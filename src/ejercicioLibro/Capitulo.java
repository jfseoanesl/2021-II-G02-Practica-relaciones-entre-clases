/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioLibro;

/**
 *
 * @author jairo
 */
public class Capitulo {
    
    private String nombre;
    private int totalPaginas;
    private int paginaInicio;
    
    public Capitulo(String nombre, int totalPaginas, int paginaInicio){
        this.nombre=nombre;
        this.totalPaginas=totalPaginas;
        this.paginaInicio=paginaInicio;
    }
    
    public Capitulo(){
    
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the totalPaginas
     */
    public int getTotalPaginas() {
        return totalPaginas;
    }

    /**
     * @param totalPaginas the totalPaginas to set
     */
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    /**
     * @return the paginaInicio
     */
    public int getPaginaInicio() {
        return paginaInicio;
    }

    /**
     * @param paginaInicio the paginaInicio to set
     */
    public void setPaginaInicio(int paginaInicio) {
        this.paginaInicio = paginaInicio;
    }
    
    @Override
    public String toString(){
        return "Nombre="+this.nombre+", totalPaginas="+this.totalPaginas+", paginaInicio="+this.paginaInicio;
    }
    
}
