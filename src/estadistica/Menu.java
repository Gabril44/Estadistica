package estadistica;

import java.util.Scanner;

public class Menu {
	
    public Menu() {
        Scanner sc= new Scanner(System.in);
        Distribuciones distribucion = new Distribuciones();

        System.out.println("****************BIENVENIDO*****************");
        System.out.println("\n");
        System.out.println("Que distribucion desea hacer?");
        System.out.println("\n");
        System.out.println("1_Binomial\n2_Poisson\n3_Hipergeometrica\n0_Salir");
        int op = sc.nextInt();

        switch(op){

        case 1:System.out.println("ingrese n");
            double n=sc.nextDouble();
            System.out.println("ingrese x");
            double x=sc.nextDouble();
            System.out.println("ingrese p");
            double p=sc.nextDouble();
            System.out.println("ingrese q");
            double q=sc.nextDouble();
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
        /*case 3:
        System.out.println("ingrese N");
        double N=sc.nextDouble();
        System.out.println("ingrese n");
        double n2=sc.nextDouble();
        System.out.println("ingrese X");
        double X=sc.nextDouble();
        System.out.println("ingrese x");
        double x2=sc.nextDouble();

        System.out.println(Fact.Hipergeometrica(x2, X, N, n2));*/



        }

    }

}
