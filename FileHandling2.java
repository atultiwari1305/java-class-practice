import java.io.*;
public class FileHandling2
{
	public static void main(String[] args) {
		try {
		    File f = new File("Demo1.txt");
    		if(f.createNewFile())
    		{
    		    System.out.println("File " + f.getName() + " created successfully");
                System.out.println("File is readable? "+f.canRead());
                System.out.println("File is writable? "+f.canWrite());
                System.out.println("File length "+f.length());
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