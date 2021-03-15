
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
public class C6Q14 {
   public static void main(String[] args){
    //Variaveis
    String alunos[]= new String[2];
    float nota1[]= new float[2];
    float nota2[]= new float[2];
    float media;
    double aprovados=0;
    float reprovados;
    int dois=2;
    double porcent_total=0.06;
    float total;
    String input_alunosEturma;
    String input_notas;
    String nome_turma;
    //Mensagem inicial
    JOptionPane.showMessageDialog(null, "Olá! Esse programa irá receber o nome dos alunos e suas notas, retorar a média de cada aluno, a porcentagem dos que passaram, dos que reprovaram e a média da turma", null, JOptionPane.INFORMATION_MESSAGE);
    //input nome da turma
    input_alunosEturma= JOptionPane.showInputDialog(null, "Coloque aqui o nome da turma\n"+"Turma:", null, JOptionPane.QUESTION_MESSAGE);
    nome_turma= input_alunosEturma;
    JOptionPane.showMessageDialog(null, "Relatório da Turma "+ nome_turma, null, JOptionPane.INFORMATION_MESSAGE);
    //input alunos(6)
    //input nota 1
    //input nota 2
    for(int i=0; i < alunos.length; i++){
        input_alunosEturma=JOptionPane.showInputDialog(null, "Adicione aqui o nome do(a) aluno (a) " + (i+1), null, JOptionPane.QUESTION_MESSAGE);
        alunos[i]= input_alunosEturma;
        
        input_notas=JOptionPane.showInputDialog(null, "1° Nota do(a) aluno (a)", null, JOptionPane.QUESTION_MESSAGE);
        nota1[i]= Float.valueOf(input_notas);
        
        input_notas=JOptionPane.showInputDialog(null, "2° Nota do(a) aluno (a)", null, JOptionPane.QUESTION_MESSAGE);
        nota2[i]= Float.valueOf(input_notas);
   
 
    }
    
    for(int i=0; i < alunos.length; i++){
       //Calcular média de cada aluno
       //Retornar as 3 notas de cada aluno(nota 1, nota 2 e media)
       //Calcular se foi aprovado ou não
        media=(nota1[i]+nota2[i])/dois;
        JOptionPane.showMessageDialog(null, "Notas do(a) aluno (a) "+ alunos[i] + ": \n"
              +"1° Nota: " + nota1[i] + "\n "
              +"2° Nota: " + nota2[i]  + "\n "
              +"Média final: "+ media, null, JOptionPane.INFORMATION_MESSAGE);
          if(media >= 6){
              JOptionPane.showMessageDialog(null, "Status do(a) aluno(a) " + alunos[i]+ ": Aprovado", null, JOptionPane.INFORMATION_MESSAGE);
              total= (float) ((i+1)*porcent_total);
              JOptionPane.showMessageDialog(null, "Porcentagem alunos aprovados:" + total, null, JOptionPane.INFORMATION_MESSAGE);
          }else{ JOptionPane.showMessageDialog(null, "Status do(a) aluno(a) " + alunos[i]+ ": Reprovado", null, JOptionPane.INFORMATION_MESSAGE);
            total= (float) ((i+1)*porcent_total);
            JOptionPane.showMessageDialog(null, "Porcentagem alunos reprovados:" + total, null, JOptionPane.INFORMATION_MESSAGE);
          }
    }
       
    
    
    //Calcular média da turma
    //Calcular % de quantos foram aprovados e quantos não
    //Se uma das notas for menor que 6 recuperação 
    //Se as duas estão menores que 6, reprovado
    //Quantos reprovados
    //Quantos passaram
        }
}
               