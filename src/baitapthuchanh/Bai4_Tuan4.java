
package baitapthuchanh;

import java.util.Scanner;

public class Bai4_Tuan4 {
    static Scanner sc = new Scanner(System.in);
    static int n;
    public static boolean KTSNT(int n)
    {
        if(n<2)
            return false;
        for( int i =2; i<= Math.sqrt(n); i++)
            if(n%i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.print("nhap so n: ");    
        n = sc.nextInt();
        if(KTSNT(n))
            System.out.println(n + " la so nguyen to");
        else
            System.out.println(n + " khong phai la so nguyen to");
    }
}
