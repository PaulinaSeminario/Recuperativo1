package cl.ipvg.recuperativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent intent = new Intent(InicioActivity.this, DireccionActivity.class);
            startActivity(intent);
            }
        }, 5000);
    }


}