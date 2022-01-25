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
public class MyRectangle {
    
    private MyPoint topLeft;        //X = lado SUPERIOR e Y = lado IZQUIERDO
    private MyPoint bottomRight;    //X = lado INFERIOR e Y = lado DERECHO
    
    
    /**
     * Este constructor generará un rectángulo a partir de los datos que 
     * le pasemos. Estos datos deben ser puntos (x1, y1) (x2, y2)
     * @param topLeft
     * @param bottomRight 
     */
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    
        
    /**
     * (Suponiendo que el rectángulo está horientado horizontalmente)
     * 
     * Setter cambiar el lado SUPERIOR y el IZQUIERDO a la vez
     * @param topLeft 
     */
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }
    
    /**
     * (Suponiendo que el rectángulo está horientado horizontalmente)
     * 
     * Setter cambiar el lado INFERIOR y el DERECHO a la vez
     * @param topLeft 
     */
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }
    
    
    /**
     * (Suponiendo que el rectángulo está horientado horizontalmente)
     * 
     * Calcular la ANCHURA que tiene el rectángulo; para ello, 
     * podemos coger el valor de X en "bottomRight" (que sería el valor 
     * más GRANDE que tendrá en X), y restarle el valor de X en "topLeft" (que 
     * será el valor más PEQUEÑO que tendrá en X).
     * Esto es:
     *  -> anchura = maxX - minX;
     *      * maxX = valor en el eje X donde se TERMINA el rectángulo
     *      * minX = valor en el eje X donde se COMIENZA el rectángulo
     * 
     * Con este dato podemos obter la anchura del rectángulo; o lo que es lo 
     * mismo, el valor del lado tanto inferior, como superior (o base)
     * @return 
     */
    public int getAnchura() {
        int rectAnchura = this.bottomRight.getX() - this.topLeft.getX();
        return rectAnchura;
    }
    
    
    /**
     * (Suponiendo que el rectángulo está horientado horizontalmente)
     * 
     * Calcular la ALTURA que tiene el rectángulo; para ello, 
     * podemos coger el valor de Y en "topLeft" (que sería el valor 
     * más GRANDE que tendrá en Y), y restarle el valor de Y en "bottomRight" (que 
     * será el valor más PEQUEÑO que tendrá en Y).
     * Esto es:
     *  -> altura = maxY - minY;
     *      * maxY = valor en el eje Y donde se TERMINA el rectángulo
     *      * minY = valor en el eje Y donde se COMIENZA el rectángulo
     * 
     * Con este dato podemos obter la ALTURA del rectángulo; o lo que es lo 
     * mismo, el valor de tanto el lado izquierdo, como el lado derecho (o lateral)
     * @return 
     */
    public int getAltura() {
        int rectAltura = this.topLeft.getY() - this.bottomRight.getY();
        return rectAltura;
    }
    
    /**
     * (Suponiendo que el rectángulo está horientado horizontalmente)
     * 
     * Este método devolverá el valor del área del rectángulo (double)
     * EL área de un rectángulo se calcula de la siguiente manera:
     *  -> a = altura * anchura
     * 
     * Limitar el resultado a 4 decimales (máx.)
     * @return 
     */
    public double getAzalera() {
        double rectAzalera = this.getAltura() * this.getAnchura();
        return rectAzalera;
    }
    
    /**
     * (Suponiendo que el rectángulo está horientado horizontalmente)
     * 
     * Este método nos permite conocer y obtener el perímetro del 
     * rectángulo. Se calcula así:
     * 
     * Ya que top y bot DEBEN SER IGUALES -> 2 * top (edo bot)
     * Ya que izquierda y derecha DEBEN SER IGUALES -> 2 * izq (edo der)
     * 
     *  -> p = (2*top) + (2*der)
     * @return 
     */
    public double getPerimetroa() {
        
        double perimetro = (2 * this.getAltura()) + (2 * this.getAnchura());
        return perimetro;
    }
    
    /**
     * Obtener el punto SUPERIOR IZQUIERDO
     * @return 
     */
    public MyPoint getTopLeft() {
        return this.topLeft;
    }
    
    /**
     * Obtener el punto INFERIOR DERECHO
     * @return 
     */
    public MyPoint getBottomRight() {
        return this.bottomRight;
    }
    
    //------------------
    
    /**
     * (Suponiendo que el rectángulo está horientado horizontalmente)
     * 
     * Si queremos obtener el otro vértice/punto INFERIOR (en este caso 
     * el INFERIOR IZQUIERDO), tendremos que asignarle el valor que tiene 
     * X en "topLeft", y el valor que tiene Y en "bottomRight"
     * @param topLeftPuntua
     * @param bottomRightPuntua
     * @return 
     */
    public MyPoint getBottomLeft() {
        MyPoint bottomLeft = new MyPoint(this.topLeft.getX(), this.bottomRight.getY());
        return bottomLeft;
    }
    
    
    /**
     * (Suponiendo que el rectángulo está horientado horizontalmente)
     * 
     * Si queremos obtener el otro vértice/punto SUPERIOR (en este caso 
     * el SUPERIOR DERECHO), tendremos que asignarle el valor que tiene 
     * X en "bottomRight", y el valor que tiene Y en "topLeft"
     * @param topLeftPuntua
     * @param bottomRightPuntua
     * @return 
     */
    public MyPoint getTopRight() {
        MyPoint topRight = new MyPoint(this.bottomRight.getX(), this.topLeft.getY());
        return topRight;
    }
    
    
    public String toString() {
        return "MyRectangle = [" + this.topLeft + ", " + this.bottomRight + "]";
    }
    
}

/*
https://www.google.com/search?q=dos+vertices+de+un+rect%C3%A1ngulo&rlz=1C1CHBF_esES970ES970&biw=958&bih=959&ei=Rn_dYZrmI6WEjLsPleydiAE&ved=0ahUKEwiaocu64Kn1AhUlAmMBHRV2BxEQ4dUDCA4&uact=5&oq=dos+vertices+de+un+rect%C3%A1ngulo&gs_lcp=Cgdnd3Mtd2l6EAM6BggAEAcQHjoICAAQCBAHEB46BggAEAgQHkoECEEYAEoECEYYAFAAWLIXYMoYaANwAngAgAH4A4gBlg6SAQs2LjMuMC4xLjAuMZgBAKABAcABAQ&sclient=gws-wiz#kpvalbx=_WH_dYeniGpTQgweTs5ywAw28
*/
