package br.com.ana;

import br.com.ana.model.Cliente;

import java.util.Scanner;

public class AppInit {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String name = sc.nextLine();
        System.out.println("seu nome é :" + name);
    }
}
