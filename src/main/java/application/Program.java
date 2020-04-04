/*
 *fazer um programa para ler o nome de um aluno e as três notas que ele obteve
 *nos tres trimestre do ano. Ao final, mostrar qual a nota final do aluno no
 *ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo,
 *quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
 *Você deve criar uma classe Student para resolver este problema. 
 */
package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        System.out.print("Nome do aluno: ");
        student.name = sc.nextLine();
        System.out.print("Nota trimestre 1: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Nota trimestre 2: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Nota trimestre 3: ");
        student.grade3 = sc.nextDouble();
        System.out.println();
        
        System.out.println("Nota final: " + student.finalGrade());
        
        System.out.println();
        if(student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("Faltam %.2f pontos para aprovação.", student.missingPoints());
        } else{
            System.out.println("PASS!!");
        }
    }
}
