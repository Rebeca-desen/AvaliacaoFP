
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// testar fazer em função de categorias
/**
 *
 * @author André
 */

//ajeitar para lógica de que se o produto é menor que 25 só pode ser barato
        
public class Cap4Q24 {

    public static void main(String[] args) {    
       double preco;
       double aumento;
       double imposto;
       String  produto;
       double preco_final;
       double porcent_aumento;
       double porcent_imposto;
       int SecOption;
       
        
      JOptionPane.showMessageDialog(null, "Este programa vai calcular o valor do produto final, contando com as dispesas e os impostos", null, JOptionPane.INFORMATION_MESSAGE);
        
              String Option;
              String VInformado;
             
            
              VInformado=JOptionPane.showInputDialog(null, "Agora os cuidados que o produto precisa \n" 
                +"R- O produto necessita de refrigeração\n"
                +"N- O produto não precisa de refrigeração\n", null, JOptionPane.QUESTION_MESSAGE);
              Option=String.valueOf(VInformado); 
              
                VInformado=JOptionPane.showInputDialog(null, "Qual o nome do produto?", null, JOptionPane.QUESTION_MESSAGE);
                produto=String.valueOf(VInformado);
                VInformado=JOptionPane.showInputDialog(null, "Qual o valor do produto " + produto + "?", null, JOptionPane.QUESTION_MESSAGE);
                preco=Double.valueOf(VInformado);
                
                
                 VInformado=JOptionPane.showInputDialog(null, "Selecione o tipo do produto \n" 
                 +"1- Limpeza \n"
                 +"2- Alimentação \n"
                 +"3- Vestuário\n", null, JOptionPane.QUESTION_MESSAGE);
      
                 SecOption=Integer.valueOf(VInformado);
               
           if ("R".equals(Option) ){
                     
               if(preco <= 25 ) {
               
               switch(SecOption) {
               case 1 :
                   porcent_aumento=0.05;
                   porcent_imposto=0.05;
                   
                   aumento= porcent_aumento*preco;
                   JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                   imposto= porcent_imposto*preco;
                   JOptionPane.showMessageDialog(null, "O imposto será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                   preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
       
        break;
             case 2:
                  porcent_aumento=0.08;
                  porcent_imposto=0.05;
                  
                  aumento= porcent_aumento*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  imposto= porcent_imposto*preco;
                  JOptionPane.showMessageDialog(null, "O imposto será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
        break;
            case 3: 
                   
                  porcent_aumento=0.1;
                  porcent_imposto=0.05;
                  
                  aumento= porcent_aumento*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  imposto= porcent_imposto*preco;
                  JOptionPane.showMessageDialog(null, "O imposto será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
        break;
                
        default: JOptionPane.showMessageDialog(null, "Escolha um valor dos citados" , null, JOptionPane.INFORMATION_MESSAGE);
                   
        }
               } else { 
                   switch(SecOption) {
             case 1 :
                   porcent_aumento=0.12;
                   porcent_imposto=0.05;
                   
                   aumento= porcent_aumento*preco;
                   JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                   imposto= porcent_imposto*preco;
                   JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                   preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
       
        break;
             case 2:
                  porcent_aumento=0.15;
                  porcent_imposto=0.05;
                  
                  aumento= porcent_aumento*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  imposto= porcent_imposto*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
        break;
            case 3: 
                   
                  porcent_aumento=0.18;
                  porcent_imposto=0.05;
                  
                  aumento= porcent_aumento*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  imposto= porcent_imposto*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
        break;
                
        default: JOptionPane.showMessageDialog(null, "Escolha um valor dos citados" , null, JOptionPane.INFORMATION_MESSAGE);
                      } // else do <=25
                
           
                 }
           }else{   //else do R (refrigeração)
               
               if(preco <= 25 ) {
               
               switch(SecOption) {
               case 1 :
                   porcent_aumento=0.05;
                   porcent_imposto=0.08;
                   
                   aumento= porcent_aumento*preco;
                   JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                   imposto= porcent_imposto*preco;
                   JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                   preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
       
        break;
             case 2:
                  porcent_aumento=0.08;
                  porcent_imposto=0.05;
                  
                  aumento= porcent_aumento*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  imposto= porcent_imposto*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
        break;
            case 3: 
                   
                  porcent_aumento=0.1;
                  porcent_imposto=0.08;
                  
                  aumento= porcent_aumento*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  imposto= porcent_imposto*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
        break;
                
        default: JOptionPane.showMessageDialog(null, "Escolha um valor dos citados" , null, JOptionPane.INFORMATION_MESSAGE);
                   
        }
               } else { 
                   switch(SecOption) {
             case 1 :
                   porcent_aumento=0.12;
                   porcent_imposto=0.08;
                   
                   aumento= porcent_aumento*preco;
                   JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                   imposto= porcent_imposto*preco;
                   JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                   preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
       
        break;
             case 2:
                  porcent_aumento=0.15;
                  porcent_imposto=0.05;
                  
                  aumento= porcent_aumento*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  imposto= porcent_imposto*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
        break;
            case 3: 
                   
                  porcent_aumento=0.18;
                  porcent_imposto=0.08;
                  
                  aumento= porcent_aumento*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  imposto= porcent_imposto*preco;
                  JOptionPane.showMessageDialog(null, "O aumento será: R$" + aumento, null, JOptionPane.INFORMATION_MESSAGE);
                   
                  preco_final= preco+aumento-imposto;
                      
                     if(preco_final <= 50) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto barato", null, JOptionPane.INFORMATION_MESSAGE);
                     } else if(preco_final > 50 && preco_final < 120) {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto normal", null, JOptionPane.INFORMATION_MESSAGE);
                      } else {
                         JOptionPane.showMessageDialog(null, "O produto " + produto + " custará: R$ " + preco_final, null, JOptionPane.INFORMATION_MESSAGE);
                         JOptionPane.showMessageDialog(null, "Ele é um produto caro", null, JOptionPane.INFORMATION_MESSAGE);
                              }
        break;
                
        default: JOptionPane.showMessageDialog(null, "Escolha um valor dos citados" , null, JOptionPane.INFORMATION_MESSAGE);
                  
                   
                     }
         }
             
           }
    }
}
