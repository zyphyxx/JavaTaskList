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
                System.out.println("\u001B[32m4- Editar Tarefa\u001B[0m");
                System.out.println("\u001B[36m5- Sair\u001B[0m");
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
                        editarTarefa();
                        break;
                    case 5:
                        sair();
                        break;
                    default:
                        System.out.println("\n\u001B[31mOpção inválida. Por favor, escolha uma opção válida.\u001B[0m\n");

                }

            } catch (InputMismatchException e) {

                System.out.println("\n\u001B[31mEntrada inválida! Por favor, digite um número.\u001B[0m\n");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }

        } while (valor != 5);

    }

    private static void adicionarTarefas() {

        int count = 0;
        int numEscolhido;

        System.out.println("\n\u001B[1mQuantas tarefas você deseja adicionar?\u001B[0m");
        numEscolhido = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\n\u001B[1mDigite a(s) tarefa(s):\u001B[0m");

        do {

            Task.listaTarefas.add(scanner.nextLine());
            count++;

        } while (count < numEscolhido);

        System.out.println("\n\u001B[32mTarefa(s) adicionada(s) com sucesso!!\u001B[0m\n");

    }

    private static void exibirTarefas() {
        int valor = 9;

        do {
            try {

                System.out.println("\n\n\u001B[1m==== SUAS TAREFAS ====\u001B[0m");

                if (Task.listaTarefas.isEmpty()) {
                    System.out.println("\n\u001B[31mSua lista está vazia\u001B[0m\n");
                } else {

                    for (int i = 0; i < Task.listaTarefas.size(); i++) {
                        System.out.println("\u001B[37m" + (i + 1) + "- " + Task.listaTarefas.get(i) + "\u001B[0m");
                    }
                    System.out.println("\n\u001B[1m==== Digite 000 para voltar para o Menu ====\u001B[0m\n");
                    valor = scanner.nextInt();
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("\n\u001B[31mErro de indice.\u001B[0m\n");
                scanner.nextLine();
            }

            exibirMenu();

        } while (valor != 000);

    }

    private static void removerTarefa() {
        int valor;

        try {

            System.out.println("\nQual tarefa você deseja remover: ");
            System.out.println("Ou digite \u001B[33m000\u001B[0m para sair:\n");
            scanner.nextLine();

            if (Task.listaTarefas.isEmpty()) {

                System.out.println("\n\u001B[31mSua lista não tem nada para remover.\u001B[0m\n");

            } else {

                for (int i = 0; i < Task.listaTarefas.size(); i++) {

                    System.out.println(Task.listaTarefas.indexOf(Task.listaTarefas.get(i)) + " - " + Task.listaTarefas.get(i));
                }

                valor = scanner.nextInt();

                if (valor == 000){
                    exibirMenu();
                } else {
                    System.out.println(Task.listaTarefas.remove(Task.listaTarefas.get(valor)) + " Removido com sucesso");
                }

            }

        } catch (IndexOutOfBoundsException e) {

            System.out.println("\n\u001B[31mErro de indice.\u001B[0m\n");
        }

    }

    public static void editarTarefa(){
        int valor;

        try {

            System.out.println("\n\u001B[1mQual tarefa você deseja alterar:\u001B[0m");
            scanner.nextLine();

            if (Task.listaTarefas.isEmpty()) {

                System.out.println("\n\u001B[31mSua lista está vazia. Não há tarefas para alterar.\u001B[0m\n");

            } else {
                System.out.println("\n\u001B[1mLista de Tarefas:\u001B[0m");
                for (int i = 0; i < Task.listaTarefas.size(); i++) {

                    System.out.println(Task.listaTarefas.indexOf(Task.listaTarefas.get(i)) + " - " + Task.listaTarefas.get(i));
                }

                System.out.println("\n\u001B[1mDigite o número da tarefa que deseja alterar:\u001B[0m");
                valor = scanner.nextInt();
                scanner.nextLine();

                System.out.println("\n\u001B[1mDigite a nova descrição da tarefa:\u001B[0m");
                String novaTarefa = scanner.nextLine();
                scanner.nextLine();

                Task.listaTarefas.set(valor, novaTarefa);
                System.out.println("\n\u001B[32mTarefa alterada com sucesso!\u001B[0m\n");
            }

        } catch (IndexOutOfBoundsException e) {

            System.out.println("\n\u001B[31mErro: Índice da tarefa inválido.\u001B[0m\n");
        }


    }

    private static void sair() {
        System.out.println("\u001B[32m\nAté a próxima ;D\n\u001B[0m");
        System.exit(0);
    }
}

