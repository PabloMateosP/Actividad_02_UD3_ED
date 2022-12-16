/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Pablo Mateos Palas
 */
public class CCuenta {

    
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    public CCuenta (){
    
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Nombre de la cuenta presente 
    * @param sal Número del saldo de la cuenta 
    * @param tipo Número del tipo de Interés presente 
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }
  /**
   * 
   * @param nom Que se corresponde con el nombre del titular de la cuenta 
   */
    public void asignarNombre(String nom)
    {
        nombre = nom;
    }
   
    /**
     *
     * @return mediante el return devolvemos el nombre de nuestro método presente 
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     *
     * @return mediante este return recibimos el saldo presente
     */
    public double estado ()
    {
        return saldo;
    }

    /**
     *
     * @param cantidad, la palabra cantidad nos declara la cantidad presente en la cuenta que tenemos
     * @throws Exception mediante este throws exception declaramos una restricción por la cual si el cliente intenta introducir una cantidad negativa esto será denegado 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad, al igual que en el anterior cantidad inicializado, nos declara la cantidad presente usando un double para una mayor capacidad. 
     * @throws Exception con la palabra exception buscamos poner una "excepción" como su nombre indica para redirigir el programa en caso de no cumplir los parámetros neceesarios.
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     *
     * @return con esta palabra en este método nuestro código devuelve el valor de nuestra String cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     *
     * @param cuenta, el String cuenta es una cadena que hace referencia a la cuenta como tal dando valores de tipo cuenta.
     */
    public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

    /**
     *
     * @param saldo, el double saldo al igual que cantidad comprende un valor en este caso del saldo de la cuenta que tenemos.
     */
    public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

    /**
     *
     * @return con esta palabra en este método nuestro código devuelve el valor de nuestro double tipoInterés
     */
    public double getTipoInterés() {
    return tipoInterés;
  }

    /**
     *
     * @param tipoInterés, el tipoInterés el double declarado anteriormente que comprende el tipo de interés presentado en la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
