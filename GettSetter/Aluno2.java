public class Aluno2 {
	private String nome;
	private int idade;
	
		public void setNome(String nome) {
		this.nome = nome;

		}
		public void setIdade(int idade) {
			if (idade > 0 && idade < 130) {
		  
		    	System.out.println("idade cadastrada..."+idade+" anos");
		    }
		    else {
				System.out.println("idade "+idade+" não é valida..");
				 }

		this.idade = idade;
		
		}
	public String pegaNome() {
	 return nome; }
	 
	public int pegaIdade() {
		return idade; }

	}
