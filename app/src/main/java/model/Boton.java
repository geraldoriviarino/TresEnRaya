package model;

import android.content.Context;
import android.widget.Button;

/**
 * Created by Mario on 06/12/2016.
 */


/********************************





 *********************************/
public class Boton extends Button {

     private int id;
    private boolean pulsado;

    public Boton(Context c){
        super(c);
    }

    public int getID(){
        return this.id;
    }

    public boolean estaPulsado(){
        return pulsado;
    }

    /**
     * Método que establece el atributo pulsado a true, para no comparar con el contenido en "".
     *
     */
    public void pulsar(){
        pulsado = true;
    }
}
