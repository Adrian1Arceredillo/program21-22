/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;
import exekutagarriak.LangileenArrayListaKudeatu;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import model.Langilea;
import model.Zatikia;

/**
 *
 * @author arceredillo.adrian
 */
public class Menua {

    //private static Laukia[] laukiak = new Laukia[LAUKI_KOP];
    private static int LANGILE_KOP = 10;
    private static Langilea[] langileak = new Langilea[LANGILE_KOP];

    public static void main(String[] args) {

        langileak = Langilea.nireHamarLagunLangile();

        Scanner in = new Scanner(System.in);
        int aukera = 0;

        do {
            System.out.println();
            System.out.println("MENUA");
            System.out.println("====================================");
            System.out.println("1.- Langile guztiak ikusi");    //imprimir los elementos
            System.out.println("2.- Langile berria sortu");     //si x no es null
            System.out.println("3.- Langilea bilatu");
            System.out.println("4.- Soldata handiena");
            System.out.println("5.- Enpresak urte baten zenbat diru ordaindu beharko duen nominetan");
            System.out.println("6.- Langile baten soldata zenbat handitu nahi duen galdetu");
            System.out.println("7.- Kaleratu");
            System.out.println("8.- Lehenengo eta azken langileen lanaldiak erdira murriztu");
            System.out.println("9.- Enpresan astero lan egiten diren ordu kopurua");
            System.out.println("10.-Langile baten lanaldia aldatu");
            System.out.println("11.-Langile batek enpresan daraman egun kopurua imprimatu");
            System.out.println("12.-Entre dos trabajadores, indicar cuántos días hay entre ellos. ");
            System.out.println("13.-...");
            System.out.println("20.- Irten");
            System.out.println("");

            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();

            switch (aukera) {
                case 1:
                    imprimatuLangileak();
                    break;
                case 2:
                    crearLangileSolo();
                    break;
                case 3:
                    System.out.print("Noren bila zabiltza? ");
                    String bilaturikoLangilea = in.next();
                    System.out.println(bilatuLangileBat(bilaturikoLangilea, langileak));
                    break;
                case 4:
                    System.out.println("Soldatarik handiena, " + soldataHandienaImprimatu() + " da. ");
                    break;
                case 5:
                    System.out.println("Enpresak, " + urtekoGastuakSoldata() + " ordainduko du urtero nominetan. ");
                    break;
                case 6:
                    System.out.print("Noren soldata nahi duzu igo? (sartu langilearen id-a): ");
                    int idTrabajador = in.nextInt();
                    System.out.print("Soldata zenbat igo nahi duzu? ");
                    String porcentajeSubida = in.next();
                    galdetuSoldataIgoera(idTrabajador, porcentajeSubida);
                    break;
                case 7:
                    despedir();
                    break;
                case 8:
                    //System.out.println(Arrays.toString(langileak));
                    modifExtrem();
                    //System.out.println(Arrays.toString(langileak));
                    imprimatuLangileak();
                    break;
                case 9:
                    System.out.println("Número de horas que se trabajan a la semana en la empresa = " + enpresanLanOrduKopuruaAstero());
                    break;
                case 10:
                    System.out.print("Zeinen lanaldia nahi duzu aldatu? (sartu langilearen id-a): ");
                    int trabajadorQueSolicitaCambio = in.nextInt();
                    System.out.print("Sartu lanaldi berriaren proposamena (x/x): ");
                    String propuestaNuevaJornada = in.next();
                    lanaldiBerriaProposatu(trabajadorQueSolicitaCambio, propuestaNuevaJornada);
                    break;
                case 11:
                    System.out.print("Sartu langilearen id-a: ");
                    int idTrabajadorVerDiasEmpresa = in.nextInt();
                    //2017-04-14
                    System.out.println(langileaEnpresanEgunKopurua(idTrabajadorVerDiasEmpresa) + " egun. ");
                    break;
                case 12:
                    System.out.print("Sartu lehenengo langilearen id-a: ");
                    int idLan1 = in.nextInt();
                    System.out.print("Sartu bigarren langilearen id-a: ");
                    int idLan2 = in.nextInt();
                    System.out.println("Langile zaharrena, berria baino " +  besteaBainoZenbatEgunGehiago(idLan1, idLan2) + " egun gehiago darama enpresan lan egiten. ");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriro.");
            }

        } while (aukera != 20);

        //imprimatuLangileak();
    }

