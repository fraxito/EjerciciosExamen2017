/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosexamen2017;

/**
 *
 * @author jorgecisneros
 */
public class EjerciciosExamen2017 {

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }
    
    public boolean palindromo(String palabra){
        //1º creo la palabra sin espacios
        String p1 = "";
        for (int i=0; i< palabra.length(); i++){
            if (palabra.charAt(i) != ' '){
                p1 = p1 + palabra.charAt(i);
            }
        }
        //Ahora en p1 tengo gurdada todas las letras de la palabra sin los espacios en blanco
        
        //METODO DE LOS DOS INDICES
        //En este método vamos comparando la primera letra con la última, la segunda letra con la penúltima etc
        int longitudPalabra = p1.length();
        for (int i=0; i < longitudPalabra/2; i++){
            if (p1.charAt(i) != p1.charAt(longitudPalabra -1 -i )){
                return false;
            }
        }
        return true;
    }
 
    public boolean palindromoMetodo2(String palabra){
        //1º creo la palabra sin espacios
        String p1 = "";
        for (int i=0; i< palabra.length(); i++){
            if (palabra.charAt(i) != ' '){
                p1 = p1 + palabra.charAt(i);
            }
        }
        //Ahora en p1 tengo gurdada todas las letras de la palabra sin los espacios en blanco
        
        //METODO DE LA PALABRA INVERTIDA
        //En este método creamos una palabra nueva con todas las letras invertidas
        int longitudPalabra = p1.length();
        String p2 = "";
        for (int i=0; i < longitudPalabra; i++){
            p2 = p2 + p1.charAt(longitudPalabra -1 -i );
        }
        //retorna la comparación de las dos palabras; si son iguales, devuelve true, si no, false
        return p1.equals(p2);
    }
        
    public void calendario(int n){
        int posicion = 1; //variable que guarda la posición del 1 al 7 en la que estamos
        n = n%7;  // si tengo más de 7, que imprima el numero correspondiente, que no haga otra linea de XX
        
        //imprime las XX iniciales
        for (int i=0; i<n; i++){
            System.out.print("XX ");
            posicion++;
        }
        
        //imprime los numeros del 01 al 31. Si posicion llega a 7, lo cambia a 0 e imprime una linea nueva
        for (int i=1; i<=31; i++){
            if (i<10){
                System.out.print("0" + i + " ");
            }
            else {
                System.out.print(i + " ");
            }
            if (posicion == 7){
                 System.out.println();
                 posicion = 0;
            }
            posicion++;
        }
        
        //imprime las XX del final
        for (int i=posicion; i<=7; i++){
            System.out.print("XX ");
        }        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosExamen2017 ejercicio1 = new EjerciciosExamen2017();
        //System.out.println( ejercicio1.hasTeen(0, 0, 0) );
//        System.out.println( ejercicio1.palindromo("acaso hubo buhos aca") );
//        System.out.println( ejercicio1.palindromoMetodo2("acaso hubo buhos aca") );
        for (int i=0; i<=7; i++){ 
            ejercicio1.calendario(i);
            System.out.println();
            System.out.println();
        }
    }
    
}
