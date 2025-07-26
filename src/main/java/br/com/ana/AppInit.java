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
                    System.out.println("Insira seu nome: ");
                    String name = sc.next();
                    System.out.println("Agora Diga sua idade: ");
                    int idade = sc.nextInt();
                    System.out.println("Por fim, diga sua cidade: ");
                    String cidade = sc.next();

                    

                    Pessoa pessoa1 = new Pessoa();
                    pessoa1.setNome(name);
                    pessoa1.setIdade(idade);
                    pessoa1.setCidade(cidade);
                    pessoas.add(pessoa1);
                    break;
                case 2:;
                case 3:
                    System.out.println("**** Lista de pessoas Cadastradas ****");
                    Pessoa selecionada;

                    for (Pessoa person : pessoas) {
                        System.out.println("Nome: " + person.getNome() );
                        System.out.println("Idade: " + person.getIdade() );
                        System.out.println("Cidade: " + person.getCidade() );
                        System.out.println(" ");
                    

                        if(person.getCidade().equals("Florianopolis")  ) {
                            System.out.println("Você é manezinho!");
                            selecionada = person;
                        }
                    
                    } 


                    selecionada.getNome();
                

                    break;
                case 4:
                    program = false;
                    break;
                default:
                    throw new IllegalStateException("Essa opção não é valida: " + opcao);

                case 5:
            }
        }
    }

    

}
