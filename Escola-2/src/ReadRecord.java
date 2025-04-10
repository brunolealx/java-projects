
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadRecord {

  // Classe para armazenar os dados dos registros
  static class Recordin {
    String nome;
    String snome;
  }

  public static void main(String[] args) {
    // Caminho para o arquivo
    String pasta = "C:/Projetos/java-projetos/Escola-2/src/";

    try {
      // Abre o arquivo de entrada para leitura
      RandomAccessFile inputFile = new RandomAccessFile(pasta + "nomeSnome.txt", "r");

      // Define a estrutura do registro
      Recordin inputRec = new Recordin();

      // Lê o arquivo de entrada e escreve a saída
      String eof = "N"; // Indicador de fim de arquivo
      int recordCount = 0;

      // Loop para ler os registros do arquivo
      while (eof.equals("N")) {
        if (recordCount > 1) {
          eof = "f"; // Encerra o loop após ler o primeiro registro (ajustado para o seu caso)
        }

        // Lê o registro de entrada
        inputRec.nome = readFixedLengthString(inputFile, 20);
        inputRec.snome = readFixedLengthString(inputFile, 30);

        // Exibe o registro
        System.out.println(inputRec.nome + " " + inputRec.snome);

        // Verifica o final do arquivo
        if (inputFile.getFilePointer() == inputFile.length()) {
          eof = "Y";
        }

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

    // Retorna a string com espaços extras removidos
    return new String(bytes).trim();
  }
}
