package assignment;
import java.util.Arrays;
import java.util.Scanner;


public class anagrams {

	public static boolean isAnagram(String str1,String str2)
	 {  
		boolean flag=false;
		if(str1.length()!=str2.length()){
			return flag;
			}
		else {
			char[] Array1=str1.toCharArray();
			char[] Array2=str2.toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			flag= Arrays.equals(Array1,Array2);
			return flag;}
				

  }

		public static void  main(String[] args){
			Scanner s= new Scanner(System.in);
			String str1= s.nextLine();
			String str2= s.nextLine();
			if(isAnagram(str1,str2))
			 System.out.println("yes it is an anagram");
			else
			System.out.println("no it is not an anagram");
			
		}

	}
	
