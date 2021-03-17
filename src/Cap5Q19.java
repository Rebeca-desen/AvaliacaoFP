
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
    
    
    
    
    
    }
    //Receber letra para ser comercializada
    //while >1000
    //Gerador de números automáticos
}
