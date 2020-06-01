import org.springframework.boot.SpringBootConfiguration;
import java.util.ArrayDeque;
import java.util.ArrayList;

@SpringBootConfiguration
public class atividade3 {

    public static void main(String[] args) {

        System.out.println("===============================Criando a primeira Lista=================================");
        System.out.println();
        //Criando a lista com 5 células
        ArrayList<Integer> lista = new ArrayList<>(5);

        //Inserindo os numeros 1,2,3,4,5 na lista
        for (int numero = 1; numero <= 5; numero++) {
            lista.add(numero);
        }

        System.out.println("=-=-=-=-=-Adicionado na Lista-=-=-=-=-=");
        System.out.println(lista);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        //Criando a pilha com 5 células
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);

        //Removendo os dados das celulas iniciais da lista e incluindo na pilha

        while (!lista.isEmpty()) {
            for (int n = 1; n <= 5; n++) {
                pilha.push(n);
                int elemento = lista.remove(0);

                System.out.println("=-=-=-=-=-Esvaziando Lista-=-=-=-=-=");
                System.out.println(lista);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            }
        }

        System.out.println("=-=-=-=-=-Adicionada na Pilha-=-=-=-=-=");
        System.out.println(pilha);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");


        //Criando a fila com 10 células
        ArrayDeque<Integer> fila = new ArrayDeque<>(10);

        //Removendo os dados da pilha e incluindo na fila
        while (!pilha.isEmpty()) {
            for (int n = 1; n <= 5; n++) {
                fila.add(n);
                int elemento = pilha.pop();
                System.out.println("=-=-=-=-=-Esvaziando pilha-=-=-=-=-=");
                System.out.println(pilha);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }

            System.out.println("\n=-=-=-=-=-Adicionada na fila-=-=-=-=-=");
            System.out.println(fila);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        }

        System.out.println("================================Criando a segunda lista==============================");
        System.out.println();
        ArrayList<Integer> lista2 = new ArrayList<>(5);

        //Inserindo os numeros 6,7,8,9 e 10 na lista
        for (int numero = 1; numero <= 5; numero++) {
            lista2.add(numero);
        }

        System.out.println("=-=-=-=-=-Adicionado na Lista2-=-=-=-=-=");
        System.out.println(lista2);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        //Criando a pilha com 5 células
        ArrayDeque<Integer> pilha2 = new ArrayDeque<>(5);

        //Removendo os dados das celulas iniciais da lista2 e incluindo na pilha2

        while (!lista2.isEmpty()) {
            for (int n = 6; n <= 10; n++) {
                pilha2.push(n);
                int elemento = lista2.remove(0);

                System.out.println("=-=-=-=-=-Esvaziando Lista2-=-=-=-=-=");
                System.out.println(lista2);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            }
        }

        System.out.println("=-=-=-=-=-Adicionada na Pilha2-=-=-=-=-=");
        System.out.println(pilha2);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        //Removendo os dados da pilha2 e incluindo na fila
        while (!pilha2.isEmpty()) {
            for (int n = 6; n <= 10; n++) {
                fila.add(n);
                int elemento = pilha2.pop();
                System.out.println("=-=-=-=-=-Esvaziando pilha2-=-=-=-=-=");
                System.out.println(pilha2);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            }

            System.out.println("\n=-=-=-=-=-Adicionada na fila-=-=-=-=-=");
            System.out.println(fila);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        }
    }
}
