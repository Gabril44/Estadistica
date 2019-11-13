package estadistica;

public class Distribuciones {
	
    public static double factorial (double nro) {
        if (nro == 0) {
            return 1;
        }
        double numero=nro-1;
        while ( numero!=0) {
            nro=nro*numero;
            numero--;
          }
        return nro;
    }

    public static double Binomial (double n, double x, double p, double q ) {
        double t1 = factorial(n)/(factorial(x)*(factorial(n-x)));
        double t2 = Math.pow(p, x);
        double t3 = Math.pow(q, (n-x));
        return (t1*t2*t3);
    }

    public static double Poisson (double lambda, double x){
        double e = Math.exp(1);
        double result = 0;
        while(x>=0){
            double factX = factorial(x);
            result += (Math.pow(lambda, x))*(Math.pow(e, -lambda))/factX;
            x-=1;
            System.out.println(factX);
        }
        
        return(result); 
    }


    public static double Hipergeometrica(double x1, double X, double N, double n1) {
            double uno = factorial(X)/(factorial(x1)*(factorial(X-x1)));
            double dos = N-X;
            double tres = n1-x1;
            double cuatro= factorial(dos)/(factorial(tres)*(factorial(dos-tres)));
        double cinco= factorial(N)/(factorial(n1)*(factorial(N-n1)));
            double result=(uno*cuatro)/cinco;

            return result;
    }
}


