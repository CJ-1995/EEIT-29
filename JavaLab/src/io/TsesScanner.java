package io;

import java.util.Scanner;

public class TsesScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請選擇");
		System.out.println("1:xxx");
		System.out.println("2:xxx");
		String answer = scanner.nextLine();
		int parseInt = Integer.parseInt(answer);
		System.out.println("使用著輸入:"+answer);
		
	}

}
