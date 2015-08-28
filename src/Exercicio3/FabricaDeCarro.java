package Exercicio3;

public class FabricaDeCarro {

	private static FabricaDeCarro instance;

	static {

	}

	private FabricaDeCarro() {
	}

	public static FabricaDeCarro getInstance() {

		if (instance == null) {
			inicializaInstancia();

		}
		return instance;

	}

	private static synchronized void inicializaInstancia() {
		if (instance == null) {
			instance = new FabricaDeCarro();
		}
	}

}
