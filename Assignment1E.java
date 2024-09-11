public class pattern {
    public static void main(String[] args) 
    {         
        for (int a = 1; a <= 5; a++) {
            int j=5;
            for (int b = 1; b <= a; b++) {
                System.out.print(j+" ");
                j--;
            }
            System.out.println("\t");
        }
    }
}
