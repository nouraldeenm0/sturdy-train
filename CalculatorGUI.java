import javax.swing.*;

public class CalculatorGUI extends JFrame {
    public CalculatorGUI() {
        JPanel panel = new JPanel();
        // Add buttons to panel...
        add(panel);
        pack();
    }

    public static void main(String[] args) {
        CalculatorGUI calculator = new CalculatorGUI();
        calculator.setVisible(true);
    }
}
