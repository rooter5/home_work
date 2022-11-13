package lesson1;

public class TestTax {
    public static void main(String[] args){
        Tax t = new Tax();
        t.grossIncome = 5000;
        t.dependents = 2;
        t.state = "NJ";

        double yourTax = t.calcTax();

        System.out.println("Your tax is " + yourTax);
    }
}
