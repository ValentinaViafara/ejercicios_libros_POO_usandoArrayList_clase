/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoLibros.vista;

import edu.unal.poo.conjuntoLibros.modelo.Autor;
import edu.unal.poo.conjuntoLibros.modelo.ConjuntoLibro;
import edu.unal.poo.conjuntoLibros.modelo.Libro;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class PruebaLibro {
    
    public static int selecionarOpcion(){
       Scanner teclado = new Scanner(System.in);
       int opcion = -1; 
       System.out.println("Presione: ");
       System.out.println("1.Ingresar Libro\n2.Eliminar libro por Autor\n3.Eliminar por Titulo");
       System.out.println("\n4.Buscar Libro Mejor Calificado\n 5.Buscar Menor Calificado \n6.Calificar Libro\n 7.Listar Todo \n8 Salir");
       opcion = teclado.nextInt();
       return opcion;  
    }
    public static void main(String[] args) {
         int opcion = 0;
         Scanner teclado = new Scanner(System.in);
         ConjuntoLibro conjunto = new ConjuntoLibro();
         do{
            opcion = selecionarOpcion();
            switch(opcion){
                case 1 : 
                     //Ingresar Libro
                    System.out.println("Ingresar Titulo");
                    String titulo = teclado.next();
                    System.out.println("Ingresar Numero de Paginas");
                    int paginas = teclado.nextInt();
                    Libro libro = new Libro(titulo, paginas);
                    System.out.println("Ingrese nombre autor");
                    String nombre = teclado.next();
                    System.out.println("Ingrese apellido");
                    String apellido = teclado.next();
                    System.out.println("Ingrese telefono");
                    String telefono = teclado.next();
                    Autor autor = new Autor(nombre, apellido, telefono);
                    libro.setAutor(autor);
                    
                    boolean resultado = conjunto.anadirLibro(libro);
                    if(resultado == true){
                        System.out.println("Ingreso exitoso");
                    }else{
                        System.out.println("Problema al realizar la insercion");
                    }
                    break;
                    
                case 2 : 
                      //Eliminar Libro Por Autor
                    System.out.println("Ingrese nombre del autor");
                      String nombreAutor = teclado.next();
                      resultado = conjunto.eliminarxAutor(nombreAutor);
                      if(resultado == true){
                          System.out.println("Libro eliminado satisfactoriamente");
                      }else{
                          System.out.println("No se ha podido eliminar el libro");
                      }
                      break;
                
                case 3 : 
                     //Eliminar Libro por Titulo
                    System.out.println("Ingrese nombre del autor");
                     String tituloLibro = teclado.next();
                      resultado = conjunto.eliminarxTitulo(tituloLibro);
                      if(resultado == true){
                          System.out.println("Libro eliminado satisfactoriamente");
                      }else{
                          System.out.println("No se ha podido eliminar el libro");
                      }
                      
                      break;
                case 4 : 
                     //Buscar Mejor Calificado
                    Libro mejor = conjunto.buscarMejorCalificado();
                    if(mejor != null){
                        System.out.println(mejor.getTitulo());
                    }else{
                        System.out.println("No existen libros registrados");
                    }
                      break;
                case 5 : 
                     //Buscar Menor Calificado
                     Libro menor = conjunto.buscarMenorCalificado();
                    if(menor != null){
                        System.out.println(menor.getTitulo());
                    }else{
                        System.out.println("No existen libros registrados");
                    }
                    
                      break;
                case 6 : 
                      //Calificar Libro
                    System.out.println("Ingrese titulo del libro");
                    tituloLibro = teclado.next();
                    System.out.println("Ingrese la calificacion");
                    int calificacion =   teclado.nextInt();
                    resultado = conjunto.calificarLibro(tituloLibro, calificacion);
                    if(resultado == true){
                        System.out.println("Calificaicon exitosa");
                    }else{
                        System.out.println("No se realizo la calificacion");
                    }
                    
                      break;
                case 7 : 
                     //Listar Todo
                     Libro[] listar = conjunto.mostrarLibros();
                     for (int i = 0; i < listar.length; i++) {
                         if(listar[i]!=null){
                             System.out.println(listar[i].getTitulo());
                         }
                    }
                      break;
                
               default:
                   break;
            
            }
            
         }while(opcion != 8);
    
         }
        
}
