package com.jeremi.tradingjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText init, perc, target;
    TextView displaya, detailsa;
    Button calc;

    String d="",b="",c="";
    Double initialValue, percent, targetAmt, deci;
    int a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init = findViewById(R.id.editInit);
        perc= findViewById(R.id.editPerc);
        target= findViewById(R.id.editTarget);
        displaya= findViewById(R.id.display);
        detailsa= findViewById(R.id.details);
        calc= findViewById(R.id.btnCalc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d=init.getText().toString();
                b=perc.getText().toString();
                c=target.getText().toString();

                initialValue= Double.parseDouble(d);
                percent= Double.parseDouble(b);
                targetAmt= Double.parseDouble(c);
                deci=1+(percent/100);
                a=0;
                String all="";
                for (double i=initialValue; i<targetAmt; i=i*deci){
                    a=a+1;

                    all=all+i+"        ";

                }
                displaya.setText(String.valueOf(a));
                detailsa.setText(all);


            }
        });


    }
}