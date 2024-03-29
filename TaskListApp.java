import model.Task;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskListApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        exibirMenu();

    }

    private static void exibirMenu() {

        int valor = 0;

        do {

            try {

                System.out.println("\n==== \u001B[1mBem-vindo ao Task List App\u001B[0m ====");
                System.out.println();
                System.out.println("\u001B[33m1- Adicionar Tarefa\u001B[0m");
                System.out.println("\u001B[34m2- Exibir Tarefas\u001B[0m");
                System.out.println("\u001B[35m3- Remover Tarefa\u001B[0m");
                System.out.println("\u001B[36m4- Sair\u001B[0m");
                System.out.println();
                System.out.println("Escolha uma opção: ");

                valor = scanner.nextInt();

                switch (valor) {
                    case 1:
                        adicionarTarefas();
                        break;
                    case 2:
                        exibirTarefas();
                        break;
                    case 3:
                        removerTarefa();
                        break;
                    case 4:
                        sair();
                        break;
                    default:
                        System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.\n");

                }

            } catch (InputMismatchException e) {

                System.out.println("\nEntrada inválida! Por favor, digite um número.\n");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }

        } while (valor != 4);

    }

    private static void adicionarTarefas() {

        int count = 0;
        int numEscolhido;

        System.out.println("\nQuantas tarefas você deseja adicionar?");
        numEscolhido = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDigite a(s) tarefa(s): ");

        do {

            Task.listaTarefas.add(scanner.nextLine());
            count++;

        } while (count < numEscolhido);

        System.out.println("\nTarefa(s) adicionada(s) com sucesso!!\n");

    }

    private static void exibirTarefas() {
        int valor = 9;

        do {
            try {

                System.out.println("\n\n==== SUAS TAREFAS ===");

                if (Task.listaTarefas.isEmpty()) {
                    System.out.println("\nSua lista está vazia\n");
                } else {

                    for (int i = 0; i < Task.listaTarefas.size(); i++) {
                        System.out.println("\u001B[37m" + (i + 1) + "- " + Task.listaTarefas.get(i) + "\u001B[0m");
                    }
                    System.out.println();
                    System.out.println("\n==== Digite 0 para voltar para o Menu ===\n");
                    valor = scanner.nextInt();
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro de indice:");
                scanner.nextLine();
            }

            exibirMenu();

        } while (valor != 0);

    }

    private static void removerTarefa() {
        int valor;

        try {

            System.out.println("\nQual tarefa você deseja remover: ");
            scanner.nextLine();

            if (Task.listaTarefas.isEmpty()) {

                System.out.println("\nSua lista não tem nada para remover\n");

            } else {

                for (int i = 0; i < Task.listaTarefas.size(); i++) {

                    System.out.println(Task.listaTarefas.indexOf(Task.listaTarefas.get(i)) + " - " + Task.listaTarefas.get(i));
                }

                valor = scanner.nextInt();

                System.out.println(Task.listaTarefas.remove(Task.listaTarefas.get(valor)) + " Removido com sucesso");

            }

        } catch (IndexOutOfBoundsException e) {

            System.out.println("Erro de indice: ");
        }

    }

    private static void sair() {
        System.out.println("\u001B[32m\nAté a próxima ;D\n\u001B[0m");
        System.exit(0);
    }
}

