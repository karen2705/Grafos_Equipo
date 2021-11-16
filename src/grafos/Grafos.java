  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafos;

import javax.swing.JFrame;

/**
 *
 * @author Karen Vázquez
 */
public class Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame ventana = new JFrame("GRAFO");
        ventana.add(new Lienzo());
        ventana.setSize(600,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
