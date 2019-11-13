package estadistica;

import java.util.Scanner;

public class Menu {
	
    public Menu()
    {
        Scanner sc= new Scanner(System.in);
        Distribuciones distribucion = new Distribuciones();

        System.out.println("****************BIENVENIDO*****************");
        System.out.println(" ");
        System.out.println("Que distribucion desea hacer?");
        System.out.println("\n");
        System.out.println("1_Binomial\n2_Poisson\n3_Hipergeometrica\n0_Salir");
        int op = sc.nextInt();

        switch(op){

        case 1:System.out.println("Ingrese N(Numero de eventos)");
            double n=sc.nextDouble();
            System.out.println("Ingrese X(Números de exitos)");
            double x=sc.nextDouble();
            System.out.println("Ingrese P(Probabilidad de éxito u Ocurrencia)");
            double p=sc.nextDouble();
            System.out.println("Ingrese Q(Probabilidad de Fracaso)");
            double q=sc.nextDouble();
            System.out.println("\nEl resultado es: "+" ");
            System.out.println(Distribuciones.Binomial(n, x, p, q));
            break;
        case 2:
            System.out.println("Ingrese el valor de lambda (exitos promedio en el intervalo)");
            double i=sc.nextDouble();
            System.out.println("Ingrese el valor de x (exitos minimos en el intervalo)");
            double j=sc.nextDouble();
            System.out.println(Distribuciones.Poisson(i, j));
            break;
//---------------------------------------------------------------------------
        case 0: break;
//---------------------------------------------------------------------------
        case 3:
        System.out.println("Ingrese N(Tamaño de población)");
        double N=sc.nextDouble();
        System.out.println("Ingrese n(Tamaño de la muestra)");
        double n1=sc.nextDouble();
        System.out.println("Ingrese X(Éxitos en la población)");
        double X=sc.nextDouble();
        System.out.println("Ingrese x(Éxitos en la muestra)");
        double x1=sc.nextDouble();
        System.out.println("\nEl resultado es: "+" ");
        System.out.println(Distribuciones.Hipergeometrica(x1, X, N, n1));
        }
    }
}