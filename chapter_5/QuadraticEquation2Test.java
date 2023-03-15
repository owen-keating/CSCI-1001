import java.util.Scanner;

public class QuadraticEquation2Test {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=s.nextInt();
        System.out.print("Enter b: ");
        int b=s.nextInt();
        System.out.print("Enter c: ");
        int c=s.nextInt();
        QuadraticEquation2 q = new QuadraticEquation2(a,b,c);
        System.out.println(q.getNumSolns(a)+".\nThe solutions are the following: " + q.getSolns());
    }

}
