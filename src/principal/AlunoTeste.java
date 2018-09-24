package principal;

import java.util.Scanner;

import modelos.Curso;
import modelos.Disciplina;
import modelos.Professor;
import services.AlunoService;
import services.CursoService;
import services.DisciplinaService;
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
			
			System.out.println("Escolha uma op��o: \n ");
			System.out.println("(1) Cadastrar  Aluno");
			System.out.println("(2) Cadastrar  Curso");
			System.out.println("(3) Cadastrar Professor");
			System.out.println("(4) Cadastrar Disciplina");
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
				System.out.print("Digite o endere�o do aluno \n");
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
				System.out.print("Digite o c�digo do curso \n");
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
				System.out.print("Digite o endere�o do professor: ");
				String enderecoProfessor = teclado.next();
				System.out.print("Digite o telefone do professor: ");
				long telefoneProfessor = teclado.nextLong();
				System.out.print("Escolha a especialidade do professor: ");
				professorService.listarCategoriasProfessor();
				int opcaoCategoriaProfessor = teclado.nextInt();
				String especialidade = professorService.especialidadeProfessor(opcaoCategoriaProfessor);
				professorService.addProfessor(nomeProfessor, cpfProfessor, emailProfessor, enderecoProfessor, telefoneProfessor, especialidade);
				break;
			case 4:				
				System.out.println("Digite o nome da Disciplina: ");
				String nomeDisciplina = teclado.next();
				//Professor professor, double custo)
				System.out.print("Digite o codigo da Disciplina: ");
				int codigoDisciplina = teclado.nextInt();				
				System.out.print("Digite o horario da disciplina:");
				double horario = teclado.nextDouble();
				System.out.print("Digite a carga horaria da disciplina: ");
				int cargaHoraria = teclado.nextInt();
				System.out.print("Digite a sala da disciplina: ");
				int sala = teclado.nextInt();
				System.out.print("Escolha o professor da disciplina \n");
				professorService.listarProfessores();
				int opcaoProfessorDisciplina = teclado.nextInt();
				Professor professorSelect = professorService.professorDisciplina(opcaoProfessorDisciplina);
			//	professorService.addProfessor(nomeProfessor, cpfProfessor, emailProfessor, enderecoProfessor, telefoneProfessor, especialidade);
				break;

			default:
				break;
			}
		}
		System.out.println("Encerrando...");
		teclado.close();

	}
	

}
