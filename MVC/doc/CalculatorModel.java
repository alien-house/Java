
package mvcdemo1;

public class CalculatorModel {
    private int CalValue;
    
    public void addTwoNumbers(int no1, int no2)
    {
        CalValue = no1 + no2;
    }
    
    public int getCalcvalue(){
        return CalValue;
    }
    
}
