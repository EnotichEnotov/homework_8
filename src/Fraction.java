public class Fraction {
    public int numerator;
    public int denominator;
    public double value;


    Fraction (int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Divided by zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normilize();
    }
    Fraction (double value){
        this.value = value;
    }
Fraction (int numerator){
        this.numerator = numerator;
        this.denominator = 1;
}



    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }

    private int getGcd(){
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0){
            if (a > b){
                a %= b;

            }else{
                b%=a;
            }
        }
        return a+b;
    }
    void normilize(){
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;

    }
    double toDecimal(){
        return numerator / denominator;
    }
}
