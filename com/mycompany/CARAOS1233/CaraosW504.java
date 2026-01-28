/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caraos;

/**
 *
 * @author rcaraos
 */
import javax.swing.JOptionPane;

public class CaraosW504 {
    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name:");
    String course = JOptionPane.showInputDialog("Enter your Course:");
    String sec = JOptionPane.showInputDialog("Enter your section:");


    JOptionPane.showMessageDialog (null,"Your Name: " + name + "!\nYour major: " + course + " from " +  sec);
}

}
