
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
public class Cap7Q5 {
    public static void main(String[] args){
        float[][] meses_semanas= new float[12][4];
        String[] meses= new String[12];
        int valor = (int) (Math.random() * 2000);
        int opcao;
        String VInformado;
        
           VInformado=JOptionPane.showInputDialog(null, "Selecione o que deseja \n" 
                 +"1- Total vendido em cada semana do ano \n"
                 +"2- Total vendido em cada mês do ano \n"
                 +"3- Total vendido no ano\n", null, JOptionPane.QUESTION_MESSAGE);
                opcao=Integer.valueOf(VInformado);
                
                          for(int i=0; i < meses_semanas.length; i++){
                          for(int iSem=0; iSem < meses_semanas[i].length; iSem++){
                        
                           }
                         }
              
                switch(opcao){
                     case 1:
                          
                        break;
                    case 2:
                        
                        break;
                    case 3: 
                        
                        break;
                        
                 default: JOptionPane.showMessageDialog(null, "Ação finalizada" , null, JOptionPane.INFORMATION_MESSAGE);
                }
    
    }
    
}
