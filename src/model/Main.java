package model;

public class Main {

    public static void main(String[] args) {
        // Complexidade Assintótica para Pilha

        System.out.println("Pilha:");
        // push(): Este método envolve apenas um número constante de operações (incrementando topoe atribuindo o elemento ao índice correspondente no array). Portanto, sua complexidade é O(1) , que é considerada de tempo constante .
        System.out.println(" - push(): O(1)"); // Constant time
        // pop(): semelhante a push(), este método também envolve um número constante de operações (decrementando topoe acessando o elemento no topoíndice). Portanto, sua complexidade também é O(1) .
        System.out.println(" - pop(): O(1)"); // Constant time

        // Complexidade Assintótica para Fila

        System.out.println("\nFila:");
        // enqueue(): semelhante push()à pilha, este método envolve um número constante de operações (atualização trase atribuição do elemento ao índice correspondente no array). Portanto, sua complexidade é O(1) .
        System.out.println(" - enqueue(): O(1)"); // Constant time
        //dequeue(): Este método também envolve um número constante de operações (acessar o elemento no frenteíndice e atualizar frente). Portanto, sua complexidade é O(1) .
        System.out.println(" - dequeue(): O(1)"); // Constant time
        //rear(): Este método só precisa acessar o elemento no trasíndice, resultando em complexidade O(1) .
        System.out.println(" - rear(): O(1)"); // Constant time
        //front(): semelhante a rear(), este método simplesmente acessa o elemento no frenteíndice, levando à complexidade O(1) .
        System.out.println(" - front(): O(1)"); // Constant time

        // Complexidade Assintótica para Lista Encadeada


        System.out.println("\nLista Encadeada:");
        // push(): No caso médio, adicionar um novo nó no final da lista leva um tempo constante. No entanto, no pior cenário (quando a lista está vazia), pode ser necessário percorrer a lista para encontrar a cauda, ​​levando a uma complexidade amortizada O(1) .
        System.out.println(" - push(): O(1) amortizado"); // Amortized constant time
        //pop(): a remoção do último elemento (cauda) leva um tempo constante na melhor das hipóteses (quando há apenas um elemento). No entanto, remover do meio da lista requer iterar pela lista para encontrar o nó antes daquele a ser removido, resultando em complexidade O(n) no caso médio.
        System.out.println(" - pop(): O(1) no pior caso, O(n) no caso médio"); // Worst-case: O(1), Average-case: O(n)
        //insert(): Inserir um novo nó no início leva um tempo constante, pois só precisamos atualizar a headreferência. A inserção no final pode exigir a iteração da lista para encontrar o final, levando à complexidade O(n) .
        System.out.println(" - insert(): O(1) no início, O(n) no fim"); // O(1) at beginning, O(n) at end
        //remove(): semelhante a insert(), remover desde o início leva um tempo constante. Remover do meio requer percorrer a lista para encontrar o nó antes daquele a ser removido, resultando em complexidade O(n) .
        System.out.println(" - remove(): O(1) no início, O(n) no meio"); // O(1) at beginning, O(n) in the middle
        //elementAt(): percorrer a lista para encontrar o elemento em um índice específico requer iterar pelos nnós no pior caso. Portanto, sua complexidade é O(n) , que é considerada tempo linear .
        System.out.println(" - elementAt(): O(n)"); // Linear time
    }
}

