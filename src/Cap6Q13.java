
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
    String alunos[]=new String[8];
    float notas[]= new float[8];
    String nomeinf;
    String notainf;
    float media=0;
    int oito=8;

    // -nome alunos (8)
    // -nota (8)    
// Mensagem inicial dizendo o objetivo do programa
    
       
   
        JOptionPane.showMessageDialog(null, "Esse é um programa que recebe o nome e nota dos alunos");
       // Input para arrays
        for(int i=0; i < alunos.length; i++){
            nomeinf= JOptionPane.showInputDialog(null, "Adicione o nome do aluno(a) "+ (i+1)+":");
            alunos[i]= nomeinf;
            notainf= JOptionPane.showInputDialog(null, "Adicione a nota dele(a)");
            notas[i]= Float.valueOf(notainf);
 
     }
        for(int i=0; i < alunos.length; i++){
                JOptionPane.showMessageDialog(null,"O Relatório Final dos alunos é:\n"+ "Aluno(a) "+alunos[i]+" - "+notas[i]);
        media+=notas[i]/oito;
        }
        JOptionPane.showMessageDialog(null,"Média da turma"+ media);
  }
}

  

  
 
  
    
  


