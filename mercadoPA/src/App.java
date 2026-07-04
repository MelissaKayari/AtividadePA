import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner (System.in);
         ArrayList<String> listaCompras = new ArrayList<>();

    int opcaoLista = 0;
    int opcao = 0;
    String novoItem;
    int contadora = 0; 




              do{

                try{
    System.out.println("""
                Bem vindos ao programa lista de compras

                Escolha a opção desejada

                1 - Criar um nova lista de compras
                2 - Sair
            
        """);
        opcaoLista = inUser.nextInt();
        inUser.nextLine();

        switch(opcaoLista){
            case 1 -> {System.out.println("Lista criada com sucesso!");

                do{
                    System.out.println(""" 
                        escolha a opcao desejada:
                        1 - Adicionar um item a lista
                        2 - Remover um item a lista
                        3 - Exibir a lista de compras
                        4 - Limpar a lista de compras
                        5 - alterar item
                        6 - Voltar ao menu principal 
                    """);

                    opcao = inUser.nextInt();
                    inUser.nextLine();

                    switch(opcao){
                        case 1 -> {
                            System.out.println("Você escolheu criar um item da lista");
                            System.out.println("Digite o nome do produto");

                            novoItem = inUser.nextLine();
                            listaCompras.add(novoItem);

                        }

                                                  case 2 -> {
                                    System.out.println("Você escolheu remover um item:");
                                    String comprasRemover = inUser.nextLine();
                                    System.out.println("Digite o nome do item que deseja remover");


                                    boolean removido = listaCompras.remove(comprasRemover);

                                if (removido) {
                                    System.out.println("Compra removida com sucesso!");
                                } else {
                                    System.out.println("Item não encontrado.");
                                    }
                                }



                        case 3 ->{
                            if(listaCompras.size() < 1){
                                System.out.println("Lista vazia");
                            }else
                            System.out.println("Você escolheu ver a lista");
                            for(int i =0 ; i < listaCompras.size(); i++){
                                System.out.println((i+1) + " - " + listaCompras.get(i));
                            }
                        }

                        case 4 -> {
        listaCompras.clear();
        System.out.println("Lista de compras limpa com sucesso!");
    }


                   case 5 -> {
    for (int i = 0; i < listaCompras.size(); i++) {
        System.out.println((i + 1) + " - " + listaCompras.get(i));
    }

    System.out.println("Digite o número do item que deseja alterar:");
    int alterar = inUser.nextInt();
    inUser.nextLine();

    if (alterar >= 1 && alterar <= listaCompras.size()) {
        System.out.println("Digite o novo nome:");
        String novoNome = inUser.nextLine();

        listaCompras.set(alterar - 1, novoNome);

        System.out.println("Item alterado com sucesso!");
    } else {
        System.out.println("Número inválido.");
    }
}

                    }

                }while(opcao != 6);


            }
            case 2 -> System.out.println("Obrigada por utilizar nosso sistema.");
            default -> System.out.println("Opção inválida");
            }




    }catch(Exception erro){
        System.out.println("Erro na Entrada");
        opcaoLista = 1;
    }
         }while(opcaoLista != 2);

         inUser.close();
    }
}



