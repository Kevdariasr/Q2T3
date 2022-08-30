package com.mycompany.taller3;
import java.util.Scanner;
public class Taller3 {
private Scanner leer;
double n1;

public void Datos(){
 Scanner leer = new Scanner(System.in);
 System.out.println("Digite el numero: ");
 n1 = leer.nextDouble();
}

public static boolean primo(double n1){
    if (n1 % 2 == 0)return false;
    
    for(int i = 3; i * i <= n1; i += 2){
        if(n1 % i == 0) return false;
    }
    
    return true;
}
    public void resultado (){
     if(primo(n1)) System.out.println("Es primo");
    else System.out.println("No es primo");
}


public static void main(String[] args) {

   Taller3 llamar = new Taller3();
   llamar.Datos();
   llamar.resultado();

}


}