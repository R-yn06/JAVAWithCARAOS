import javax.swing.*;              // Imports Swing classes for GUI components.
import java.awt.*;                 // Imports AWT classes for layout and graphics.
import java.awt.event.*;           // Imports AWT event classes for handling actions.

public class Experiment1 extends JFrame implements ActionListener { // Defines a class that is a window and can handle actions.
    private JTextField display;    // Text field to show input and results.
    private StringBuilder input = new StringBuilder(); // Stores the current input as a string.
    private double num1 = 0, num2 = 0; // Variables to hold operands.
    private String operator = "";  // Stores the selected operator.

    public Experiment1() {         // Constructor to set up the calculator window.
        setTitle("Calculator");    // Sets the window title.
        setSize(300, 400);         // Sets the window size.
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Closes app when window is closed.
        setLocationRelativeTo(null); // Centers the window on the screen.

        display = new JTextField(); // Creates the display field.
        display.setEditable(false); // Makes the display read-only.
        display.setFont(new Font("Arial", Font.BOLD, 24)); // Sets font for display.
        add(display, BorderLayout.NORTH); // Adds display to the top of the window.

        JPanel panel = new JPanel(); // Creates a panel for the buttons.
        panel.setLayout(new GridLayout(4, 4, 5, 5)); // 4x4 grid with spacing.

        String[] buttons = {        // Array of button labels.
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) { // For each label in the array:
            JButton btn = new JButton(text); // Create a button.
            btn.setFont(new Font("Arial", Font.BOLD, 20)); // Set button font.
            btn.addActionListener(this); // Register this class to handle button clicks.
            panel.add(btn); // Add button to the panel.
        }

        add(panel); // Add the panel to the window (center by default).

        setVisible(true); // Show the window.
    }

    public void actionPerformed(ActionEvent e) { // Handles button clicks.
        String cmd = e.getActionCommand(); // Gets the label of the clicked button.

        if (cmd.matches("\\d")) { // If it's a digit (0-9):
            input.append(cmd); // Add digit to input.
            display.setText(input.toString()); // Update display.
        } else if ("+-*/".contains(cmd)) { // If it's an operator:
            if (input.length() > 0) { // If there's input:
                num1 = Double.parseDouble(input.toString()); // Store first number.
                operator = cmd; // Store operator.
                input.setLength(0); // Clear input for next number.
            }
        } else if (cmd.equals("=")) { // If equals button:
            if (input.length() > 0 && !operator.isEmpty()) { // If ready to calculate:
                num2 = Double.parseDouble(input.toString()); // Store second number.
                double result = 0;
                switch (operator) { // Perform calculation.
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num2 != 0 ? num1 / num2 : 0; break; // Avoid divide by zero.
                }
                display.setText(String.valueOf(result)); // Show result.
                input.setLength(0); // Clear input.
                input.append(result); // Allow chaining calculations.
                operator = ""; // Reset operator.
            }
        } else if (cmd.equals("C")) { // If clear button:
            input.setLength(0); // Clear input.
            operator = ""; // Reset operator.
            num1 = num2 = 0; // Reset numbers.
            display.setText(""); // Clear display.
        }
    }

    public static void main(String[] args) { // Main method to start the app.
        SwingUtilities.invokeLater(Experiment1::new); // Run GUI on the event dispatch thread.
    }
}