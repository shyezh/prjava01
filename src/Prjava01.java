
/**
 *
 * @author shyezh1617daw2
 */
import java.io.*;

public class Prjava01 {
    public static void main(String[] args) throws IOException{
        File f = new File("fitxer.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
        bw.write("<html>");bw.newLine();
        bw.write("  <head>");bw.newLine();
        bw.write("      <title>");bw.newLine();
        bw.write("      Nova p&agrave; gina web");bw.newLine();
        bw.write("      </title>");bw.newLine();
        bw.write("  </head>");bw.newLine();
        bw.write("  <body>");bw.newLine();
        bw.write("  Nova p&agrave; gina web");bw.newLine();
        bw.write("  </body>");bw.newLine();
        bw.write("</html>");bw.newLine();
        }
    }
}

