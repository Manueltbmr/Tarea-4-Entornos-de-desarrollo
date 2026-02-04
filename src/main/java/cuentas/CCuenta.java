package cuentas;

/**
 * @author Manuel Taboada Clase que representa una cuenta bancaria con titular,
 * número de cuenta, saldo e interés.
 */
public class CCuenta {

    /**
     * nombre del titular de la cuenta
     */
    private String nombre;
    /**
     * nombre de la cuenta
     */
    private String cuenta;
    /**
     * saldo de la cuenta
     */
    private double saldo;
    /**
     * interes de la cuenta
     */
    private double tipoInterés;

    /**
     * constructor vacio
     *
     */
    public CCuenta() {
    }

    /**
     * constructor con atributos
     *
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * @return saldo de la cuenta
     *
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Metodo utilizado para ingresar dinero en la cuenta
     *
     * @param cantidad recibe la cantidad de dinero a ingresar
     * @throws Exception si la contidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo utilizado para sacar dinero en la cuenta
     *
     * @param cantidad recibe la cantidad de dinero a retirar
     * @throws Exception si la contidad es negativa o la cantidad a retirar es
     * mayor al saldo disponibe
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return nombre de al cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre del titular de la cuenta 
     * se pasa el nombre del titular a la instancia CCuenta
     * 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return nombre de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta nombre de la cuenta 
     * se pasa el nombre a la instancia CCuenta
     * 
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return saldo de la cuenta
     *
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo 
     * se pasa el saldo que dispone la cuenta a la instancia CCuenta
     * 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return tipoInterés de al cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés  tipo de interés de la cuenta
     * se pasa el interes que dispone la cuenta a la instancia CCuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

}
