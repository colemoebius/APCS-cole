import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Decrypt47 implements Interface47 {
	Scanner reader;
	String plaintext="";
	String ciphertext="";
	File file;
	public Decrypt47(){
		
	}
	
public void Read(){
		
		try {
			reader = new Scanner(new File("C:\\Users\\moebiusc5097\\Desktop\\encrypted.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (reader.hasNext()){
			  ciphertext += reader.nextLine();
		}
	}
	
	public char rotate47(char add47) {
		if(add47 != ' '){
			add47-=47;
		
			if(add47 < 33){
				add47+=94;
			}
			}
		return add47;
	}
	public String decrypt(){
		for(int i = 0; i<ciphertext.length();i++){
			 
			char temp = rotate47(ciphertext.charAt(i));
			plaintext+= temp;
		}
		return plaintext.toString();
	}
	

	
public void Write(){
			try {

				

				 file = new File("C:\\Users\\moebiusc5097\\Desktop\\decrypted.txt");

				
				if (!file.exists()) {
					file.createNewFile();
				}

				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(plaintext);
				bw.close();

				
			} catch (IOException e) {
				e.printStackTrace();
			}
			}

public String toString(){
	return "Decrypted Text: " + plaintext;
}
	}


