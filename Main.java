import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		//Corredor c1 = new Corredor(35);
		//c1.recargarEnergia(20);
		//c1.recargarEnergia(20);
		Corredor c1 = new Corredor("Corredor 1",100);
		Corredor c2 = new Corredor("Corredor 2",(int) (Math.random()* 100));
		Corredor c3 = new Corredor("Corredor 3",(int) (Math.random()* 100));
		Corredor c4 = new Corredor("Corredor 4",(int) (Math.random()* 100));
		Corredor c5 = new Corredor("Corredor 5",(int) (Math.random()* 100));
		Corredor c6 = new Corredor("Corredor 6",(int) (Math.random()* 100));
		Corredor c7 = new Corredor("Corredor 7",(int) (Math.random()* 100));
		Corredor c8 = new Corredor("Corredor 8",(int) (Math.random()* 100));
		
		ArrayList<Corredor> corredores = new ArrayList<Corredor>();
		corredores.add(c1);
		corredores.add(c2);
		corredores.add(c3);
		corredores.add(c4);
		corredores.add(c5);
		corredores.add(c6);
		corredores.add(c7);
		corredores.add(c8);
		
		for(int i=0;i<corredores.size();i++) {
		Corredor temp = corredores.get(i);
			temp.correr();
		}
	
		Carrera carrera = new Carrera(1000, corredores);
		carrera.empezar();
		carrera.getPosiciones();
		
		c1.correr();
		c1.correr();
		c1.correr();
		int recarga =(int)(Math.random()*10);
		System.out.println(recarga);
		c1.recargarEnergia(10);
		c1.correr();
		c1.correr();
		c1.correr();
		c1.recargarEnergia(10);
		c1.correr();
		
		System.out.println(c1.getEnergia());
		System.out.println(c1.getDistancia());


	}

}
