package Day4;


import java.util.Stack;

public class ExpressionEvaluator {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                                stack.push(ch - '0');
            } else if (ch == ' ') {
                                continue;
            } else {
                                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        if (operand2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                            return Integer.MIN_VALUE;                         }
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        return Integer.MIN_VALUE;                 }
            }
        }

                return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "10 2 6 * +";         int result = evaluatePostfix(postfixExpression);
        System.out.println("Result: " + result);     }
}
