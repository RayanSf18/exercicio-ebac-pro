package model;

public class Pilha {

    private int topo;
    private int[] elementos;
    private int tamanho;

    public Pilha(int tamanho) {
        this.topo = -1;
        this.elementos = new int[tamanho];
        this.tamanho = tamanho;
    }

    public void push(int elemento) {
        elementos[++topo] = elemento;
    }

    public int pop() {
        return elementos[topo--];
    }

    public int peek() {
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == tamanho - 1;
    }

    public int size() {
        return topo + 1; // Since topo points to the last element, adding 1 gives the actual size.
    }
}
