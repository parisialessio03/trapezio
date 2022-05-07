/**
* The Class Trapezio.
*
* @author Marco
* Dichiarazione della classe Trapezio
*/
public class Trapezio
{

/**
* Dichiarazione degli attributi nella classe Trapezio .
*
*/
private float base1;

/** The base 2. */
private float base2;

/** The altezza. */
private float altezza;

/**
* Generazione del costruttore Trapezio.
*
* @param base1 the base 1
* @param base2 the base 2
* @param altezza the altezza
*/
public Trapezio (float base1,float base2,float altezza)
{
this.base1=base1;
this.base2=base2;
this.altezza=altezza;
}

/**
* Calcola Area.
*
* @return the float
*/
public float Area()
{
return(base1+base2)*altezza/2;
}

/**
* Main.
*
* @param args the arguments
*/
public static void main(String [] args)
{
Trapezio t = new Trapezio(1,2,3);
System.out.println("Area: "+ t.Area());
}
}