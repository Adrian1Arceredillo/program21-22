package exekutagarriak;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import model.Libros;
import java.util.Scanner;

public class ProgramaPrincipal {

    //private static Libros[] liburuak;
    private static ArrayList<Libros> misLibros = new ArrayList<Libros>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        misLibros = Libros.getLiburuSortaArrayListFormatuan();  //esta línea llama al método que CREA y DA VALORES al arrayList (está en la clase Libros)

        //Object[] array = misLibros.toArray();
        //System.out.println(misLibros);
        //misLibros.add(new Libros(nuevoIzenburua, nuevoEgilea, nuevoOrriKopurua, nuevoFechaLibro, nuevoTema, nuevoIdioma, nuevoPrecio));
        int aukera = 0;
        boolean aukeraEgokia = false;

        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Liburu berri bat gehitu");
            System.out.println("6.- Esandako liburu batek dituen urteak");
            System.out.println("7.- Egile baten liburu guztiak ikusi (izenburua, urtea, egilea)");
            System.out.println("8.- Liburu bat ezabatu");
            System.out.println("10.- Irten");
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
                    System.out.println(" -> Kontuz!! Zenbaki bat sartu behar duzu.");
                    sc.next(); //scannerrean geratu dan elementua hustuteko
                }
            } while(!aukeraEgokia);
            
            /*System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");*/  
            //Scanner in = new Scanner(System.in);

            switch (aukera) {
                case 1:
                    liburuakIkusi();
                    break;
                case 2:
                    liburuenDatuGuztiakIkusi();
                    break;
                case 3:
                    liburuenPrezioaIrudikatu();
                    break;
                case 4:
                    zaharrenaBilatu();
                    break;
                case 5:
                    crearNuevoLibro();
                    break;
                case 6:
                    System.out.print("Sartu nahi duzun liburuaren izenburua: ");
                    String tituloDelLibro = in.nextLine();
                    System.out.println("Eskaturiko liburuak, " + liburuBatenUrteak(tituloDelLibro) + " urte ditu. ");
                    break;
                case 7:
                    System.out.print("Sartu egilearen izena: ");
                    String nombreEscritor = in.nextLine();
                    //System.out.println(bilatuLiburuBat(nombreEscritor));
                    bilatuLiburuBat(nombreEscritor);
                    break;
                case 8:
                    System.out.print("Sartu ezabatu nahi duzun liburuaren izenburua: ");
                    String izenburuaDelLibro = in.nextLine();
                    liburuBatEzabatu(izenburuaDelLibro);
                    break;
                case 10:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 10);
    }

    /**
     * Liburuen zerrenda sinplea inprimatzen du kontsolan metodo honek, liburuen
     * toString() metodoaz baliatuz.
     */
    public static void liburuakIkusi() {
        //METODO HAU OSATU BEHAR DUZU
        /*System.out.println("");
        System.out.println("LIBURUEN ZERRENDA");
        System.out.println("==================");*/

        for (int i = 0; i < misLibros.size(); ++i) {
            if (misLibros.get(i) != null) {
                System.out.printf("%s (%s) \n", misLibros.get(i).getIzenburua(), misLibros.get(i).getEgilea());
                //System.out.println(liburuak[i].getIzenburua() + "(" + liburuak[i].getEgilea() + ")");
            }
        }
    }

    public static void liburuenDatuGuztiakIkusi() {
        //METODO HAU OSATU BEHAR DUZU
        // ...
        int cantidad = 0;
        int orrienBatura = 0;
        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.", "G.", "H.", "P.", "K.");
        for (int i = 0; i < 100; i++) {
            System.out.print("=");

        }

        System.out.println("");
        for (int i = 0; (i < misLibros.size()); ++i) {
            if (misLibros.get(i) != null) {
                System.out.printf("%-3d %-30s %-20s %4d %4d %-11s %1c %-6.2f %-15s\n", i + 1,
                        misLibros.get(i).getIzenburua(),
                        misLibros.get(i).getEgilea(),
                        misLibros.get(i).getOrriKopurua(),
                        misLibros.get(i).getUrtea(),
                        misLibros.get(i).getGaia(),
                        misLibros.get(i).getHizkuntza(),
                        misLibros.get(i).getPrezioa(),
                        misLibros.get(i).getKodea());
                orrienBatura = orrienBatura + misLibros.get(i).getOrriKopurua();
                ++cantidad;
            }
        }
        double batazBestekoOrriak;
        batazBestekoOrriak = (double) orrienBatura / cantidad;
        System.out.println("---------------------------------------------------------------");
        System.out.printf("            Liburuen batez besteko orri kopurua: %.2f", batazBestekoOrriak);
        //...
    }

    public static void liburuenPrezioaIrudikatu() {
        //METODO HAU OSATU BEHAR DUZU
        for (int i = 0; i < misLibros.size(); ++i) {
            if (misLibros.get(i) != null) {
                //ez dakit marginaren balioa, beraz, %25s -koa jarri dut.
                System.out.printf("%25s : %s\n", misLibros.get(i).getIzenburua(), misLibros.get(i).getPrezioaIzartxotan());
            }
        }
    }

    public static void zaharrenaBilatu() {
        //METODO HAU OSATU BEHAR DUZU
        int masViejo = 0;
        int posLibroMasViejo = -1;

        for (int i = 0; i < misLibros.size(); ++i) {
            if (misLibros.get(i) != null) {
                if (i == 0) {
                    masViejo = misLibros.get(i).getUrtea();
                }
                if (misLibros.get(i).getUrtea() < masViejo) {
                    masViejo = misLibros.get(i).getUrtea();
                    posLibroMasViejo = i;
                }
            }
        }
        if (posLibroMasViejo == -1) {
            System.out.println("El array está vacío. ");
        } else {
            System.out.println("Libururik zaharrena, " + misLibros.get(posLibroMasViejo).getUrtea() + " urtean argitaratu zen: " + misLibros.get(posLibroMasViejo).getIzenburua() + " (" + misLibros.get(posLibroMasViejo).getEgilea() + ")");
        }
    }

    //hecho por mí
    public static void crearNuevoLibro() {
        Scanner in = new Scanner(System.in);
        System.out.println("Sartu liburu berriaren datuak: ");
        System.out.print("Izenburua = ");
        String nuevoIzenburua = in.nextLine();
        System.out.print("Egilea = ");
        String nuevoEgilea = in.nextLine();
        System.out.print("Orri kopurua = ");
        int nuevoOrriKopurua = in.nextInt();
        System.out.print("Urtea = ");
        int nuevoFechaLibro = in.nextInt();
        System.out.print("Gaia = ");
        String nuevoTema = in.next();
        System.out.print("Hizkuntza = ");
        char nuevoIdioma = in.next().charAt(0);
        System.out.print("Prezioa = ");
        double nuevoPrecio = in.nextDouble();

        //saber cuál es el id del último elemennto, para que el id del langile que acabamos de crear, vaya a continuación del último del arrayList
        misLibros.add(new Libros(nuevoIzenburua, nuevoEgilea, nuevoOrriKopurua, nuevoFechaLibro, nuevoTema, nuevoIdioma, nuevoPrecio));
    }

    public static long liburuBatenUrteak(String tituloDelLibro) {

        /*Scanner in = new Scanner(System.in);
        tituloDelLibro = in.nextLine();*/
        
        LocalDate añoTrabajador = null;

        int añosEnLaEmpresa = 0;
        for (int i = 0; i < misLibros.size(); ++i) {
            if (misLibros.get(i) != null) {
                if (misLibros.get(i).getIzenburua().equals(tituloDelLibro)) {
                    añoTrabajador = LocalDate.of(misLibros.get(i).getUrtea(), 1, 1);
                }
            }

        }

        LocalDate añoActual = LocalDate.now();

        long diasEmpresa = ChronoUnit.YEARS.between(añoTrabajador, añoActual);
        //System.out.println(ChronoUnit.DAYS.between(fechaIncorporacion, fechaActual));

        return diasEmpresa;
    }

    public static void bilatuLiburuBat(String autorDelLibro) {   //método para buscar los libros que tiene el autor que metamos por teclado.

        for (int i = 0; i < misLibros.size(); ++i) {
            if (misLibros.get(i) != null) {
                if (misLibros.get(i).getEgilea().equals(autorDelLibro)) {
                    /*System.out.println("Izenburua= " + misLibros.get(i).getIzenburua() + 
                                            "Hizkuntza = " + misLibros.get(i).getHizkuntza() + 
                                            "Urtea= " + misLibros.get(i).getUrtea() + 
                                            "Egilea= " + misLibros.get(i).getEgilea()
                                            );*/
                    System.out.println("Izenburua = " + misLibros.get(i).getIzenburua() + ", Urtea = " + misLibros.get(i).getUrtea() + ", Egilea = " + misLibros.get(i).getEgilea());
                }
            }
        }
        //return null;
    }

    public static void liburuBatEzabatu(String tituloDelLibro) {
        for (int i = 0; i < misLibros.size(); ++i) {
            if (misLibros.get(i) != null) {
                if (misLibros.get(i).getIzenburua().equals(tituloDelLibro)) {
                    misLibros.remove(i);
                }
            }
        }
    }

}
