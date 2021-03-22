package com.example.randonnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> lista = new ArrayList<String>();
    private EditText et1;
    private TextView tv1;
    private TextView tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // limpio la lista
        lista.clear();

        et1=findViewById(R.id.editTextTarjetas);
        tv1=findViewById(R.id.textViewLive);
        tv2=findViewById(R.id.textViewDie);
    }

    //Este método se ejecutará cuando se presione el botón
    public void randomizarLista(View view) {

        String cadena = et1.getText().toString();
        Toast notificacion;

        if(cadena.length()== 0) {
            notificacion = Toast.makeText(this,"Debe ingresar al menos una linea",Toast.LENGTH_LONG);
            notificacion.show();
        } else {
            lista.clear();
            tv1.setText("");
            tv2.setText("");

//            notificacion=Toast.makeText(this,cadena,Toast.LENGTH_LONG);
//            notificacion.show();
            String[] subStrings = cadena.split("\n");
            for(String s : subStrings){
                lista.add(s);
            }
            Collections.shuffle(lista);
//            notificacion=Toast.makeText(this,lista.toString(),Toast.LENGTH_LONG);
//            notificacion.show();
        }
    }
}