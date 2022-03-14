package assignment;
import java.util.Arrays;
import java.util.Scanner;


public class Anagrams {

	public  boolean isAnagram(String str1,String str2)
	 {  // if length is not equal than they are not an anagram
		boolean flag=false;
		if(str1.length()!=str2.length())
			return flag;
			
		else {
			char[] Array1=str1.toCharArray();
			char[] Array2=str2.toCharArray();
		//sorting and then comparing every charcter of Array1 with Array2	
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			flag= Arrays.equals(Array1,Array2);
			return flag;
		}
				

  
	}  
	/* that two strings are anagram of each other or not
     input-str1,str2
     isAnagram will return a flag
  
  */

		public static void  main(String[] args){
			Scanner s= new Scanner(System.in);
			String str1= s.nextLine();
			String str2= s.nextLine();
			Anagrams a= new Anagrams();
			if(a.isAnagram(str1,str2))
			 System.out.println("yes it is an anagram");
			else
			System.out.println("no it is not an anagram");
			
		}

	
}
	
