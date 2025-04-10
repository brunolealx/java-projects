import java.io.*;
import java.io.IOException;
import java.io.RandomAccessFile;


public class  ReadRecord {
	//atributos da minha classe
	

            // Read input file and write to output file
            String eof = "N";
            int recordCount = 0;
            while (eof.equals("N")) {
               if (recordCount > 1 ) { eof = "f"; }
   
                // Read input record
                inputRec.nome = readFixedLengthString(inputFile, 20);
                inputRec.snome = readFixedLengthString(inputFile, 30);

                // Check for end of file
                if (inputFile.getFilePointer() == inputFile.length()) {
                    eof = "Y";
                }
              recordCount++;
}
}
