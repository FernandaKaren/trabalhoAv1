package services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import modelos.Aluno;
import modelos.Curso;
import modelos.Disciplina;

public class AlunoService {
		
	    ArrayList<Aluno> listaAlunos = new ArrayList();
		// Criar aluno
		public void addAluno(String nome,String cpf,String endereco,long telefone,Curso curso){
			Calendar cal = GregorianCalendar.getInstance();
			int anoCorrente = cal.get(Calendar.YEAR);
			Aluno aluno = new Aluno();			
			aluno.setNome(nome);
			aluno.setCpf(cpf);
			//Código do curso + 4 últimos dígitos do cpf + o ano corrente.
			int codigoCurso = curso.getCodigoCurso();
			String ultimosDigitosCpf = cpf.substring(cpf.length()-4);
			String matricula = codigoCurso +""+ultimosDigitosCpf+""+anoCorrente;
			aluno.setMatricula(matricula);
			aluno.setEndereco(endereco);
			aluno.setTelefone(telefone);
			aluno.setCurso(curso);
			listaAlunos.add(aluno);
			System.out.print("Aluno cadastrado com sucesso!");
		}
}
