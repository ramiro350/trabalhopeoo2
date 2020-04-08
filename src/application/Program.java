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
		System.out.println("Disciplina" + c + ": ");
		sc.nextLine();
		String disciplina = sc.nextLine();
		disciplinas.add(new Disciplina(disciplina));
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
		
		}
		
		
		String path = "c:\\eclipse\\temp\\" + disciplina + ".txt";
		
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
        sc.close();
}

}
