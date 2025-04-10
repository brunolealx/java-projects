public class Aluno{
	private String nome;
	private int idade;
	
		public void setNome(String nome) {
		this.nome = nome;
		this.idade = idade;

	}
	public String pegaNome() {
	 return nome; }
	 
		public void setIdade(int idade) {
//			this.idade = idade;
			if (idade > 0 && idade < 130) {
		  
		    	System.out.println("idade cadastrada..."+idade+" anos");
		    }
		    else {
				System.out.println("idade "+idade+" não é valida..");
				 }
		}
	}

