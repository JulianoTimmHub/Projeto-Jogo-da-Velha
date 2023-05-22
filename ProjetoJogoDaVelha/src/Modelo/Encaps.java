package Modelo;


public class Encaps {
    private String nome1;
    private String nome2;
    private String vitoriaX;
    private String vitoriaO;
    private String empatado;
    
    public String getnome1(){
        return nome1;
    }
    
    public void setnome1 (String nome1){
        this.nome1 = nome1;
    }
    
    public String getnome2(){
        return nome2;
    }
    
    public void setnome2 (String nome2){
        this.nome2 = nome2;
    }
    
    public String getvitoriaX(){
        return vitoriaX;
    }
    
    public void setvitoriaX (String vitoriaX){
        this.vitoriaX = vitoriaX;
    }
    
    public String getvitoriaO(){
        return vitoriaO;
    }
    
    public void setvitoriaO (String vitoriaO){
        this.vitoriaO = vitoriaO;
    }
    
    public String getempatado(){
        return empatado;
    }
    
    public void setempatado (String empatado){
        this.empatado = empatado;
    }  
}