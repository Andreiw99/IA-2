import static java.nio.file.StandardOpenOption.APPEND;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Codificator extends File{

	Codificator(char _continut) {
		super(_continut);
		
	}
	 public void codificare()
	    {
	    	Random rand = new Random();
	        int n1 = rand.nextInt(100);;
	        int n2 = 255 + n1;
	        this.continut = (char) (n1 + (continut+n1	) % (n2-n1));
	    }


}
