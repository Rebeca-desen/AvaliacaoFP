
import java.util.Arrays;
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
    String alunos[]=new String[3];
    float notas[]= new float[1];
    String VInformado;
   
   

    // -nome alunos (8)
    // -nota (8)    
// Mensagem inicial dizendo o objetivo do programa
    JOptionPane.showMessageDialog(null, "Esse é um programa que recebe o nome e nota dos alunos",null, JOptionPane.INFORMATION_MESSAGE);
    
  
    // Input para arrays
  for(int i=0; i < alunos.length; i++){
    VInformado= JOptionPane.showInputDialog(null, "Adicione aque o nome do muleque", null, JOptionPane.QUESTION_MESSAGE);
    alunos[i]= VInformado;
   
        VInformado= JOptionPane.showInputDialog(null, "Adicione a nota dele", null, JOptionPane.QUESTION_MESSAGE);
        notas[i]= Float.valueOf(VInformado);
  
  
      }
    }
  }

