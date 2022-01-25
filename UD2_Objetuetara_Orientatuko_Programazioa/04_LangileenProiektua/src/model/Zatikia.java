package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

/**
 *
 * @author arceredillo.adrian
 */
public class Zatikia {

    private int zenbakitzailea;
    private int izendatzailea;

    /**
     * Este método tiene como objetivo, crear una fracción aleatoria; es decir:
     * El valor del NUMERADOR será un número aleatorio, generado por la función
     * "Math.random()" El valor del DENOMINADOR será un número aleatorio,
     * generado por la función "Math.random()"
     */
    public Zatikia() {

        zenbakitzailea = 1;
        izendatzailea = 1;
    }

    /*public Zatikia() {
        Random rnd = new Random();
        zenbakitzailea = (rnd.nextInt());
        izendatzailea = (rnd.nextInt());
    }*/
    public Zatikia(int zenbakitzailea, int izendatzailea) {
        
        this.zenbakitzailea = zenbakitzailea;   //"this" es para diferenciar entre conceptos con el mismo nombre;
        this.izendatzailea = izendatzailea;
    }

    /**
     * Este método nos permite obtener, de un String con formato
     * "numerador/denominador", los valores tanto para el NUMERADOR, como para
     * el DENOMINADOR. -> Una posible forma de hacerlo: Lo que esté a la
     * izquiera de "/" será numerador. En cambio, lo que se encuentre a la
     * derecha de "/" será denominador.
     *
     * @param zatIdatzia
     */
    public Zatikia(java.lang.String zatIdatzia) {

        String separator = "/";
        int posSeparator = zatIdatzia.indexOf(separator);

        zenbakitzailea = Integer.valueOf(zatIdatzia.substring(0, posSeparator));
        izendatzailea = Integer.valueOf(zatIdatzia.substring(posSeparator + separator.length()));

        Zatikia fra1 = new Zatikia( //Integer.valueOf(zatIdatzia.substring(0, posSeparator)),
                //Integer.valueOf(zatIdatzia.substring(posSeparator + separator.length()))
                );

        //System.out.print(fra1.toString());
        //System.out.println("Substring before separator = " + zatIdatzia.substring(0, posSeparator));
        //zenbakitzailea = Integer.valueOf(zatIdatzia.substring(0, posSeparator));
        //System.out.println("Substring after separator = " + zatIdatzia.substring(posSeparator + separator.length()));
        //izendatzailea = Integer.valueOf(zatIdatzia.substring(posSeparator + separator.length()));
    }

    /**
     * Este método devuelve el NUMERADOR (número de la parte SUPERIOR de la
     * fracción)
     *
     * @return -> Número entero que se encuentra en la parte SUPERIOR de la
     * fracción
     */
    public int getZenbakitzailea() {    //Obtener el numerador
        return zenbakitzailea;
    }

    /**
     * Este método devuelve el DENOMINADOR (número de la parte INFERIOR de la
     * fracción)
     *
     * @return -> Número entero que se encuentra en la parte INFERIOR de la
     * fracción
     */
    public int getIzendatzailea() {     //Obtener el denominador
        return izendatzailea;
    }

    public void setZenbakitzailea(int zenba) {  //establecer un nuevo numerador
        zenbakitzailea = zenba;
    }

    public void setIzendatzailea(int izenda) {  //establecer un nuevo denominador
        izendatzailea = izenda;
    }

    /**
     * Este método devuelve una representación de la fracción en forma de
     * string.
     *
     * @return representación en forma de string (p.e.: 4/5) de la fracción
     */
    public java.lang.String toString() {
        return "Zatikia[" + zenbakitzailea + "/" + izendatzailea + "]";
    }

    /**
     * Este método estático crea una nueva fracción, la cual es la
     * multiplicación entre dos fracciones que nosotros especifiquemos, pero sin
     * cambiar las fracciones recibidas (iniciales).
     *
     * @param zat1
     * @param zat2
     * @return -> devuelve el resultado de la multiplicación en un objeto de
     * clase Zatikia.
     */
    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {   //al estar subrayado en el diagrama, el método es ESTÁTICO
        //crear un zatiki nuevo.

        Zatikia fra1 = new Zatikia(zat1.getZenbakitzailea() * zat2.getZenbakitzailea(), zat1.getIzendatzailea() * zat2.getIzendatzailea());
        fra1.sinplifikatu();
        return fra1;
    }

