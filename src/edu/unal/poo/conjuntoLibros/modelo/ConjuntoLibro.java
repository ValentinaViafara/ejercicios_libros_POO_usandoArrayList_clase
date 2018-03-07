/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoLibros.modelo;

/**
 *
 * @author Estudiante
 */
import java.util.ArrayList;
public class ConjuntoLibro {
        //Asociacion
    private ArrayList<Libro> libros;

    public ConjuntoLibro() {
      this.libros=new ArrayList<>();
    }
    
    public boolean anadirLibro(Libro libro){
       boolean resultado=
       this.libros.add(libro);
         return resultado;
       
    }
       
    
    public ArrayList<Libro> mostrarLibros(){
      return this.libros;
    }
    
    public boolean eliminarxAutor(String nombre){
        for (int i = 0; i < this.libros.size(); i++) {
            Libro libro=this.libros.get(i);       
            if(libro.getAutor().getNombre().equals(nombre)){
                Libro eliminado= this.libros.remove(i);
            if(eliminado!=null)
                return true;
            
        }
        }
        //duda??? 
        return true;
    }
    
    
    public boolean eliminarxTitulo(String titulo){
        for (int i = 0; i < libros.size(); i++) {
            Libro libro = this.libros.get(i);
            if (libro.getTitulo().equals(libro)){
                return this.libros.remove(libro);
            }
            
        }
        return false;
    }
    
}