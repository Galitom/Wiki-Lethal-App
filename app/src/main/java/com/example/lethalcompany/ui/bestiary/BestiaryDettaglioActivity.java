package com.example.lethalcompany.ui.bestiary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lethalcompany.R;
import com.example.lethalcompany.ui.bestiary.placeholder.Bestiary;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class BestiaryDettaglioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestiary_dettaglio);

        Bestiary bestiary = getIntent().getSerializableExtra("bestiary",Bestiary.class);

        TextView nome = findViewById(R.id.bestiaryName);
        nome.setText(bestiary.getName());

        TextView info = findViewById(R.id.bestiaryInfo);
        info.setText(bestiary.getInfo());

        ImageView foto = findViewById(R.id.bestiaryImg);
        Picasso.get().load(bestiary.getFoto()).into(foto);

        Button back = findViewById(R.id.backBestiary);
        back.setOnClickListener(v -> {
            finish();
        });

    }
}