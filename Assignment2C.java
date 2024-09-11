public class pattern 
{
    public static void main(String[] args) 
    {
        for (int a = 0; a <5; a++) {
            for (int b = 0; b < a; b++) {
                if (b%2==0){
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
