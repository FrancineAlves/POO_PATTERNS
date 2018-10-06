package strategy;

public class Automovel extends Veiculo{

	private Double valorHora = 2.5;
	private int hora;
	
	public Automovel(String placa, Marca marca, String modelo, int hora) {
		super(placa, marca, modelo);
		this.hora=hora;
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

	@Override
	public String toString() {
		return "Automovel [valorHora=" + valorHora + ", hora=" + hora + "]";
	}
	
}
