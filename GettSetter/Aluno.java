public class Aluno {
	private String nome;
	private int idade;

	// Setter para nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getter para nome
	public String pegaNome() {
		return nome;
	}

	// Setter para idade com validação
	public void setIdade(int idade) {
		if (idade > 0 && idade < 130) {
			this.idade = idade; // Atribuindo a idade
			System.out.println("Idade cadastrada: " + idade + " anos");
		} else {
			System.out.println("Idade " + idade + " não é válida.");
		}
	}

	// Getter para idade
	public int getIdade() {
		return idade;
	}
}
