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
		char [] gabarito = sc;
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		alunos.add(new Aluno(gabarito, nome));
		System.out.println();
		}
		
		for(Aluno aluno: alunos) {
			if (aluno.respostasIguais()) {  
				System.out.print(0);
			}
			
	        int count = 0;
	        char[] gabChars = aluno.getGabarito().replace("\n", "").toCharArray();
	        for (int p = 0; p < gabChars.length; p++) { 
	        	if (aluno.getGabarito()[p] == gabChars[p]) { 
	        		count++;
	        	   }
	        	System.out.print(count);
	              }
	           
		      
	        
			
			String path2 = "c:\\temp\\" + disciplina.getDisciplina() + "ordemalfabética.txt";
		  try(BufferedWriter bw2 = new BufferedWriter(new FileWriter(path2))){
				  String line2 = aluno.getNome() + "  " + count;
				  bw2.write(line2);
				  bw2.newLine();
				  System.out.println(line2);
			  }
		  catch(IOException e) {
			  e.printStackTrace();
		  }
		  
		}	
		
		
		String path = "c:\\temp\\" + disciplina.getDisciplina() + ".txt";
			
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(Aluno aluno: alunos) {
				String convert = new String(aluno.getGabarito());
				String line = convert + "  " + aluno.getNome();
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
		String path1 = "c:\\temp\\" + disciplina.getDisciplina() +  "in.txt";
		try(BufferedWriter bw1 = new BufferedWriter(new FileWriter(path1))){
			String line1 = new String(disciplina.getGabaritooficial());        
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
