package com.example.giovanna.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // view layout
    private TextView vMessaggio;
    private Button vAumenta;
    private Button vDiminuisci;
    private Button vAzzera;
    private CheckBox vRaddoppia;

    private int contatore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //imposto riferimenti layout
        vMessaggio = findViewById(R.id.textMessaggio);
        vAumenta = findViewById(R.id.btnAumenta);
        vDiminuisci = findViewById(R.id.btnDiminuisci);
        vAzzera = findViewById(R.id.btnAzzera);
        vRaddoppia = findViewById(R.id.chkRaddoppia);

        // imposto azioni pulsanti
        vAumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++contatore;
                if (vRaddoppia.isChecked())
                    ++contatore;
                visualizzaMessaggio();
            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --contatore;
                if (vRaddoppia.isChecked())
                    --contatore;
                visualizzaMessaggio();
            }
        });

        vAzzera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatore = 0;
                visualizzaMessaggio();
            }
        });
    }

    /**
     * funzione che visualizza il valore del contatore.!
     */
    private void visualizzaMessaggio (){
        vMessaggio.setText(getString(R.string.valore) + contatore);
    }




}
