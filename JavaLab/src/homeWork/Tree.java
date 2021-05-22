package homeWork;

public class Tree {

	public static void main(String[] args) {
		int Line = 4;
		for (int i = 1; i <= Line; i++) {
			for (int j = 1; j <= Line - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
	}

}
}

/*			      金 字 塔
空白格 1 2 3 * 5 6 7  	第一行的*=            4 					  
空白格 1 2 * * * 6 7  	第二行的*=          3 4 5 	
空白格 1 * * * * * 7      第三行的*=        2 3 4 5 6
空白格 * * * * * * *      第四行的*=      1 2 3 4 5 6 7
*/   
	     



