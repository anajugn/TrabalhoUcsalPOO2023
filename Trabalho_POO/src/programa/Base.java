package programa;

import java.util.ArrayList;
import java.util.List;

public class Base implements IBase{

	private final Integer

	QTDE_DEPARTAMENTOS = 3,
	QTDE_PROFESSORES = 15,
	QTDE_LABORATORIOS = 12;


	private List<Laboratorio> laboratorios;
	private List<Departamento> Departamentos;
	private List<Disciplina> Disciplina;
	private List<Professor> Professores;
	private List<Aluno> Alunos;

	@Override
	public List<Laboratorio> getlaboratorios() {
		laboratorios();
		return this.laboratorios;
	}

	private void laboratorios() {
		this.laboratorios = new ArrayList<Laboratorio>();
		Laboratorio lab;
		for (int i = 0, ctle = 0; i < QTDE_LABORATORIOS; i++, ctle++) {
			lab = new Laboratorio();
			lab.setId(ctle);
			lab.setDescricao("LAMI"+ ctle);
			lab.setCapacidade(15);
			lab.setStatus(false);
			this.laboratorios.add(lab);
		}
	}

	@Override
	public List<Departamento> getDepartamentos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Disciplina> getDisciplina() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professor> getProfessores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> getAlunos(int qtde, int inicio) {
		// TODO Auto-generated method stub
		return null;
	}

}
