import java.util.Scanner;
class character 
{
    public static void main(String args[])
  {
        Scanner scan=new Scanner(System.in);
        try {
            System.out.print("Enter String : ");
            String str = scan.nextLine();
            for(int i=0;i<str.length();i+=2) {
                System.out.print(" " + str.charAt(i));
            }
        } catch (Exception e) {}
    }
}
