package exekutagarriak;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.*;
import exekutagarriak.*;
import java.util.*;
import java.util.Collections;


/** Programa honetan Euskal Selekzioaren datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  Programa hau selekzioko partaideen datuak kargatzen hasiko da. 
 *  Normalena da, datu hauek fitxategi edo datu-base batetik irakurtzea baina 
 *  oraindik hori ez dakigunez egiten guk programan bertan, metodo baten barruan idatziko ditugu.
 * 
 *  Gero, horrelako menu bat agertuko zaigu:
 * 
 *  **********************************************************
 *  *    EUSKAL SELEKZIOA
 *  *  ----------------------------------
 *  *  1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...)
 *  *  2. Partaideen datuak ikusi taldekatuta
 *  *  3. Futbolariak alfabetikoki inprimatu
 *  *  4. Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz)
 *  *  5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez)
 *  *  z. Irten
 * 
 *  *  Aukeratu zenbaki bat:
 * 
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {
    
    public static int azkenId = 0; 
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>(); 
       
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        selekzioa = selekzioarenPlantillaOsoaSortu();
        //System.out.println(selekzioa);
        
        
        int aukera = 0; //variable que recogerá la elección del menú del usuario 
        boolean aukeraEgokia = false;
        
        do {
            System.out.println();
            System.out.println("**********************************************************");
            System.out.println("\tEUSKAL SELEKZIOA");
            System.out.println("----------------------------------");
            System.out.println("1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...) ");
            System.out.println("2. Partaideen datuak ikusi taldekatuta ");
            System.out.println("3. Futbolariak alfabetikoki inprimatu ");
            System.out.println("4. Aldaketa (Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz) ");
            System.out.println("5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez) ");
            System.out.println("z. Irten ");
            System.out.println("");

            do {
                aukeraEgokia = false;
                try {
                    //System.out.print("Zenbatgarren zenbakia ikusi nahi duzu? ");
                    System.out.print("Aukeratu zenbaki bat: ");
                    aukera = sc.nextInt();
                    System.out.println("");
                    aukeraEgokia = true;
                } catch (InputMismatchException ex) {
                    System.out.println(" -> Kontuz!! Zenbaki bat sartu behar duzu. \n");
                    sc.next(); //scannerrean geratu dan elementua hustuteko
                }
            } while(!aukeraEgokia);
            
            /*System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");*/  
            //Scanner in = new Scanner(System.in);

            switch (aukera) {
                case 1:
                    partaideenDatuakIkusi();
                    //System.out.println(selekzioa);
                    break;
                case 2:
                    partaideakTaldekatuta();
                    //System.out.println(selekzioa);
                    break;
                case 3:
                    futbolarienIzenakOrdenatu();    //utilizando el método de ordenación burbuja
                    //ordenarEdadFutbolistasBurbuja();    //ordenar futbolistas según su EDAD (método burbuja)
                    //futbolistakAlfabetikoki();  //utilizando el método sort()
                    break;
                case 4:
                    jokalariBatOrdezkatu();
                    break;
                case 5:
                    bilatuAbizenetik();
                    break;
                case 6:
                    System.out.println("Irteten... \nFIN. \n");
                    break;
                case 'z':
                    System.out.println("Irteten...\nFIN. ");
                    break;
                default:
                    System.out.println(" -> Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 6);
        
                
    }
        
    /**
     * Este método se ha creado para introducir datos en el arrayList definido 
     * en la parte superior de esta clase, y para PODER LLAMAR a este arrayList, 
     * y a su contenido, DESDE OTRA CLASE.
     * 
     * Para ello, el tipo del método dejará de ser "void", y será del siguiente 
     * tipo: 
     *  -> public static ArrayList<objeto> + nombre()
     * 
     * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion
     * klaseko ArrayList estatiko baten.
     *
     */
    
    public static ArrayList<IntegranteSeleccion> selekzioarenPlantillaOsoaSortu() {
        //ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();

        selekzioa.add(new Futbolista(++azkenId, "Aitor", "Fernandez", 30, 1, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Unai", "Bustinza", 29, 2, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Mikel", "Balenziaga", 33, 3, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Asier", "Illarramendi", 31, 4, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Martinez", 30, 5, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Mikel", "San Jose", 32, 6, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Gaizka", "Larrazabal", 24, 7, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Manu", "Garcia", 35, 8, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Aduriz", 40, 9, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Javier", "Eraso", 31, 10, Demarkazioa.MED));
        selekzioa.add(new Futbolista(++azkenId, "Asier", "Villalibre", 24, 11, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Aihen", "Munoz", 24, 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Iago", "Herrerin", 34, 13, Demarkazioa.POR));
        selekzioa.add(new Futbolista(++azkenId, "Aritz", "Elustondo", 27, 14, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Jesus", "Areso", 22, 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(++azkenId, "Iñigo", "Vicente", 24, 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(++azkenId, "Daniel", "Vivian", 22, 17, Demarkazioa.DEF));

        selekzioa.add(new Entrenador(++azkenId, "Francisco", "Padalino", 52, "Entrenador"));
        selekzioa.add(new Entrenador(++azkenId, "Joseba", "Nunez", 44, "Entrenador"));
        selekzioa.add(new Entrenador(++azkenId, "Markel", "Lautadahandi", 52, "Entrenador de porteros"));

        selekzioa.add(new Masajista(++azkenId, "Iñaki", "Sertxiberrieta", 36, "Fisioterapeuta", 9));
        selekzioa.add(new Masajista(++azkenId, "Ander", "Etxeburu", 51, "Medico", 20));
        

        //System.out.println("SELEKZIO OSOA SORTU: \n");
        
        return selekzioa;   //imprimir todo el contenido del arrayList "selekzioa"

    }
    
    /**
     * Este método nos permite filtrar a nuestro gusto, todos los elementos/objetos que 
     * se encuentren dentro del arrayList "selekzioa". El filtro puede ser tanto en 
     * función de valores especificos de cualquiera de los atributos de las clases, o 
     * también dependiendo del tipo de objeto/elemento se trate; 
     * 
     * En este caso, debemos filtrar los elementos del arrayList en según el tipo de 
     * estos; es decir, separar los elementos Futbolista, Entrenador y Masajista.
     * 
     */
    public static void partaideakTaldekatuta() {
        System.out.println("Futbolariak: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Futbolista.class) {
                    //selekzioa.remove(i);
                    System.out.println(selekzioa.get(i));
                }
            }
        }
        System.out.println("Entrenatzaileak: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Entrenador.class) {
                    //selekzioa.remove(i);
                    System.out.println(selekzioa.get(i));
                }
            }
        }
        System.out.println("Masajistak: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Masajista.class) {
                    //selekzioa.remove(i);
                    System.out.println(selekzioa.get(i));
                }
            }
        }
    }
    
    
    /**
     * Método para imprimir todo el contenido de los objetos que se encuentren 
     * en el interior del arrayList "selekzioa".
     */
    public static void partaideenDatuakIkusi() {
        System.out.println("Uneko Plantilla: \n");
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                System.out.println(selekzioa.get(i));
            }
        }
        System.out.println("----------------------------");
    }
    
    
    /**
     * Usando MÉTODO SORT():
     * 
     * Método para ordenar los futbolistas en función del nombre de cada. En 
     * este caso, lo he ordenado de A-Z. Para ello, he usado el método sort().
     * 
     * @return 
     */
    public static ArrayList<IntegranteSeleccion> futbolistakAlfabetikoki() {
        ArrayList<String> futbolarienIzenak = new ArrayList<>(); //arrayList que recoge los nombres de todos los jugadores
        System.out.println("Futbolariak alfabetikoki ordenatu: \n");
        for(int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getClass() == Futbolista.class) {
                    futbolarienIzenak.add(selekzioa.get(i).getNombre());
                    //System.out.println(selekzioa.get(i));
                    Collections.sort(futbolarienIzenak);  
                }
            }
        }
        
        for (int x = 0; x < futbolarienIzenak.size(); ++x) {
            String nombreJugador = futbolarienIzenak.get(x);
            System.out.println("\t" + nombreJugador);
        }
        System.out.println("----------------------------");
        
        /*for(String nombre : futbolarienIzenak){
			System.out.println(nombre);
                    }*/
        
        return selekzioa;
    }

    
    /**
     * Método para ordenar los futbolistas en función de la EDAD de 
     * cada uno. Para ello, he utilizado el MÉTODO BURBUJA; el cual 
     * se encarga de hacer comparaciones entre todos y cada uno de 
     * los elementos del array/arrayList... 
     * 
     * Es decir, cada elemento se compara con todos los demás.
     * 
     * Info método burbuja: 
     *  -> http://puntocomnoesunlenguaje.blogspot.com/2012/07/metodo-de-ordenacion-burbuja.html
     *  -> https://sites.google.com/site/fernandoagomezf/programacion-en-c/tips-de-programador-c/algoritmos/ordenacion-de-arrays-metodo-de-la-burbuja
     * 
     * @return 
     */
    public static ArrayList<IntegranteSeleccion> ordenarEdadFutbolistasBurbuja() {
        ArrayList<IntegranteSeleccion> seleccion2 = new ArrayList<>();
        seleccion2 = selekzioa;
        int i, j, aux;
        for (i = 0; i < seleccion2.size() - 1; ++i) {
            for(j = 1; j < seleccion2.size(); ++j) {
                if (seleccion2.get(j).getEdad() < seleccion2.get(j - 1).getEdad()) {
                    aux = seleccion2.get(j).getEdad();
                    seleccion2.get(j).setEdad(seleccion2.get(j - 1).getEdad());
                    seleccion2.get(j - 1).setEdad(aux);
                }
            }
        }
        
        for (int x = 0; x < seleccion2.size(); ++x) {
            IntegranteSeleccion nombreJugador = seleccion2.get(x);
            System.out.println("\tEdad del jugador: " + nombreJugador.getEdad());
        }
        System.out.println("----------------------------");
        
        return seleccion2;
    }
    
    
    
    /**
     * Método para ordenar alfabeticamente los futbolistas en función del 
     * nombre de cada uno. Para ello, he utilizado el MÉTODO BURBUJA; el cual 
     * se encarga de hacer comparaciones entre todos y cada uno de 
     * los elementos del array/arrayList... 
     * 
     * Es decir, cada elemento se compara con todos los demás.
     * 
     * Info método burbuja: 
     *  -> http://puntocomnoesunlenguaje.blogspot.com/2012/07/metodo-de-ordenacion-burbuja.html
     *  -> https://sites.google.com/site/fernandoagomezf/programacion-en-c/tips-de-programador-c/algoritmos/ordenacion-de-arrays-metodo-de-la-burbuja
     * 
     * @return 
     */
    public static ArrayList<IntegranteSeleccion> futbolarienIzenakOrdenatu() {
        ArrayList<IntegranteSeleccion> selekzioaIzenak = new ArrayList<>();
        selekzioaIzenak = selekzioa;
        
        //variables que recogerán los valores del arrayList
        int i, j;   //posiciones del arrayList
        IntegranteSeleccion aux;  //elemento que se moverá en el arrayList (mover = cambio de posición/orden)
        
        for (i = 0; i < selekzioaIzenak.size() - 1; ++i) {
            for(j = 1; j < selekzioaIzenak.size(); ++j) {
                int letraOrden = 1;   //número del carácter que se tomará como referencia para ordenar el nombre
                
                if (selekzioaIzenak.get(j).getNombre().charAt(0) < selekzioaIzenak.get(j - 1).getNombre().charAt(0)) {
                    aux = selekzioaIzenak.get(j);
                    selekzioaIzenak.set(j, selekzioaIzenak.get(j - 1));
                    selekzioaIzenak.set(j - 1, aux);
                    
                    /*selekzioaIzenak.get(j).setNombre(selekzioaIzenak.get(j - 1).getNombre());
                    selekzioaIzenak.get(j - 1).setNombre(aux);*/
                    
                } else if (selekzioaIzenak.get(j).getNombre().charAt(0) == selekzioaIzenak.get(j - 1).getNombre().charAt(0)) {
                    
                    if (selekzioaIzenak.get(j).getNombre().charAt(1) < selekzioaIzenak.get(j - 1).getNombre().charAt(1)) {
                        aux = selekzioaIzenak.get(j);
                        selekzioaIzenak.set(j, selekzioaIzenak.get(j - 1));
                        selekzioaIzenak.set(j - 1, aux);
                    
                    }
                } 
            }
        }
        
        for (int x = 0; x < selekzioaIzenak.size(); ++x) {
            IntegranteSeleccion nombreJugador = selekzioaIzenak.get(x);
            System.out.println("\t" + nombreJugador);
        }
        System.out.println("----------------------------");
        
        return selekzioaIzenak;
    }
    
    
    /**
     * Método en el se cambiará un jugador por otro. En este caso, hay que 
     * elegir uno de los jugadores existentes del arrayList, y cambiarlo 
     * "mí". 
     * 
     * El programa NO deberá pedir los datos al usuario. Es decir, el cambio 
     * se efectuará de forma automática. 
     * 
     * Adibidez: 
     *  -> int rangoIdRandom = (int) (Math.random() * 9 + 1); Devuelve un 
     * número aleatorio entre 1-9.
     */
    public static void jokalariBatOrdezkatu() {
        
        //variable que hace referencia al VALOR MÁXIMO de id en el arrayList ( = ÚLTIMO id)
        int idMax = selekzioa.get(selekzioa.size() - 1).getId();    //System.out.println(idMax);
        
        //variable que hace referencia al VALOR MÍNIMO de id en el arrayList ( = PRIMER id)
        int idMin = selekzioa.get(0).getId();   //System.out.println(idMin);
        
        //variable que determina el rango MÁXIMO para hacer el Math.random
        int rangoIdRandom = idMax - idMin + 1;  //System.out.println(rangoIdRandom);
        
        //crear un número aleatorio para obtener un id
        int idOrdezkatu = (int) (Math.random() * rangoIdRandom) + idMin;    //System.out.println(idOrdezkatu);
        
        //ver el "ANTES" del jugador que tiene el id obtenido del random
        System.out.println("\tAntes: \n" + selekzioa.get(idOrdezkatu - 1));
        
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getId() == idOrdezkatu) {
                    selekzioa.get(i).setNombre("Adrian");
                    selekzioa.get(i).setApellidos("Arceredillo");
                    //ver el "DESPUÉS" del jugador que tiene el id obtenido del random
                    System.out.println("\tDespues: \n" + selekzioa.get(i));
                }
            }
        }
    }
    
    
    public static void bilatuAbizenetik() {
        Scanner in = new Scanner(System.in);
        //pedir un APELLIDO al usuario y guardarlo en una variable
        System.out.println("\tSartu jokalari baten ABIZENA: "); 
        System.out.print("\t-> "); 
        String jokalariaAbizena = in.next();
        
        //poner la primera letra del apellido en MAYÚSCULA y guardarlo
        String abizenaUser = jokalariaAbizena.substring(0, 1).toUpperCase() + jokalariaAbizena.substring(1).toLowerCase();
        System.out.println("");
        //System.out.println("\t->" + abizenaUser + "\n");
        
        //buscar en el araryList el APELLIDO introducido por el usuario (+ mostrar datos de dicho jugador)
        for (int i = 0; i < selekzioa.size(); ++i) {
            if (selekzioa.get(i) != null) {
                if (selekzioa.get(i).getApellidos().equals(abizenaUser)) {
                    System.out.println(selekzioa.get(i));
                }
            }
        }
        
    }
    
    
}

/*
Info internet:
http://puntocomnoesunlenguaje.blogspot.com/2013/02/arraylist-de-objetos-en-java.html
*/


/*

*/
