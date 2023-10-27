package Prueba;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner teclado=new Scanner(System.in);
			
		
			
				 int op1=0;
				 
				 System.out.println("OPCIONES CON PRODUTOS");
				 
				 do {
					 System.out.println("1.Coeficientes de una ecuación");
					 System.out.println("2.Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene");
					 System.out.println("3.Dime el dia, mes y año de una fecha");
					 System.out.println("4.Dame un array de numeros");
					 
					 op1=Integer.parseInt(teclado.next());
					 
					 switch (op1) {
					 
					 case 1:
						 ejercicio1();
						 
					 case 2:
						 cifraNumeros();
						;
						
					 case 3:
						 ejercicio3(); 
						
					 case 4:
						 ejercicio4();
					 }
										 
					 
				 } while(true);
				 

			}

	private static void ejercicio4() {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int longitud[]= {1,5,3,8,5,6,0};
		System.out.println(Arrays.toString(longitud));
		
		Arrays.sort(longitud);	
		System.out.println(Arrays.toString(longitud));
		
		
		
	}

	private static void ejercicio3() {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Indicar Fecha:");
		
		System.out.println("Dia: ");
		int dia=teclado.nextInt();
		System.out.println("Mes: ");
		int mes=teclado.nextInt();
		System.out.println("Año: ");
		int year=teclado.nextInt();
		
		int diaMes[]= {31,28,31,30,31,30,31,3130,31,30,31};
		
		if(dia>0 && dia<=diaMes[mes-1]) {
			
			System.out.println("Es correcto");
		}
		else {
			System.out.println("Es incorrecto");
		}		
		
	}

	private static void cifraNumeros() {
		// TODO Auto-generated method stub
		 Scanner teclado=new Scanner(System.in);
		 System.out.println("Dime un numero");
		 
		 int numero=teclado.nextInt();
		 
		 if(numero>0 && numero<10) {
			  System.out.println("Tiene una cifra");
		 }
		 if(numero>9 && numero<99) {
			 System.out.println("Tiene dos cifras");
		 }
		 if(numero>99 && numero<1000) {
			 System.out.println("Tiene tres cifras");
		 }
		 if(numero>1000 && numero<9999) {
			 System.out.println("tiene cuatro cifras");
		 }
		 
		 
		}

	private static void ejercicio1() {
		// TODO Auto-generated method stub
		 Scanner teclado=new Scanner(System.in);
		 
		System.out.println("introduce A");
		int a=teclado.nextInt();
		System.out.println("Introduce B");
		int b=teclado.nextInt();
		System.out.println("Introduce C");
		int c=teclado.nextInt();
		
		double solucion1=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a);
		double solucion2=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c)/2*a);
		
		if(Double.isNaN(solucion1)||Double.isNaN(solucion2)) {
			System.out.println("no existe");
		}
		else {
			System.out.println(solucion1+" "+solucion2);
		}
		
		
	}
	}


