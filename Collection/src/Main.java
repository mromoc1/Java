import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // seccion Arreglos
        System.out.println("Seccion ARREGLOS");
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 1;
        numeros[2] = 1;
        numeros[3] = 1;
        numeros[4] = 1;
        // numeros[5] = 1; ERROR out of range
        int[] numeros2 = { 1, 1, 1, 1, 1 }; //Equivalente a lo anterior
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        // seccion Matrices
        System.out.println("Seccion MATRICES");
        int[][] matriz = new int[2][2];
        matriz[0][0] = 1;
        matriz[0][1] = 1;
        matriz[1][0] = 1;
        matriz[1][1] = 1;
        int[][] matriz2 = { { 1, 1 }, { 1, 1 } }; //Equivalente a lo anterior
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println(matriz2[i][j]);
            }
        }

        // seccion arraylist
        System.out.println("Seccion ARRAYLIST");
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("string1");
        lista.add("string1");
        lista.add("string2");
        lista.add("string3");
        lista.add("string4");
        lista.add("string2");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
        // iterator
        System.out.println("Seccion ITERATOR");
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // seccion List
        System.out.println("Seccion LIST");
        List<String> lista2 = new ArrayList<String>();
        lista2.add("string1");
        lista2.add("string1");
        lista2.add("string2");
        lista2.add("string3");
        lista2.add("string4");
        lista2.add("string2");
        for (String nombre2 : lista2) {
            System.out.println("El nombre es: " + nombre2);
        }

        // seccion Set
        System.out.println("Seccion SET");
        Set<String> conjunto = new HashSet<String>();
        conjunto.add("Juan");
        conjunto.add("Juan");
        conjunto.add("Carlos");
        conjunto.add("Maria");
        conjunto.add("Patricio");
        conjunto.add("Patricio");
        conjunto.add("Patricio");
        for (String nombre2 : conjunto) {
            System.out.println("El nombre es: " + nombre2);
        }

        // seccion Map
        System.out.println("Seccion MAP");
        Map<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "Juan");
        mapa.put(2, "Carlos");
        mapa.put(3, "Maria");
        mapa.put(4, "Patricio");
        mapa.put(5, "Patricio");
        mapa.put(6, "Patricio");
        for (Map.Entry<Integer, String> entry : mapa.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
