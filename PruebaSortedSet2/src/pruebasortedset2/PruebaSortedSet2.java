package pruebasortedset2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet2 {

    private static final int[] numeros = {1, 2, 4, 6, 8, 6, 7, 8, 9};

    public PruebaSortedSet2() {
        List<Number> listaNumeros = new ArrayList<>();
        for (int i : numeros) {
            listaNumeros.add(i);
        }

        SortedSet<Number> set = new TreeSet<Number>(listaNumeros);

        System.out.println("Conjunto de numeros ordenados:");
        imprimirConjunto(set);
        
        //headset, menores que 4
        System.out.println("\nheadSet con base a 4:");
        imprimirConjunto(set.headSet(4));
        
        //tailset, mayores que 4
        System.out.println("\ntailSet con base a 4:");
        imprimirConjunto(set.tailSet(4));
        
        //primero del conjunto
        System.out.println("\nprimero: " + set.first());
        System.out.println("ultimo : " + set.last());

    }

    private void imprimirConjunto(Collection<Number> n) {
        for (Number x : n) {
            System.out.printf("%s ", x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new PruebaSortedSet2();
    }

}
