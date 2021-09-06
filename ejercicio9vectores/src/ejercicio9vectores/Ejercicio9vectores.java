
package ejercicio9vectores;

import java.util.Scanner;
public class Ejercicio9vectores {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int elegir,c,x;
        double n=0;
        System.out.println("Ingrese lotes de Ventas pares");
        x=entrada.nextInt();
        if(x%2==0){
            System.out.println("Numero del Producto[1-2-3-4-5]");
            for(int i=0;i<x;i++){
                do{
                    System.out.println("Seleccione un producto:");
                    elegir = entrada.nextInt();
                }while((elegir<1)||(elegir>5));
            
                switch(elegir){
                    case 1:
                        System.out.println("Ingrese Cantidad vendidas:");
                        c=entrada.nextInt();
                        int cantidad1=c;
                        double producto1 = 2.98;
                        n=n+producto1;
                        break;
                
                    case 2:
                        System.out.println("Ingrese Cantidad vendidas:");
                        c=entrada.nextInt();
                        int cantidad2=c;
                        double producto2 = 4.50;
                        n=n+producto2;
                        break;
                
                    case 3:
                        System.out.println("Ingrese Cantidad vendidas:");
                        c=entrada.nextInt();
                        int cantidad3=c;
                        double producto3 = 9.98;
                        n=n+producto3;
                        break;
                
                    case 4:
                        System.out.println("Ingrese Cantidad vendidas:");
                        c=entrada.nextInt();
                        int cantidad4=c;
                        double producto4 = 4.49;
                        n=n+producto4;
                        break;
                
                    case 5:
                        System.out.println("Ingrese Cantidad vendidas:");
                        c=entrada.nextInt();
                        int cantidad5=c;
                        double producto5 = 6.87;
                        n=n+producto5;
                        break;
                }
            } 
        }
        System.out.println("Valor total de ventas:"+n);     
    }
    
}
