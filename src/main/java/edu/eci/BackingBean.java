package edu.eci;


import java.util.Random;
import java.util.logging.Logger;
import javax.faces.bean.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2117816
 */

@ManagedBean(name = "beanEstadoAdivinanza")
@SessionScoped
public class BackingBean {
    
    private Random randomGenerator;
    private int numeroAdivinar;
    private int intentos;
    private int premio;
    private String estado;
    private int input;
    
    
    
    public BackingBean() {
        randomGenerator = new Random();
        numeroAdivinar = randomGenerator.nextInt(10) + 1;
        intentos = 0;
        premio = 100000;
        estado = "No has ganado todavía";
    }
    
    public void reiniciar() {        
        numeroAdivinar = randomGenerator.nextInt(10);
        intentos = 0;
        premio = 100000;
        estado = "No has ganado todavía";
    }
   
    
    public int getNumeroAdivinar() {
        return numeroAdivinar;
    }
    
    public int getIntentos() {        
        return intentos;
    }
    
    public int getPremio() {        
        return premio;
    }
    
    public String getEstado() {
        if(getInput() == numeroAdivinar) {
            //estado = ("Ganaste, tu premio es de " + String.valueOf(premio));
            estado = "Ganaste!";
        } else if(premio == 0) {
            estado = "Ya perdiste toda la plata, reinicia el juego";
        } else {
            estado = "No has ganado todavia, sigue intentando";
            
        }
        return estado;
    }

    
    public int getInput() {
        return input;
    }
    
    public void setInput(int inp) {
        input = inp;
        
        if(!estado.equals("Ganaste!") && premio > 0){
            intentos=intentos+1;
            premio = premio-10000;
        }
    }
}
