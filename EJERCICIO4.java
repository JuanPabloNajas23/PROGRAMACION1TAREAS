
package CLASEMATH;

public class EJERCICIO4 {

    public static void main(String[] args) {
        double numero1 = Math.random()*50+1;
        double numero2 = Math.random()*50+1;
        double numero1redon = Math.round(numero1*100.0)/100.0; //Redondee a dos decimales
        double numero2redon = Math.round(numero2*100.0/100.0); //Redondee a dos decimales
        System.out.println("El numero mayor es =" + Math.max(numero1redon, numero2redon));
       
    }
    
}
