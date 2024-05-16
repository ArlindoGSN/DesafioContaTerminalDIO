package org.projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o nome do cliente");
        String nome = scanner.nextLine();
        System.out.println("digite o numero da conta");
        Integer numero = scanner.nextInt();
        System.out.println("digite a agencia");
        String agencia = scanner.next();
        System.out.println("digite o saldo");
        Double saldo = scanner.nextDouble();
        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldo);
        System.out.println(conta);

    }
}