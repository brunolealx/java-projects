
import java.util.*;

public class Sisalu {

    // Definindo as classes principais
    static class Aluno {
        String codigo;
        String nome;
        String sobrenome;
        String fone;
        String cep;
        String cidade;
        String uf;
        String bairro;
        String rua;

        public Aluno(String codigo, String nome, String sobrenome, String fone, String cep, String cidade, String uf,
                String bairro, String rua) {
            this.codigo = codigo;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.fone = fone;
            this.cep = cep;
            this.cidade = cidade;
            this.uf = uf;
            this.bairro = bairro;
            this.rua = rua;
        }

        @Override
        public String toString() {
            return "Código: " + codigo + ", Nome: " + nome + " " + sobrenome;
        }
    }

    static class Nota {
        String codigo;
        String nome;
        String sobrenome;
        int primeiro;
        int segundo;
        int terceiro;
        int quarto;

        public Nota(String codigo, String nome, String sobrenome, int primeiro, int segundo, int terceiro, int quarto) {
            this.codigo = codigo;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.primeiro = primeiro;
            this.segundo = segundo;
            this.terceiro = terceiro;
            this.quarto = quarto;
        }

        public double calcularMedia() {
            return (primeiro + segundo + terceiro + quarto) / 4.0;
        }

        @Override
        public String toString() {
            return "Notas: " + primeiro + ", " + segundo + ", " + terceiro + ", " + quarto;
        }
    }

    static class Parcela {
        String codigo;
        String nome;
        String sobrenome;
        String anoRef;
        double valorParcela;

        public Parcela(String codigo, String nome, String sobrenome, String anoRef, double valorParcela) {
            this.codigo = codigo;
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.anoRef = anoRef;
            this.valorParcela = valorParcela;
        }

        @Override
        public String toString() {
            return "Parcela: " + anoRef + " - Valor: " + valorParcela;
        }
    }

    // Simulação do banco de dados em memória
    private static Map<String, Aluno> alunos = new HashMap<>();
    private static Map<String, Nota> notas = new HashMap<>();
    private static Map<String, Parcela> parcelas = new HashMap<>();

    public static void main(String[] args) {
        // Exemplo de leitura e exibição do menu
        Scanner scanner = new Scanner(System.in);
        String opcao;
        do {
            exibirMenu();
            opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    consultaAlunos(scanner);
                    break;
                case "2":
                    cadastrarAluno(scanner);
                    break;
                case "3":
                    mostrarNotas(scanner);
                    break;
                case "4":
                    mostrarFinanceiro(scanner);
                    break;
                case "9":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("9"));
        scanner.close();
    }

    // Exibe o menu
    private static void exibirMenu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 - Consulta/Alteração/Exclusão");
        System.out.println("2 - Cadastro de Alunos");
        System.out.println("3 - Mostrar Notas");
        System.out.println("4 - Mostrar Financeiro");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Função de consulta de alunos
    private static void consultaAlunos(Scanner scanner) {
        System.out.print("Digite o código do aluno: ");
        String codigo = scanner.nextLine();
        Aluno aluno = alunos.get(codigo);
        if (aluno != null) {
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    // Função para cadastrar um aluno
    private static void cadastrarAluno(Scanner scanner) {
        System.out.print("Digite o código do aluno: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o sobrenome do aluno: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite o telefone do aluno: ");
        String fone = scanner.nextLine();
        System.out.print("Digite o CEP do aluno: ");
        String cep = scanner.nextLine();
        System.out.print("Digite a cidade do aluno: ");
        String cidade = scanner.nextLine();
        System.out.print("Digite o UF do aluno: ");
        String uf = scanner.nextLine();
        System.out.print("Digite o bairro do aluno: ");
        String bairro = scanner.nextLine();
        System.out.print("Digite a rua do aluno: ");
        String rua = scanner.nextLine();

        Aluno aluno = new Aluno(codigo, nome, sobrenome, fone, cep, cidade, uf, bairro, rua);
        alunos.put(codigo, aluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    // Função para mostrar as notas
    private static void mostrarNotas(Scanner scanner) {
        System.out.print("Digite o código do aluno para mostrar notas: ");
        String codigo = scanner.nextLine();
        Nota nota = notas.get(codigo);
        if (nota != null) {
            System.out.println(nota);
            System.out.println("Média: " + nota.calcularMedia());
        } else {
            System.out.println("Notas não encontradas.");
        }
    }

    // Função para mostrar informações financeiras
    private static void mostrarFinanceiro(Scanner scanner) {
        System.out.print("Digite o código do aluno para mostrar parcelas: ");
        String codigo = scanner.nextLine();
        Parcela parcela = parcelas.get(codigo);
        if (parcela != null) {
            System.out.println(parcela);
        } else {
            System.out.println("Informações financeiras não encontradas.");
        }
    }
}
