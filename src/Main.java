public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
            // здесь возникает ошибка ArithmeticException, если b = 0
            // в качестве решения - обработка исключения в реалтзации метода

        calc.println.accept(a);
        calc.println.accept(b);
        calc.println.accept(c);
    }
}
