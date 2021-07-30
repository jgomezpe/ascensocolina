package ascensocolina;

public class MutacionReal implements Mutacion<Double> {
    @Override
    public Double aplicar(Double x){
      x += Math.random();
      if( x >= 5.0 ) x = 5.0;
      else if( x<-5.0 ) x=-5.0;
      return x;
    }  
 }
