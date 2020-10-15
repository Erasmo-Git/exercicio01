package com.example.exercicio01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final EditText editTextTexto = findViewById(R.id.et_text);
//        Button btnMostrar = findViewById(R.id.button01);
//
//        btnMostrar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, editTextTexto.getText(), Toast.LENGTH_LONG).show();
//            }
//        });
}

//    @Override
//    protected void onStart() {
//        super.onStart();
//        EditText editTextTexto = findViewById(R.id.et_text);
//        Toast.makeText(MainActivity.this, editTextTexto.getText(), Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        EditText editTextTexto = findViewById(R.id.et_text);
//        Toast.makeText(MainActivity.this, editTextTexto.getText(), Toast.LENGTH_LONG).show();
//    }
    public void onClicBtnMostrar (View v) {
        EditText editTextTexto = findViewById(R.id.et_text);
        EditText editTextTexto2 = findViewById(R.id.et_text2);
        Toast.makeText( MainActivity.this, "" + editTextTexto.getText() + " " + editTextTexto2.getText(), Toast.LENGTH_LONG).show();
    }
    public void onClicBtnDesfazerDigitacao (View v) {
        EditText editTextTexto = findViewById(R.id.et_text);
        EditText editTextTexto2 = findViewById(R.id.et_text2);
        editTextTexto.setText(" ");
        editTextTexto2.setText(" ");
    }

}