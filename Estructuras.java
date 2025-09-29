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
        pila.push(1);
        pila.push(2);
        int top = pila.pop();

// 4-Cola
        Queue<String> cola = new LinkedList<>();
        cola.add("A");
        cola.add("B");
        String primero = cola.poll();

// 5-Arbol
        TreeSet<Integer> arbol = new TreeSet<>();
        arbol.add(5);
        arbol.add(2);
        arbol.add(9);

// 6-Grafo
        Map<String, List<String>> grafo = new HashMap<>();
        grafo.put("A", Arrays.asList("B","C"));
        grafo.put("B", Arrays.asList("A","D"));

    }
}