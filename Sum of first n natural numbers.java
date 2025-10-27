import java.util.*;
public class demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i<n){
				System.out.print(i+"+");
			}
			else{
				System.out.print(i+"=");
			}
			sum=sum+i;
		}
		System.out.print(sum);
	}
}
