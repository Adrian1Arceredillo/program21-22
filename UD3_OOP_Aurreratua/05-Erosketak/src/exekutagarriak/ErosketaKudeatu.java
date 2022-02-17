/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.*;
import model.*;

/**
 *
 * @author arceredillo.adrian
 */
public class ErosketaKudeatu {

    private static ArrayList<Bezeroa> kontaktuak = new ArrayList<>();
    private static ArrayList<Produktua> produktuKatalogoa = new ArrayList<>();
    private static ArrayList<Erosketa> erosketenZerrenda = new ArrayList<>();

    public static void main(String[] args) {

        initialize();
        int aukera = 0;

        boolean aukeraEgokia = false;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("**********************************************************");
            System.out.println("\tEROSKETEN KUDEAKETA");
            System.out.println("----------------------------------");
            System.out.println("1.  Create (Datuak gehitu) ");
            System.out.println("2.  Read (Ikusi) ");
            System.out.println("3.  Update (Aldatu) ");
            System.out.println("4.  Delete (Ezabatu) ");
            System.out.println("20. Irten ");
            System.out.println("----------------------------------\n");
            System.out.print("Aukeratu zenbaki bat: ");

            aukera = in.nextInt();

            switch (aukera) {
                case 1:
                    create();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 20:
                    break;
                default:
                    System.out.println(" -> Aukera okerra. Saiatu berriz.");
            }

        } while (aukera != 20);

    }

    /**
     * Crear/generar los datos del PDF.
     */
    public static void initialize() {

        //pdf-ko Erosketak sortu
        //array de eMails de contactos - Bezero de tipo Empresa
        String[] eMailakEmpresa = new String[100];
        eMailakEmpresa[0] = "idazkaria@uni.eus";
        eMailakEmpresa[1] = "zuzendaria@uni.eus";

        //crear los clientes
        Bezeroa karlos = new Pertsona(1, "Karlos", "Arginano", "Hondartza Pasialekua z/g ZARAUTZ", "kargi@zarautz.eus");
        Bezeroa martin = new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g. DONOSTIA.", "mbera@donostia.eus");
        Bezeroa uni = new Empresa(3, "IES Uni", "Eibar-Ermua", "Otaola Hiribidea 29 Eibar", eMailakEmpresa);

        kontaktuak.add(karlos);
        kontaktuak.add(martin);
        kontaktuak.add(uni);

        //crear catálogo de productos
        Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
        Produktua hp = new Produktua("C02", "HP Pavilion", 600);
        Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
        Produktua iPhone = new Produktua("T02", "iPhone XX", 1300);

        produktuKatalogoa.add(toshiba);
        produktuKatalogoa.add(hp);
        produktuKatalogoa.add(samsung);
        produktuKatalogoa.add(iPhone);

        //MARTIN - productos que hay en cada compra / unidades de cada producto
        ArrayList<Produktua> productosMartin = new ArrayList<>();
        //poner sus productos
        productosMartin.add(toshiba);
        productosMartin.add(hp);
        productosMartin.add(samsung);

        ArrayList<Integer> unidadesMartin = new ArrayList<>();
        //poner las unidades de cada uno de los productos de su compra
        unidadesMartin.add(4);
        unidadesMartin.add(2);
        unidadesMartin.add(3);

        //KARLOS 1 - productos que hay la compra 
        ArrayList<Produktua> productosKarlos1 = new ArrayList<>();
        productosKarlos1.add(toshiba);

        ArrayList<Integer> unidadesKarlos1 = new ArrayList<>();
        unidadesKarlos1.add(15);

        //KARLOS 2 - productos que hay la compra 
        ArrayList<Produktua> productosKarlos2 = new ArrayList<>();
        productosKarlos2.add(toshiba);
        productosKarlos2.add(samsung);

        ArrayList<Integer> unidadesKarlos2 = new ArrayList<>();
        unidadesKarlos2.add(1);
        unidadesKarlos2.add(1);

        //KARLOS 3 - productos que hay la compra 
        ArrayList<Produktua> productosKarlos3 = new ArrayList<>();
        productosKarlos3.add(toshiba);
        productosKarlos3.add(hp);
        productosKarlos3.add(iPhone);

        ArrayList<Integer> unidadesKarlos3 = new ArrayList<>();
        unidadesKarlos3.add(3);
        unidadesKarlos3.add(1);
        unidadesKarlos3.add(1);

        //UNI - productos que hay la compra 
        ArrayList<Produktua> productosUni1 = new ArrayList<>();
        productosUni1.add(hp);

        ArrayList<Integer> unidadesUni1 = new ArrayList<>();
        unidadesUni1.add(25);

        //crear las compras & guardarlas en el arrayList que recoge todas las compras - erosketenZerrenda
        Erosketa compraMartin1 = new Erosketa("E18-01", "2018-09-25",
                martin, productosMartin, unidadesMartin);

        Erosketa compraKarlos1 = new Erosketa("E18-02", "2018-10-24",
                karlos, productosKarlos1, unidadesKarlos1);

        Erosketa compraKarlos2 = new Erosketa("E19-01", "2019-01-09",
                karlos, productosKarlos2, unidadesKarlos2);

        Erosketa compraKarlos3 = new Erosketa("E19-02", "2019-02-09",
                karlos, productosKarlos3, unidadesKarlos3);

        Erosketa compraUni1 = new Erosketa("E21-01", "2020-01-17",
                uni, productosUni1, unidadesUni1);
        
        
        
        double guztiraCompraNueva = 0;
            for (int i = 0; i < productosUni1.size(); ++i) {
                guztiraCompraNueva = guztiraCompraNueva
                        + (productosUni1.get(i).getPrezioa() * unidadesUni1.get(i));
            }
            
        EpekakoErosketa erosketaBerria = new EpekakoErosketa("E44-02", null, kontaktuak.get(2),
                    productosUni1, unidadesUni1, guztiraCompraNueva, 300);

        //añadir compra al arrayList de todas las compras
        erosketenZerrenda.add(compraMartin1);
        erosketenZerrenda.add(compraKarlos1);
        erosketenZerrenda.add(compraKarlos2);
        erosketenZerrenda.add(compraKarlos3);
        erosketenZerrenda.add(compraUni1);
        erosketenZerrenda.add(erosketaBerria);

        System.out.println(erosketenZerrenda.toString());

    }

    /**
     * Crear una nueva compra con datos del usuario.
     */
    public static void create() {
        //crear una nueva compra
        Scanner in = new Scanner(System.in);
        String compraUser = "";  //fecha del usuario
        int bezeroKodeaUser;    //código del cliente del usuario
        double guztiraUser;     //valor de "guztira" del usuario
        String epekaUser;         //comprobar si el usuario quiere un compra a plazos o no
        boolean seguirComprando = true; //preguntar al usuario si quiere seguir añadiendo productos a su compra
        String eleccionUserSeguir = "";
        String productoElegidoUser = "";
        int unidadesElegidoUser = 0;

        ArrayList<Produktua> productosCompraNueva = new ArrayList<>();  //guardar productos de la nueva compra
        ArrayList<Integer> unidadesCompraNueva = new ArrayList<>(); //unidades de la nueva compra

        System.out.println("\n\tErosketa berria");
        System.out.println("===========================");
        System.out.print("Sartu erosketa kodea: (xxx-xx)");
        compraUser = in.next();

        System.out.print("Sartu bezero kodea: (1-3)");
        bezeroKodeaUser = in.nextInt();

        while (seguirComprando == true) {
            System.out.print("Produkturen bat gehitu nahi duzu? (bai/ez): ");
            eleccionUserSeguir = in.next();

            if (eleccionUserSeguir.equals("bai")) {
                System.out.print("[");
                for (int i = 0; i < produktuKatalogoa.size(); ++i) {
                    System.out.print(produktuKatalogoa.get(i).getStrKodea() + ", ");
                }
                System.out.println("]");
                System.out.println("");

                System.out.print("\tSartu produktu baten kodea: ");//productosCompraNueva
                productoElegidoUser = in.next();

                System.out.print("\tZenbat unitate? ");
                unidadesElegidoUser = in.nextInt();
                unidadesCompraNueva.add(unidadesElegidoUser);
                System.out.println("");

                for (int i = 0; i < produktuKatalogoa.size(); ++i) {
                    if (produktuKatalogoa.get(i).getStrKodea().equals(productoElegidoUser)) {
                        productosCompraNueva.add(produktuKatalogoa.get(i));
                    }
                }
            } else if (eleccionUserSeguir.equals("ez")) {
                seguirComprando = false;

            }
        }

        System.out.println("");
        System.out.print("Epekako erosketa da? (bai/ez): ");
        epekaUser = in.next().toLowerCase();

        //buscar el codigo del cliente en el array de clientes
        int posClienteUser = 0;     //variable que recogerá la posicición en la que se encuentra el cliente que ha metido el usuario

        for (int i = 0; i < kontaktuak.size(); ++i) {
            if (kontaktuak.get(i).getKodea() == bezeroKodeaUser) {
                if (kontaktuak.get(i).getClass() == Pertsona.class) {
                    posClienteUser = i;
                } else if (kontaktuak.get(i).getClass() == Empresa.class) {
                    posClienteUser = i;
                } else {
                    System.out.println("No se ha encontrado ese cliente. ");
                }
                posClienteUser = i;
            }
        }

        if (epekaUser.equals("ez")) {
            System.out.println("\nErosketa normala da! \n");
            Erosketa erosketaBerria = new Erosketa(compraUser, null, kontaktuak.get(posClienteUser),
                    productosCompraNueva, unidadesCompraNueva);

            System.out.println("total compra: " + erosketaBerria.verTotalCompra());
            System.out.println("fecha compra nueva: " + erosketaBerria.getData());
            erosketenZerrenda.add(erosketaBerria);

        } else if (epekaUser.equals("bai")) {

            /*System.out.print("Guztira ordaindu beharrekoa: ");
            guztiraUser = in.nextDouble();*/
            System.out.println("\n\tEpekako erosketa bat da! \n");
            System.out.print("Zenbatekoa izango da kuota bakoitza? ");
            double cadaCuotaUser = in.nextDouble();

            //ArrayList<Produktua> productosEpeka = new ArrayList<>();
            //ArrayList<Integer> unitateakEpeka = new ArrayList<>();
            double guztiraCompraNueva = 0;
            for (int i = 0; i < productosCompraNueva.size(); ++i) {
                guztiraCompraNueva = guztiraCompraNueva
                        + (productosCompraNueva.get(i).getPrezioa() * unidadesCompraNueva.get(i));
            }

            EpekakoErosketa erosketaBerria = new EpekakoErosketa(compraUser, null, kontaktuak.get(posClienteUser),
                    productosCompraNueva, unidadesCompraNueva, guztiraCompraNueva, cadaCuotaUser);

            //System.out.println("Gainetik ordaindu beharko den kantitatea: " + erosketaBerria.gainetikOrdainduBeharrekoa());
            erosketenZerrenda.add(erosketaBerria);

        }

    }

    /**
     * Método para poder consultar/ver todo tipo de información que deseemos
     * acerca de las compras que haya y de las que se vayan realizando.
     */
    public static void read() {

        Scanner in = new Scanner(System.in);
        int aukeraReadMenua;
        do {
            System.out.println("");
            System.out.println("\tREAD MENUA");
            System.out.println("-------------------------------------------");
            System.out.println("1.  Erosketen zerrenda ");
            System.out.println("2.  Fakturazio osoa ");
            System.out.println("3.  Bezerorik onena ");
            System.out.println("4.  Helbidea bilatu "); //meter apellido y devolver dirección
            System.out.println("5.  Epekako erosketen txostena ");
            System.out.println("20. Menu nagusira itzuli ");
            System.out.println("-------------------------------------------");
            System.out.print("Aukeratu zenbaki bat: ");

            aukeraReadMenua = in.nextInt();

            System.out.println("");

            switch (aukeraReadMenua) {
                case 1:
                    erosketenZerrenda();
                    break;
                case 2:
                    System.out.println("\tTotal dinero facturado: " + fakturazioOsoa());
                    break;
                case 3:
                    bezerorikOnena();
                    break;
                case 4:
                    helbideaBilatu();
                    break;
                case 5:
                    epekakoErosketenTxostena();
                    break;
                default:
                    System.out.println(" -> Aukera okerra. Saiatu berriz.");
            }
        } while (aukeraReadMenua != 20);

    }

    /**
     * Método que imprime un listado con todas las compras que se han
     * registrado/guardado (+ datos de cada compra).
     */
    public static void erosketenZerrenda() {    //método para imprimir todas las compras
        for (int i = 0; i < erosketenZerrenda.size(); ++i) {
            System.out.println(erosketenZerrenda.get(i).toString());
        }
    }

    /**
     * Método para calcular el total de lo facturado entre todas las compras. Es
     * decir, suma de los totales a pagar en cada compra.
     *
     * @return
     */
    public static double fakturazioOsoa() {
        double totalFacturado = 0;
        for (int i = 0; i < erosketenZerrenda.size(); ++i) {
            if (erosketenZerrenda.get(i).getProduktuak() != null) {
                totalFacturado = totalFacturado + erosketenZerrenda.get(i).getGuztira();
            }

        }
        return totalFacturado;
    }

    /**
     * Método para buscar cuál ha sido el mejor cliente; es decir, el cliente
     * que más haya gastado en la tienda.
     */
    public static void bezerorikOnena() {
        double maxCompra = 0;
        int posicionCompraMax = 0;  //posición del arrayList de la compra deseada

        for (int i = 0; i < erosketenZerrenda.size(); ++i) {
            if (erosketenZerrenda.get(i).getProduktuak() != null) {
                if (i == 0) {
                    maxCompra = erosketenZerrenda.get(i).getGuztira();
                } else if (erosketenZerrenda.get(i).getGuztira() >= maxCompra) {
                    maxCompra = erosketenZerrenda.get(i).getGuztira();
                    posicionCompraMax = i;
                }
            }

        }
        //System.out.println("\t-> Bezerorik onena: " + erosketenZerrenda.get(posicionCompraMax).getBezeroa().getIzena());
        System.out.println("\t-> Bezerorik onena: \n" + erosketenZerrenda.get(posicionCompraMax).getBezeroa());
        System.out.println("\n\t-> Gasto del cliente: " + maxCompra);
    }

    /**
     * Método para buscar la información de un cliente/compra, mediane su
     * dirección. Es decir, el usuario deberá introducir la dirección.
     */
    public static void helbideaBilatu() {
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu bezeroaren abizena: ");
        String apellidoUser = in.next().toLowerCase();
        
        

        for (int i = 0; i < kontaktuak.size(); ++i) {
            
            if (kontaktuak.get(i).getClass() == Pertsona.class) {
                Pertsona personaBuscada = (Pertsona) (kontaktuak.get(i));
                
                if (personaBuscada.getAbizena().toLowerCase().equals(apellidoUser)) {
                    System.out.println("\n\t-> Izen osoa: " + personaBuscada.getIzena());
                    System.out.println("\t-> Helbidea: " + personaBuscada.getHelbidea());
                }
                
            } else if (kontaktuak.get(i).getClass() == Empresa.class) {
                Empresa empresaBuscada = (Empresa) (kontaktuak.get(i));
                
                if (empresaBuscada.getIzenKomertziala().toLowerCase().equals(apellidoUser)) {
                    System.out.println("\n\t-> Empresaren izena: " + empresaBuscada.getIzena());    //izenKomertziala
                    System.out.println("\t-> Helbidea: " + empresaBuscada.getHelbidea());
                }
            }
            
            /*
            if (kontaktuak.get(i).getIzena().toLowerCase().equals(nombreUser.toLowerCase())) {
                System.out.println("\tKodea: " + kontaktuak.get(i).getKodea() + "\n"
                        + "\tIzena: " + kontaktuak.get(i).getIzena() + "\n"
                        + "\tHelbidea: " + kontaktuak.get(i).getHelbidea());
            }*/
        }
    }

    /**
     * Método para filtrar las compras a plazos de las normales.
     */
    public static void epekakoErosketenTxostena() {
        int numeroComprasPlazos = 0;
        
        ArrayList<EpekakoErosketa> epekakoErosketak = new ArrayList<EpekakoErosketa>();
        
        System.out.println("");
        System.out.println("EPEKAKO EROSKETEN TXOSTENA: ");
        System.out.println("============================");
        System.out.printf("%-10s %-20s %-10s %10s %-10s %10s %s\n", "Data", "Bezeroa", "GuztiraES","Epeak","Kuota","GuztiraEP", "Ordaindua");
        System.out.println("-----------------------------------------------------------------------------------");
        for (int i = 0; i < erosketenZerrenda.size(); i++) {
            if (erosketenZerrenda.get(i).getClass() == EpekakoErosketa.class) {
                epekakoErosketak.add((EpekakoErosketa) erosketenZerrenda.get(i));
                
            }
        }
        
        for (int x = 0; x < epekakoErosketak.size(); ++x) {
            System.out.printf("%-10s %-20s %-10.2f %10d %-10.2f %10.2f %b\n",    //System.out.printf("%10s %10s %-18.2f %-2d %-15.2f %-10.2f %b\n", 
                        epekakoErosketak.get(x).getData().toString(), 
                        epekakoErosketak.get(x).getBezeroa().getIzena(), 
                        epekakoErosketak.get(x).getGuztira(), 
                        epekakoErosketak.get(x).getEpeak(), 
                        epekakoErosketak.get(x).getKuota(), 
                        epekakoErosketak.get(x).getEpeak() * epekakoErosketak.get(x).getKuota(), 
                        epekakoErosketak.get(x).isOrdainketaBukatuta());
        }   //isOrdainketaBukatuta
        
        

    }

    public static void update() {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.print("Zein erosketaren kodea nahi duzu aldatu? (sartu kodea): ");
        String erosketaKodeaUser = in.next();

        System.out.println("");
        System.out.print("Sartu erosketaren KODE BERRIA: ");
        String nuevoCodigoCompraUser = in.next();
        
        char[] nuevoCodigoCompra = new char[nuevoCodigoCompraUser.length()];
        
        for (int i = 0; i < nuevoCodigoCompra.length; ++i) {
            nuevoCodigoCompra[i] = nuevoCodigoCompraUser.charAt(i);
        }
        
        for (int i = 0; i < erosketenZerrenda.size(); ++i) {
            if (erosketenZerrenda.get(i).getStrKodea().equals(erosketaKodeaUser)) {
                erosketenZerrenda.get(i).setKodea(nuevoCodigoCompra);
            }
        }
        
    }

    /**
     * Método para eliminar un elemento (Erosketa) del listado de compras
     * registradas. Para ello, el usuario deberá introducir el código de la
     * compra que desea eliminar.
     */
    public static void delete() {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.print("Sartu erosketaren kodea: ");
        String erosketaKodeaUser = in.next();

        /*char[] compraCodigoUser = new char[erosketaKodeaUser.length()];
        
        for (int i = 0; i < compraCodigoUser.length; ++i) {
            compraCodigoUser[i] = erosketaKodeaUser.charAt(i);
        }*/
        for (int i = 0; i < erosketenZerrenda.size(); ++i) {
            if (erosketenZerrenda.get(i).getStrKodea().equals(erosketaKodeaUser)) {
                erosketenZerrenda.remove(i);
            }
        }
    }

}
