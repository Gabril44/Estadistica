package estadistica;

public class Fact {

	
	
	
	public static double factorial (double nro) {
		double numero=nro-1;
		while ( numero!=0) {
			  nro=nro*numero;
			  numero--;
			}
		return nro;
		
	}
	
	
	public static double Binomial (double n, double x, double p, double q ) {
		
		double uno = factorial(n)/(factorial(x)*(factorial(n-x)));
		double dos = Math.pow(p, x);
		double tres = Math.pow(q, (n-x));
		
		double result=uno*dos*tres;
		
		
		return result;
	}
	
	
	/*public static double Hipergeometrica(double x, double X, double N, double n) {
		double uno = factorial(X)/(factorial(x)*(factorial(X-x))); 
		double dos = N-X;
		double tres = n-x;
		double cuatro= factorial(dos)/(factorial(tres)*(factorial(dos-tres)));
	    double cinco= factorial(N)/(factorial(n)*(factorial(N-n)));
		double result=uno*cuatro*cinco;
		
		return result;
	}*/
	
	
}


