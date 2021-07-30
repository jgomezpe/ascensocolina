package ascensocolina;

public class SoloA implements Funcion<String> {
    @Override
    public double evaluar(String x){
      int cuenta=0;
      for( int i=0; i<x.length(); i++ ){
        if(x.charAt(i)=='a' || x.charAt(i)=='A')
         cuenta++;
      }
      return cuenta;
    }  
 }
