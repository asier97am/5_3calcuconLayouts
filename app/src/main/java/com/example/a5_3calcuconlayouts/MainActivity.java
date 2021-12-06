package com.example.a5_3calcuconlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] operadores={"Seleccione","suma","resta","multiplicacion","division"};
    private ArrayAdapter mAdapter;
    public TextView txResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp1=(Spinner) findViewById(R.id.sp1);
        txResultado=(TextView)findViewById(R.id.txResultado);
        sp1.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,operadores));

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {

                if (pos==0){
                    txResultado.setText("NADA Seleccionado ");
                }
                else{
                    String tsp1=sp1.getSelectedItem().toString();
                    txResultado.setText("Seleccionado: "+tsp1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                //txResultado.setText("NADA Seleccionado ");
            }
        });
    }
}