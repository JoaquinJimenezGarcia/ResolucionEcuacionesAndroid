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

/*

import java.util.Scanner;

public class resolucionEcuaciones01joaquinJimenez{

  public static void main (String[] args){

    //Crea el elemento del scanner para poder usarlo
    Scanner input = new Scanner(System.in);

    //Declara las variables a usar (la ecuación se ha dividido en partes para
    //verla más fácil y detectar fallos más rápidamente)
    int a, b, c;
    double primeraMenosB, primeraCuadrado, primeraMultiplicacion;
    double primeraResta, primeraRaiz, primeraSuma, primeraMultiplicacionBaja, primeraResultado;
    double segundaMenosB, segundaCuadrado, segundaMultiplicacion, segundaResta;
    double segundaRaiz, segundaSuma, segundaMultiplicacionBaja, segundaResultado;


    //Pregunta y lee los valores asignados a "a", "b" y "c"
    System.out.println("Introduzca el coeficiente \'a\':");
    a = input.nextInt();
    System.out.println("Introduzca el coeficiente \'b\':");
    b = input.nextInt();
    System.out.println("Introduzca el coeficiente \'c\':");
    c = input.nextInt();

    //Cuentas necesarias para resolver la primera solución de la ecuación
    primeraMenosB = -1 * b; //-b
    primeraCuadrado = Math.pow(b, 2); //b^2
    primeraMultiplicacion = 4 * a * c; //4ac
    primeraResta = primeraCuadrado - primeraMultiplicacion;//b^2 - 4ac
    primeraRaiz = Math.sqrt(primeraResta);//Raiz cuadrada de (b^2-4ac)
    primeraSuma = primeraMenosB + primeraRaiz;//-b + la raíz
    primeraMultiplicacionBaja = 2 * a;//Multiplicacion de abajo
    primeraResultado = primeraSuma/primeraMultiplicacionBaja;//Resultado de arriba entre lo de abajo

    //Cuentas necesarias para resolver la segunda solución de la ecuación
    segundaMenosB = -1 * b; //-b
    segundaCuadrado = Math.pow(b, 2); //b^2
    segundaMultiplicacion = 4 * a * c; //4ac
    segundaResta = segundaCuadrado - segundaMultiplicacion;//b^2 - 4ac
    segundaRaiz = Math.sqrt(segundaResta);//Raiz cuadrada de (b^2-4ac)
    segundaSuma = segundaMenosB - segundaRaiz;//-b + la raíz
    segundaMultiplicacionBaja = 2 * a;//Multiplicacion de abajo
    segundaResultado = segundaSuma/segundaMultiplicacionBaja;//Resultado de arriba entre lo de abajo

    //Pregunta si el resultado es mayor a 0, y en caso afirmativo...
    if (primeraResultado > 0){
      //Imprime el mensaje anunciado y los resultados
      System.out.println("La ecuación con coeficientes " + a + ", " + b + ", " + c + " tiene las siguientes soluciones:");
      System.out.printf("X1: " +  "%.1f %n", primeraResultado);
      System.out.printf("X2: " +  "%.1f %n", segundaResultado);
    }else{
      //En caso contrario, te indica que no tiene solución
      System.out.println("La ecuación no tiene solución.");
    }
  }

}

 */
