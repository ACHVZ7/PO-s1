package main;

import models.Operacion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        int num1, num2, suma, resta;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("dime un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("dime otro numero"));
        suma = operacion.sumar(num1, num2);
        JOptionPane.showMessageDialog(null, "la suma es " + suma);
        resta = operacion.restar( num1, num2);
        JOptionPane.showMessageDialog(null, "la resta es " + resta);
    }

}
