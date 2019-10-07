package daya.npplants.aplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button btnRegistroPaciente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnRegistroPaciente = findViewById(R.id.btnRegistroPaciente);

        btnRegistroPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volverReg = new Intent(Registro.this, MainActivity.class);
                startActivity(volverReg);
            }
        });

    }
}
