/**
 * @author Hajar Mahmoud Mohammed Debian
 *      ID: 20190661
 *@author Shehab Eldin Ahmmed Sabry
 *      ID: 20190265
 *@author Omar Hamed Hashem Hamed
 *      ID : 20190349
 *@date 30/4/2020
 */

package task;

import java.util.Scanner;

public class Main {
	
	/**
	 *The main function to build and execute the program 
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		/**
		 * A scanner statement to allow taking inputs from the user
		 */
		Scanner scan = new Scanner(System.in); 
		
		/**
		 * Creating an object from class (Account)
		 */
		Account account = new Account();
		
		/**
		 * Creating an object from class (SpecialAccount)
		 */
		SpecialAccount specialaccount = new SpecialAccount();
		
		/**
		 * Creating an object from class (Client)
		 */
		Client client= new Client();
		
		/**
		 * Creating an object from class (CommercialClient)
		 */
		CommercialClient commercialclient= new CommercialClient();
		
		/**
		 * an object from class(Bank)
		 */
		Bank bank;
		
		/**
		 * giving the bank object values
		 */
		bank=new Bank("BankName","BankAdress",00000000000);
		
		/**
		 * A boolean variable
		 */
		boolean decision= true;
		
		/**
		 * A while loop that uses the variable (decision), to determine the state of the program (on/off)
		 */
		while(decision)
		{
			/**
			 * printing some statements to the user
			 */
			System.out.println("1-create account"+"\r\n"+"2-display all accounts"+"\r\n"+"3-exit");
			
			/**
			 * a variable for the if statement to determine the choice the user chose
			 */
			int choice=scan.nextInt();
			
			/**
			 * some if statements to execute some pieces of code for every choice of the user's
			 */
			
			/**
			 * the first state (create account)
			 */
			if(choice==1)
			{
				/**
				 * displaying a list for the user
				 */
				System.out.println("1-regular account"+"\r\n"+"2-special account");
				
				/**
				 * taking an input that represents the user's choice
				 */
				int choice1=scan.nextInt();
				
				/**
				 * inner if statement for each case/ state in the inner list
				 */
				
				/**
				 * first case of the inner list (regular account)
				 */
				if(choice1==1)
				{
					/**
					 * asking the user for his account number
					 */
					System.out.println("account number :");
					
					/**
					 * taking the account number as an input
					 */
					long num = scan.nextLong();
					
					/**
					 * storing its value by setting it using the setAccountNumber method from class (Account)
					 */
					account.setAccountNumber(num);
					
					/**
					 * adding the user's account to the accounts list by calling addAccount method from class (Bank)
					 */
					bank.addAccount(account);
				
				}
			
				/**
				 * second case of the inner list (special account)
				 */
				else if(choice1==2)
				{
					/**
					 * asking the user for his account number
					 */
					System.out.println("account number :");
					
					/**
					 * taking the account number as an input from the user
					 */
					long num = scan.nextLong();
					
					/**
					 * storing its value by setting it using the setAccountNumber method from class (SpecialAccount)
					 */
					specialaccount.setAccountNumber(num);
					
					/**
					 * adding the user's account to the accounts list by calling addAccount method from class (Bank)
					 */
					bank.addAccount(account);
				}
				
				/**
				 * displaying another inner list to the user
				 */
				System.out.print("1-Regular Client"+"\r\n"+"2-Commercial Client"+"\r\n"+":");
				
				/**
				 * taking the user's choice as an input
				 */
				int choice2 = scan.nextInt();
				
				/**
				 * another inner if statement for each case/ state in the inner list
				 */
				
				/**
				 * first case of the inner list (regular account) and (Regular Client)
				 */
				if(choice2== 1 && choice1==1)
				{
					/**
					 * asking the user for his name
					 */
					System.out.println("name:");
					
					/**
					 * taking the user's name as an input
					 */
					String name=scan.next();
					
					/**
					 * storing the user's name by using the setName method in class (Client)
					 */
					client.setName(name);
					
					/**
					 * asking the user for his national ID
					 */
					System.out.println("national ID:");
					
					/**
					 * taking the user's national ID as an input
					 */
					Long id=scan.nextLong();
					
					/**
					 * storing the user's national ID by using the setNationalID method from class (Client) 
					 */
					client.setNationalID(id);
					
					/**
					 * asking the user for his address
					 */
					System.out.println("address:");
					
					/**
					 * taking the user's address as an input
					 */
					String address=scan.nextLine();
					
					/**
					 * storing the user's address by using the setAddress method from class (Client)
					 */
					client.setAddress(address);
					
					/**
					 * asking the user for his phone number
					 */
					System.out.println("phone:");
					
					/**
					 * taking the user's phone number as an input
					 */
					Long phone =scan.nextLong();
					
					/**
					 * storing the value of the user's phone number by using the method setPhone from class (Client)
					 */
					client.setPhone(phone);
					
					/**
					 * storing the user's account using the method setAccount from class (Client)
					 */
					client.setAccount(account);
					
					/**
					 * adding the user as a client to the bank using the method addClient from class (Bank)
					 */
					bank.addClient(client);
				}
				
				/**
				 * second case of the inner list (special account) and (Commercial Client)
				 */
				else if(choice2== 2 && choice1==2)
				{
					/**
					 * asking the user for is name
					 */
					System.out.println("name:");
					
					/**
					 * taking the user's name as an input
					 */
					String name=scan.next();
					
					/**
					 * storing the user's name by using the method setName from the class (commercialclient)
					 */
					commercialclient.setName(name);
					
					/**
					 * asking the user for his commercial ID
					 */
					System.out.println("commercial ID:");
					
					/**
					 * taking the use's commercial ID as an input
					 */
					Long id=scan.nextLong();
					
					/**
					 * storing the user's commercial ID by using the method setCommercialID from the class (commercialclient)
					 */
					commercialclient.setCommercialID(id);
					
					/**
					 * asking the user for his address
					 */
					System.out.println("address:");
					
					/**
					 * taking the user's address as an input
					 */
					String address=scan.next();
					
					/**
					 * storing the user's address
					 */
					commercialclient.setAddress(address);
					
					/**
					 * asking the user for his phone number
					 */
					System.out.println("phone:");
					
					/**
					 * taking the user's phone number as an input
					 */
					Long phone =scan.nextLong();
					
					/**
					 * storing the user'd phone number
					 */
					commercialclient.setPhone(phone);
					
					/**
					 * storing the user's account
					 */
					commercialclient.setAccount(specialaccount);
					
					/**
					 * adding the user's account to the bank system
					 */
					bank.addClient(commercialclient);
				}
			}
			
			/**
			 * the second state (display all accounts)
			 */
			else if(choice==2)
			{
				/**
				 * calling the implemented methods in class Bank
				 */
				bank.displayAccounts();
				bank.displayClients();
			}
			
			/**
			 * the third and last state (exit)
			 */
			else if(choice==3)
			{
				/**
				 * terminating from the program
				 */
				decision= false;
			}
		
		}
	}
}
