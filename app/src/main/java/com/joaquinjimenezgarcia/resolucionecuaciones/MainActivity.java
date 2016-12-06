package com.joaquinjimenezgarcia.resolucionecuaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText valor1, valor2, valor3;
    private TextView textX1, textX2;

    public static double a, b, c, x1, x2;
    public static String valorX1;
    public static String valorX2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuenta();
            }
        });
    }

    public void cuenta(){
        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        valor3 = (EditText) findViewById(R.id.valor3);
        textX1 = (TextView) findViewById(R.id.textX1);
        textX2 = (TextView) findViewById(R.id.textX2);

        a = Double.parseDouble(valor1.getText().toString());
        b = Double.parseDouble(valor2.getText().toString());
        c = Double.parseDouble(valor3.getText().toString());

        x1 = (-b + (Math.sqrt(b*b - 4*a*c)))/2*a;
        x2 = (-b - (Math.sqrt(b*b - 4*a*c)))/2*a;

        valorX1 = String.valueOf(x1);
        valorX2 = String.valueOf(x2);

        textX1.setText(valorX1);
        textX2.setText(valorX2);
    }
}
