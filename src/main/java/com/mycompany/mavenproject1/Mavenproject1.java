
package com.mycompany.mavenproject1;
import java.lang.Math;

/// ----------------------------Fibonacci-----------------------------------
/*

public class Mavenproject1 {

     public static void main(String[] args) {
         
         int N = 10;
         int x1 = 1;
         int x2 = 1;
         
         int Fib = 0;
         
         for(int i = 3; i <= N; i++){
             
             
             Fib = x2 + x1;
             x1 = x2;
             x2 = Fib;
                  
            System.out.println(Fib); 
         }
         
     }
}
*/
//---------------------------------Fibonacci----------------------------------

//-----------------------------------array------------------------------------

/*
public class Mavenproject1 {

     public static void main(String[] args) {
         
         String[] palabras = {"hola","adios"};
         
         // palabras 2
         
         String[] palabras2 = new String[23];
         
         System.out.println(palabras2[0]);
         
         //palabras 2
         
         System.out.println(palabras[0]);
         System.out.println(palabras[1]);
         
         palabras[0] = "buenos dias";
         
         System.out.println(palabras[0]);
         
         for (int i = 0; i < palabras.length; i++) {
             System.out.println(palabras[i]);
             System.out.println("hola");
         }
     }
     }
*/
//-----------------------------------array------------------------------------

//----------------------------------------------------------------------------

// calcular termino N de fibonacci con arrays en vez de x1, x2 y Fib

/*

public class Mavenproject1 {

     public static void main(String[] args) {
         int[] valores = {1,1,1,10};
         
         for (int i = 1; i < valores[3]; i++) {
             System.out.println(valores[2]);
             valores[2] = valores[1] + valores[0];
             valores[0] = valores[1];
             valores[1] = valores[2];
            
         }
     }
}
*/

// calcular y guradar todos los terminos de fibonacci hasta el N

/*
public class Mavenproject1 {

     public static void main(String[] args) {
         
     int N = 5;
     
     int[] Fib = new int[N];
     Fib[0] = 1;
     Fib[1] = 1;
     
     for (int i = 2; i < N; i++) {
     
          Fib[i] = Fib[i -1] + Fib[i-2];
     }
     for(int i=0; i<Fib.length;i++){
         System.out.println(Fib[i]);
     }

         }
}
 */    
//---------------------------Ejercicios array---------------------------

//----------------------------ver si un numero es capicua---------------------

/*
public class Mavenproject1 {

     public static void main(String[] args) {
     
     int N = 1551;
     int tam = 4;
     int tmp = N;
     
     int[] cifras = new int[tam];
     
     for (int i = 0; i < tam; i++){
     
     cifras[i] = tmp%10;
     System.out.println(cifras[i]);
     tmp = tmp/10;
     }
     
     double x = 0;
     for(int i= 0; i < tam; i++) {
         x = x + cifras[i]*Math.pow(10,tam-(i+1));
         
     }
         System.out.println((int)x == N);
         
     }
     }
*/

//----------------------------------simplificado * 10000----------------------------------

/*
public class Mavenproject1 {

     public static void main(String[] args) {

int n = 1551;
      int inverso = 0 ;
      int cifra     ; 
      int tmp = n;
while (tmp!=0){
cifra = tmp % 10; 
tmp= tmp / 10; 
inverso = inverso * 10 + cifra;
}      
   if(n == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
}}
*/
//----------------------------------simplificado * 10000----------------------------------


//-------------------------codigo capicua del profe--------------------------
/*

public class Mavenproject1 {

     public static void main(String[] args) {
     
     int N = 1551;
     int tam = 4;
     int tmp = N;
     
     int[] cifras = new int[tam];
     
     for (int i = 0; i < tam; i++){
     
     cifras[i] = tmp%10;
     System.out.println(cifras[i]);
     tmp = tmp/10;
     }
     
     double x = 0;
     for(int i= 0; i < tam; i++) {
         x = x + cifras[i]*Math.pow(10,tam-(i+1));
         
     }
         System.out.println((int)x == N);
     }}

*/

//-------------------------------codigo capicua del profe---------------------------

//-----------------damos N numeros, cual es el menor/mayor de todos-----------------



                //---------------------Menor--------------------------------
/*
public class Mavenproject1 {

     public static void main(String[] args) {
         

         double a = 5.43;
         double b = 43.21;
         double min;
         
         if(a > b) {
             min = b;
         }
         
         else {
             min = a;
         }
         
         System.out.println("el minimo es " + min);
     }
}
*/

                //---------------------Menor--------------------------------


/*
public class Mavenproject1 {

     public static void main(String[] args) {

int numeros[] = { 1, 2, 3, 4, 6, 7, 8};
        int X ;
        int Y ;
        
        if(numeros.length % 2 == 0){
            X = numeros[numeros.length / 2];
            Y = numeros[numeros.length / 2 - 1];
            System.out.println(Y);
            System.out.println(X);
        }
        else{
            X = numeros[numeros.length / 2];
            System.out.println(X);
        }
        
        //Con String
        
        String str = "abcdefghi";
        int A ;
        int B ;
        
        if( str.length() % 2 == 0){
            A = str.length() / 2;
            B = str.length() / 2 - 1;
            System.out.println(str.charAt(B));
            System.out.println(str.charAt(A));
        }
        else{
            A = str.length() / 2;
            System.out.println(str.charAt(A));
        }
     }
}
*/
public class Mavenproject1 {

     public static void main(String[] args) {
String cadena = "Esto es una cadena para contar las vocales";
int a = 0, e = 0, i = 0, o = 0, u = 0;

for (int x = 0; x < cadena.length(); x++) {
    char actual = cadena.toLowerCase().charAt(x);

    switch (actual) {
        case 'a':
            a++;
            break;
        case 'e':
            e++;
            break;
        case 'i':
            i++;
            break;
        case 'o':
            o++;
            break;
        case 'u':
            u++;
            break;
        default:
            break;
    }
}

System.out.println("Total de vocales: " + (a+e+i+o+u));

System.out.println("Cantidad de a: " + a);
System.out.println("Cantidad de e: " + e);
System.out.println("Cantidad de i: " + i);
System.out.println("Cantidad de o: " + o);
System.out.println("Cantidad de u: " + u);

     }}
