package gui;
import javax.swing.*;

public class CalculatorGUI extends JFrame {
    public CalculatorGUI() {
        JPanel panel = new JPanel();
        // Add buttons to panel...
        for (int i = 0; i <= 9; i++) {
            JButton numberButton = new JButton(String.valueOf(i));
            panel.add(numberButton);
        }
        String[] operations = {"+", "-", "*", "/"};
        for (String operation : operations) {
            JButton operationButton = new JButton(operation);
            panel.add(operationButton);
        }
        JButton equalsButton = new JButton("=");
        panel.add(equalsButton);
        add(panel);
        pack();
    }

    public static void main(String[] args) {
        CalculatorGUI calculator = new CalculatorGUI();
        calculator.setVisible(true);
    }
}