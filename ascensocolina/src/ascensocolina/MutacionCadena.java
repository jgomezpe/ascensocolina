package ascensocolina;

public class MutacionCadena implements Mutacion<String> {
    @Override
    public String aplicar(String x){
      char c = (char)(65+(int)(Math.random()*26));
      int pos = (int)(Math.random()*x.length());
      return x.substring(0,pos)+c+x.substring(pos+1,x.length());
    }  
 }
