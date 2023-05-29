import java.util.List;
import java.util.ArrayList;

public class TestCalculator {
    public static void main(String[] args) {
        testcalculate();
    }

    public static void testcalculate() {
        String expression = "9*9";
        String expectedresult = "81.0";
        Calculator actualresult = new Calculator();

        Calculator.Run(expression);
        
        String textResult = Float.toString(actualresult.finalResult);


        if (expectedresult.equals(textResult)) {
            System.out.println ("Pass");
        
        } else {
            System.out.println ("Fail");
        }
    }
}
