package com.example.lethalcompany.ui.moons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lethalcompany.R;
import com.example.lethalcompany.ui.moons.placeholder.Moon;

public class MoonDettaglio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon_dettaglio);

        Moon moon = getIntent().getSerializableExtra("moon", Moon.class);


        TextView titolo = findViewById(R.id.moonTitolo);
        titolo.setText(moon.getName());

        TextView costo = findViewById(R.id.moonCosto);
        costo.setText(""+moon.getCost());

        TextView risk = findViewById(R.id.moonRisk);
        risk.setText(moon.getRisk());

        Button btn1 = findViewById(R.id.moonBack);
        btn1.setOnClickListener(v -> {
            finish();
        });

//        ImageView foto = findViewById(R.id.moonImage);
//        foto.setImageURI(moon.getFoto());


    }
}