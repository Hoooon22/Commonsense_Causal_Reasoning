import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CCR {
    public static void main(String[] args) 
    {
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<Integer> freq = new ArrayList<Integer>();
        File f = new File("CausalNet.txt");

        // File exist
        if (f.isFile()) 
        {
            System.out.println("CausalNet.txt O");
        }
        else
        {
            System.out.println("CausalNet.txt X");
        }

        // File Read
        try{
            FileReader rw = new FileReader("CausalNet.txt");
            BufferedReader br = new BufferedReader( rw );

            String temp;
            String[] result = new String[3];
            while((temp = br.readLine()) != null) 
            {
                result = temp.split("\\s");
                a.add(result[0]);
                b.add(result[1]);
                freq.add(Integer.parseInt(result[2]));
            }

            System.out.printf("%s, %s, %d\n", a.get(1), b.get(1), freq.get(1));

        }catch ( IOException e ) {
            System.out.println(e);
        } 
    }
}











