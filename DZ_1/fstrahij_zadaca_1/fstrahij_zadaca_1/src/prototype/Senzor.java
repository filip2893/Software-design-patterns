/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Filip
 */
public class Senzor implements Cloneable{

    private String naziv;
    private int tip, vrsta;
    private float min, max;
    
    private Senzor senzor; 

    public Senzor(Senzor senzor) {
        this.senzor = senzor;
    }    

    public Senzor(String naziv, int tip, int vrsta, float min, float max) {
        this.naziv = naziv;
        this.tip = tip;
        this.vrsta = vrsta;
        this.min = min;
        this.max = max;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getTip() {
        return tip;
    }

    public int getVrsta() {
        return vrsta;
    }

    public float getMin() {
        return min;
    }

    public float getMax() {
        return max;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public void setVrsta(int vrsta) {
        this.vrsta = vrsta;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public Senzor getSenzor() {
        return senzor;
    }  

    @Override
    public Senzor clone() throws CloneNotSupportedException {
    
        Senzor temp = this.getSenzor();        
        
        return new Senzor (temp);
    
    }
    
    
}
