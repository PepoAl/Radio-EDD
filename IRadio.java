public interface IRadio{
    /**
     * Retornamos el valor de si esta encendido o no
     * @return boolean
     */
    public boolean getState();
    /**
     * Apagar y encender
     */
    public void tooglePowerOffOn();
    /**
     * FM o AM
     */
    public void toogleAMFM();
    /**
     * Obtener si esta en FM o AM
     * @return boolean
     */
    public boolean getStateAMFM();
    /**
     * Siguiente frecuencia
     */
    public void nextFrequency();
    /**
     * frecuencia previa
     */
    public void previousFrequency();
    
    /**
     * Obtener la frecuencia actual
     * @return float
     */
    public float getCurrentFrequency();
    /**
     * Guardar frecuencia
     * @param button
     */
    public void setFavFrequency(int button);
    /**
     * Llama frecuencia
     * @param button
     * @return
     */
    public float getFavFrequency(int button);
}