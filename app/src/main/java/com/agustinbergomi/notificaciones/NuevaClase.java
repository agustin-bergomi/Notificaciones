package com.agustinbergomi.notificaciones;

public interface NuevaClase {

    String hola = "hola";

    public String saludar();
    public String responder();
}

interface Info{

    String nombre_cripto = null;
    String sigla_cripto = null;

    public String obtenerValores();

}

class Menu{

    private String entradas;
    private String platosPrincipales;
    private String postres;
    private String bebidas;

    public String mostrarPlatos(){
        return "Los platos son: " + entradas + platosPrincipales + postres + bebidas;
    }

    public Menu(String entradas, String platosPrincipales, String postres, String bebidas){
        this.postres = postres;
        this.platosPrincipales = platosPrincipales;
        this.bebidas = bebidas;
        this.entradas = entradas;
    }

    public Menu(String entradas, String platosPrincipales){
        this.entradas = entradas;
        this.platosPrincipales = platosPrincipales;
    }
//
//    public String getEntradas(){
//        return entradas;
//    }
//
//    public void setEntradas(){
//        this.entradas = entradas;
//    }


    public String getEntradas() {
        return entradas;
    }

    public void setEntradas(String entradas) {
        this.entradas = entradas;
    }
}