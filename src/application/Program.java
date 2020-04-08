package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;
import entities.Disciplina;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Disciplina> disciplinas = new ArrayList<>();
		
		System.out.println("Quantas disciplinas vão ser registradas ?");
		int m = sc.nextInt();
		
		for(int c=1;c<=m;c++) {
		System.out.println();
		System.out.println("Disciplina #" + c + ": ");
		sc.nextLine();
		String disciplina = sc.nextLine();
		System.out.println("Gabarito oficial #" + c + ": ");
		String gabaritooficial = sc.nextLine();
		disciplinas.add(new Disciplina(disciplina,gabaritooficial));
		}
		
		System.out.println("Quantos alunos vão ser registrados ?");
		int n = sc.nextInt();
		
		
		System.out.println();
		for(Disciplina disciplina: disciplinas) {
			
		
		List<Aluno> alunos = new ArrayList<>();
		
		
		
		for(int i=1;i<=n;i++) {
		System.out.println();
		System.out.println("Aluno #" + i + ": ");
		System.out.println("Gabarito: ");
		sc.nextLine();
		String gabarito = sc.nextLine();
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		alunos.add(new Aluno(gabarito, nome));
		System.out.println();
		}
		
		
		String path = "c:\\eclipse\\temp\\" + disciplina.getDisciplina() + ".txt";
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(Aluno aluno: alunos) {
				String line = aluno.getGabarito() + "  " + aluno.getNome();
				bw.write(line);
				bw.newLine();
				System.out.println(line);
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	for(Disciplina disciplina: disciplinas) {
		String path1 = "c:\\eclipse\\temp\\" + disciplina.getDisciplina() + "gabaritooficial.txt";
		try(BufferedWriter bw1 = new BufferedWriter(new FileWriter(path1))){
			String line1 = disciplina.getGabaritooficial();
			bw1.write(line1);
			bw1.newLine();
			System.out.println(line1);
		}
	
	catch(IOException e) {
		e.printStackTrace();
	}
 }	
		sc.close();     
 }

}
