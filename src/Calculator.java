public class Calculator {
    private final String ADD = "+";
    private final String SUB = "-";
    private final String MUL = "*";
    private final String DIV = "/";

    private float firstOperator, secondOperator;
    private String operator;
    public Calculator() {
    }

    public Calculator(float firstOperator, String operator, float secondOperator) {
        this.firstOperator = firstOperator;
        this.secondOperator = secondOperator;
        this.operator = operator;
    }

    public String calculate(){
        float result;
        switch (operator){
            case ADD: {
                result = firstOperator + secondOperator;
                break;
            }
            case SUB: {
                result = firstOperator - secondOperator;
                break;
            }
            case MUL: {
                result = firstOperator * secondOperator;
                break;
            }
            case DIV: {
                if (secondOperator == 0) return "Div by zero";
                result = firstOperator / secondOperator;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return Float.toString(result);
    }
}
