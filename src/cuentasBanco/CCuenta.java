package cuentasBanco;

/**
 * @author Rosa Cazador
 * @version 0.1
 *
 */
public class CCuenta {

    /**
     * Atributo nombre: para identificar el nombre de la persona titular de la cuenta bancaria
     */
    /**
     * Atributo cuenta: para el numero de cuenta bancaria de esa persona
     */
    /**
     * Atributo saldo: contiene el saldo de la cuenta
     */
    /**
     * Atributo tipoInteres: para el tipo de interes que tenga la cuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Metodo getNombre: me permite obtener el nombre del titular de la cuenta
     * @return devuelve el nombre del titular
     */
    public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo setNombre: me permite asignar el nombre del titular de la cuenta
	 * @param nombre para asignar el nombre del titular de la cuenta
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo getCuenta: permite obtener el número de cuenta bancaria
	 * @return devuelve el número de cuenta bancaria
	 */
	public String getCuenta() {
		return cuenta;
	}
	/**
	 * Metodo setCuenta: permite asignar el número de cuenta bancaria
	 * @param cuenta para asignar el número de cuenta bancaria
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 *Metodo gelSaldo: permite obtener el saldo de la cuenta
	 * @return devuelve el saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Metodo setSaldo: permite asignar el saldo de la cuenta
	 * @param saldo para asignar el saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo getTipoInteres: permite obtener el tipo de interes de la cuenta
	 * @return devuelve el tipo de interes de la cuenta
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Metodo setTipoInteres: permite asignar el tipo de interes de la cuenta
	 * @param tipoInterés para asignar el tipo de interes de la cuenta
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	

    /**
     * Llamada al metodo CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Metodo CCuenta: para obtener todos los datos de la cuenta. Esos datos los definen los parámetros nombre, cuenta, saldo y tipo de interes definidos.
     * @param nom para el nombre del titular de la cuenta
     * @param cue para el número de cuenta bancaria
     * @param sal para el saldo en la cuenta
     * @param tipo para el tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     *Metodo estado: para saber el estado de la cuenta en ese momento
     * @return devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Metodo ingresar: para hacer ingresos en la cuenta y actualizar el saldo de esta, añadiendo al saldo actual la cantidad ingresada.
     * 
     * @param cantidad para indicar la cantidad de dinero a ingresar en la cuenta
     * @throws Exception si la cantidad a ingresar es menor que 0, no podré ingresar y me dira que "No se puede ingresar una cantidad negativa"
     * 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo retirar: para retirar dinero de la cuenta. Me permite retirar dinero de la cuenta y actualizar el saldo de esta restando del saldo actual, la cantidad retirada.
     * 
     * @param cantidad para indicar la cantidad de dinero a retirar de la cuenta
     * @throws Exception si la cantidad a retirar es menor o igual a 0, no podré retirar dinero y me dira que "No se puede retirar una cantidad negativa". Y si la cantidad a retirar es mayor que el saldo disponible en la cuenta, tampoco podré retirar dinero y me dira que "No hay suficiente saldo"
     * 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}