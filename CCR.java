import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CCR {
    public int getFreq(ArrayList<String> a, ArrayList<String> b, ArrayList<Integer> freq, String strA, String strB)
    {
        int num = -1; // If no value, return -1

        try {
            if (a.contains(strA) && b.contains(strB)) 
            {
                for (int i = 0; i < a.size(); i++)
                {
                    if (a.get(i).toString().compareTo(strA) == 0 && b.get(i).toString().compareTo(strB) == 0)
                    {
                        num = i;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return num;
    }

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
            System.out.println("Read Done.");
        }catch ( IOException e ) {
            System.out.println(e);
        } 

        // freq index
        CCR myCCR = new CCR();
        System.out.println(myCCR.getFreq(a, b, freq, "cleveland", "debate"));
    }
}











