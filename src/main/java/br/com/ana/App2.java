package br.com.ana;

import br.com.ana.model.Pessoa;

import java.util.*;

public class App2 {

    


public class AppInit {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        boolean program = true;
        Scanner sc = new Scanner(System.in);
        
        while(program) {
            System.out.println("********** Bem vindo ao sistema de cadastro de pessoas **************");
            System.out.println("Selecione a opção desejada:");
            System.out.println("1- Adicionar pessoa:");
            System.out.println("2- Remover pessoa:");
            System.out.println("3- Listar pessoa:");
            System.out.println("4 - Adicionar hobbies:");
            System.out.println("5 - Sair:");
            
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("Insira seu nome: ");
                    String name = sc.nextLine();
                    System.out.println("Agora Diga sua idade: ");
                    int idade = Integer.parseInt(sc.nextLine());
                    System.out.println("Qual a sua cidade: ");
                    String cidade = sc.nextLine();
                    System.out.println("Quais são os seus hobbies: ");
                    String hobbies = sc.nextLine();


                    Pessoa pessoa1 = new Pessoa();
                    pessoa1.setNome(name);
                    pessoa1.setIdade(idade);
                    pessoa1.setCidade(cidade);
                    pessoa1.adicionarHobby(hobbies);
                    pessoas.add(pessoa1);
                    break;

                case 2:;
                case 3:
                    System.out.println("**** Lista de pessoas Cadastradas ****");
                    // Pessoa selecionada;

                    for (Pessoa person : pessoas) {
                        System.out.println("Nome: " + person.getNome() );
                        System.out.println("Idade: " + person.getIdade() );
                        System.out.println("Cidade: " + person.getCidade() );
                        System.out.println("Hobbies: " + person.getHobbies() );
                        System.out.println(" ");
                    

                        if(person.getCidade().equals("Florianopolis")) {
                            System.out.println("Você é manezinho!");
                            
                        }
                    
                    } 

                    case 4:
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                        break;
                    }

                    System.out.println("Nome da pessoa para adicionar hobbies:");
                    String nomePessoa = sc.nextLine();
                    boolean pessoaEncontrada = false;
                   // quebrar linha

                    for (Pessoa pessoa : pessoas) {
                        if (pessoa.getNome().equalsIgnoreCase(nomePessoa)) {
                            pessoaEncontrada = true;
                            System.out.println("Digite o hobby que deseja adicionar:");
                            String hobby = sc.nextLine();
                            pessoa.adicionarHobby(hobby);
                            System.out.println("Hobby adicionado com sucesso!");
                            break;
                        }

                    }

                    if (!pessoaEncontrada) {
                        System.out.println("Pessoa não encontrada.");
                    }
                    
                case 5:
                    program = false;
                    break;
                default:
                    throw new IllegalStateException("Essa opção não é valida: " + opcao);
            }

        }
    }
}




    
}
