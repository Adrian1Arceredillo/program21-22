package model;

import java.util.ArrayList;

public class Libros {

    /**
     * Liburuaren izenburua
     */
    private String izenburua;
    /**
     * Liburuaren egilearen izen abizenak
     */
    private String egilea;
    /**
     * Liburuaren orri kopurua. Zenbaki positibo bat dela ziurtatuko dugu
     * (Setterraren bidez). Ez badigute balio egokia eman, 0 balioa emango diogu
     * atributo honi.
     */
    private int orriKopurua;
    /**
     * Zein urtetan argitaratu den liburua. Uneko urtea baino handiagoa ez dela
     * ziurtatuko dugu (Seterraren bidez)
     */
    private int urtea;
    /**
     * Hiru balio hauetakoren bat izango du atributo honek: Fikzioa, Historikoa,
     * Bestelakoa. Seterraren bidez, horrela dela ziurtatuko dugu. "Bestelakoa"
     * da balio lehenetsia.
     */
    private String gaia;
    /**
     * Hiru balio hauetakoren bat izango du atributo honek: E(Euskara),
     * G(Gaztelera), I(Ingelesa). Seterraren bidez, horrela dela ziurtatuko
     * dugu. Ez badigute balio egokia eman, '-' balioa emango diogu atributo
     * honi.
     */
    private char hizkuntza;
    /**
     * Liburutegiak erosi zuenean, liburuagatik ordaindu zuena gordeko dugu.
     */
    private double prezioa;

    public Libros(String izenburua, String egilea, int orriKopurua, int urtea, String gaia, char hizkuntza, double prezioa) {
        this.izenburua = izenburua;
        this.egilea = egilea;
        this.orriKopurua = orriKopurua;
        this.urtea = urtea;
        this.setGaia(gaia);
        this.setHizkuntza(hizkuntza);
        this.prezioa = prezioa;
    }

    public String getIzenburua() {
        return izenburua;
    }

    public void setIzenburua(String izenburua) {
        this.izenburua = izenburua;
    }

    public String getEgilea() {
        return egilea;
    }

    public void setEgilea(String egilea) {
        this.egilea = egilea;
    }

    public int getOrriKopurua() {
        return orriKopurua;
    }

    public void setOrriKopurua(int orriKopurua) {
        this.orriKopurua = orriKopurua;
    }

    public int getUrtea() {
        return urtea;
    }

    public void setUrtea(int urtea) {
        this.urtea = urtea;

    }

    public String getGaia() {
        return this.gaia;
    }

    /**
     * Parametro bezala pasatu diguten gaia "FIKZIOA" bada (bai maiuskulaz edo
     * minuskulaz, edozein case-etan), "Fikzioa" balioa emango diogu
     * atributoari. Pasatu diguten gaia "HISTORIKOA" bada (edozein case-tan),
     * "Fikzioa" balioa emango diogu atributoari. Beste kasuetan, "Bestelakoa"
     * balioa emango diogu.
     */
    public void setGaia(String gaia) {
        //METODO HAU OSATU BEHAR DUZU
        String fikzi = "fikzioa";
        String histori = "historikoa";

        if (gaia.toLowerCase().equals(fikzi)) {
            this.gaia = "Fikzioa";
        } else if (gaia.toLowerCase().equals(histori)) {
            this.gaia = "Historikoa";
        } else if (!((gaia.toLowerCase().equals(fikzi) || gaia.toLowerCase().equals(fikzi)))) {
            this.gaia = "Bestelakoa";
        }

    }

    public char getHizkuntza() {
        return hizkuntza;
    }

    /**
     * Parametro bezala 'e' edo 'E' pasatzen badigute, 'E' balioa emango diogu
     * atributoari. Parametro bezala 'g' edo 'G' pasatzen badigute, 'G' balioa
     * emango diogu atributoari. Parametro bezala 'i' edo 'I' pasatzen badigute,
     * 'I' balioa emango diogu atributoari. Bestela, '-' balioa emango diogu
     * atributoari.
     *
     */
    public void setHizkuntza(char hizkuntza) {
        //METODO HAU OSATU BEHAR DUZU
        if ((hizkuntza == 'e' || hizkuntza == 'E')) {
            this.hizkuntza = 'E';
        } else if (hizkuntza == 'g' || hizkuntza == 'G') {
            this.hizkuntza = 'G';
        } else if (hizkuntza == 'i' || hizkuntza == 'I') {
            this.hizkuntza = 'I';
        }
        if (!(hizkuntza == 'e' || hizkuntza == 'E' || hizkuntza == 'g' || hizkuntza == 'G' || hizkuntza == 'i' || hizkuntza == 'I')) {
            this.hizkuntza = '-';
        }

    }

    public double getPrezioa() {
        return prezioa;
    }

