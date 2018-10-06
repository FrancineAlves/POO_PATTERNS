package strategy;

public class Tester {
	public static void main(String[] args) {
		
		CalculadoraDeHoras cs = new CalculadoraDeHoras(); 
		
		Veiculo carro1 = new Automovel("ASD-1234",Marca.FIAT, "Palio",2);
		cs.calcularHoras(carro1);
		System.out.println(carro1);
		
		Veiculo caminhao1 = new Automovel("ASD-1234",Marca.FIAT, "Palio", 4);
		cs.calcularHoras(caminhao1);
		System.out.println(caminhao1);
		
	}
}
