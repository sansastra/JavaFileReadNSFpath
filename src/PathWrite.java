import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Sandeep on 10/1/2015.
 */
public class PathWrite {
    List<String> paths;

    public PathWrite(List<String> paths1) {
     //   BufferedWriter writer;
        this.paths = paths1;
        //Path p = Paths.get("./nsf-path.txt");
        //Charset charset = Charset.forName("US-ASCII");
        String fileName = "nsf-path.txt";
        System.out.print("Writing " + fileName + ": ");

        try {
            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

            // Note that write() does not automatically
            // append a newline character.
           // String[] data;

            Pattern pattern = Pattern.compile(Pattern.quote(" "));
           // String[] data;
            String[] mapData = {"N14","N1","N2","N13","N3","N12","N8","N6","N11","N5","N7","N10","N4","N9"};
            for (int m=0; m<paths.size();m++) {
               String data = paths.get(m);
                String[] data1 = pattern.split(data);
                for (int i = 0; i < data1.length; i++) {
                   // data[i] = paths.get(m).get(i);
                    String one =mapData[Integer.parseInt(data1[i])];
                    bufferedWriter.write(one);
                    if(i!=data1.length-1)
                        bufferedWriter.write("-");

                }
                bufferedWriter.newLine();
            }


            // Always close files.
                bufferedWriter.close();
        }
        catch (IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}