    /**
     * Este método estático crea una nueva fracción, la cual es la suma entre
     * dos fracciones que nosotros especifiquemos, pero sin cambiar las
     * fracciones recibidas (iniciales).
     *
     * @param zat1
     * @param zat2
     * @return -> devuelve el resultado de la suma en forma de fracción.
     */
    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {    //al estar subrayado en el diagrama, el método es ESTÁTICO
        Zatikia frSumaDos = new Zatikia(
                (zat1.getZenbakitzailea() * zat2.getIzendatzailea()) + (zat1.getIzendatzailea() * zat2.getZenbakitzailea()),
                (zat1.getIzendatzailea() * zat2.getIzendatzailea())
        );
        frSumaDos.sinplifikatu();
        return frSumaDos;
    }

    /**
     * OPCIÓN 1 -> batu(besteZatBat:Zatikia): void Este método de instancia
     * cambiará el objeto actual (= fracción actual), sumando el valor de otra
     * fracción.
     *
     * @param besteZatBat
     */
    public void batu(Zatikia besteZatBat) {

        this.zenbakitzailea = (this.zenbakitzailea * besteZatBat.getIzendatzailea()) + (this.izendatzailea * besteZatBat.getZenbakitzailea());
        this.izendatzailea = this.izendatzailea * besteZatBat.getIzendatzailea();

        this.sinplifikatu();
    }

    /**
     * Otra forma de hacerlo: OPCIÓN 2 -> batu(besteZatBat:Zatikia): void Este
     * método de instancia cambiará el objeto actual (= fracción actual),
     * sumando el valor de otra fracción.
     *
     * @param besteZatBat
     */
    public void batu2(Zatikia besteZatBat) {
        this.setZenbakitzailea((this.zenbakitzailea * besteZatBat.getIzendatzailea()) + (this.izendatzailea * besteZatBat.getZenbakitzailea()));
        this.setIzendatzailea(this.izendatzailea * besteZatBat.getIzendatzailea());

        System.out.println(this.toString());
    }

    /**
     * Este método realiza la resta entre dos fracciones, y muestra el resultado en una nueva fracción.
     * Para que se pueda efectuar la resta, la primera fracción deberá ser mayor que la segunda.
     * Hay dos posibles casos:
     * -> si los DENOMINADORES son IGUALES, simplemente se restarán los NUMERADORES
     * -> si los DENOMINADORES son DIFERENTES, se multiplicará en cruz (restando),y se multiplicarán los denominadores.
     *
     * @param za1
     * @param za2
     * @return
     */
    public static Zatikia kenketa(Zatikia za1, Zatikia za2) {

        Zatikia zaKenketa = new Zatikia();
        if (za1.getIzendatzailea() == za2.getIzendatzailea()) {     //si ambos denominadores son iguales, a la hora de hacer la resta se mantendrá dicho valor. Por lo tanto, se puede poner el de za1 o za2
            if (za1.isBiggerThan(za2)) {
                zaKenketa.setIzendatzailea(za1.getIzendatzailea());
                zaKenketa.setZenbakitzailea(((za1.getZenbakitzailea()) - (za2.getZenbakitzailea())));
            } else if (za2.isBiggerThan(za1)) {
                zaKenketa.setIzendatzailea(za1.getIzendatzailea());
                
                zaKenketa.setZenbakitzailea(((za1.getZenbakitzailea()) - (za2.getZenbakitzailea())));
                //System.out.println(String.valueOf('-'));
            }

        } else if (za1.getIzendatzailea() != za2.getIzendatzailea()) {
            if (za1.isBiggerThan(za2)) {
                zaKenketa.setZenbakitzailea((za1.zenbakitzailea * za2.izendatzailea) - (za1.izendatzailea * za2.zenbakitzailea));
                zaKenketa.setIzendatzailea(za1.izendatzailea * za2.izendatzailea);
            } else if (za2.isBiggerThan(za1)) {
                zaKenketa.setZenbakitzailea((za1.zenbakitzailea * za2.izendatzailea) - (za1.izendatzailea * za2.zenbakitzailea));
                zaKenketa.setIzendatzailea(za1.izendatzailea * za2.izendatzailea);
            }
            zaKenketa.setZenbakitzailea((za1.getZenbakitzailea() * za2.getIzendatzailea()) - (za1.getIzendatzailea() * za2.getZenbakitzailea()));
            zaKenketa.setIzendatzailea(za1.izendatzailea * za2.izendatzailea);
        }

        zaKenketa.sinplifikatu();
        //System.out.println(String.valueOf('-'));
        return zaKenketa;
        //Zatikia frKenketa = new Zatikia(zat1.getZenbakitzailea() * zat2.getZenbakitzailea(), zat1.getIzendatzailea() * zat2.getIzendatzailea());

    }

