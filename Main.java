import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main 
{
    public static void main(String[] args) throws IOException 
    {

        Codificator continut;
        continut = new Codificator(' ');

        File fin=new File("C:\\OOP Java\\Criptare2.0\\src\\input.txt");     //Creation of File Descriptor for input file
        FileReader fr=new FileReader(fin);   //Creation of File Reader object
        BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
        int c = 0;

        while((c = br.read()) != -1)         //Read char by Char
        {
            char character = (char) c;          //converting integer to char
            continut.setContinut(character);
            continut.codificare();
            continut.writeOutput();
        }
        br.close();
    }

}
