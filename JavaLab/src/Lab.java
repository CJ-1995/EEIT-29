import java.util.Scanner;

public class Lab {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(N>100||N<0){
        N=scanner.nextInt();
        }
        if(N % 2 == 1){
            System.out.println("Weird");
        }
        else if( N % 2 == 0 & N <= 5  & N >= 2 ){
            System.out.println("Not Weird");
        }else if (N % 2 == 0 & N > 5 & N <= 20){
            System.out.println("Weird");
        }else if (N % 2 ==0 & N >= 20){
            System.out.println("Not weird");
        }
        scanner.close();
	}

}