    public double hamartarBaliokidea() {

        return (double) this.zenbakitzailea / this.izendatzailea;
    }

    /**
     * Este método compara dos fracciones y determina cuál de ellas es la mayor
     *
     * @param besteZatikiBat
     * @return --> si una fracción X (this) es mayor que otra Y
     * (besteZatikiBat), devolverá true.
     */
    public boolean isBiggerThan(Zatikia besteZatikiBat) {
        if (this.hamartarBaliokidea() > besteZatikiBat.hamartarBaliokidea()) {
            //System.out.println(this + " es mayor que " + besteZatikiBat);
            return true;
        }
        return false;
    }

    public void sinplifikatu() {
        int menor = 0;
        if (this.zenbakitzailea > this.izendatzailea) {
            menor = this.izendatzailea;
        } else if (this.izendatzailea > this.zenbakitzailea) {
            menor = this.zenbakitzailea;
        }
        //System.out.println(menor);
        for (int i = menor; i >= 1; --i) {
            if (this.zenbakitzailea % i == 0 && this.izendatzailea % i == 0) {
                this.setZenbakitzailea(this.zenbakitzailea / i);
                this.setIzendatzailea(this.izendatzailea / i);
            }
        }
        //System.out.println(this.toString());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.zenbakitzailea;
        hash = 61 * hash + this.izendatzailea;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zatikia other = (Zatikia) obj;
        if (this.zenbakitzailea != other.zenbakitzailea) {
            return false;
        }
        if (this.izendatzailea != other.izendatzailea) {
            return false;
        }
        return true;
    }

    /*public boolean equals(Zatikia besteZatikiBat) {
        
    }*/
    public boolean isBaliokidea(Zatikia besteZatikiBat) {
        if (this.zenbakitzailea * besteZatikiBat.izendatzailea == this.izendatzailea * besteZatikiBat.zenbakitzailea) {
            return true;
        }
        return false;
    }

    public void zatikiakOrdenatu(Zatikia[] zatikiak) {

        for (int i = 0; i <= zatikiak.length - 1; ++i) {
            Zatikia temporal = zatikiak[i];
            for (int j = 1; j < zatikiak.length - i; ++j) {
                if (zatikiak[j - 1].isBiggerThan(zatikiak[j])) {
                    temporal = zatikiak[j - 1];
                    zatikiak[j - 1] = zatikiak[j];
                    zatikiak[j] = temporal;
                }
            }
        }

    }

    //-.-.-.-.-.-
    
    
}

//https://www.tutorialspoint.com/get-the-substring-after-the-first-occurrence-of-a-separator-in-java
//https://www.tutorialspoint.com/get-the-substring-after-the-first-occurrence-of-a-separator-in-java
//https://www.javatpoint.com/java-string-indexof
//http://chuwiki.chuidiang.org/index.php?title=Generar_n%C3%BAmeros_aleatorios_en_Java
//http://puntocomnoesunlenguaje.blogspot.com/2012/07/generacion-de-numeros-aleatorios-en-java.html

