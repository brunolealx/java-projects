
import java.io.IOException;
import java.io.RandomAccessFile;

public class Lernomes {
    public static void main(String[] args) {
        // Caminho atualizado para o seu ambiente Windows
        String pasta = "C:/Projetos/java-projetos/Escola-2/src/";

        try {
            // Abre o arquivo de entrada
            RandomAccessFile inputFile = new RandomAccessFile(pasta + "nomeSnome.txt", "r");

            // Define a estrutura do registro
            Recordin inputRec = new Recordin();

            // Lê o arquivo de entrada e escreve a saída
            int recordCount = 0;

            // Loop para ler registros até o fim do arquivo
            while (inputFile.getFilePointer() < inputFile.length()) {
                // Lê o registro de entrada
                inputRec.nome = readFixedLengthString(inputFile, 20);
                inputRec.snome = readFixedLengthString(inputFile, 30);

                // Exibe o registro
                System.out.println(inputRec.nome + " " + inputRec.snome);

                recordCount++;
            }

            // Fecha o arquivo
            inputFile.close();

            System.out.println("Processamento concluído. " + recordCount + " registros processados.");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Função para ler uma string de comprimento fixo
    private static String readFixedLengthString(RandomAccessFile file, int length) throws IOException {
        byte[] bytes = new byte[length];
        file.read(bytes);

        return new String(bytes).trim(); // Utiliza trim() para remover espaços extras
    }
}

// Classe para armazenar os dados dos registros
class Recordin {
    String nome;
    String snome;
}
