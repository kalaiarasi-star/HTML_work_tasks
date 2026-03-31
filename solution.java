import java.util.*;
class Solution{
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = addition(a,b);
    System.out.print(c);
    }
    static int addition(int a, int b){
        int c = a+b;
        return c;
    }
}