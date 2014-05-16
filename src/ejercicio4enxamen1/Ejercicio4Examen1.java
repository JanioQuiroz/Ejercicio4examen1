package ejercicio4enxamen1;

import java.util.Scanner;

public class Ejercicio4Examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un scanner para las respuestas
		Scanner X = new Scanner(System.in); 
		//hacemos las preguntas
		System.out.println("A continuacion se le haran 5 preguntas, conteste correctamente...");
		System.out.println("¿Cuanto es 4+6?");
		//creamos una variable para cada una de las resspuestas
		//hacemos un ciclo que nos indique si la respuesta es correcta o incorrecta
		int r = X.nextInt();
		if (r==10)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");
		

		System.out.println("¿Cuanto es 10*6?");
		int s = X.nextInt();
		if (s==60)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");
		
		
		System.out.println("¿Cuanto es 100/5?");
		int a = X.nextInt();
		if (a==20)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");
		
		
		System.out.println("¿Cuanto es 50-20?");
		int w = X.nextInt();
		if (w==30)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");
		
		
		System.out.println("¿Cuanto es 8*2+5?");
		int y = X.nextInt();
		if (y==21)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");
		
		//creamos las variables p1, p2, p3, p4 y p5 para hacer el porcentaje
		//con un valor de 20 cada pregunta para completar el 100% si estan buenas las 5 
		int p1;
		if (r==10)
			p1=20;
		else
			p1=0;
		
		int p2;
		if (s==60)
			p2=20;
		else
			p2=0;
		
		int p3;
		if (a==20)
			p3=20;
		else
			p3=0;
		
		int p4;
		if (w==30)
			p4=20;
		else
			p4=0;
		
		int p5;
		if (y==21)
			p5=20;
		else
			p5=0;
		//con un S.O.P sumamos las respuestas correctas y incorrectas 
		//y tenemos listo el programa
		System.out.println("Su porcentaje de respuestas es: ");
		System.out.println(p1+p2+p3+p4+p5+("%"));
		
	}

}
