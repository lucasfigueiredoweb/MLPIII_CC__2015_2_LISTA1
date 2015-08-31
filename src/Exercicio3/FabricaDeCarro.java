package Exercicio3;

public class FabricaDeCarro {

	private static FabricaDeCarro instance = new FabricaDeCarro();

	private FabricaDeCarro() {
	}

	public static FabricaDeCarro getInstance() {
		return instance;

	}

}
