
public class Corredor {
	
	
	private String nombre;
	private int energia;
	private int distancia;
	
	public Corredor(String nombre, int energiaInicial) {
		this.nombre = nombre;
		verificarEnergia(energiaInicial);
		//if(energiaInicial>=0 && energiaInicial<=100)
			//this.energia = energiaInicial;
	}
	public void verificarEnergia(int energia) {
		if(energia<0)
			this.energia = 0;
		else if(energia>100)
			this.energia = 100;
		else
			this.energia = energia;
	}
	
	public void recargarEnergia(int valor) {
		this.energia += valor;
		verificarEnergia(this.energia);
	}
	public void correr() {
		this.energia -= 10;
		if(energia>0)
		this.distancia ++;
		verificarEnergia(this.energia);
	}
	public void entrenar() {
		this.energia += 15;
		verificarEnergia(this.energia);

		
	}
	public int getEnergia() {
		return this.energia;
	}
	public int getDistancia() {
		return distancia;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
