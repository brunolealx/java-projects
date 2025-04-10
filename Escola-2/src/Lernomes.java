import java.io.*;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Lernomes{
    public static void main(String[] args) {
		String pasta = "/home/peracio/java-projetos/Escola-2/src/";
        try {
            // Open input and output files
            RandomAccessFile inputFile = new RandomAccessFile(pasta+"nomeSnome.txt", "r");
            // Define record structures
		 
		 Recordin inputRec = new Recordin();
			
            // Read input file and write to output file
            String eof = "N";
            int recordCount = 0;
            while (eof.equals("N")) {
               if (recordCount > 1 ) { eof = "f"; }
   
                // Read input record
                inputRec.nome = readFixedLengthString(inputFile, 20);
                inputRec.snome = readFixedLengthString(inputFile, 30);

                // Display record
                System.out.println(inputRec.nome + inputRec.snome);

                // Check for end of file
                if (inputFile.getFilePointer() == inputFile.length()) {
                    eof = "Y";
                }
                recordCount++;
            }
            //Close files
            inputFile.close();

            System.out.println("Processing complete. " + recordCount + " records processed.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String readFixedLengthString(RandomAccessFile file, int length) throws IOException {
        byte[] bytes = new byte[length];
        
        file.read(bytes);
        
        return new String(bytes);
    }

}
