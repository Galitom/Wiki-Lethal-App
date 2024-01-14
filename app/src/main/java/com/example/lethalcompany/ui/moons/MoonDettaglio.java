package com.example.lethalcompany.ui.moons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.lethalcompany.R;
import com.example.lethalcompany.ui.moons.placeholder.Moon;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class MoonDettaglio extends AppCompatActivity {

    boolean click = true;

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

        TextView layout = findViewById(R.id.moonLayout);
        layout.setText(moon.getDefaultLayout());

        TextView difficulty = findViewById(R.id.moonDifficolty);
        difficulty.setText(moon.getDifficulty());

        TextView minScrap = findViewById(R.id.moonScrap);
        minScrap.setText(moon.getMinScrap()+" - "+moon.getMaxScrap());

        TextView weather = findViewById(R.id.moonWeather);
        weather.setText(moon.getWeather());


        ImageView map = findViewById(R.id.moonMap);
        Picasso.get().load(moon.getFoto()).into(map);

//        map.setOnClickListener(v -> {
//            if(this.click){
//                v.setLayoutParams(new RelativeLayout.LayoutParams(
//                        RelativeLayout.LayoutParams.MATCH_PARENT,
//                        RelativeLayout.LayoutParams.MATCH_PARENT
//                ));
//            }else{
//                v.setLayoutParams(new RelativeLayout.LayoutParams(
//                        80,80
//                ));
//
//            }
//            this.click = !this.click;
//
//        });

        Button btn1 = findViewById(R.id.moonBack);
        btn1.setOnClickListener(v -> {
            finish();
        });



//        ImageView foto = findViewById(R.id.moonImage);
//        foto.setImageURI(moon.getFoto());


    }
}