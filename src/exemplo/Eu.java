package exemplo;

public class Eu {
    public static void main(String[] args) {

        Diogo diogo = new Diogo("Jaime", 27);
        System.out.println(diogo);



    }
}

class Diogo{
    private String nome;
    private Integer idade;


    public Diogo(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Diogo{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
