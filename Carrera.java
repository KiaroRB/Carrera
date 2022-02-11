
	import java.util.ArrayList;
	import java.util.List;

	public class Carrera {
		private int distanciaTotal;
		
		private ArrayList<Corredor> corredores = new ArrayList<Corredor>();
		
		public Carrera(int distancia, ArrayList<Corredor> corredores) {
			this.distanciaTotal = distancia;
			this.corredores = corredores;
		}
		
		public void empezar() {
			boolean control = true;
			while(control){
				
				for(int i=0;i<corredores.size();i++) {
					Corredor temp = corredores.get(i);
					temp.correr();
				}
				
				for(int i=0;i<corredores.size();i++) {
					// if un corredor no tiene energia
					// // int recarga = (int) (Math.random()* 10);
					// temp.recargarEnergia(recarga);
				}
				
				
				// if todos los corredores terminaron la carrera
				control = false;
					
					
				//}
			}
			
			
			
		}
		
		public ArrayList<Corredor> getPosiciones(){
			// 
			return null;
		}
		
		

	}



