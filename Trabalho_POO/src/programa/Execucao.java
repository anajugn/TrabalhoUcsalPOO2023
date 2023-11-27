package programa;

public class Execucao {

public static void main(String[] args) {
		Base bs = new Base();

		for (Laboratorio lab : bs.getlaboratorios()) {
			System.out.println(lab);

		}
	}

}

