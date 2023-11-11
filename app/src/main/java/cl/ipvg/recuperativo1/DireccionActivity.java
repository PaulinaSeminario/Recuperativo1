package cl.ipvg.recuperativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DireccionActivity extends AppCompatActivity {

    Button agregarbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion);
    agregarbutton = (Button) findViewById(R.id.agregarbutton);
    agregarbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(DireccionActivity.this, MapaActivity.class);
            startActivity(i);

        }
    });

    }


}