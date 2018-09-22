package modelos;

public class Aluno {
	
	private String nome;
	private String cpf;
	private String matricula;
	// Código do curso + 4 últimos dígitos do cpf + o ano corrente.
	private String endereço;
	private String email;
	private long telefone;
	private boolean situacao;
	//Todo aluno deve se encontrar em uma situação que pode ser: Matriculado ou Pendente.
	private Curso curso;
	private Disciplina disciplina;
	//Lista de disciplinas cuja o mesmo está matriculado.
	//Todo aluno deve possuir pelo menos 1 disciplina para estar na situação Matriculado.
	//Um aluno so pode estar matriculado em no máximo 6 disciplinas.
	//Um aluno sem disciplinas deve ficar como pendente.
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	//Ao mostrar os dados do Aluno, o sistema deve mostrar (Fora os demais dados) seu curso
	//e todas as disciplinas

}
