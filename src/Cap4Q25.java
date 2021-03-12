
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
public class Cap4Q25 {
    //Deixar uma mensagem
   public static void main(String[] args){
      double horas_extra;
      String VInformado;
      double horas_falta;
      double horas_total;
       
      
      JOptionPane.showMessageDialog(null, "Olá, Feliz Natal! \n"
      + "Esse programa irá calcular seu bônus de Natal \n"
      + "Vamos lá! ;D", null, JOptionPane.INFORMATION_MESSAGE);
    //Deixar espaço para as extras
    VInformado=JOptionPane.showInputDialog(null, "Quantas horas extras você tem?", null, JOptionPane.QUESTION_MESSAGE);
    horas_extra=Double.valueOf(VInformado);
    //Deixar um valor fixo de horas que se perde por dia de falta
    //Perguntar quantos dias faltou
    VInformado=JOptionPane.showInputDialog(null, "Quantos horas você faltou?", null, JOptionPane.QUESTION_MESSAGE);
    horas_falta=Double.valueOf(VInformado);
    
    //Calcular quantidade de horas totais

      horas_total= horas_extra -( 0.66 *(horas_falta));
      
      if(horas_total >= 2400){
          JOptionPane.showMessageDialog(null, "Seu bônus é de R$ 500,00", null, JOptionPane.INFORMATION_MESSAGE);
          
      } else if(horas_total > 1800 && horas_total <2400){
          JOptionPane.showMessageDialog(null, "Seu bônus é de R$ 400,00", null, JOptionPane.INFORMATION_MESSAGE);
      } else if(horas_total > 1200 && horas_total <1800){
          JOptionPane.showMessageDialog(null, "Seu bônus é de R$ 300,00", null, JOptionPane.INFORMATION_MESSAGE);
      } else if(horas_total > 600 && horas_total <1200){
          JOptionPane.showMessageDialog(null, "Seu bônus é de R$ 200,00", null, JOptionPane.INFORMATION_MESSAGE);
      } else{
          JOptionPane.showMessageDialog(null, "Seu bônus é de R$ 100,00", null, JOptionPane.INFORMATION_MESSAGE);}
  
   JOptionPane.showMessageDialog(null, "Parabéns e boas festas!", null, JOptionPane.INFORMATION_MESSAGE);
    //Definir as horas e os valores correspondentes
    
     }
   }

