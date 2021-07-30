package ascensocolina;

public class Main{
    public static void reales() {
	    AscensoColina<Double> opt = new AscensoColina<Double>();
	    Funcion<Double> f = new Cuarta();
	    // Funcion<Double> f = new Tercera();
	    Mutacion<Double> m = new MutacionReal();
	    
	    opt.aplicar( f, 1.0, m, 1000);	
    }

    public static void cadenas(){
	AscensoColina<String> opt = new AscensoColina<String>();
	Funcion<String> f = new SoloA();
	Mutacion<String> m = new MutacionCadena();
	      
	opt.aplicar(f, "A ver que sucede", m, 1000);    
    }
   
    public static void main(String[] args){
      reales(); // Descomentar para correr optimización en reales
      // cadenas(); // Descomentar para correr optimización en cadenas
    }
  }
