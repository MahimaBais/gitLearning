public class Main {

    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(10,30));
        System.out.println(arithmetic.sub(40,30));
        System.out.println(arithmetic.mul(10,30));
        System.out.println(arithmetic.div(60,30));

        MathGame mg = new MathGame();
        mg.puzzle();
    }
}
