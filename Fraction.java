public class Fraction
{
    // instance variables
    int num;
    int denom;

    // methods
    public Fraction(int num, int denom){
        try{
            int quo = num / denom;
        }
        catch(IllegalArguementException e){
            System.out,println("Results in undefined, denominator cannot equal 0.");
            return;
        }
        if (num > 0 && denom < 0){
            this.num = -num;
            this.denom = Math.abs(denom);
        }
        else if (num < 0 && denom < 0){
            this.num = Math.abs(num);
            this.denom = Math.abs(num);
        }
    }
}
