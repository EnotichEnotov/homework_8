

public class Main {
    public static Fraction sumFraction(Fraction fraction1, Fraction fraction2){
        return new Fraction(fraction1.numerator * fraction2.denominator + fraction2.numerator * fraction1.denominator, fraction1.denominator * fraction2.denominator);
    }
    public static Fraction workFraction(Fraction fraction1, Fraction fraction2){
        return new Fraction(fraction1.numerator * fraction2.numerator , fraction1.denominator * fraction2.denominator);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Fraction fraction1 = new Fraction(18, 30);
        Fraction fraction2 = new Fraction(8, 5);
        Fraction fraction3 = new Fraction(1.2);
        System.out.println(sumFraction(fraction1, fraction2));
        System.out.println(workFraction(fraction1, fraction2));
    }
}