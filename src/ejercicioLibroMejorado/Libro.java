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
public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private TablaDeContenido indice; // Por la relacion de composicion
    
    public Libro(String titulo, String autor, String editorial, int nCapitulos){
        this.titulo=titulo;
        this.autor=autor;
        this.editorial=editorial;
        this.indice = new TablaDeContenido(nCapitulos); // en la composicion el objeto nace con el todo
    }
    
    public Libro(){
        this.indice = new TablaDeContenido(); // en la composicion el objeto nace con el todo
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the indice
     */
    public TablaDeContenido getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(TablaDeContenido indice) {
        this.indice = indice;
    }
    
    
}
