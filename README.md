# palindrome
package assignment;
import java.util.Scanner;




public class palindrome {
	

	static void ispalindrome(int n) {
		 int r,sum=0,temp; 
		 temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome");    
		  else    
		   System.out.println("not a palindrome"); 
	
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  Scanner s= new Scanner(System.in);
		  int n= s.nextInt();
		  ispalindrome(n);
		  
		  
		  
		 
	

}
}
