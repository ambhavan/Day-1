package com.cg.corejava;


	import java.util.Scanner;
	 
	class Login {
		String userId="Priya",password="password@123";
		int lAttempt=3;
		public String lUser(String user,String pword) {
			if(user.equals(userId)&&pword.equals(password)) {
				return "yes";
			}
			else {
				return "no";
			}
		}
	

}
	public class CUI {
		public static void main(String args[]) {
			Login login=new Login();
			String userId,password;
			Scanner sc=new Scanner(System.in);
			int lAttempt=0;
			while(true) {
				System.out.println("Enter userId:");
				userId=sc.next();
				System.out.println("Enter password:");
				password=sc.next();
				String res=login.lUser(userId,password);
				if(res.equals("yes")) {
					System.out.println("Welcome "+userId);
					break;
				}
				else {
					lAttempt++;
					if(lAttempt==3)
					{
						System.out.println("You have entered wrong credentials 3 times,Contact Admin");
				break;
			}
					System.out.println("You have entered wrong credentials,please enter the right credentials");
		}
			}
		}
	}	
	