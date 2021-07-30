package ascensocolina;

public class Tercera implements Funcion<Double> {
    @Override
    public double evaluar(Double x){
      return Math.abs(x);
    }  
 }
