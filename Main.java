public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        String expression = "233*450+43";
        String[] elements = expression.split("(?<=[-+/*])|(?=[-+/*])");

        int result = 0;
        String operator = "+";

        for (String element : elements) {
            if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/")) {
                operator = element;
            }

            else {
                int number = Integer.parseInt(element);
                switch (operator) {

                    case "+":
                        result += number;
                        break;

                    case "-":
                        result -= number;
                        break;

                    case "*":
                        result *= number;
                        break;

                    case "/":
                        result /= number;
                        break;
                }
            }
        }

        System.out.println("Result: " + result);
    }
}