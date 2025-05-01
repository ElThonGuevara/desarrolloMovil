package com.thom.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.thom.myapplication.adapters.ColorAdapter;
import com.thom.myapplication.clases.Color;

import java.util.ArrayList;
import java.util.List;

public class ColorListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_color_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        List<Color> colores = new ArrayList<>();
        colores.add(new Color(1, "Rojo", "#77565b"));
        colores.add(new Color(2, "Verde", "#00FF00"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(4, "Azul", "#f2b8c1"));
        colores.add(new Color(5, "Azul", "#377cc0"));
        colores.add(new Color(6, "Azul", "#004080"));
        colores.add(new Color(3, "Azul", "#699b57"));
        colores.add(new Color(3, "Azul", "#bcb01b"));
        colores.add(new Color(3, "Azul", "#d2c84c"));
        colores.add(new Color(3, "Azul", "#877f18"));
        colores.add(new Color(3, "Azul", "#871886"));
        colores.add(new Color(3, "Azul", "#d470d3"));
        colores.add(new Color(3, "Azul", "#7c047a"));
        colores.add(new Color(3, "Azul", "#ff08fb"));
        colores.add(new Color(3, "Azul", "#2cbdcc"));
        colores.add(new Color(3, "Azul", "#0b8996"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(3, "Azul", "#0000FF"));
        colores.add(new Color(3, "Azul", "#0000FF"));






        RecyclerView rvBasic = findViewById(R.id.rvListColor);
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        rvBasic.setAdapter(new ColorAdapter(colores));

    }
}