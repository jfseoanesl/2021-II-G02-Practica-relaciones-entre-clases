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
public class TablaDeContenido {
    private Capitulo[] capitulos;
    
    public TablaDeContenido(int nCapitulos){
        
        if(nCapitulos>10 && nCapitulos<0)
            this.capitulos = new Capitulo[10];
            
        this.capitulos = new Capitulo[nCapitulos];
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
    
    
    
}
