package AulaMar17.Ex3BilheteUnico;

import java.util.Scanner;

public class main {
    static BilheteUnico[] bilhete = new BilheteUnico[3];
    static Scanner sc = new Scanner(System.in);
    static int index;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n*************************************");
            System.out.println("1. Cadastrar bilhete");
            System.out.println("2. Carregar bilhete");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Passar na catraca");
            System.out.print("5. Finalizar");
            System.out.println("\n*************************************");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> cadastrar();
            }

        } while (opcao != 5);


    }

    private static void cadastrar() {
        String nome;
        long cpf;
        String tpTarifa;

        if (index < bilhete.length) {
            System.out.print("Nome do usuário: ");
            nome = sc.next();
            System.out.print("CPF: ");
            cpf = sc.nextLong();
            System.out.print("Tipo de tarifa (estudante, professor ou comum): ");
            tpTarifa = sc.next();
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, tpTarifa));
            index++;

        }

    }
}
