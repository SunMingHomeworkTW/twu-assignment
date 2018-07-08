import java.util.Scanner;

public class DiamondWithName {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            for (int j =n-i-1; j>0; j--) {
                System.out.print(" ");
            }
            for (int k =0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Sun Ming");
        for (int i = n-1; i>0; i--) {
            for (int j =n-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k =0; k<2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
