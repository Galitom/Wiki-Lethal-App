package com.example.lethalcompany.ui.store;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lethalcompany.R;
import com.example.lethalcompany.ui.store.placeholder.StoreItem;
import com.squareup.picasso.Picasso;

public class StoreDettaglioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_dettaglio);

        StoreItem storeItem = getIntent().getSerializableExtra("storeItem", StoreItem.class);

        TextView nome = findViewById(R.id.nameItem);
        nome.setText(storeItem.getName());

        TextView costo = findViewById(R.id.itemCosto);
        costo.setText(""+storeItem.getPrice());

        TextView info = findViewById(R.id.infoItem);
        info.setText(storeItem.getInfo());

        ImageView foto = findViewById(R.id.fotoItem);
        Picasso.get().load(storeItem.getFoto()).into(foto);

        Button back = findViewById(R.id.backStore);
        back.setOnClickListener(v -> {
            finish();
        });

    }
}