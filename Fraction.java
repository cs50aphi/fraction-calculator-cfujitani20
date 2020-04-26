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
    public Fraction(int num){
        this.num = num;
        denom = 1;
    }
    public Fraction(){
        this.num = 0;
        denom = 1;
    }
    public int getNumerator(){
        return num;
    }
    public int getDenominator(){
        return denom;
    }
    public String toString(){
        if (denom == 1)
        {
            return Integer.toString(num);
        }
        return num + "/"+ denom;
    }
    public Double toDouble(){
        return (double)(num / denom);
    }
    public Fraction add(Fraction other){
        int addnum = num * other.getNumerator() + denom * other.getDenominator();
        int adddenom = denom * other.getDenominator();
        Fraction n = new Fraction(addnum, adddenom);
        n.toLowestTerms();
        return n;
    }
    public Fraction sub(Fraction other){
        int subnum = num * other.getNumerator() - denom * other.getDenominator();
        int subdenom = denom * other.getDenominator();
        Fraction n = new Fraction(subnum, subdenom);
        n.toLowestTerms();
        return n;
    }
    public Fraction multi(Fraction other){
        int multinum = n.getNumerator() * num;
        int multidenom = n.getDenominator() * denom;
        Fraction n = new Fraction(multinum, multidenom);
        n.toLowestTerms();
        return n;
    }
    public Fraction div(Fraction other){
        int
    }
    public void toLowestTerms(){
        int gcd = new gcd(num, denom)
        num  = num / gcd;
        denom = denom / gcd;
    }
    public static int gcd(int n, int d){
        int remainder;
        while (d != 0 && a != 0){
            remainder = n % d;
            n = d;
            d = remainder;
        }
        return n;
    }
}
