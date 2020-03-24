
import java.util.Random;

public class Codificator extends File{

	Codificator(char _continut) {
		super(_continut);
		
	}
	 public void encode()
	    {
	    	Random rand = new Random();
	        int n1 = rand.nextInt(100);;
	        int n2 = 255 + n1;
	        this.continut = (char) (n1 + (continut+n1	) % (n2-n1));
	    }


}
