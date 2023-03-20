import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String [] magnitudes ={"Moneda","Masa","Temperatura"};
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona un color", "Elegir",JOptionPane.QUESTION_MESSAGE,null,magnitudes, magnitudes[0]);
        System.out.println(opcion);
    }
}

