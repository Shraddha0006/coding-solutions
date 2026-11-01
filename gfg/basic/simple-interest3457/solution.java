import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        // code here
        double SI = (p * r * t)/100.0;
        System.out.printf("%.2f", SI);
        /*
        
                %.1f → 40.0
                %.2f → 40.00
                %.3f → 40.000

            Simple rule: Jab output ka format control karna ho, 
            jaise 40.00, 25.50, 10.75, tab printf useful hai.
        */
        
    }
}