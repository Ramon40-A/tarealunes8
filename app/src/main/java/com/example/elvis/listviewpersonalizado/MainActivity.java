package com.example.elvis.listviewpersonalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvItems;
    private Adaptador adaptador;
    private ArrayList<Entidad> arrayEntidad = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = (ListView) findViewById(R.id.lvItems);

        llenarItems();
    }

    private void llenarItems(){
        arrayEntidad.add(new Entidad(R.drawable.pintura01, "El Código Da Vinci", "Con más de ochenta millones de ejemplares vendidos, es una de las novelas más leídas de todos los tiempos, un fenómeno mundial que convirtió a Dan Brown en el maestro absoluto del thriller. "));
        arrayEntidad.add(new Entidad(R.drawable.pintura02, "El libro de las almas", "La novela del autor de La biblioteca de los muertos plantea un nuevo y aún más estremecedor reto: encontrar un libro que revela el destino último de la humanidad. ¿Qué harías si conocieras la fecha del fin del mundo?"));
        arrayEntidad.add(new Entidad(R.drawable.pintura03, "Las hijas de la tierra", "«Hay algo que los hombres ansían más que el dinero: el poder. Algunos lo tienen, otros sueñan con él antes de dormir, y otros lo combaten. "));
       // arrayEntidad.add(new Entidad(R.drawable.pintura04, "Pintura Rupestre", "Dibujo o voceto que existe en algunas rocas de cavernas"));
        //arrayEntidad.add(new Entidad(R.drawable.pintura05, "El Angelus", "Pintura más conocida de Jean-Francois Millet"));

        adaptador = new Adaptador(this, arrayEntidad);
        lvItems.setAdapter(adaptador);
    }
}
