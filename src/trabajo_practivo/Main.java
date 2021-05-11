package trabajo_practivo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	        final double IVA = 0.21 ;
	        
	        Scanner scan = new Scanner(System.in);
	        
	        String RS;		
	        String Domicilio;	        
	        String Descripcion;
	        int precio;
	        int cantidad;
	        String Descripcion2;
	        int precio2;
	        int cantidad2;
	       
	        
	        System.out.println("Ingrese el la razon social de su empresa");
	        RS = scan.nextLine();
	        System.out.println("Ingrese el domicilio de su empresa");
	        Domicilio = scan.nextLine();
	        System.out.println("¿Que producto lleva?");
	        Descripcion = scan.nextLine();
	        System.out.println("¿Cuanto cuesta cada uno?");
	        precio = scan.nextInt();
	        System.out.println("¿Cuantos productos de ese tipo lleva?");
	        cantidad = scan.nextInt();
	        System.out.println("¿Que otro producto lleva?");
	        Descripcion2 = scan.next();
	        
	        
	        System.out.println("¿Cuanto cuesta cada uno?");
	        precio2 = scan.nextInt();
	        System.out.println("¿Cuantos lleva?");
	        cantidad2 =scan.nextInt();
	        
	  
	        
	        
	        
	        //Calculos producto 1
	        
	        int precioTotalP1 = precioTotal1(precio, cantidad);
	        double precioConIVAP1 = precioConIva1(IVA, precioTotalP1);
	        
	        //Calculos producto 2
	        int precioTotalP2 = precioTotal1(precio2, cantidad2);
	        double precioConIva2 = precioConIva1(IVA, precioTotalP2);
	        
	        
	        //Calculos en conjunto
	        int subtotalSinIva = subtotalSinIva(precioTotalP1, precioTotalP2);
	        double total = total(precioConIVAP1, precioConIva2);
	        
	        
	        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        System.out.println("Fecha");
	        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        System.out.println(RS);
	        System.out.println(Domicilio);
	        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	        System.out.println("Cantidad++++++Descripcion++++++++++++++++Precio Unitario++++++++++++++P Total");
	        System.out.println("-----------------------------------------------------------------------------");
	        System.out.println(cantidad + "              " + Descripcion +"                         " + precio + "   "+ "                 " + precioTotalP1);
	        System.out.println("-----------------------------------------------------------------------------");
	        System.out.println(cantidad2 + "              " + Descripcion2 +"                       "+ precio2 +"                        "+ precioTotalP2);
	        System.out.println("-----------------------------------------------------------------------------");
	        System.out.println("IVA: 21%");
	        System.out.println("Subtotal (sin IVA):   " + subtotalSinIva);
	        System.out.println("TOTAL:   " + total);
	        

	        
	        
	        
	
	        
		
	
	}

	private static double total(double precioConIVAP1, double precioConIva2) {
		return precioConIVAP1 + precioConIva2;
	}

	private static int subtotalSinIva(int precioTotalP1, int precioTotalP2) {
		return precioTotalP1 + precioTotalP2;
	}

	private static double precioConIva1(final double IVA, int precioTotalP1) {
		return precioTotalP1 * IVA + precioTotalP1;
	}

	private static int precioTotal1(int precio, int cantidad) {
		return precio*cantidad;
	}

}
