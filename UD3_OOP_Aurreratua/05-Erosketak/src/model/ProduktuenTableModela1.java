/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 *
 * @author arceredillo.adrian
 */
public class ProduktuenTableModela1 extends AbstractTableModel {

    private final String[] zutabeIzenak = {"Kodea", "Izena", "Prezioa"};
    private ArrayList<Produktua> data = new ArrayList<>();

    public ProduktuenTableModela1() {
        data.add(new Produktua("J01", "Ogia", 1.5));
        data.add(new Produktua("J02", "Esnea", 1.05));
        data.add(new Produktua("J03", "Madalenak", 2.25));
        data.add(new Produktua("J04", "Mermelada", 3.0));
    }

    public static void main(String[] args) {
        new ProduktuenTableModela1();
        
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return zutabeIzenak.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return data.get(rowIndex).getStrKodea();
        } else if (columnIndex == 1) {
            return data.get(rowIndex).getIzena();
        } else if (columnIndex == 2) {
            return data.get(rowIndex).getPrezioa();
        }
        
        return null;
    }
    
    /**
     * Mediante este método cambiaremos los nombres de las columnas de 
     * la tabla, poniendo los valores que a nosotros nos interesen. 
     * 
     * @param col
     * @return 
     */
    @Override
    public String getColumnName(int col) {
        return zutabeIzenak[col];
    }
    
    
    
    
    /**
     * Método para ver de qué tipo es el elemento que nosotros le digamos; 
     * ya que por defecto, para el programa, todos los elementos son de la 
     * clase object. 
     * 
     * P.E.: si preguntamos de qué tipo es una columna, nos devolverá su 
     * tipo -> Integer, String... o lo que sea. 
     * 
     * @param c número columna
     * @return Boolean, Integer, String edo...
     */
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    
    }
    
    
    @Override
    public boolean isCellEditable(int row, int col) {
        if (col == 2) {
            return true;
        }
        return false;
    }
    
    
    /**
     * Cada vez que haya un cambio en una de las casillas, se llamará a 
     * este método automáticamente. 
     * @param value
     * @param row
     * @param col 
     */
    public void setValueAt(Object value, int row, int col) {    //ponerlo con todas las columnas
        data.get(row).setPrezioa((double) value);
        
    }
    
    //para hacerlo editable y que se puedan guardar los cambios, hay usar también setValue()
    //convertir en editable las celdas correspondientes a los precios

}

//https://www.mclibre.org/consultar/python/ejercicios/ej-listas-1.html#ejercicio-1
//https://www.mclibre.org/consultar/python/ejercicios/ej-listas-1-soluciones.html
