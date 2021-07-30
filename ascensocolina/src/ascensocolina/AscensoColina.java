package ascensocolina;

public class AscensoColina<T>{
    public T aplicar( Funcion<T> f, T x, Mutacion<T> m, int ITERS ){
      double fx = f.evaluar(x);
      for( int i=0; i<ITERS; i++ ){
        T y = m.aplicar(x);
        double fy = f.evaluar(y);
        if( fy >= fx ){
          x = y;
          fx = fy;
        }
        System.out.println("x="+x+" fx="+fx);
      }
      return x;
    }
  }
