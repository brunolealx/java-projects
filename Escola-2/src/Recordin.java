public class Recordin {
    // Atributos privados
    private String codigo;
    private String nome;
    private String snome;
    private String fone;
    private String cep;
    private String cidade;
    private String uf;
    private String bairro;
    private String rua;
    private String fim;

    // Construtor com todos os parâmetros
    public Recordin(String codigo, String nome, String snome, String fone, String cep,
            String cidade, String uf, String bairro, String rua, String fim) {
        this.codigo = codigo;
        this.nome = nome;
        this.snome = snome;
        this.fone = fone;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.fim = fim;
    }

    // Construtor sem parâmetros (caso necessário)
    public Recordin() {
    }

    // Métodos getter e setter para acessar e modificar os atributos privados
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    // Sobrescrever o método toString para exibir os dados de forma legível
    @Override
    public String toString() {
        return "Recordin [codigo=" + codigo + ", nome=" + nome + ", snome=" + snome +
                ", fone=" + fone + ", cep=" + cep + ", cidade=" + cidade + ", uf=" + uf +
                ", bairro=" + bairro + ", rua=" + rua + ", fim=" + fim + "]";
    }
}
