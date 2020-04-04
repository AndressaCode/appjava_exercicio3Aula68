/*
 *fazer um programa para ler o nome de um aluno e as três notas que ele obteve
 *nos tres trimestre do ano. Ao final, mostrar qual a nota final do aluno no
 *ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
 *quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
 *Você deve criar uma classe Student para resolver este problema. 
 */
package entities;

/**
 *
 * @author Andressa Silva
 */
public class Student {
    
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    public double missingPoints(){
        return 60.0 - finalGrade();
    }
}