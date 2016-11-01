package text2morse;

import java.util.Scanner;

public class morse {

	public static void main(String[] args) {
		while (true) {
		System.out.println("<Type 'set' for standard morse commands>");
		Scanner sc= new Scanner(System.in);
		String in= sc.nextLine();
		
		if (in.equals("set")) {
			System.out.println("(1) Understood"
					+ "\n(2) Error"
					+ "\n(3) Invitation to transmit (k)"
					+ "\n(4) Commencing signal (ct)"
					+ "\n(5) Wait (as)"
					+ "\n(6) End of work (va)"
					+ "\n(7) SOS"
					+ "\n Type a no: ");
			Scanner sc1= new Scanner(System.in);
			int no= sc1.nextInt();
			switch (no) {
			case 1:
				System.out.println("...-.");
				break;
			case 2:
				System.out.println("........");
				break;
			case 3:
				System.out.println("-.-");
				break;
			case 4:
				System.out.println("-.-.-");
				break;
			case 5:
				System.out.println(".-...");
				break;
			case 6:
				System.out.println("...-.-");
				break;
			case 7:
				System.out.println("...---...");
				break;
			}
			
		}
		
		else {
		String converted = in.toLowerCase().replaceAll("a", ".-")
				.replaceAll("b", "-...")
				.replaceAll("c", "-.-.")
				.replaceAll("d", "-..")
				.replaceAll("e", ".")
				.replaceAll("f", "..-.")
				.replaceAll("g", "--.")
				.replaceAll("h", "....")
				.replaceAll("i", "..")
				.replaceAll("j", ".---")
				.replaceAll("k", "-.-")
				.replaceAll("l", ".-..")
				.replaceAll("m", "--")
				.replaceAll("n", "-.")
				.replaceAll("o", "---")
				.replaceAll("p", ".--.")
				.replaceAll("q", "--.-")
				.replaceAll("r", ".-.")
				.replaceAll("s", "...")
				.replaceAll("t", "-")
				.replaceAll("u", "..-")
				.replaceAll("v", "...-")
				.replaceAll("w", ".--")
				.replaceAll("x", "-..-")
				.replaceAll("y", "-.--")
				.replaceAll("z", "--..")
				.replaceAll("1", ".----")
				.replaceAll("2", "..---")
				.replaceAll("3", "...--")
				.replaceAll("4", "....-")
				.replaceAll("5", ".....")
				.replaceAll("6", "-....")
				.replaceAll("7", "--...")
				.replaceAll("8", "---..")
				.replaceAll("9", "----.")
				.replaceAll("0", "-----")
				.replaceAll(".", ".-.-.-")
				.replaceAll(",", "--..--")
				.replaceAll(":", "---...")
				.replaceAll("'", ".----.")
				.replaceAll("/", "-..-.")
				.replaceAll("-", "-....-")
				.replaceAll("=", "-...-")
				.replaceAll("\\(", "-.--.")
				.replaceAll("\\)", "-.--.-")
				.replaceAll("`", ".-..-.")
				.replaceAll("\\+", ".-.-.")
				.replaceAll("\\?", "..--..");
				
				
		System.out.println(converted);
		}
	}
	}
}
