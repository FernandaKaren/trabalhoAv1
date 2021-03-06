package services;

import java.util.ArrayList;

import modelos.Aluno;
import modelos.Curso;
import modelos.Disciplina;
import modelos.Professor;

public class DisciplinaService {
	
	ArrayList<Disciplina> listaDisciplina = new ArrayList();
	
	public Disciplina disciplinaSelecionado(int indice)
	{
		indice = indice - 1;
		return listaDisciplina.get(indice);
	}
	public boolean verificaExistenciaDisciplina()
	{
		if(listaDisciplina.isEmpty()) 
		{
			System.out.println("Nenhuma disciplina cadastrado por favor cadastre um curso!");
			return false;
		}		
		return true;
	}

	
	public void listarDisciplina()
	{
		if(listaDisciplina.isEmpty()) 
		{
			System.out.println("Nenhuma disciplina cadastrado por favor cadastre um curso!");			
		}
		int indice = 1; 	
		for (Disciplina disciplina : listaDisciplina) 
		{
			disciplina.mostraDisciplina(indice);
			indice++;
		}
	}
	public void addDisciplina(String nomeDisciplina,int codigoDisciplina, double horario, int cargaHoraria, int sala,Professor professorDisciplina)
	{
		Disciplina disciplina = new Disciplina();
		disciplina.setNomeDisciplina(nomeDisciplina);
		disciplina.setCodigoDisciplina(codigoDisciplina);
		disciplina.setSala(sala);
		disciplina.setCargaHoraria(cargaHoraria);
		disciplina.setProfessorDisciplina(professorDisciplina);
	//	disciplina.setCusto(custo);
		disciplina.setHorario(horario);
		listaDisciplina.add(disciplina);
		System.out.print("Disciplina cadastrado com sucesso!");
	}
	
	 
	
	//private String chamada;


}
