import java.util.*;

public class FractionCalculator
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String op;
        boolean fin = false;
        Fraction uno = new Fraction(1);
        Fraction dos = new Fraction(1);
        Fraction val;

        //Welcome text
        System.out.println("Welcome to the Fraction Calculator!");
        System.out.println("It will add, subtract, multiply, and divide fractions until you type Q to quit.");
        System.out.println("Please enter your fractions in the form a/b where a and b are both integers.");
        System.out.println("---------------------------------------------------------------------------");
        // Operations loop
        while (!fin)
        {
            op = getOperation(kb);
            if (!op.equals("q") && !op.equals("Q"))
            {
                uno = getFraction(kb);
                dos = getFraction(kb);
                switch (op)
                {
                    // add fractions
                    case "+":
                        val = uno.add(dos);
                        System.out.println(uno + " + " + dos + " is " + val);
                        break;
                    // subtract fractions
                    case "-":
                        val = uno.sub(dos);
                        System.out.println(uno + " - " + dos + " is " + val);
                        break;
                    // multiply fractions
                    case "*":
                        val = uno.multi(dos);
                        System.out.println(uno + " * " + dos + " is " + val);
                        break;
                    // divide fractions
                    case "/":
                        val = uno.div(dos);
                        System.out.println(uno + " / " + dos + " is " + val);
                        break;
                    case "q":
                        fin = true;
                        break;
                    case "Q":
                        fin = true;
                        break;
                    // compare fractions if equal
                    case "=":
                        if (uno.equals(dos))
                        {
                            System.out.println(uno + " = " + dos + " are equal");
                        }
                        else
                        {
                            System.out.println(uno + " = " + dos + " are not equal");
                        }
                        break;
                }
            }
            else
            {
                System.out.println("Thanks for using fraction calculator! See ya!");
                fin = true;
            }
        }
    }

    public static String getOperation(Scanner kb)
    {
        // string of op
        String operation = "-=+/*qQ";
        System.out.print("Enter an operation to continue (+, -, *, /, = or q to quit): ");
        String input = kb.next();
        // check if proper op
        if (input.length() == 1 && operation.indexOf(input.substring(0,1)) >= 0)
        {
            return input;
        }
        // check for invalid op
        else
        {
            System.out.println("Not a valid operation!");
            return getOperation(kb);
        }
    }
    public static boolean validFraction(String frac)
    {
        // check denom if it is neg otherwise go to letters
        if ((frac.indexOf("-") > frac.indexOf("/")))
        {
            return false;
        }
        // check for letters
        for (int i = 0, k = frac.length(); i < k; i++)
        {
            if (Character.isLetter(frac.charAt(i)))
            {
                return false;
            }
            if (i > 0 && frac.charAt(i) == '-')
            {
                return false;
            }
        }
        // check if double was entered
        if (frac.indexOf(".") != -1)
        {
            return false;
        }
        return true;
    }
    public static Fraction getFraction(Scanner kb)
    {
        int num;
        int denom;
        int div;
        System.out.println ("Enter a fraction (a / b) or an integer (a): ");
        String input = kb.next();
        // check validity of fraction
        if (validFraction(input))
        {
            // check for whole number
            if (input.indexOf("/") != -1)
            {
                // find the div sign in string and parse int's
                div = input.indexOf("/");
                num = Integer.parseInt(input.substring(0, div));
                denom = Integer.parseInt(input.substring(div + 1, input.length()));
                return new Fraction(num, denom);
            }
            // if whole number use whole number for parse
            else
            {
                num = Integer.parseInt(input.substring(0));
                return new Fraction(num);
            }
        }
        // not valid fraction
        else
        {
            System.out.print("Not a proper input! ");
            return getFraction(kb);
        }
    }
}

