/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author AdriAlex
 */
public class MyTriangle {
    
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    /**
     * Para construir un triángulo de esta manera, tendremos que pasarle los tres 
     * puntos del mismo.
     * Para ello, endremos que pasarle los valor de las coordenadas tanto 
     * de X como de Y (de cada uno de los puntos del triángulo
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3 
     */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    
    /**
     * Otra forma de construir un triángulo es pasándole los tres puntos
     * ya creados. Estos puntos se pasarán como parámetro.
     * @param v1
     * @param v2
     * @param v3 
     */
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    /**
     * Este método imprimirá el objeto deseado en un formato como 
     * el siguiente: 
     *  -> "MyTriangle[v1 = (x1,y1), v2 = (x2,y2), v3 = (x3,y3)]"
     * @return 
     */
    public String toString() {
        return "MyTriangle[v1 =(" + 
                v1.getX() + ", " + v1.getY() + "), " + 
                "v2 = (" + v2.getX() + "," + v2.getY() + "), " +
                "v3 = (" + v3.getX() + "," + v3.getY() + ")"
                + "]";
    }
    /**
     * Obtener los valores del punto 1
     * @return 
     */
    public MyPoint getV1() {
        return v1;
    }
    
    /**
     * Obtener los valores del punto 2
     * @return 
     */
    public MyPoint getV2() {
        return v2;
    }
    
    /**
     * Obtener los valores del punto 3
     * @return 
     */
    public MyPoint getV3() {
        return v3;
    }

    /**
     * Cambiar p1 por un punto nuevo
     * @param v1 
     */
    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }
    
    /**
     * Cambiar p2 por un punto nuevo
     * @param v1 
     */
    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }
    
    /**
     * Cambiar p3 por un punto nuevo
     * @param v1 
     */
    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }
    
    /**
     * Getter para obtener el perímetro de un triángulo.
     * El perímetro de un triángulo es la suma de las distancias que hay 
     * entre puntos (p1, p2, p3).
     * 
     * La distancia entre dos puntos se puede calcular de la siguiente manera:
     *  - xDiff = p1X - p2X
     *  - yDiff = p1Y - p2Y
     * 
     *  -> dist (p1,p2) = Math.sqrt((xDiff * xDiff) + (yDiff * yDiff))
     * @return 
     */
    public double getPerimeter() {
        double distLado1 = v1.distance(v2);
        double distLado2 = v2.distance(v3);
        double distLado3 = v3.distance(v1);
        
        double perimetroTriangulo = distLado1 + distLado2 + distLado3;
        return perimetroTriangulo;        
    }
    
    
    /**
     * Este método devolverá un string indicando el tipo del triangulo 
     * que le estamos pasando (equilátero, isósceles, escaleno)
     * 
     *  -> Equilátero = TODOS los lados son iguales (coinciden las 3 distancias entre puntos)
     *  -> Isósceles = DOS de los 3 lados son iguales (solamente coinciden 2 de los 3 lados)
     *  -> Escaleno = NINGUNO de los 3 lados son iguales (no hay coincidencia en los lados)
     * @return 
     */
    public String getType() {
        double distanciaLadoA = v1.distance(v2);
        double distanciaLadoB = v2.distance(v3);
        double distanciaLadoC = v3.distance(v1);
        
        String triangeluMota = "";
        
        if ((distanciaLadoA == distanciaLadoB) && (distanciaLadoA == distanciaLadoC)) { //TODOS IGUALES - lados del triángulo (distancia entre puntos)
            triangeluMota = "Triangelua aldekidea da. ";          
            
        } else if (
                    ((distanciaLadoA == distanciaLadoB) && (distanciaLadoA != distanciaLadoC))   //solo los lados A y B son iguales (C distinto)
                    ||  //or
                    ((distanciaLadoB == distanciaLadoC) && (distanciaLadoB != distanciaLadoA))  //solo los lados B y C son iguales (A distinto)
                    ||  //or
                    ((distanciaLadoC == distanciaLadoA) && (distanciaLadoC != distanciaLadoB))  //solo los lados C y A son iguales (B distinto)
                ) {
            triangeluMota = "Triangelua isoszelea da. ";
            
        } else if ((distanciaLadoA != distanciaLadoB) && (distanciaLadoA != distanciaLadoC)) {  //TODOS SON DIFERENTES - ninguno de los lados coincide con otro
            triangeluMota = "Triangelua eskalenoa da. ";
            
        }
        return triangeluMota;
        
    }
    
    
    
}
