package cl.ipvg.recuperativo1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaActivity extends AppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener {

    EditText txtlatitud, txtlongitud;
    GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);

        txtlatitud = findViewById(R.id.txtlatitud);
        txtlongitud = findViewById(R.id.txtlongitud);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        this.mMap.setOnMapClickListener(this);
        this.mMap.setOnMapLongClickListener(this);
        LatLng chillan = new LatLng(-36.60664, -72.10344);
        LatLng temuco = new LatLng(-38.73965, -72.59842);
        LatLng concepcion = new LatLng(-36.82699, -73.04977);
        LatLng santiago = new LatLng(-33.45694, -70.64827);
        mMap.addMarker(new MarkerOptions().position(chillan).title("Yo"));
        mMap.addMarker(new MarkerOptions().position(temuco).title("Temuco"));
        mMap.addMarker(new MarkerOptions().position(concepcion).title("Concepcion"));
        mMap.addMarker(new MarkerOptions().position(santiago).title("Santiago de Chile"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(chillan));
    }

    @Override
    public void onMapClick(@NonNull LatLng latLng) {
        txtlatitud.setText("" + latLng.latitude);
        txtlongitud.setText("" + latLng.longitude);
    }

    @Override
    public void onMapLongClick(@NonNull LatLng latLng) {
        txtlatitud.setText("" + latLng.latitude);
        txtlongitud.setText("" + latLng.longitude);
    }
}