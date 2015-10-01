import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;


public class PathRead {

	private boolean read_success;
	private static List<String> paths;
	
	public PathRead(String filename){
		this.read_success = true;
        System.out.print("Reading "+filename+": ");
        BufferedReader f;
        try{
			String temp;
            paths = new ArrayList<String>();
            f = new BufferedReader(new FileReader(filename));
       //     if(f.readLine().trim()=="(")
            int i=0;
				while ((temp = f.readLine()) != null) {
					temp = temp.trim();
					if (temp.length() == 1) {
						break;
					}
					paths.add(temp);
                    i++;
				}
            	

            f.close();
        }
        // If the file can't be opened:
        catch (IOException e){
        	this.read_success = false;
            System.out.println("\r\nERROR reading file " + filename + ": no such file or read error.");
        }
   //write into a text

	}

public  List<String> getPaths(){return this.paths;}
    public boolean readSuccess(){
        return this.read_success;
    }
}
