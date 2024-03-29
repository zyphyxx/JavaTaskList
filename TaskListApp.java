import model.Task;

import java.util.InputMismatchException;
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

    private static void exibirMenu() {

        int valor = 0;

        do {

            try {

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
                        System.out.println("Opção inválida. Por favor, digite uma opção válida.");

                }

            } catch (InputMismatchException e) {

                System.out.println("Entrada inválida! Por favor, digite um número.");
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

        System.out.println("QUANTAS TAREFAS VOCÊ QUER ADICIONAR ?");
        numEscolhido = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a(s) tarefas: ");

        do {

            Task.listaTarefas.add(scanner.nextLine());
            count++;

        } while (count < numEscolhido);

        System.out.println("TAREFAS ADICIONADAS COM SUCESSO!!");

    }

    private static void exibirTarefas() {
        int valor = 9;

        do {
            try {

                System.out.println("==== SUAS TAREFAS ===");

                if (Task.listaTarefas.isEmpty()) {
                    System.out.println("Sua Lista esta vazia");
                } else {

                    for (int i = 0; i < Task.listaTarefas.size(); i++) {
                        System.out.println((i + 1) + "- " + Task.listaTarefas.get(i));
                    }
                    System.out.println();
                    System.out.println("==== Digite 0 para voltar para o Menu:  ===");
                    valor = scanner.nextInt();
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("erro de indice:");
                scanner.nextLine();
            }

            exibirMenu();

        } while (valor != 0);

    }

    private static void removerTarefa() {
        int valor;

        try {

            System.out.println("Qual tarefa voce quer remover: ");
            scanner.nextLine();

            if (Task.listaTarefas.isEmpty()) {

                System.out.println("Sua lista não tem nada para remover");

            } else {

                for (int i = 0; i < Task.listaTarefas.size(); i++) {

                    System.out.println(Task.listaTarefas.indexOf(Task.listaTarefas.get(i)) + " - " + Task.listaTarefas.get(i));
                }

                valor = scanner.nextInt();

                System.out.println(Task.listaTarefas.remove(Task.listaTarefas.get(valor)) + " Removido com sucesso");

            }

        } catch (IndexOutOfBoundsException e) {

            System.out.println("erro de indice: ");
        }

    }

    private static void sair() {
        // TODO: 27/03/2024
        System.out.println("ATÉ A PROXIMA ;D");

    }


}

