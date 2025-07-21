public class Usuario {

    private String nome;
    private String email;
    private int idade;

    public Usuario(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", idade: " + idade;
    }


}
