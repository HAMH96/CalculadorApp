package com.example.hamh96.calculadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private String texto = "";
    private EditText editorTexto;
    private String prevDigit="";
    private Double oper1=0.0;
    private Double oper2=0.0;
    private Double result=0.0;
    private String acumul="";
    private String operation="";
    private int flagEqual=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editorTexto = (EditText) findViewById(R.id.editorTexto);
    }

    public void writeB7(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "7";
        prevDigit="7";
        acumul+="7";
        editorTexto.setText(texto);
    }

    public void writeB8(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "8";
        prevDigit="8";
        acumul+="8";
        editorTexto.setText(texto);
    }

    public void writeB9(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "9";
        prevDigit="9";
        acumul+="9";
        editorTexto.setText(texto);
    }

    public void writeBplus(View view) {
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))){
            texto += "+";
            prevDigit="+";
            if(flagEqual==1) {
                oper2=Double.parseDouble(acumul);
                result=oper1+oper2;
                texto=Double.toString(result);
                texto+="+";
                oper1=result;
            }
            else if(flagEqual==0){
                oper1 = Double.parseDouble(acumul);
            }
            editorTexto.setText(texto);
            flagEqual=1;
            acumul="";
        }
    }

    public void writeB4(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "4";
        prevDigit="4";
        acumul+="4";
        editorTexto.setText(texto);
    }

    public void writeB5(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "5";
        prevDigit="5";
        acumul+="5";
        editorTexto.setText(texto);
    }

    public void writeB6(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "6";
        prevDigit="6";
        acumul+="6";
        editorTexto.setText(texto);
    }

    public void writeBsustract(View view) {
        acumul="";
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))) {
            texto += "-";
            prevDigit="-";
            editorTexto.setText(texto);
        }
    }

    public void writeB1(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "1";
        prevDigit="1";
        acumul+="1";
        editorTexto.setText(texto);
    }

    public void writeB2(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "2";
        prevDigit="2";
        acumul+="2";
        editorTexto.setText(texto);
    }

    public void writeB3(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
        texto += "3";
        prevDigit="3";
        acumul+="3";
        editorTexto.setText(texto);
    }

    public void writeBmulti(View view) {
        acumul="";
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))) {
            texto += "*";
            prevDigit="*";
            editorTexto.setText(texto);
        }
    }

    public void writeBdot(View view) {
        if(!(prevDigit.equals("."))) {
            texto += ".";
            prevDigit = ".";
            acumul += ".";
            editorTexto.setText(texto);
        }
    }

    public void writeB0(View view) {
        if(prevDigit.equals("=")){
            texto="";
            acumul="";
            oper1 = 0.0;
            oper2 = 0.0;
            result = 0.0;
        }
            texto += "0";
            prevDigit = "0";
            acumul += "0";
            editorTexto.setText(texto);
    }

    public void writeBC(View view) {
        texto = "";
        prevDigit = "";
        oper1 = 0.0;
        oper2 = 0.0;
        result = 0.0;
        acumul = "";
        flagEqual = 0;
        editorTexto.setText(texto);
    }

    public void writeBdivide(View view) {
        acumul="";
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))){
            texto += "/";
            prevDigit="/";
            editorTexto.setText(texto);
        }
    }

    public void writeBequal(View view) {
        if (!(texto.equals(""))&&!(prevDigit.equals("+"))&&!(prevDigit.equals("-"))&&!(prevDigit.equals("*"))&&!(prevDigit.equals("/"))&&!(prevDigit.equals("."))&&!(prevDigit.equals("="))) {
            prevDigit="=";
            oper2=Double.parseDouble(acumul);
            result=oper1+oper2;
            texto=Double.toString(result);
            editorTexto.setText(texto);
            acumul=texto;
            flagEqual=0;
        }
    }
}
