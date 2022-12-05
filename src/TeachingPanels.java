/**
 *
 * @author NAME
 */

import java.awt.GridLayout;
import java.lang.*;
import javax.swing.*;

public class TeachingPanels {
    public static void main(String[] args) throws Exception {
        JPanel panel=new JPanel(new GridLayout(0,2));
        panel.add(new JLabel("a"));
        panel.add(new JLabel("a"));
        JCheckBox jr1=new JCheckBox("+");
        JCheckBox jr2=new JCheckBox("-");
        JCheckBox jr3=new JCheckBox("*");
        JCheckBox jr4=new JCheckBox("/");
        panel.add(jr1);
        panel.add(jr2);
        panel.add(jr3);
        panel.add(jr4);
        panel.add(new JLabel("a"));
        JSpinner spin=new JSpinner(new SpinnerNumberModel(12,1,24,1));
        panel.add(spin);
        
        JOptionPane.showMessageDialog(null, panel);
        
        if(jr1.isSelected())System.out.println("Addition");
        System.out.println(spin.getValue());
    }

}
