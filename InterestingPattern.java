import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int i=1;
		while(i<=n) {
			int j=1;
			char p=(char)('A'+n-i);
			while(j<=i) {
				
                System.out.print(p);
                p=(char)(p+1);
				j+=1;
			}
			System.out.println();
			i+=1;
        }
	}

}
