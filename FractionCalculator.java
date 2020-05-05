import java.util.Scanner;

public class FractionCalculator
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        boolean fin = false;
        Fraction num;
        Fraction denom;
        Fraction ansfrac;
        String op;
        System.out.println("Welcome to the Fraction Calculator!");
        System.out.println("It will add, subtract, multiply, and divide fractions until you type Q to quit.");\
        System.out.println("Please enter your fractions in the form a/b where a and b are both integers.");
        while (!fin){
            op = getOperation(kb);
            if (!op.equals("q") || !op.equals("Q")){
                num = getFraction(kb);
            }
        }
    }

    public static String getOperation(Scanner kb){
        String operation = "-=+/*qQ";
        System.out.print("Enter an operation to continue (+, -, *, /, = or q to quit): ");
        String input = kb.next();
        if (input.length() == 1 && operation.indexOf(input.substring(0,1)) >= 0){
            return input;
        }
        else{
            System.out.println("Not a valid operation!");
            return getOperation(kb);
        }
    }
    public static boolean validFraction(String input){
        if (input.substring(1, input.length()).contains("-")){
            return false;
        }
        String rem = input.replaceALL("[0-9]", "");
        if(remove.equals("/") || remove.isEmpty())
        {
            return true;
        }
        return false;
    }
    public static Fraction getFraction(Scanner kb){
        System.out.println ("Enter a fraction (a / b) or an integer (a): ");
        String fraction = kb.nextLine();
        int num;
        int div;
        int denom;
        if (validFraction(fraction)){
            div = fraction.indexOf("/");
            num = Integer.parseInt(fraction.substring(0,div));
            denom = Integer.parseInt(fraction.substring(split + 1, frac.length()));
            return new Fraction(num, denom);
        }
        else{
            num = Integer.parseInt(fraction);
            return new Fraction(num);
        }
        System.out.print("Not a proper input! ");
        return getFraction(kb);
    }
}

