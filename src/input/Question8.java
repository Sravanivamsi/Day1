package input;
import java.util.Scanner;
public class Question8 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int value = (int)ch;
		int num = sc.nextInt();
		char result = (char)num;
		System.out.println(value);
		System.out.println(result);
	}

}