    public static void imprimatuLangileak() {

        System.out.println("");
        System.out.printf("%-8s %9s %12s %12s %12s \n", "Langilea", "Izena", "Abizena", "Soldata", "UrtekoS.");
        System.out.println("===================================================================");
        for (int i = 0; i < langileak.length/* && langileak[i] != null*/; ++i) {
            if (langileak[i] == null) { //esto hace que aunque un elemento del array sea nulo (no tiene ningún objeto), se muestre null (o lo que nosotros queramos que muestre)
                System.out.printf("%19s", "Hueco Libre. \n");
            } else {
                int numLan = i;
                System.out.printf("%6d %10s %11s %11.2f %12.2f %12s %15s \n", langileak[numLan].getId(), langileak[numLan].getIzena(), langileak[numLan].getAbizena(), langileak[numLan].getSoldata(), langileak[numLan].getUrtekoSoldata(), langileak[numLan].toStringLanaldia(), langileak[numLan].getDiacomienzo());
            }
        }
    }

    public static double galdetuSoldataIgoera(int idLangilea, String portzentaia) { //int

        int valorPorcentajeSolicitud = 0;
        try {
            valorPorcentajeSolicitud = Integer.parseInt(portzentaia);
            if (valorPorcentajeSolicitud < 0) {
                //++contNegativos;
                System.out.println("Datua txarto sartuta dagoenez, %10 jaitsiera aplikatuko da.  \n");
                langileak[idLangilea - 1].soldataIgo(-10);
                System.out.println(langileak[idLangilea - 1].toString());
            }
        } catch (NumberFormatException e) {
            System.out.println("Datua txarto sartuta dagoenez, %10 jaitsiera aplikatuko da. ");
            valorPorcentajeSolicitud = -10;
            langileak[idLangilea - 1].soldataIgo(valorPorcentajeSolicitud);
            System.out.println(langileak[idLangilea - 1].toString());
        }

        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {     //si la posición actual NO es null...
                if (langileak[i].getId() == idLangilea) {
                    langileak[i].soldataIgo(valorPorcentajeSolicitud);
                }
            }
        }
        return 0;
    }

    public static void crearLangileSolo() {

        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] == null) {
                Scanner in = new Scanner(System.in);
                System.out.println("Izena: ");
                String nuevoNombre = in.next();
                System.out.println("Abizena: ");
                String nuevoAbizena = in.next();
                System.out.println("Soldata: ");
                Double nuevoSoldata = in.nextDouble();
                System.out.println("Data (yyyy-mm-dd): ");
                String nuevoFechaInicio = in.next();

                System.out.print("Lanaldia (x/x): ");
                String nuevaJornada = in.next();
                //el siguiente método nos permite pasarle un string, y que el método lo convierta en un objeto de tipo zatikia; el string tendrá que tener la siguiente forma -> x/x
                Zatikia nuevoLanaldia = new Zatikia(nuevaJornada);  //también se podría añadir el método sinplifikatu()
                //System.out.println(nuevoLanaldia);

                langileak[i] = new Langilea(i, nuevoNombre, nuevoAbizena, nuevoSoldata, nuevoFechaInicio); //cuando se cree este elemento, se saldrá de la función; ya que tenemos un break en la siguiente líneaal tener un break en la
                langileak[i].setLanaldia(nuevoLanaldia);

                break;

            } else if (i == LANGILE_KOP - 1) {
                System.out.println("---> Ezin dituzu langile gehiago kontratatu. ");
            }
        }
    }

    public static Langilea bilatuLangileBat(String nombreTrabajador, Langilea[] trabajadores) {

        for (int i = 0; i < trabajadores.length; ++i) {
            if (trabajadores[i] != null) {
                if (trabajadores[i].getIzena().equals(nombreTrabajador) == true) {
                    return trabajadores[i];
                }
            }
        }
        return null;
    }

    public static Langilea soldataHandienaImprimatu() {

        double salMaximo = 0.0;
        int posMax = -1;

        //Langilea mayorSalario = langileak[0];
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getSoldata() >= salMaximo) {
                    salMaximo = langileak[i].getSoldata();
                    posMax = i;
                }
            }
        }

        if (posMax == -1) {  // no he encontrado ningun elemento lleno
            return langileak[posMax];
        } else {
            return langileak[posMax];
        }
    }

    public static Langilea despedir() {
        Scanner in = new Scanner(System.in);
        System.out.print("Zein langilea nahi duzu kaleratu? (sartu id-a) ");
        int numero = in.nextInt();

        langileak[numero - 1] = null;
        return null;
    }

    public static double urtekoGastuakSoldata() {

        double gastosEnSalarios = 0;
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                gastosEnSalarios = gastosEnSalarios + langileak[i].getUrtekoSoldata();
            }
        }
        return gastosEnSalarios;
    }

    public static void modifExtrem() {
        //a)  modificar el primero
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) { // si está ocupado...
                langileak[i].lanaldiaZatitu(); //modificar el valor a la mitad
                break; //salimos depué de encontrar el primero
            }
        }
        //b) modificar el último
        for (int i = (langileak.length - 1); i >= 0; --i) {
            if (langileak[i] != null) { // si está ocupado ...
                langileak[i].lanaldiaZatitu();
                break;
            }
        }
    }

    public static double enpresanLanOrduKopuruaAstero() {
        int trabajadoresCompletos = 0;  //trabajadores que hacen jornada completa
        int trabajadoresParciales = 0;  //número de trabajadores que no tienen un lanaldia de 1/1

        int horasSemanaTraCompleto = 35;  //número de horas que mete A LA SEMANA cada trabajor a jornada compelta

        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getLanaldia().hamartarBaliokidea() == 1) {     //obtener el número de trabajadores COMPLETOS; es decir, lanaldi = 1/1
                    ++trabajadoresCompletos;
                } else if (langileak[i].getLanaldia().hamartarBaliokidea() < 1) {   //obtener el número de trabajadores PARCIALES; es decir, lanaldi < 1/1
                    ++trabajadoresParciales;
                }
            }

        }
        System.out.println("");
        System.out.println("Hay " + trabajadoresCompletos + " trabajadores a jornada completa. ");
        System.out.println("Hay " + trabajadoresParciales + " trabajadores a jornada reducida/parcial. ");

        double totalHorasDeLaEmpresa = 0;   //número total de horas que se trabaja en la empresa (todos los trabajadores).
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getLanaldia().hamartarBaliokidea() == 1) {
                    totalHorasDeLaEmpresa = totalHorasDeLaEmpresa + 35;
                } else if (langileak[i].getLanaldia().hamartarBaliokidea() < 1) {
                    totalHorasDeLaEmpresa = totalHorasDeLaEmpresa + (horasSemanaTraCompleto * langileak[i].getLanaldia().hamartarBaliokidea());
                }
            }

        }
        System.out.println("");
        //System.out.printf("En la empresa se trabaja un total de %.2f horas. \n", totalHorasDeLaEmpresa);

        return totalHorasDeLaEmpresa;
    }

    public static Langilea lanaldiBerriaProposatu(int numeroId, String lanaldiBerria) {

        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getId() == (numeroId)) {
                    langileak[i].setLanaldia(new Zatikia(lanaldiBerria)); //Sale al encontrar el primero de ellos que cumple la condición
                    return langileak[i];
                }
            }

        }
        // si no lo ha encontrado
        return null;
    }
    
    public static long langileaEnpresanEgunKopurua(int idBuscarTrabajador) {
        
        LocalDate fechaIncorporacion = null;
        
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getId() == idBuscarTrabajador) {
                    fechaIncorporacion = langileak[i].getDiacomienzo();
                }
            }
        }
        //LocalDate fechaIncorporacion = LocalDate.parse(primerDiaEmpresa);
        LocalDate fechaActual = LocalDate.now();
        
        long diasEmpresa = ChronoUnit.DAYS.between(fechaIncorporacion, fechaActual);
        //System.out.println(ChronoUnit.DAYS.between(fechaIncorporacion, fechaActual));
        
        return diasEmpresa;
    }
    
    public static long besteaBainoZenbatEgunGehiago(int idTrabajador1, int idTrabajador2) {
        
        LocalDate trabajadorUno = null;
        LocalDate trabajadorDos = null;
        
        
        for (int i = 0; i < langileak.length; ++i) {
            if (langileak[i] != null) {
                if (langileak[i].getId() == idTrabajador1) {
                    trabajadorUno = langileak[i].getDiacomienzo();
                }
                if (langileak[i].getId() == idTrabajador2) {
                    trabajadorDos = langileak[i].getDiacomienzo();
                }
            }
        }
        LocalDate fechaActual = LocalDate.now();
        
        long diasEmpresaUno = ChronoUnit.DAYS.between(trabajadorUno, fechaActual);
        long diasEmpresaDos = ChronoUnit.DAYS.between(trabajadorDos, fechaActual);
        
        LocalDate mayor = null;
        LocalDate menor = null;
        
        if (diasEmpresaUno > diasEmpresaDos) {
            mayor = trabajadorUno;
            menor = trabajadorDos;
            //diasDiferencia = diasEmpresaUno - diasEmpresaDos;
        } else if (diasEmpresaDos > diasEmpresaUno) {
            mayor = trabajadorDos;
            menor = trabajadorUno;
        }
        
        //return diasDif;
        long diasEmpresa = ChronoUnit.DAYS.between(mayor, menor);
        
        return diasEmpresa;
        /*
        long diasEmpresa = ChronoUnit.DAYS.between(trabajadorDos, trabajadorUno);
        
        return diasEmpresa;
        */
        
        
    }

}

//https://www.discoduroderoer.es/calcular-el-numero-de-dias-entre-dos-localdate-en-java/