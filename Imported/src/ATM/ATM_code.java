package ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM_code {
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(in);
	
	int login() throws IOException{
		
		int pinn,pin=6311,i=0;
		//InputStreamReader in = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(in);
		try{
			System.out.println("Enter your password : ");
			pinn = Integer.parseInt(br.readLine());
			while(i<2){
				if(pinn!=pin)
				{
					throw new Wrong_pin("Incorrect pin.Please enter pin again");
					}
				else
					return 1;
						
			}
				
		}catch(Wrong_pin k){
			System.out.println(k);
			return 0;
		}
		return 0;
	}
	
	void withdrawal() throws NumberFormatException, IOException, MultipleOfHundered{
		int r = login();
		if(r==1){
			int balance = 5000,wd;
			System.out.println("Enter amount to be withdraw :");
			wd = Integer.parseInt(br.readLine());  
			try{
				if(wd<=balance){
					if(wd%100!=0){
						throw new MultipleOfHundered("Enter amount in multiples of hundred!");
					}
					else
					{
						System.out.println("Your transaction is being processed...");
						System.out.println("Collect your cash..");
						balance = balance - wd;	
						System.out.println("Updated balance is : "+balance);
					}
					
					
				}
				else{
					throw new Insufficient_balance("Insufficient balance..!");
				}
			}catch(Insufficient_balance k){
				System.out.println(k);
			}
			catch(MultipleOfHundered h){
				System.out.println(h);
				}
			finally{
				home();
			}
			

			
		}else{
			System.out.println("Login failed..!");
			home();
			
			
		}
			
		}
	
	void home() throws NumberFormatException, IOException, MultipleOfHundered{
		int x;
		System.out.println("Press 1]login\t 2]Withdraw\t 3]Exit :");
		x = Integer.parseInt(br.readLine());
		switch(x){
		case 1 :
			login();
			break;
		case 2:
			withdrawal();
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("pls enter valid no.:");
			
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException, MultipleOfHundered {
		ATM_code s = new ATM_code();
		s.home();
		//InputStreamReader in = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(in);
		
		// TODO Auto-generated method stub

	}

}
