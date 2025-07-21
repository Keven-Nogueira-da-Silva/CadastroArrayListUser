import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n=== MENU ===");
            System.out.println("""
                    1 - Cadastra usuário
                    2 - Lista usuários
                    3 - Remover usuário
                    0 - Sair""");
            System.out.println("ESCOLHA UM OPÇÃO");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){

                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite seu Email: ");
                    String email = sc.nextLine();
                    System.out.println("Digite sua idade");
                    int idade = sc.nextInt();

                    Usuario user = new Usuario(nome, email, idade);
                    usuarios.add(user);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n ===Lista de Usuário===");
                    for (Usuario a : usuarios ) {
                        System.out.println(a);
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do usuário para remover: ");
                    String userRemover = sc.nextLine();
                    boolean removido = false;
                    for (Usuario r : usuarios) {
                        if (r.getNome().equalsIgnoreCase(userRemover)) {
                            usuarios.remove(r);
                            removido  = true;
                            System.out.println("Usuário removido.");
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção invalida");
            }

        }while(opcao != 0);

        sc.close();
    }
}