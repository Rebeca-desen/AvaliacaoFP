
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
        int opcao2;
        String VInformado;
        int[] total_mes= new int[12];
        int ano=0;
        
        meses[0]="Janeiro";
        meses[1]="Fevereiro";
        meses[2]="Março";
        meses[3]="Abril";
        meses[4]="Maio";
        meses[5]="Junho";
        meses[6]="Julho";
        meses[7]="Agosto";
        meses[8]="Setembro";
        meses[9]="Outubro";
        meses[10]="Novembro";
        meses[11]="Dezembro";
        
        
           VInformado=JOptionPane.showInputDialog(null, "Selecione o que deseja \n" 
                 +"1- Total vendido em cada semana do ano \n"
                 +"2- Total vendido em cada mês do ano \n"
                 +"3- Total vendido no ano\n", null, JOptionPane.QUESTION_MESSAGE);
                opcao=Integer.valueOf(VInformado);
                
                          for(int i=0; i < meses_semanas.length; i++){
                          for(int iSem=0; iSem < meses_semanas[i].length; iSem++){
                          meses_semanas[i][iSem]=valor;
                           }
                         }
              
                switch(opcao){
                     case 1:
                      
                         
                         for(int i=0; i < meses_semanas.length; i++){
                          for(int iSem=0; iSem < meses_semanas[i].length; iSem++){
                       
                             VInformado=JOptionPane.showInputDialog(null, "Selecione a semana de qual mês deseja ver \n" 
                 +"1- "+meses[0]+"\n"
                 +"2- "+meses[1]+"\n"
                 +"3- "+meses[2]+"\n"
                 +"4- "+meses[3]+"\n"                 
                 +"5- "+meses[4]+"\n"
                 +"6- "+meses[5]+"\n"                 
                 +"7- "+meses[6]+"\n"
                 +"8- "+meses[7]+"\n"                 
                 +"9- "+meses[8]+"\n"                 
                 +"10- "+meses[9]+"\n" 
                 +"11- "+meses[10]+"\n"                  
                 +"12- "+meses[11]+"\n", null, JOptionPane.QUESTION_MESSAGE);
                opcao2=Integer.valueOf(VInformado);
        
                i=opcao2-1;
                meses_semanas[i][iSem]=valor;
                  JOptionPane.showMessageDialog(null, "Total de vendas do mês " + meses[i]+ " \n"
                        + "Semana 1- R$"+  meses_semanas[i][0] +"\n"
                        + "Semana 2- R$"+  meses_semanas[i][1] +"\n"
                        + "Semana 3- R$"+  meses_semanas[i][2] +"\n"
                        + "Semana 4- R$"+  meses_semanas[i][3], null, JOptionPane.INFORMATION_MESSAGE);         
                         
                           }
                         
                         }
                        
                
                        break;
                    case 2:
                           for(int i=0; i < meses_semanas.length; i++){
                          for(int iSem=0; iSem < meses_semanas[i].length; iSem++){
                          meses_semanas[i][iSem]=valor;
                          total_mes[i]+=meses_semanas[i][iSem];
                          
                        
                          
                          }
                          JOptionPane.showMessageDialog(null, "Total de " + meses[i] + "- R$" + total_mes[i], null, JOptionPane.INFORMATION_MESSAGE);
                         }
                          
                        break;
                    case 3: 
                         for(int i=0; i < meses_semanas.length; i++){
                          for(int iSem=0; iSem < meses_semanas[i].length; iSem++){
                          meses_semanas[i][iSem]=valor;
                          total_mes[i]+=meses_semanas[i][iSem];
                          ano+=total_mes[i];
                          
                          }
                          
                         }
                         JOptionPane.showMessageDialog(null, "Total do ano- R$" + ano, null, JOptionPane.INFORMATION_MESSAGE);
                         break;
                         
                 default: JOptionPane.showMessageDialog(null, "Ação finalizada" , null, JOptionPane.INFORMATION_MESSAGE);
                }
    
   
    
    }
    
       
    } 

