
package mvcdemo1;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame{
    private JTextField no1 = new JTextField(10);
    private JTextField no2 = new JTextField(10);
    private JLabel addLabel = new JLabel(" + ");
    private JTextField calSolution =  new JTextField(10);
    private JButton calButton = new JButton("Caculate");

    public CalculatorView()  {
        JPanel calcpanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        calcpanel.add(no1);
        calcpanel.add(addLabel);
        calcpanel.add(no2);
        calcpanel.add(calButton);
        calcpanel.add(calSolution);
        this.add(calcpanel); 
    }
    
    public int getFirstNumber(){
       return Integer.parseInt(no1.getText());
    }
    
    public int getSecondNumber(){
        return Integer.parseInt(no2.getText());
    }
    
    public int getCalcSolution(){
        return Integer.parseInt(calSolution.getText());
    }
    
    public void setCalcSolution(int solution){
        calSolution.setText(Integer.toString(solution));
    }
    
    public void addCalculateListener(ActionListener listenerforCalButton){
        calButton.addActionListener(listenerforCalButton);
    }
}