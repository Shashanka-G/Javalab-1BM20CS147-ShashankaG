import java.util.*;


public class prime_chck
{

	public static void main(String[] args) {

		int n,flag=0;

		System.out.println("Enter a Number:");

		Scanner sc = new Scanner(System.in);

		n=sc.nextInt();

		for(int i=2;i<n;i++){

		    if(n%i==0)

		        flag=1;

		}

		if(flag==1){

		    System.out.println(n+" is composite");

		}else{

		    System.out.println(n+" is prime");

		}

	}

}
