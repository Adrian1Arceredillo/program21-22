/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author arceredillo.adrian
 */
public class Terminoa {
    
    private String euskara;
    private String gaztelera;

    public Terminoa(String euskara, String gaztelera) {
        this.euskara = euskara;
        this.gaztelera = gaztelera;

    }

    public String getEuskara() {
        return euskara;
    }

    public void setEuskara(String euskara) {
        this.euskara = euskara;
    }

    public String getGaztelera() {
        return gaztelera;
    }

    public void setGaztelera(String gaztelera) {
        this.gaztelera = gaztelera;
    }

    @Override
    public String toString() {

        String s = "Euskera : " + euskara + "  \nGaztelera : " + gaztelera + "\n-----------------------------------------------------------------------\n";
        return s;
    }
}
