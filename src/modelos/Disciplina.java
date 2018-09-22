package modelos;

import java.util.ArrayList;

public class Disciplina {
	private String nome;
	private int codigoDisciplina;
	// 4 dígitos
	private Professor professor;
	private String chamada;
	ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
	// lista de alunos matriculados
	private int sala;
	//salas são valores entre 100 até 399.
	private int cargaHoraria;
	//2h ou 4h por semana.
	private double horario;
	private double custo;
	// O custo é e a soma de todos os custos em um mês:
	//Custo com professor, valor da hora aula multiplicado pela carga horária do professor.
	// Especialista 25$/h, mestre 35$/h e doutor 45$/h
	// Custo com infraestrutura, valor de custo de uma sala multiplicado pela carga horária da disciplina.
	// Custo de de uma sala é de 30$/h.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}
	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getChamada() {
		return chamada;
	}
	public void setChamada(String chamada) {
		this.chamada = chamada;
	}
	public ArrayList<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}
	public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getHorario() {
		return horario;
	}
	public void setHorario(double horario) {
		this.horario = horario;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
}
