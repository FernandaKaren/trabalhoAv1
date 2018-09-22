package modelos;

import java.util.ArrayList;

public class Professor {
	
	private String nomeProfessor;
	private String cpfProfessor;
	private String enderecoProfessor;
	private String emailProfessor;
	private long telefoneProfessor;
	private CategoriasEnum categoriasProfessor;
	// Especialista
	// Mestre
	// Doutor
	private Disciplina disciplinasProfessor;
	// Um professor deve estar associado a pelo menos uma disciplina.
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public String getCpfProfessor() {
		return cpfProfessor;
	}
	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
	}
	public String getEnderecoProfessor() {
		return enderecoProfessor;
	}
	public void setEnderecoProfessor(String enderecoProfessor) {
		this.enderecoProfessor = enderecoProfessor;
	}
	public String getEmailProfessor() {
		return emailProfessor;
	}
	public void setEmailProfessor(String emailProfessor) {
		this.emailProfessor = emailProfessor;
	}
	public long getTelefoneProfessor() {
		return telefoneProfessor;
	}
	public void setTelefoneProfessor(long telefoneProfessor) {
		this.telefoneProfessor = telefoneProfessor;
	}
	public CategoriasEnum getCategoriasProfessor() {
		return categoriasProfessor;
	}
	public void setCategoriasProfessor(CategoriasEnum categoriasProfessor) {
		this.categoriasProfessor = categoriasProfessor;
	}
	public Disciplina getDisciplinasProfessor() {
		return disciplinasProfessor;
	}
	public void setDisciplinasProfessor(Disciplina disciplinasProfessor) {
		this.disciplinasProfessor = disciplinasProfessor;
	}
	
	

}
