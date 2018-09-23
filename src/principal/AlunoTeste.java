package principal;

import java.util.Scanner;

import modelos.Curso;
import modelos.Professor;
import services.AlunoService;
import services.CursoService;
import services.ProfessorService;

public class AlunoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		AlunoService alunoService = new AlunoService();
		CursoService cursoService = new CursoService();
		ProfessorService professorService = new ProfessorService();
		
		System.out.println("**Menu***");
		
		int ops = -1;
		while(ops != 0){
			
			System.out.println("Escolha uma opção: \n ");
			System.out.println("(1) Cadastrar  Aluno");
			System.out.println("(2) Cadastrar  Curso");
			System.out.println("(3) Cadastrar Professor");
			//System.out.println("(4) Cadastrar disciplina");
			//System.out.println("(3) Deletar contato");
			//System.out.println("(4) Listar contatos");
			System.out.println("(0) Sair \n");
		
			ops = teclado.nextInt();			
			
			switch (ops) {
			case 1:
				if(!cursoService.verificaExistenciaCurso()) {
					break;
				}
				System.out.println("Digite o nome do aluno \n");
				String nome = teclado.next();
				System.out.print("Digite o cpf do aluno \n");
				String cpf = teclado.next();				
				System.out.print("Digite o endereço do aluno \n");
				String endereco = teclado.next();
				System.out.print("Digite o telefone do aluno \n");
				long telefone = teclado.nextLong();				
				System.out.print("Escolha o curso \n");
				cursoService.listarCursos();
				int opcaoCurso = teclado.nextInt();
				Curso cursoSelecionado = cursoService.cursoSelecionado(opcaoCurso);
				alunoService.addAluno(nome, cpf, endereco, telefone, cursoSelecionado);
				break;
			case 2:
				if(!professorService.verificaExistenciaProfessor()) {
					break;
				}
				System.out.print("Digite o nome do curso \n");
				String nomeCurso = teclado.next();
				System.out.print("Digite o código do curso \n");
				int codigoCurso = teclado.nextInt();				
				System.out.print("Digite o turno do curso \n");
				String turnoCurso = teclado.next();								
				System.out.print("Escolha o professor coordenador do curso \n");
				professorService.listarProfessores();
				int opcaoProfessorCoorneador = teclado.nextInt();
				Professor professorSelecionado = professorService.professorCoordenador(opcaoProfessorCoorneador);
				cursoService.addCurso(nomeCurso, codigoCurso, turnoCurso, professorSelecionado);
				break;
			case 3:				
				System.out.println("Digite o nome do professor: ");
				String nomeProfessor = teclado.next();
				System.out.print("Digite o cpf do professor: ");
				String cpfProfessor = teclado.next();				
				System.out.print("Digite o email do professor:");
				String emailProfessor = teclado.next();
				System.out.print("Digite o endereço do professor: ");
				String enderecoProfessor = teclado.next();
				System.out.print("Digite o telefone do professor: ");
				long telefoneProfessor = teclado.nextLong();
				System.out.print("Escolha a especialidade do professor: ");
				professorService.listarCategoriasProfessor();
				int opcaoCategoriaProfessor = teclado.nextInt();
				String especialidade = professorService.especialidadeProfessor(opcaoCategoriaProfessor);
				professorService.addProfessor(nomeProfessor, cpfProfessor, emailProfessor, enderecoProfessor, telefoneProfessor, especialidade);
				break;

			default:
				break;
			}
		}
		System.out.println("Encerrando...");
		teclado.close();

	}

}
