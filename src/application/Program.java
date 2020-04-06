package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<>();
		
		System.out.println("Qual a disciplina ? ");
		String disciplina = sc.nextLine();
		
		System.out.println("Quantos alunos vão ser registrados ?");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
		System.out.println();
		System.out.println("Aluno #" + i + ": ");
		System.out.print("Gabarito: ");
		sc.nextLine();
		String gabarito = sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		alunos.add(new Aluno(gabarito, nome));
		sc.nextLine();
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
		
        sc.close();
	}

}
