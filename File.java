import static java.nio.file.StandardOpenOption.APPEND;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {
	protected char continut;
	File(char _continut)
	{
		this.continut = _continut;
	}
	public void setContinut(char _continut)
	{
		this.continut = _continut;
	}

    public void writeOutput()
    {
    	
        Path p = Paths.get("C:\\OOP Java\\Criptare2.0\\src\\encoded.bin");
        try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, APPEND))) 
        {
            out.write(this.continut);
        } 
        catch (IOException x) 
        {
            System.err.println(x);
        }
    }
	
}
