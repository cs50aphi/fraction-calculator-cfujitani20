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
        catch(IllegalArgumentException e){
            System.out.println("Results in undefined, denominator cannot equal 0.");
            return;
        }
        if (num < 0 && denom < 0){
            num = Math.abs(num);
            denom = Math.abs(denom);
        }
        else if (denom < 0){
            num = -num;
            denom = Math.abs(denom);
        }
        else{
            this.num = num;
            this.denom = denom;
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
        int addnum = num * other.getDenominator() + denom * other.getNumerator();
        int adddenom = denom * other.getDenominator();
        Fraction n = new Fraction(addnum, adddenom);
        n.toLowestTerms();
        return n;
    }
    public Fraction sub(Fraction other){
        int subnum = num * other.getDenominator() + denom * other.getNumerator();
        int subdenom = denom * other.getDenominator();
        Fraction n = new Fraction(subnum, subdenom);
        n.toLowestTerms();
        return n;
    }
    public Fraction multi(Fraction other){
        int multinum = other.getNumerator() * num;
        int multidenom = other.getDenominator() * denom;
        Fraction n = new Fraction(multinum, multidenom);
        n.toLowestTerms();
        return n;
    }
    public Fraction div(Fraction other){
        try{
             int quotient = (num * other.getDenominator() / denom * other.getNumerator());
        }
        catch(IllegalArgumentException e){
            System.out.println("Results in undefined, can't divide by 0!");
        }
        int divnum = num * other.getDenominator();
        int divdenom = denom * other.getNumerator();
        Fraction n = new Fraction(divnum, divdenom);
        n.toLowestTerms();
        return n;
    }
    public boolean equals(Object other){
        Fraction k = (Fraction)other;
        k.toLowestTerms();
        if ((double)(num / denom) == (double)(k.getNumerator() / k.getDenominator())){
            return true;
        }
        return false;
    }
    public void toLowestTerms(){
        int gcd = gcd(num, denom);
        num  = num / gcd;
        denom = denom / gcd;
    }
    public static int gcd(int n, int d){
        int remainder;
        while (d != 0 && n != 0){
            remainder = n % d;
            n = d;
            d = remainder;
        }
        return n;
    }
}
