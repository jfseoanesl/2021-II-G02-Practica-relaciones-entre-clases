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
public class TablaDeContenido {
    private Capitulo[] capitulos;
    private int nCapitulosRegitrados; // capitulos adicionados a la tabla de contenido
    
    public TablaDeContenido(int nCapitulos){
        
        if(nCapitulos>10 && nCapitulos<0)
            this.capitulos = new Capitulo[10];
            
        this.capitulos = new Capitulo[nCapitulos];
        this.nCapitulosRegitrados=0;
    }
    
    public TablaDeContenido(){
        this(10);
    }

    /**
     * @return the capitulos
     */
    public Capitulo[] getCapitulos() {
        return capitulos;
    }

    /**
     * @param capitulos the capitulos to set
     */
    public void setCapitulos(Capitulo[] capitulos) {
        this.capitulos = capitulos;
    }
    
       /**
     * @return the nCapitulosRegitrados
     */
    public int getnCapitulosRegitrados() {
        return nCapitulosRegitrados;
    }

    /**
     * @param nCapitulosRegitrados the nCapitulosRegitrados to set
     */
    public void setnCapitulosRegitrados(int nCapitulosRegitrados) {
        this.nCapitulosRegitrados = nCapitulosRegitrados;
    }
    
    /**
     * Permite adicionar un capitulo a la tabla de contenido hasta completar su tamaño
     * @param capitulo 
     */
    public void adicionarCapitulo(Capitulo capitulo){
        
        if(this.capitulos.length>this.getnCapitulosRegitrados()){ // valida que se puede agregar un nuevo capitulo a la tabla de contenido
            this.capitulos[this.getnCapitulosRegitrados()]=capitulo; // agrega el capitulo a la table de contenido
            this.setnCapitulosRegitrados(this.getnCapitulosRegitrados() + 1); // se actualiza el numero de capitulos incluidos en la T. de contenido
        }
        
    }
    
    /**
     * permite leer un capitulo en una posicion especifica de la tabla de contenido
     * @param n
     * @return 
     */
    public Capitulo getCapitulo(int n){
        if(n>=0 && n<this.getnCapitulosRegitrados()){ // valida que el capitulo a leer, no supere el tamaño de capitulos registrados
            return this.capitulos[n];
        }
        return null;
    }
    
   
    
}
