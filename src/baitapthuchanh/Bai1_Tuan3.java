
package baitapthuchanh;

import java.util.Scanner;

public class Bai1_Tuan3 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static void main(String[] args) {
        System.out.print("nhap so n: ");    
        n = sc.nextInt();
        if(n==0)
            System.out.println("n la so 0. ");
        else
            if(n>0)
                System.out.println("n la so duong.");
            else
                System.out.println("n la so am.");
    }
 
}
    