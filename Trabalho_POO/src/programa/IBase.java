package programa;

public class IBase {
	
	private final Integer
	
			QTDE_DEPARTAENTOS = 3,
			QNTDE_PROFESSORES = 15,
			QTDE_LABORATORIOS = 12;


	List<Laboratorio> getLaboratorios();
	List<Departamento> getDepartamentos();
	List<Disciplina> getDisciplina();
	List<Professor> getProfessores();
	List<Aluno> getAlunos(int qtde, int inicio);
	
	private void labortatorios() {
		this.labortatorios = new ArrayList<Laboratorios>();
		Laboratorio lab;
		
		for (int i = 0; i <	QTDE_LAABORATORIOS; i++, ctle++) {
			lab.setId(Long.valueOf(ctle));
			lab.setDescricao("LAMI"+ crle);
			
		}
			
		}
	}