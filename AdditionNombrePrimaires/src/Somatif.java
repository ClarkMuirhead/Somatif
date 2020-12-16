/*
 * Author: Clark
 * Date: Dec 15, 2020
 * Description :  
 */

public class Somatif {

	public static void main(String[] args) 
	{ 
		int []myTab=new int[100];
		for(int i=0;i<100;i++)
		{
			myTab[i]=(int)(Math.random()*(i+1));
		}
		
		  for (int element : myTab) { System.out.println(element); }
		
		System.out.println("le somme des chiffres premiers est " + sommeNombresPremiers(myTab));

	}
	//code pour verifier si le chiffre est une chiffre premier
	static boolean isPrimeNumber(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i ==0)
			{
				return false;
			}
		}
		return true;
	}
	//programe pour addition les chiffres premiers
		static int sommeNombresPremiers(int [] a)
		{
		int sommeNombresPremiers=0;
		for(int i=0;i<a.length;i++)
		{
			if (isPrimeNumber(a[i]))
			
				sommeNombresPremiers+=a[i];  
		}
		return sommeNombresPremiers;
		
	}
}
	

		
