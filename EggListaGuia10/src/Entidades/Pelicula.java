
package Entidades;

import java.util.Comparator;

//implements Comparable<Pelicula> 

public class Pelicula {

    private String titulo;
    private String director;
    private Float duracion;
    //Interger, Double
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }

//    @Override
//    public int compareTo(Pelicula p1) {
//        return this.duracion.compareTo(p1.getDuracion());
//    }
    
  
    public static Comparator<Pelicula> compararDuracionMayor = (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());
    
    public static Comparator<Pelicula> compararDuracionMenor = (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());
  
    public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareTo(p2.getTitulo());
    
    public static Comparator<Pelicula> compararDirector = (Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector());
}
  