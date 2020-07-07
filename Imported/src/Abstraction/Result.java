package Abstraction;

import java.io.IOException;

public class Result extends Exam implements Grade{
	float p;
	int i;
	public void findGrade(){
		p = (float)(m1+m2+m3)/3;
		
		String s = String.format("%.2f",p);
		p = Float.parseFloat(s);
		System.out.println("-----------------------------------------------------------");		
		
		System.out.print("Percentage : "+p+"     ");
		if (90<p && p<100)
		{
			System.out.println("Grade : AA");		
		}
		else if (80<p && p<90)
		{
			System.out.println("Grade : AB");		
		}
		else if (70<p && p<80)
		{
			System.out.println("Grade : BA");		
		}
		else if (60<p && p<70)
		{
			System.out.println("Grade : BB");		
		}
		else if (35<p && p<60 || p==35)
		{
			System.out.println("Grade : DD");		
		}
		else if (p<35)
		{
			System.out.println("Result : Fail");		
		}		
		
			
		System.out.println("-----------------------------------------------------------");		
			
	}

	public static void main(String[] args) throws IOException {
		Result r =new Result();
		r.accept();
		r.findGrade();
		
		
		// TODO Auto-generated method stub

	}

}
