/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
  import javax.swing.JOptionPane;
public class ValentineProposal {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Hello Baby! enter your name:");
        if (name == null || name.trim().isEmpty()) {
            name = "My Bababbb";
        }

        JOptionPane.showMessageDialog(null, "My Dear " + name + ",\nI have a question to ask to you...", "A Special Question", JOptionPane.INFORMATION_MESSAGE);

        
        int choice = JOptionPane.showConfirmDialog(
            null,
            "Will you be my Valentine?",
            "My Valentine Proposal",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Yay! I love you so much my Valentine! \u2764\ufe0f", "Answer Received", JOptionPane.INFORMATION_MESSAGE);
        } else if (choice == JOptionPane.NO_OPTION) {
            
            JOptionPane.showMessageDialog(null, "Oh no! :C\n\n Please try again!", "Error: Invalid Choice", JOptionPane.ERROR_MESSAGE);
            
            boolean accepted = false;
            while (!accepted) {
                int secondChoice = JOptionPane.showConfirmDialog(
                    null,
                    "Asking Again,., will you be my Valentine Baby?",
                    "For My Love",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
                );

                if (secondChoice == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "HEHEHE, I LOVE YOU SO MUCH MY LOVE! I love you my valentine! \u2764\ufe0f\u2764\ufe0f", "Success!", JOptionPane.INFORMATION_MESSAGE);
                    accepted = true;
                } else {
                    
                    JOptionPane.showMessageDialog(null, "The 'No' isn't working... \nThink of a 'Yes' answer!", "Still Broken...", JOptionPane.WARNING_MESSAGE);
                }
            }

        } else {
            
             JOptionPane.showMessageDialog(null, "I'll take that as a maybe baby! Think about it! \u2764\ufe0f", "See you later Baby", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}



