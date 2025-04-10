public class Recordout {
  // Define record structures
    public String codigo;
    public String nome;
    public String snome;
    public String fone;
    public String cep;
    public String cidade;
    public String uf;
    public String bairro;
    public String rua;

	Recordout(){
	}
	Recordout (String codigo, String nome, String snome, String fone, String cep, 
	String cidade, String uf, String bairro, String rua) {
		
    this.codigo=codigo;
    this.nome=nome;
    this.snome=snome;
    this.fone=fone;
    this.cidade=cidade;
    this.uf=uf;
    this.bairro=bairro;
    this.rua=rua;
	}
}
