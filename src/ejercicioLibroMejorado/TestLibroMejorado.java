/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioLibroMejorado;

/**
 *
 * @author jairo
 */
public class TestLibroMejorado {
    
    public static void main(String[] args) {
        
        Capitulo uno = new Capitulo("Introudccion a java", 10, 1);
        Capitulo dos = new Capitulo("Clases y objetos", 12, 11);
        Capitulo tres = new Capitulo("Herencia", 5, 24);
        
        Libro java = new Libro("Hola Java", "Jairo Seoanes", "Unicesar editores", 3);
        
        java.getIndice().adicionarCapitulo(uno);
        java.getIndice().adicionarCapitulo(dos);
        java.getIndice().adicionarCapitulo(tres);
        
        imprimirLibro(java);
        
        
    }
    
    
    public static void imprimirLibro(Libro libro){
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Editorial: " + libro.getEditorial());
        
        System.out.println("Contenido: ");
        for(int i=0; i<libro.getIndice().getnCapitulosRegitrados();i++){
            System.out.println((i+1)+"->"+libro.getIndice().getCapitulo(i));
        }
    }
}
