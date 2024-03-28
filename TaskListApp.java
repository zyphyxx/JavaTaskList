import java.util.Scanner;

public class TaskListApp {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // exibir o menu
        exibirMenu();
        // adicionar
        //exibir
        //remover
        //sair
    }

    private static void exibirMenu () {

        int valor;

        do {

            System.out.println("==== Task List App ===");
            System.out.println();
            System.out.println("1- Adicionar tarefas");
            System.out.println("2- Exibir tarefas");
            System.out.println("3- Remover tarefas");
            System.out.println("4- Sair");
            System.out.println();
            System.out.println(" Digite sua escolha: ");

            valor = scanner.nextInt();

            switch (valor) {
                case 1: adicionarTarefas();
                    break;
                case 2: exibirTarefas();
                    break;
                case 3: removerTarefa();
                    break;


                default:
                    System.out.println("Digite uma opçao valida");

            }

        } while (valor != 4);

        sair();


    }

    private static void adicionarTarefas () {
        // TODO: 27/03/2024
        System.out.println("adicionar tarefas");
        scanner.close();

    }

    private static void exibirTarefas () {
        // TODO: 27/03/2024
        System.out.println("exibindo tarefas");
        scanner.close();

    }

    private static void removerTarefa (){
        // TODO: 27/03/2024
        System.out.println("removendo tarefa");
        scanner.close();
    }

    private static void sair () {
        // TODO: 27/03/2024
        System.out.println("ate a proxima");
        scanner.close();

    }


}

