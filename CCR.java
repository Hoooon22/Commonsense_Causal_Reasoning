import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CCR {
    public static void main(String[] args) 
    {
		int lineCnt = 0;
        String temp;
        String[] result = new String[3];
        File f = new File("Causal.txt");
        // 파일 존재 여부 판단
        if (f.isFile()) 
        {
            System.out.println("Causal.txt O");
        }
        else
        {
            System.out.println("Causal.txt X");
        }

        // File Read
        try{
            FileReader rw = new FileReader("Causal.txt");
            BufferedReader br = new BufferedReader( rw );

            // line Count
            while(br.readLine() != null) 
            {
                lineCnt++;
            }
            String[] a = new String[lineCnt]; 
            String[] b = new String[lineCnt]; 
            int[] freq = new int[lineCnt];

            br = new BufferedReader( rw ); // Reread

            // arrange
            lineCnt = 0;
            while((temp = br.readLine()) != null) 
            {
                result = temp.split("\\s");
                a[lineCnt] = result[0];
                b[lineCnt] = result[1];
                freq[lineCnt] = Integer.parseInt(result[3]);
                lineCnt++;
            }

            System.out.printf("%s, %s, %d\n", a[1], b[1], freq[1]);

        }catch ( IOException e ) {
            System.out.println(e);
        } 
    }
}











