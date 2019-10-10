package mx.edu.tesoem.isc.niaa.proyectoniaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class introduccionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduccion2);
    }
    public void menu(View v) {
        Intent menu=new Intent(this, MENUActivity.class);
        startActivity(menu);
        finish();
    }
}
