import java.util.*;
import java.io.*;

public class CausalNetRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("eng_small_test.txt"));
        String line="";
        HashMap<String, HashMap> causalMap = new HashMap<>();
        while((line=br.readLine())!=null) {
            String[] lines=line.split("\t");
            if(causalMap.get(lines[0])==null) {
                HashMap<String, Integer> tempMap = new HashMap<>();
                tempMap.put(lines[1], Integer.parseInt(lines[2]));
                causalMap.put(lines[0], tempMap);
                continue;
            }
            causalMap.get(lines[0]).put(lines[1], Integer.parseInt(lines[2]));
        }
        
        System.out.println(causalMap.get("boat").get("ocean"));
    }
}