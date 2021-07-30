package ascensocolina;

public class MutacionEntero implements Mutacion<Integer> {
    @Override
    public Integer aplicar(Integer x){
      x += (int)(Math.random()*5);
      if( x >= 10 ) x = 10;
      else if( x<-10) x=-10;
      return x;
    }  
 }
