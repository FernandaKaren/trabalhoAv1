package services;

import java.util.ArrayList;

import modelos.Curso;
import modelos.Professor;

public class CursoService {
	ArrayList<Curso> listaCursos = new ArrayList();
	public Curso cursoSelecionado(int indice)
	{
		indice = indice - 1;
		return listaCursos.get(indice);
	}
	public boolean verificaExistenciaCurso()
	{
		if(listaCursos.isEmpty()) 
		{
			System.out.println("Nenhum curso cadastrado por favor cadastre um curso!");
			return false;
		}		
		return true;
	}
	
	public void listarCursos()
	{
		if(listaCursos.isEmpty()) 
		{
			System.out.println("Nenhum curso cadastrado por favor cadastre um curso!");			
		}
		int indice = 1; 	
		for (Curso curso : listaCursos) 
		{
			curso.mostraCurso(indice);
			indice++;
		}
	}
	public void addCurso(String nomeCurso,int codigoCurso,String turno,Professor professorCoordenador)
	{
		Curso curso = new Curso();
		curso.setNomeCurso(nomeCurso);
		curso.setCodigoCurso(codigoCurso);
		curso.setTurno(turno);
		curso.setProfessorCoordenador(professorCoordenador);
		listaCursos.add(curso);
		System.out.print("Curso cadastrado com sucesso!");
	}
}
