package br.com.ana;

import br.com.ana.model.Pessoa;

import java.util.*;

public class AppInit {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        boolean program = true;
        while(program) {
            Scanner sc = new Scanner(System.in);
            System.out.println("********** Bem vindo ao sistema de cadastro de pessoas **************");
            System.out.println("Selecione a opção desejada:");
            System.out.println("1- Adicionar pessoa:");
            System.out.println("2- Remover pessoa:");
            System.out.println("3- Listar pessoa:");
            System.out.println("4 - Sair:");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    if(!pessoas.isEmpty()) {
                        System.out.println("Maximo de pessoas ja cadastradas.");
                        break;
                    }
                    System.out.println("Insira seu nome: ");
                    String name = sc.next();
                    System.out.println("Agora Diga sua idade: ");
                    int idade = sc.nextInt();

                    Pessoa pessoa1 = new Pessoa();
                    pessoa1.setNome(name);
                    pessoa1.setIdade(idade);
                    pessoas.add(pessoa1);
                    break;
                case 2:;
                case 3:
                    System.out.println("**** Lista de pessoas Cadastradas ****");
                    for (Pessoa ps : pessoas) {
                        System.out.println("Nome: " + ps.getNome() );
                        System.out.println("Nome: " + ps.getIdade() );
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    program = false;
                    break;
                default:
                    throw new IllegalStateException("Essa opção não é valida: " + opcao);
            }
        }
    }

    private static void verificarIdade(int idade) {
        if(idade > 20) {
            System.out.println("Você é velho");
        }
    }

}
