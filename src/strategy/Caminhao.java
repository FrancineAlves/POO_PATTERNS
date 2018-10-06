package strategy;

public class Caminhao extends Veiculo{

	private Double valorHora = 8.45;
	private int hora;
	
	public Caminhao(String placa, Marca marca, String modelo, int hora) {
		super(placa, marca, modelo);
		this.hora = hora;
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}

	public Double calcularHoras(Veiculo veiculo){
		return valorHora+this.hora;
	}
	
}
