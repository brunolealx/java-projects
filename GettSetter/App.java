public class App {
	public static void main(String[] args) {
		// Criando uma instância de Pessoa
		Pessoa pessoa = new Pessoa();

		// Usando o setter para definir o nome
		pessoa.setNome("Peracio");

		// Usando o getter para acessar o nome e exibir
		System.out.println(pessoa.pegarNome());
	}
}
