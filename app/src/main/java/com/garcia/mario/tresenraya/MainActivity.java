package com.garcia.mario.tresenraya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {

    RadioButton rbNaranjaJugador1;
    RadioButton rbNaranjaJugador2;
    RadioButton rbVerdeJugador1;
    RadioButton rbVerdeJugador2;
    RadioButton rbAzulJugador1;
    RadioButton rbAzulJugador2;
//////////sernrtnertnwaergawg vawg
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargar_radiobuttons();


    }

    public void on_radiobutton_pulsado(View v){

         bloquear_radiobutton(v);
    }

    public void bloquear_radiobutton(View v){

        switch(v.getId()){
            case R.id.rbNaranjaJugador1:
                activar_radiobuttons();
                rbNaranjaJugador2.setEnabled(false);
                break;
            case R.id.rbNaranjaJugador2:
                activar_radiobuttons();
                rbNaranjaJugador1.setEnabled(false);
                break;
            case R.id.rbVerdeJugador1:
                activar_radiobuttons();
                rbVerdeJugador2.setEnabled(false);
                break;
            case R.id.rbVerdeJugador2:
                activar_radiobuttons();
                rbVerdeJugador1.setEnabled(false);
                break;
            case R.id.rbAzulJugador1:
                activar_radiobuttons();
                rbAzulJugador2.setEnabled(false);
                break;
            case R.id.rbAzulJugador2:
                activar_radiobuttons();
                rbAzulJugador1.setEnabled(false);
                break;
        }

    }

    public void cargar_radiobuttons(){
        rbNaranjaJugador1 = (RadioButton) findViewById(R.id.rbNaranjaJugador1);
        rbNaranjaJugador2 = (RadioButton) findViewById(R.id.rbNaranjaJugador2);
        rbVerdeJugador1 = (RadioButton) findViewById(R.id.rbVerdeJugador1);
        rbVerdeJugador2 = (RadioButton) findViewById(R.id.rbVerdeJugador2);
        rbAzulJugador1 = (RadioButton) findViewById(R.id.rbAzulJugador1);
        rbAzulJugador2 = (RadioButton) findViewById(R.id.rbAzulJugador2);
    }

    public void activar_radiobuttons(){

        if(!rbNaranjaJugador1.isEnabled()) rbNaranjaJugador1.setEnabled(true);
        if(!rbNaranjaJugador2.isEnabled()) rbNaranjaJugador2.setEnabled(true);
        if(!rbVerdeJugador1.isEnabled()) rbVerdeJugador1.setEnabled(true);
        if(!rbVerdeJugador2.isEnabled()) rbVerdeJugador2.setEnabled(true);
        if(!rbAzulJugador1.isEnabled()) rbAzulJugador1.setEnabled(true);
        if(!rbAzulJugador2.isEnabled()) rbAzulJugador2.setEnabled(true);
    }
}
