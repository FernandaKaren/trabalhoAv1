package modelos;

import java.util.ArrayList;

public class Curso {
	private String nomeCurso;
	private int codigoCurso;	
	// número de 4 dígitos
	private String turno;
	private Professor professorCoordenador;
	ArrayList<Disciplina> grade = new ArrayList<Disciplina>();
	//A grade é uma lista de disciplinas.
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public Professor getProfessorCoordenador() {
		return professorCoordenador;
	}
	public void setProfessorCoordenador(Professor professorCoordenador) {
		this.professorCoordenador = professorCoordenador;
	}
	public ArrayList<Disciplina> getGrade() {
		return grade;
	}
	public void setGrade(ArrayList<Disciplina> grade) {
		this.grade = grade;
	}
	public void mostraCurso(int indice){
		System.out.println("("+indice+") Nome: " + this.nomeCurso + "\n");				
	}
	
}
