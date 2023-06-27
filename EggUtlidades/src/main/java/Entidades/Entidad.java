package Entidades;

import java.util.Date;
import java.util.Random;

public class Entidad {

    //---------------------Ej 1 Cadena-------------------//
//    private String frase;
//    private int longitud;
//
//    public Entidad() {
//    }
////new Entidades("hola")
//    public Entidad(String frase) {
//        this.frase = frase;
//        this.longitud = frase.length();
//    }
//
//    public void setFrase(String frase) {
//        this.frase = frase;
//    }
////cs.setLongitud(50)
//    public void setLongitud(int longitud) {
//        this.longitud = longitud;
//    }
//
//    public String getFrase() {
//        return frase;
//    }
//
//    public int getLongitud() {
//        return longitud;
//    }
    //-------------------Ej 2 Par de Numeros-------------------//
//    private double num1;
//    private double num2;
//
//    public Entidad() {
//        this.num1 = Math.random()*10;
//        this.num2 = Math.random()*10;
//    }
//    
//    public Entidad(double num1, double num2) {
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//
//    public void setNum1(double num1) {
//        this.num1 = num1;
//    }
//
//    public void setNum2(double num2) {
//        this.num2 = num2;
//    }
//
//    public double getNum1() {
//        return num1;
//    }
//
//    public double getNum2() {
//        return num2;
//    }
    //------------------Ej 3-------------------//
//  vacio
    //------------------Ej 4 fecha-------------//
//  vacio
    //------------------Ej 5 ------------------//
//    private String nombre;
//    private Date fechaN;
//
//    public Entidad() {
//    }
//
//    public Entidad(String nombre, Date fechaN) {
//        this.nombre = nombre;
//        this.fechaN = fechaN;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void setFechaN(Date fechaN) {
//        this.fechaN = fechaN;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public Date getFechaN() {
//        return fechaN;
//    }
    //------------------Ej 6 ---------------------//
//    private String nombreCurso;
//    private int cantidadHorasDia;
//    private int cantidadDiaSemana;
//    private String turno;
//    private double precioHora;
//    private String[] alumnos = new String[5]; 
//
//    public Entidad() {
//    }
//
//    public Entidad(String nombreCurso, int cantidadHorasDia, int cantidadDiaSemana, String turno, double precioHora, String[] alumnos) {
//        this.nombreCurso = nombreCurso;
//        this.cantidadHorasDia = cantidadHorasDia;
//        this.cantidadDiaSemana = cantidadDiaSemana;
//        this.turno = turno;
//        this.precioHora = precioHora;
//        this.alumnos = alumnos;
//    }
//
//    public void setNombreCurso(String nombreCurso) {
//        this.nombreCurso = nombreCurso;
//    }
//
//    public void setCantidadHorasDia(int cantidadHorasDia) {
//        this.cantidadHorasDia = cantidadHorasDia;
//    }
//
//    public int getCantidadDiaSemana() {
//        return cantidadDiaSemana;
//    }
//
//    public void setTurno(String turno) {
//        this.turno = turno;
//    }
//
//    public void setPrecioHora(double precioHora) {
//        this.precioHora = precioHora;
//    }
//
//    public void setAlumnos(String[] alumnos) {
//        this.alumnos = alumnos;
//    }
//
//    public String getNombreCurso() {
//        return nombreCurso;
//    }
//
//    public int getCantidadHorasDia() {
//        return cantidadHorasDia;
//    }
//
//    public void setCantidadDiaSemana(int cantidadDiaSemana) {
//        this.cantidadDiaSemana = cantidadDiaSemana;
//    }
//
//    public String getTurno() {
//        return turno;
//    }
//
//    public double getPrecioHora() {
//        return precioHora;
//    }
//
//    public String[] getAlumnos() {
//        return alumnos;
//    }
    //--------------------Ej 1 extra---------------//
    //vacio
    //------------------Ej 2 extra------------------//
//    private char[] palabra;
//    private char[] adivinados; //_ _ _ _ 
//    private int cantLetras;
//    private int pifios;
//
//    public Entidad() {
//    }
//
//    public Entidad(char[] palabra, char[] adivinados, int cantLetras, int pifios) {
//        this.palabra = palabra;
//        this.adivinados = adivinados;
//        this.cantLetras = cantLetras;
//        this.pifios = pifios;
//    }
//
//    public void setPalabra(char[] palabra) {
//        this.palabra = palabra;
//    }
//
//    public void setAdivinados(char[] adivinados) {
//        this.adivinados = adivinados;
//    }
//
//    public void setAdivinadosPos(char ad, int pos) {
//        this.adivinados[pos] = ad;
//    }
//    public void setCantLetras(int cantLetras) {
//        this.cantLetras = cantLetras;
//    }
//
//    public void setPifios(int pifios) {
//        this.pifios = pifios;
//    }
//
//    public char[] getPalabra() {
//        return palabra;
//    }
//
//    public char[] getAdivinados() {
//        return adivinados;
//    }
//
//    public int getCantLetras() {
//        return cantLetras;
//    }
//
//    public int getPifios() {
//        return pifios;
//    }
        //-----------------Ej Integrador----------//
    
    private String nombre;
    private double salario;

    public Entidad() {
    }

    public Entidad(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
    
    
}
