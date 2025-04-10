public class Pessoa {

	private String nome; // Tornar o nome privado, para controle melhor de acesso
	private int idade;

	// Getter para o nome
	public String pegarNome() {
		return nome;
	}

	// Getter para a idade
	public int getIdade() {
		return idade;
	}

	// Setter para a idade
	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Setter para o nome, caso precise modificar o nome depois
	public void setNome(String nome) {
		this.nome = nome;
	}
}
