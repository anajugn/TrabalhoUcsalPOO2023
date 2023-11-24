package entidades;

public class Aluno {
private int id;
	private int matricula;
	private String nome;
	private boolean definicao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isDefinicao() {
		return definicao;
	}
	public void setDefinicao(boolean definicao) {
		this.definicao = definicao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
