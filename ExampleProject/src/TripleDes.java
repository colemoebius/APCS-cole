import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
public class TripleDes implements myInterface{
	//three 56bit keys or one 186 bit key
	//encrypt --> decrypt --> encrypt
	// 64 bit block of plaintext
	//how do i make a key?
	//should my strings be bytes?
	//can u use the encrypt methods on java api?
	//what happens at the mixing part (xor)
	//help with sbox and pbox(or can i take one online)
	String text="";
	String ciphertext;
	Scanner reader;
	public TripleDes(){
		
	}
	public void Read(){
		
		try {
			reader = new Scanner(new File("C:\\Users\\moebiusc5097\\Desktop\\input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (reader.hasNext()){
			  text += reader.nextLine();
		}
	}
	
	
	public Byte[] encrypt(String plaintext){
		String half1 = plaintext.substring(0, plaintext.length()/2);
		String half2 = plaintext.substring(plaintext.length()/2, plaintext.length());
		for(int i = 0; i<plaintext.length();i+=8){
			
		}
		return null;
		
	}
	

	@Override
	public String Decrypt(Byte[] ciphertext) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
