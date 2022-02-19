package cuentas;

public class CCuenta {

/** 
 * Esta clase permite ingresar y devolver dinero en una cuenta, adem�s calcula el interes
 * @author Andrea
 * 
 * 
 * */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInter�s;

    public CCuenta()
    {
    }
    /**
     * Estos par�metros introducen unos datos para realizar operaciones
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    public double estado()
    {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * Este m�todo devuelve un nombre
     * @return
     */
    
	private String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return
	 */
	private String getCuenta() {
		return cuenta;
	}
	/**
	 * 
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInter�s() {
		return tipoInter�s;
	}

	private void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}
