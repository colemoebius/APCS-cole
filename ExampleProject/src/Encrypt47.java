import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Encrypt47 implements Interface47{
	Scanner reader;
	File file;
	String plaintext="";
	String ciphertext="";
	public Encrypt47(){
		
	}
public void Read(){
			try {
			reader = new Scanner(new File("C:\\Users\\moebiusc5097\\Desktop\\input.txt"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		while (reader.hasNext()){
			  plaintext += reader.nextLine();
		}
	}
 	

public char rotate47(char add47){
	
		if(add47 != ' '){
		add47+=47;
	
		if(add47 > 126){
			add47-=94;
		}
		}
	return add47;
	
}
public String encrypt(){
	for(int i = 0; i<plaintext.length();i++){
		 
		char temp = rotate47(plaintext.charAt(i));
		ciphertext+= temp;
	}
	return ciphertext.toString();
	
}
public void Write(){
	try {

		

		 file = new File("C:/Users/moebiusc5097/Desktop/encrypted.txt");

		
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(ciphertext);
		bw.close();

		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
public String toString(){
	return "Encrypted Text: "+ ciphertext;
}
public static void main(String[] args) {
	Encrypt47 encrypted = new Encrypt47();
	encrypted.Read();
	encrypted.encrypt();
	encrypted.Write();
	System.out.println(encrypted);
	Decrypt47 decrypted = new Decrypt47();
	decrypted.Read();
	decrypted.decrypt();
	decrypted.Write();
	System.out.println(decrypted);
	
	
		
	
}
}