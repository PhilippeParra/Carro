package ejecutable;

import modelo.Carro;

public class Test 
{
    public static void main(String[] args) 
    {
        //Crear un objeto de tipo carro usando un constructor sin parametro
        Carro carro1 = new Carro();

        System.out.print("Color: " + carro1.getColor());
        System.out.print("\nNum. Ruedas: " + carro1.getNumRuedas());
        System.out.print("\nPos. X: " + carro1.getPosX());
        System.out.print("\nPos. Y: " + carro1.getPosY());
        System.out.print("\nVelocidad: " + carro1.getVelocidad());

        System.out.print("\n----------------------------\n");

        System.out.print(carro1);

        //Crear ubn objeto tipo Carro usando constructor con parametros
        Carro carro2 = new Carro("Blanco" , 10 , 100);
        carro2.acelerar();
        System.out.println(carro2);
    }    
}
