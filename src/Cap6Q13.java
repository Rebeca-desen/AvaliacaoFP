
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
public class Cap6Q13 {
  public static void main(String [] args){
    // Definir Array e limite de array para:
    String alunos[][]=new String[8][2];
    String VInformado;

    // -nome alunos (8)
    // -nota (8)    
// Mensagem inicial dizendo o objetivo do programa
    JOptionPane.showMessageDialog(null, "Esse é um programa que recebe o nome e nota dos alunos",null, JOptionPane.INFORMATION_MESSAGE);
  
    // Input para arrays
    VInformado= JOptionPane.showInputDialog(null, "Adicione aque o nome do muleque", null, JOptionPane.QUESTION_MESSAGE);
    // Retornar valores do input
  }
}
