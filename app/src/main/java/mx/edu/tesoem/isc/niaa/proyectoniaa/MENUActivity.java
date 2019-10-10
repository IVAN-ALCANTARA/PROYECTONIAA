package mx.edu.tesoem.isc.niaa.proyectoniaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MENUActivity extends AppCompatActivity {
    //Button btnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void pantallaI(View v) {
        Intent E=new Intent(this, introduccionActivity.class);
        startActivity(E);
        finish();
    }

    public void pantallaEdge(View v) {
        Intent qE=new Intent(this, EdgeActivity.class);
        startActivity(qE);
        finish();
    }

    public void pantallaShelby(View v) {
        Intent historia=new Intent(this, ShelbyActivity.class);
        startActivity(historia);
        finish();
    }

    public void pantallaFiesta(View v) {
        Intent aplicaciones=new Intent(this, FiestaActivity.class);
        startActivity(aplicaciones);
        finish();
    }

    public void pantallaRaptor(View v) {
        Intent ejemplos=new Intent(this, RaptorActivity.class);
        startActivity(ejemplos);
        finish();
    }

    public void pantallaGt(View v) {
        Intent cat=new Intent(this, GtActivity.class);
        startActivity(cat);
        finish();
    }
    public void pantallaFocus(View v) {
        Intent ap=new Intent(this, FocusActivity.class);
        startActivity(ap);
        finish();
    }
    public void pantallaAcerca(View v) {
        Intent criticas=new Intent(this, AcercaActivity.class);
        startActivity(criticas);
        finish();
    }
}
