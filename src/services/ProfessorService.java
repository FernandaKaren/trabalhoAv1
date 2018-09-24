package services;

import java.util.ArrayList;

import modelos.Professor;



public class ProfessorService {
	ArrayList<Professor> listaProfessor = new ArrayList();
	ArrayList<String> listaCategorias = new ArrayList();
	
	public ProfessorService() {
		if(listaCategorias.isEmpty()) {
			listaCategorias.add("Especialista");
			listaCategorias.add("Mestre");
			listaCategorias.add("Doutor");
		}
	}
	
	public Professor professorCoordenador(int indice)
	{
		indice = indice - 1;
		return listaProfessor.get(indice);
	}
	/*public Professor professorDisciplina(int indice)
	{
		indice = indice - 1;
		return listaProfessor.get(indice);
	}*/
	
	public boolean verificaExistenciaProfessor()
	{
		if(listaProfessor.isEmpty()) 
		{
			System.out.println("Nenhum professor cadastrado por favor cadastre um professor!");
			return false;
		}		
		return true;
	}
	
	public void listarProfessores()
	{
		if(listaProfessor.isEmpty()) 
		{
			System.out.println("Nenhum professor cadastrado por favor cadastre um professor!");			
		}
		int indice = 1; 	
		for (Professor professor : listaProfessor) 
		{
			professor.mostraProfessor(indice);
			indice++;
		}
	}
	
	public void listarCategoriasProfessor()
	{		
		int indice = 1; 	
		for (String categoriaProfessor : listaCategorias) 
		{
			System.out.println("("+indice+")" + categoriaProfessor);			
			indice++;			
		}				
	}
	public String especialidadeProfessor(int indice)
	{
		indice = indice - 1;
		return listaCategorias.get(indice);
	}
	
	public void addProfessor(String nomeProfessor,String cpfProfessor,String emailProfessor,String enderecoProfessor,long telefoneProfessor,String categoriasProfessor)
	{
		Professor professor = new Professor();		
		professor.setNomeProfessor(nomeProfessor);		
		professor.setEmailProfessor(emailProfessor);		
		professor.setEnderecoProfessor(enderecoProfessor);		
		professor.setTelefoneProfessor(telefoneProfessor);		
		professor.setCpfProfessor(cpfProfessor);		
		professor.setCategoriasProfessor(categoriasProfessor);
		listaProfessor.add(professor);
		System.out.print("Professor cadastrado com sucesso!");
	}

	public Professor professorDisciplina(int opcaoProfessorDisciplina) {
		opcaoProfessorDisciplina = opcaoProfessorDisciplina - 1;
		return listaProfessor.get(opcaoProfessorDisciplina);
			}
}
