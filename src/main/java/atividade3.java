import org.springframework.boot.SpringBootConfiguration;

import java.util.ArrayDeque;
import java.util.ArrayList;

@SpringBootConfiguration
public class atividade3 {

    public static void main(String[] args) {

        //Criando a lista com 5 células
        ArrayList<Integer> lista = new ArrayList<>(5);

        //Inserindo os numeros 1,2,3,4,5 na lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println("=-=-=-=-=-Adicionado na Lista-=-=-=-=-=");
        System.out.println(lista);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        //Criando a pilha com 5 células
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);

        //Removendo os dados das celulas iniciais da lista e incluindo na pilha

        while(!lista.isEmpty()) {
            for(int n = 1; n <= 5; n++){
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
        while(!pilha.isEmpty()) {
            for(int n = 1; n <= 5 ; n++) {
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

        ArrayList<Integer> lista1 = new ArrayList<>(5);

        //Inserindo os numeros 6,7,8,9 e 10 na lista
        lista1.add(6);
        lista1.add(7);
        lista1.add(8);
        lista1.add(9);
        lista1.add(10);

        System.out.println("=-=-=-=-=-Adicionado na Lista1-=-=-=-=-=");
        System.out.println(lista1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        //Criando a pilha com 5 células
        ArrayDeque<Integer> pilha1 = new ArrayDeque<>(5);

        //Removendo os dados das celulas iniciais da lista e incluindo na pilha

        while(!lista1.isEmpty()) {
            for(int n = 6; n <= 10; n++){
                pilha1.push(n);
                int elemento = lista1.remove(0);

                System.out.println("=-=-=-=-=-Esvaziando Lista1-=-=-=-=-=");
                System.out.println(lista1);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
            }
        }

        System.out.println("=-=-=-=-=-Adicionada na Pilha1-=-=-=-=-=");
        System.out.println(pilha1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        //Removendo os dados da pilha e incluindo na fila
        while(!pilha1.isEmpty()) {
            for(int n = 6; n <= 10 ; n++) {
                fila.add(n);
                int elemento = pilha1.pop();
                System.out.println("=-=-=-=-=-Esvaziando pilha1-=-=-=-=-=");
                System.out.println(pilha1);
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            }

            System.out.println("\n=-=-=-=-=-Adicionada na fila-=-=-=-=-=");
            System.out.println(fila);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        }
    }
}
