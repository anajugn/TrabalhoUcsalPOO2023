package programa;

import java.util.List;

public interface IBase {
	
	List<Laboratorio> getlaboratorios();
	List<Departamento> getDepartamentos();
	List<Disciplina> getDisciplina();
	List<Professor> getProfessores();
	List<Aluno> getAlunos(int qtde, int inicio);

}
