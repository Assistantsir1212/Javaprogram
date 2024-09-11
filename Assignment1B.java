import java.util.Scanner;

public class VowelExtractor 
{
    public static void main(String[] args) 
  {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
       input = input.toLowerCase();
       StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels.append(c);
            }
        }
        System.out.println("Vowels in the string: " + vowels.toString());
        scanner.close();
    }
}
