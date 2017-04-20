package pruebasortedset3;

import java.util.Arrays;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebaSortedSet3 {

    private static final String nombres[]
            = {"amarillo", "verde", "negro", "carne", "gris", "blanco", "naranja",
                "rojo", "verde"};

    public PruebaSortedSet3() {
        SortedSet<String> arbol = new TreeSet<String>(
                Arrays.asList(nombres));

        System.out.println("conjunto ordenado: ");
        imprimirConjunto(arbol);

        System.out.println("\nheadSet(\"naranja\"): ");
        imprimirConjunto(arbol.headSet("naranaja"));

        System.out.println("\ntailSet (\"naranja\"): ");
        imprimirConjunto(arbol.tailSet("naranaja"));

        System.out.printf("primero: %s\n", arbol.first());
        System.out.printf("ultimo : %s\n", arbol.last());
    }

    private void imprimirConjunto(Collection<String> conjunto) {
        for (String s : conjunto) {
            System.out.printf("%s ", s);
        }
    }

    public static void main(String[] args) {
        new PruebaSortedSet3();
    }

}
