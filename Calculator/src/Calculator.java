public class Calculator {
    public static int calculate(int first, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return first + secondOperand;
            case '-':
                return first - secondOperand;
            case '*':
                return first * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return first / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
