
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class Cap7Q4 {
   public static void main(String[] args){
    
    float[][] notas_provas= new float[3][2];
    String[] alunes= new String[3];
    String notas;
    String provas;
    
    for(int iNotas=0; iNotas < notas_provas.length;  iNotas++){
      for(int iProvas=0; iProvas < notas_provas.length; iProvas++){
      
      notas= JOptionPane.showInputDialog(null, "Adicione a nota da " + (iProvas+1) + "° " + "prova", null, JOptionPane.QUESTION_MESSAGE);
      notas_provas[iNotas][iProvas]= Float.valueOf(notas);
      
      JOptionPane.showMessageDialog(null, notas_provas[iNotas][iProvas], null, JOptionPane.INFORMATION_MESSAGE);
      }
    
    }
   
   }
}
