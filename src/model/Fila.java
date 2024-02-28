package model;

public class Fila {

    private int frente;
    private int tras;
    private int tamanhoMaximo;
    private int[] elementos;

    public Fila(int tamanhoMaximo) {
        this.frente = 0;
        this.tras = -1;
        this.tamanhoMaximo = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
    }

    public void enqueue(int elemento) {
        tras = (tras + 1) % tamanhoMaximo;
        elementos[tras] = elemento;
    }

    public int dequeue() {
        int elemento = elementos[frente];
        frente = (frente + 1) % tamanhoMaximo;
        return elemento;
    }

    public int rear() {
        return elementos[tras];
    }

    public int front() {
        return elementos[frente];
    }

    public int size() {
        if (tras >= frente) {
            return tras - frente + 1;
        } else {
            return tamanhoMaximo - frente + tras + 1;
        }
    }

    public boolean isEmpty() {
        return frente == tras + 1;
    }

}

