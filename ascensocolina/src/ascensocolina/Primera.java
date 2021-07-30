package ascensocolina;

public class Primera implements Funcion<Integer> {
    @Override
    public double evaluar(Integer x){
      return -x*x;
    }  
 }