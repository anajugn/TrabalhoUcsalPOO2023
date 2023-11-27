package programa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IBase3 {
	
	private final Integer
	
			QTDE_DEPARTAMENTOS = 3,
			QTDE_PROFESSORES = 15,
			QTDE_LABORATORIOS = 12;


	private List<Laboratorio> laboratorios;
	private List<Departamento> Departamentos;
	private List<Disciplina> Disciplina;
	private List<Professor> Professores;
	private List<Aluno> Alunos;
	
	int ctle;
	
	private void laboratorios() {
		this.laboratorios = new ArrayList<Laboratorio>();
		Laboratorio lab;
		
		for (int i = 0; i <	QTDE_LABORATORIOS; i++, ctle++) {
			lab.setId(Long.valueOf(ctle));
			lab.setDescricao("LAMI"+ ctle);
			lab.setCapacidade(15);
			lab.setStatus(false);
			
		}
		
		return laboratorios;
			
		}
	
	private void professores() {
		this.professores() = new ArrayList<Professor>();
		Professor prof;
		
		for (int i = 0; i < QTDE_PROFESSORES; i++, ctle++) {
			prof.setId(Long.valueOf(ctle));
			prof.setNome("Professor" + i);
			prof.setDepartamento(null);
			prof.setStatus(false);
			
		}
	}
	
	private void departamentos() {
		this.departamentos() = new ArrayList<Departamento>();
		Departamento dep;
		
		for (int i = 0; i < QTDE_DEPARTAMENTOS; i++, ctle++) {
			dep.setId(Long.valueOf(ctle));
			dep.SetDescricao("LAMI" + ctle);
			
		}
		
		private List<Aluno> alunos(){
			
			this.alunos = new alunos
		}
		
	}
	}