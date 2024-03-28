import model.Task;
import java.util.Scanner;

public class TaskListApp {

    private static final Scanner scanner = new Scanner(System.in);

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
                case 4: sair();
                    break;
                default:
                    System.out.println("DIGITE UMA OPÇÃO VALIDA");

            }

        } while (valor != 4);
    }

    private static void adicionarTarefas () {

        int count = 0;

        System.out.println("QUANTAS TAREFAS VOCÊ QUER ADICIONAR ?");
        int valor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a(s) tarefas: ");

        do {

            Task.listaTarefas.add(scanner.nextLine());
            count++;

        } while (count < valor);

        System.out.println("TAREFAS ADICIONADAS COM SUCESSO!!");

    }

    private static void exibirTarefas () {
        // TODO: 27/03/2024
        System.out.println(Task.listaTarefas);


    }

    private static void removerTarefa (){
        // TODO: 27/03/2024
        System.out.println("removendo tarefa");
        scanner.close();
    }

    private static void sair () {
        // TODO: 27/03/2024
        System.out.println("ATÉ A PROXIMA ;D");
        scanner.close();

    }


}

