package calculadora;

import java.util.Scanner;

public class Principal {
    final static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Introduce primer número");
	int num1=sc.nextInt();
	System.out.println("Introduce segundo número");
	int num2=sc.nextInt();
	Calculadora cal=new Calculadora(num1,num2);
	System.out.println(cal.suma());
	System.out.println(cal.division());
	}
	

}
