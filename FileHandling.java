import java.io.*;
public class FileHandling
{
	public static void main(String[] args) {
		try {
		    File f = new File("Demo.txt");
    		if(f.createNewFile())
    		{
    		    System.out.println("File " + f.getName() + " created successfully");
    		}
    		else
    		{
    		    System.out.println("File is already present");
    		}
		} catch(IOException e) {
		    e.printStackTrace();
		}
	}
}