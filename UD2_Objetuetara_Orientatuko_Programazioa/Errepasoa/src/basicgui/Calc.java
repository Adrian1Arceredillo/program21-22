/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicgui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author arceredillo.adrian
 */
public class Calc extends JFrame {

    private void initFrame() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setSize(300, 400); // Tamaño de la ventana
        this.setTitle("Calculadora simple 1.0"); // El nombre de la ventana
        this.setLocationRelativeTo(null); // La posición de la ventana en la pantalla, el centro predeterminado
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // Establecer el procesamiento del programa después de hacer clic en la esquina superior derecha de la ventana
        this.setLayout(null); // Formato de diseño predeterminado
        JTextField jtf = this.topSurfacee(); // Método de llamada
        this.bottomSurface(jtf);
        this.setVisible(true); // ¡Establece si la ventana es visible! Sin contenido en la ventana frontal

    }

    private JTextField topSurfacee() {
        JPanel topPanel = new JPanel(); // Crea un panel
        topPanel.setBounds(-5, 10, 300, 50); // La posición de la ventana en la pantalla
        JTextField jtf = new JTextField(15); // Mostrar el resultado de la longitud del cuadro de texto 15 palabras
        jtf.setHorizontalAlignment(JTextField.RIGHT); // Establecer el lado derecho del archivo para que salga a la izquierda
        jtf.setForeground(Color.red); // Establece el color de primer plano del componente
        jtf.setFont(new Font("SansSerif", Font.PLAIN, 20)); // estilo de fuente formato de fuente tamaño de fuente
        jtf.setEditable(false); // Las opciones de configuración no están disponibles
        jtf.setText("0"); // El texto del cuadro de texto se establece en "Aceptar"
        topPanel.add(jtf); // Agregar componente jtf
        this.add(topPanel); // Agregar componente topPanel
        return jtf;
    }

    private void bottomSurface(JTextField jtf) {
        JPanel bottomPanel = new JPanel(); // Crea un panel
        bottomPanel.setBounds(8, 80, 270, 250); // El tamaño del panel
        bottomPanel.setLayout(new GridLayout(5, 4, 5, 4)); // Formato de diseño 5 filas 4 columnas Espaciado entre filas 5 Espaciado entre columnas 4

        String[] buttonValue = {"1", "2", "3", "C", // Opere la matriz de cadenas correspondiente
            "4", "5", "6", "CE",
            "7", "8", "9", "←",
            "+", "0", "-", ".",
            "*", "/", "%", "="};

        /*
        CalcListener cl = new CalcListener(jtf); // creación del oyente 
        for (int i = 0; i < buttonValue.length; i++) {// caracteres de operación transversal
            JButton button = new JButton(buttonValue[i]); // Crea un botón con texto
            button.setBorder(BorderFactory.createRaisedBevelBorder());
            button.setFont(new Font("kaiti", 0, 25)); // Estilo de fuente Formato de fuente Tamaño de fuente
            button.setForeground(Color.black); // Establecer el color de primer plano del componente
            bottomPanel.add(button); // Agregar componente
            button.addActionListener(cl);
        }
        */

        this.add(bottomPanel); // Agregar componente
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.initFrame();

    }
}