    /**
     * Liburuaren prezioaren araberako izartxo segida bat itzuliko du metodo
     * honek. Izartxo bat euroko eta zentimo solteak kontutan izan gabe.
     */
    public String getPrezioaIzartxotan() {
        //METODO HAU ALDATU BEHAR DUZU
        String izarrak = "";
        double p = this.prezioa;
        while (p >= 1) {
            izarrak = izarrak + "*";
            p--;
        }
        return izarrak;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }

    /**
     * Liburu bakoitzaren kodea automatikoki kalkulatu eta itzuliko du metodo
     * honek hurrengo balioak kateatuz: GaiarenLehenKarakterea, egilearen
     * abizena eta izenburuaren lehen sei hizkiak, espazioak kontatu gabe
     * Adibidez: "FLiuElbosq", "FTolkienTheHob", "FTolkienTheLor",
     * "BElorriagaMatxin",...
     */
    public String getKodea() {
        //METODO HAU ALDATU BEHAR DUZU

        /*
        char gaiarenLehenengoKarakterea = this.gaia.charAt(0);
        String gaiaFirstChar = String.valueOf(gaiarenLehenengoKarakterea);

        String separator = " ";
        int posSeparator = this.getEgilea().indexOf(separator);
        String abizena = this.getEgilea().substring(posSeparator, this.getEgilea().length());
        
        String izenburua6Chars = this.getIzenburua().substring(0, 3);

        return gaiaFirstChar.toUpperCase() + abizena + izenburua6Chars;
         */
        String uno = gaia.substring(0, 1);
        String dos = egilea.substring(egilea.indexOf(" ") + 1);
        //para este caso, se utiliza el replace para quitar el espacio
        //además, para asegurarnos de que los títulos de todos los elementos tienen más de 6 carácteres, le sumamos unos cuantos espacios.
        String tres = (izenburua.replace(" ", "") + "      ").substring(0, 6);

        return uno + dos + tres;
    }

    /**
     * Liburutegian momentu jakin batean dauden liburuen katalogoa itzultzen du.
     *
     * @return Liburuen array bat. Arrayak hutsuneak izan ditzake.
     */
    public static Libros[] getLiburuSorta() {
        final int TAMAINA = 10; //Itzuliko dugun arrayaren tamaina. Gehienez hartu ditzakeen liburuak. 
        Libros[] liburuak = new Libros[TAMAINA];
        liburuak[0] = new Libros("El bosque oscuro", "Cixin Liu", 408, 2008, "FIKZIOA", 'g', 12.95);
        liburuak[1] = new Libros("The Hobbit", "J.R.R. Tolkien", 413, 1937, "fikzioa", 'i', 20.95);
        liburuak[2] = new Libros("The Lord of the Rings", "J.R.R. Tolkien", 122, 1954, "FIkziOA", 'I', 15.95);
        liburuak[3] = new Libros("Matxinsaltoen belarriak", "Unai Elorriaga", 122, 2006, "?", 'E', 10.95);
        liburuak[4] = new Libros("Las brujas", "Roald Dahl", 222, 1983, "Fikzioa", 'G', 10.95);
        liburuak[5] = new Libros("Boy", "Roald Dahl", 122, 1984, "HISTORIKOA", 'I', 5.95);
        liburuak[7] = new Libros("Obabakoak", "Bernardo Atxaga", 392, 1988, "FIKZIOA", 'E', 22.50);

        return liburuak;
    }

    public static ArrayList<Libros> getLiburuSortaArrayListFormatuan() {

        ArrayList<Libros> misLibros = new ArrayList<Libros>();
        misLibros.add(new Libros("El bosque oscuro", "Cixin Liu", 408, 2008, "FIKZIOA", 'g', 12.95));
        misLibros.add(new Libros("The Hobbit", "J.R.R. Tolkien", 413, 1937, "fikzioa", 'i', 20.95));
        misLibros.add(new Libros("The Lord of the Rings", "J.R.R. Tolkien", 122, 1954, "FIkziOA", 'I', 15.95));
        misLibros.add(new Libros("Matxinsaltoen belarriak", "Unai Elorriaga", 122, 2006, "?", 'E', 10.95));
        misLibros.add(new Libros("Las brujas", "Roald Dahl", 222, 1983, "Fikzioa", 'G', 10.95));
        misLibros.add(new Libros("Boy", "Roald Dahl", 122, 1984, "HISTORIKOA", 'I', 5.95));
        misLibros.add(new Libros("Obabakoak", "Bernardo Atxaga", 392, 1988, "FIKZIOA", 'E', 22.50));

        return misLibros;
    }

    /**
     * Liburua klaseko objektu bat String motako formatu honetan bueltatzen du:
     * izenburua (egilea)
     */
    @Override
    public String toString() {
        //METODO HAU ALDATU BEHAR DUZU
        return this.getIzenburua() + ", " + this.getEgilea() + ", " + this.orriKopurua + ", " + this.urtea + ", " + this.getGaia() + ", " + this.hizkuntza + ", " + this.prezioa + "\n";
    }

}
