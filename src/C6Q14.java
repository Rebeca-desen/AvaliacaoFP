
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
    String alunos[]= new String[6];
    float nota1[]= new float[6];
    float nota2[]= new float[6];
    float media;
    float aprovados;
    float reprovados;
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
    //Retornar as 3 notas de cada aluno
    //Calcular média de cada aluno
    //Calcular média da turma
    //Calcular se foi aprovado ou não
    //Calcular % de quantos foram aprovados e quantos não
    //Se uma das notas for menor que 6 recuperação 
    //Se as duas estão menores que 6, reprovado
    //Quantos reprovados
    //Quantos passaram
        }
}
               