# Atividade 3 da máteria Estrutura de Dados
 
__*Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir:*__
 
* 1ª Passo: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
```
 ArrayList<Integer> lista = new ArrayList<>(5);

 lista.add(1);
 lista.add(2);
 lista.add(3);
 lista.add(4);
 lista.add(5);

```
* 2ª Passo: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
```
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
```
* 3ª Passo: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
```
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
  }
```
* 4ª Passo: Insira os números [6, 7, 8, 9 e 10] na lista; 
```
  ArrayList<Integer> lista1 = new ArrayList<>(5);

  //Inserindo os numeros 6,7,8,9 e 10 na lista
  lista1.add(6);
  lista1.add(7);
  lista1.add(8);
  lista1.add(9);
  lista1.add(10);
```
* 5ª Passo: Repita os passos 2 e 3. 
```
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
```
* 6ª Passo: Exiba todos os números que foram inseridos na fila. 
```
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
```
 
 Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido.


