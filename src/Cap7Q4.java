
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
    String alunes_input;
    float[] media= new float[3];
    float cinco=2;
    float media_total = 0;
    float quinze= 3;
   
    
    for(int i=0; i < notas_provas.length;  i++){ 
    
    alunes_input= JOptionPane.showInputDialog(null, "Adicione o nome do " + (i+1) + "° " + "aluno(a):", null, JOptionPane.QUESTION_MESSAGE);
    alunes[i]= alunes_input;
    
    }
    
    
    
    for(int i=0; i < notas_provas.length;  i++){ 
      for(int iProvas=0; iProvas < notas_provas[i].length; iProvas++){
      notas= JOptionPane.showInputDialog(null, "Adicione a nota da " + (iProvas+1) + "° " + "prova de " + alunes[i], null, JOptionPane.QUESTION_MESSAGE);
      notas_provas[i][iProvas]= Float.valueOf(notas);
      
      JOptionPane.showMessageDialog(null, notas_provas[i][iProvas], null, JOptionPane.INFORMATION_MESSAGE);
        
      }
    
    }
    
    for(int i=0; i < notas_provas.length;  i++){ 
      for(int iProvas=0; iProvas < notas_provas[i].length; iProvas++){
        for(int iMedia=0; iMedia < media.length; iMedia++) {
      media[iMedia]= (notas_provas[i][0] + notas_provas[i][1])/cinco;
      
      JOptionPane.showMessageDialog(null, "Média artmética do estudante " + alunes[i] + "- " + media[iMedia], null, JOptionPane.INFORMATION_MESSAGE);
        
      if (media[iMedia] >=6) {
       JOptionPane.showMessageDialog(null,alunes[i] + " Aprovado(a) com média- " +media[iMedia] + "\n" + "PARABÉNS!" , null, JOptionPane.INFORMATION_MESSAGE);
      } else if (media[iMedia] < 6 && media[iMedia] >= 4){
          JOptionPane.showMessageDialog(null,alunes[i] + " Em recuperação com média- " +media[iMedia] + "\n" + "Estude um pouco mais!", null, JOptionPane.INFORMATION_MESSAGE);
      }else {
          JOptionPane.showMessageDialog(null,alunes[i] + " Em reprovado com média- " + media[iMedia] + "\n" + "Não foi dessa vez, mas não desista!", null, JOptionPane.INFORMATION_MESSAGE);
      }
        }
      }
    
    }
    
  
          
      }
      
      }
    
    
    
   
   

