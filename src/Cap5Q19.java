
import java.util.Random;
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
public class Cap5Q19 {
    public static void main(String[] args){
    
    String valorx;
    String valory;
    String valorz;
    float preco_comprax;
    float preco_vendax;
    float preco_compray;
    float preco_venday;
    float preco_compraz;
    float preco_vendaz;
    int numerox = (int) (Math.random() * 2000);
    int numeroy = (int) (Math.random() * 2000);
    int numeroz = (int) (Math.random() * 2000);
    int opcao;
    int opcao2;
    String sair;
    boolean continuar = true;
    JOptionPane.showMessageDialog(null, numerox + "\n" + numeroy + "\n" + numeroz + "\n", null, JOptionPane.INFORMATION_MESSAGE );
    
    
    
    String VInformado;
    
   VInformado= JOptionPane.showInputDialog(null, "Entre com uma letra para adicionar ação no banco de valores", null, JOptionPane.QUESTION_MESSAGE);
   valorx= VInformado;
   VInformado= JOptionPane.showInputDialog(null, "Entre com o valor de compra da ação " + valorx, null, JOptionPane.QUESTION_MESSAGE);
   preco_comprax= Float.valueOf(VInformado);
   VInformado= JOptionPane.showInputDialog(null, "Entre com o valor de venda da ação " + valorx, null, JOptionPane.QUESTION_MESSAGE);
   preco_vendax= Float.valueOf(VInformado);
   JOptionPane.showMessageDialog(null, "Ação: " + valorx + "\n" + "Valor compra: "+ preco_comprax + "\n" + "Valor venda: " + preco_vendax, null, JOptionPane.INFORMATION_MESSAGE);
   
   
   
   VInformado= JOptionPane.showInputDialog(null, "Entre com outra letra para adicionar ação no banco de valores", null, JOptionPane.QUESTION_MESSAGE);
   valory= VInformado;
   VInformado= JOptionPane.showInputDialog(null, "Entre com o valor de compra da ação " + valory, null, JOptionPane.QUESTION_MESSAGE);
   preco_compray= Float.valueOf(VInformado);
   VInformado= JOptionPane.showInputDialog(null, "Entre com o valor de venda da ação " + valory, null, JOptionPane.QUESTION_MESSAGE);
   preco_venday= Float.valueOf(VInformado);
   JOptionPane.showMessageDialog(null, "Ação: " + valory + "\n" + "Valor compra: "+ preco_compray + "\n" + "Valor venda: " + preco_venday, null, JOptionPane.INFORMATION_MESSAGE);
  
   
   
   VInformado= JOptionPane.showInputDialog(null, "Entre com mais uma letra para adicionar ação no banco de valores", null, JOptionPane.QUESTION_MESSAGE);
   valorz= VInformado;
   VInformado= JOptionPane.showInputDialog(null, "Entre com o valor de compra da ação " + valorz, null, JOptionPane.QUESTION_MESSAGE);
   preco_compraz= Float.valueOf(VInformado);
   VInformado= JOptionPane.showInputDialog(null, "Entre com o valor de venda da ação " + valorz, null, JOptionPane.QUESTION_MESSAGE);
   preco_vendaz= Float.valueOf(VInformado);
   JOptionPane.showMessageDialog(null, "Ação: " + valorz + "\n" + "Valor compra: "+ preco_compraz + "\n" + "Valor venda: " + preco_vendaz, null, JOptionPane.INFORMATION_MESSAGE);
    
    
    
    
                 VInformado=JOptionPane.showInputDialog(null, "Selecione o que deseja \n" 
                 +"1- Lucro de cada ação comercializada \n"
                 +"2- Quantidade de ações com o lucro superior a 1000 \n"
                 +"3- Quantidade de ações com o lucro inferior a 200\n"
                 +"4- Lucro total da empresa\n"
                 +"5- Finalizar\n", null, JOptionPane.QUESTION_MESSAGE);
                opcao=Integer.valueOf(VInformado);
                
                
                switch(opcao){
                    case 1:
                          VInformado=JOptionPane.showInputDialog(null, "Selecione a ação que deseja ver o lucro \n" 
                 +"1- ação " + valorx + "\n"
                 +"2- ação " + valory + "\n"
                 +"3- ação " + valorz + "\n", null, JOptionPane.QUESTION_MESSAGE);
                opcao2=Integer.valueOf(VInformado);
                switch(opcao2){
                     case 1:
                         JOptionPane.showMessageDialog(null, "Lucro da ação " + valorx + "- " + numerox, null, JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Lucro da ação " + valory + "- " + numeroy, null, JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3: 
                        JOptionPane.showMessageDialog(null, "Lucro da ação " + valorz + "- " + numeroz, null, JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                 default: JOptionPane.showMessageDialog(null, "Ação finalizada" , null, JOptionPane.INFORMATION_MESSAGE);
                }
                        break;
                    case 2:
                        if (numerox > 1000){
                            while(continuar){
                        VInformado=JOptionPane.showInputDialog(null, "Lucro da ação " + valorx + " Maior que 1000 \n" + "Escreva F para sair", null, JOptionPane.INFORMATION_MESSAGE);
                        sair= VInformado;
                        if ("F".equals(sair)){
                            continuar= false;
                               } 
                              }  
                             }
                        
                        if(numeroy > 1000){
                            while(continuar){
                        VInformado=JOptionPane.showInputDialog(null, "Lucro da ação " + valory + " Maior que 1000 \n" + "Escreva F para sair", null, JOptionPane.INFORMATION_MESSAGE);
                        sair= VInformado;
                        if ("F".equals(sair)){
                            continuar= false;
                                 } 
                               }  
                             }
                        
                        if (numeroz > 1000){
                            while(continuar){
                        VInformado=JOptionPane.showInputDialog(null, "Lucro da ação " + valorz + " Maior que 1000 \n" + "Escreva F para sair", null, JOptionPane.INFORMATION_MESSAGE);
                        sair= VInformado;
                        if ("F".equals(sair)){
                            continuar= false;
                                } 
                              }  
                             }
                        
                        
                        break;
                    case 3:
                        break;
                    case 4: 
                        break;
                    case 5:
                        break;
                  default:JOptionPane.showMessageDialog(null, "Ação finalizada" , null, JOptionPane.INFORMATION_MESSAGE);
                }
    }
    }
    //Receber letra para ser comercializada
    //while >1000
    //Gerador de números automáticos

