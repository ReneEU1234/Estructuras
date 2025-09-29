import javax.swing.*;
import java.awt.event.*;

public class Estructuras {

    public static void main(String[] args) {

// 1-Array
        int[] numeros = new int[5];  
        String[] nombres = {"Ruben", "Donato", "Pichol"};

// 2-Lista
        String[] frutas = {"Manzana", "Banana", "Fresa"};
        JList<String> listaFrutas = new JList<>(frutas);

// 3-Pila
        Stack<Integer> pila = new Stack<>();

// 4-Cola
        Queue<String> cola = new LinkedList<>();

// 5-Arbol
        TreeSet<Integer> arbol = new TreeSet<>();

// 6-Grafo
        Map<String, List<String>> grafo = new HashMap<>();

    }
}