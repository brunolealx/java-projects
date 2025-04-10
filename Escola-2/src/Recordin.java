public class  Recordin {
	//atributos da minha classe
	
    public String codigo;
    public String nome;
    public String snome;
    public String fone;
    public String cep;
    public String cidade;
    public String uf;
    public String bairro;
    public String rua;
    public String fim;
 //construtor
	Recordin(){
	}
	Recordin (String codigo, String nome, String snome, String fone, String cep, 
	String cidade, String uf, String bairro, String rua, String fim) {
		
    this.codigo=codigo;
    this.nome=nome;
    this.snome=snome;
    this.fone=fone;
    this.cep=cep;
    this.cidade=cidade;
    this.uf=uf;
    this.bairro=bairro;
    this.rua=rua;
    this.fim=fim;
	}
}
