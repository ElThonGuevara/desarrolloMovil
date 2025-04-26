package com.thom.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.thom.myapplication.adapters.BasicAdapter;
import com.thom.myapplication.clases.Contacto;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        List<Contacto> contactos = new ArrayList<>();
        contactos.add(new Contacto("Juan", 123456789));
        contactos.add(new Contacto("JOse", 123456789));
        contactos.add(new Contacto("Maria", 123456789));
        contactos.add(new Contacto("Beto", 123456789));
        contactos.add(new Contacto("Mario", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));
        contactos.add(new Contacto("Patricio", 123456789));


        RecyclerView rvbasic = findViewById(R.id.rvbasic);
        rvbasic.setLayoutManager(new LinearLayoutManager(this));
        rvbasic.setAdapter(new BasicAdapter(contactos));


    }

}