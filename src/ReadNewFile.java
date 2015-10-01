import java.util.List;

/**
 * Created by Sandeep on 9/30/2015.
 */
public class ReadNewFile {
    public static PathRead topologyObj;
    public static PathWrite pathWrite;


    public static void main(String[] args) {
        topologyObj = new PathRead("NSF-SPF.txt");
        if (!topologyObj.readSuccess())
            System.exit(0);
        new PathWrite(topologyObj.getPaths());


    }
}
