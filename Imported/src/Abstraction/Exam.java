package Abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exam {
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(in);
	
	int m1,m2,m3;
	void accept() throws IOException{
		System.out.println("Enter three subject mark : ");
		m1 = Integer.parseInt(br.readLine());
		m2 = Integer.parseInt(br.readLine());
		m3 = Integer.parseInt(br.readLine());
		
	}

}
