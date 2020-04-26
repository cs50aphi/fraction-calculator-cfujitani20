import java.util.Scanner;

public class FractionDriver
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Num 1: ");
        int n1 = kb.nextInt();
        System.out.print("Den 1: ");
        int d1 = kb.nextInt();
        System.out.print("Num 2: ");
        int n2 = kb.nextInt();
        System.out.print("Den 2: ");
        int d2 = kb.nextInt();
        Fraction f1 = new Fraction(n1, d1);
        Fraction f2 = new Fraction(n2, d2);
        System.out.println(f1 + " + " + f2 + " is " + f1.add(f2));
        System.out.println(f1 + " - " + f2 + " is " + f1.sub(f2));
        System.out.println(f1 + " * " + f2 + " is " + f1.multi(f2));
        System.out.println(f1 + " / " + f2 + " is " + f1.div(f2));
        System.out.println(f1 + " is the same as " + f2 + ": " + f1.equals(f2));
    }
}

