import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n");
            writer.append("Violets are blue \n");
            writer.close();
        }catch (IOException e) {
            System.out.println("Something went wrong while working on the file!");
        }
    }
}
