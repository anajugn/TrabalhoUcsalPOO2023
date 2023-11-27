package programa;

import java.util.Iterator;

public class IBase {
	
	private final Integer
	
			QTDE_DEPARTAMENTOS = 3,
			QTDE_PROFESSORES = 15,
			QTDE_LABORATORIOS = 12;


	List<Laboratorio> getLaboratorios();
	List<Departamento> getDepartamentos();
	List<Disciplina> getDisciplina();
	List<Professor> getProfessores();
	List<Aluno> getAlunos(int qtde, int inicio);
	
	private void labortatorios() {
		this.laboratorios() = new ArrayList<Laboratorio>();
		Laboratorio lab;
		
		for (int i = 0; i <	QTDE_LABORATORIOS; i++, ctle++) {
			lab.setId(Long.valueOf(ctle));
			lab.setDescricao("LAMI"+ ctle);
			
		}
			
		}
	
	private void professores() {
		this.professores() = new ArrayList<Professor>();
		Professor prof;
		
		for (int i = 0; i < QTDE_PROFESSORES; i++, ctle++) {
			prof.setId(Long.valueOf(ctle));
			prof.setDescricao("LAMI" + ctle);
			
		}
	}
	
	private void departamentos() {
		this.departamentos() = new ArrayList<Departamento>();
		Departamento dep;
		
		for (int i = 0; i < QTDE_DEPARTAMENTOS; i++, ctle++) {
			dep.setId(Long.valueOf(ctle));
			dep.SetDescricao("LAMI" + ctle);
			
		}
	}
	}
