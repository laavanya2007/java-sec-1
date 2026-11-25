public class B12_SimpleCalculator {
    public static void main(String[] args) {
        double a = 15, b = 4;
        char[] ops = {'+', '-', '*', '/', '%'};
        for (char op : ops) {
            double result;
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': result = a / b; break;
                default: result = a % b;
            }
            System.out.println(a + " " + op + " " + b + " = " + result);
        }
    }
}
