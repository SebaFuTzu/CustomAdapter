package com.sebafutzu.customadapter.GUI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

import com.sebafutzu.customadapter.Adapters.GrillaAdapter;
import com.sebafutzu.customadapter.Adapters.ListaAdapter;
import com.sebafutzu.customadapter.Entidades.ItemLista;
import com.sebafutzu.customadapter.R;

import java.util.ArrayList;

import static com.sebafutzu.customadapter.R.id.lvItemsLista;

public class Grilla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grilla);

        llenarGrilla();
    }

    //Adapter llena el grid view con los datos del método obtenerLista
    public void llenarGrilla(){
        GridView gvItemsGrilla = (GridView) findViewById(R.id.gvItemsGrilla);
        GrillaAdapter adapter = new GrillaAdapter(this, obtenerLista(), gvItemsGrilla);
        gvItemsGrilla.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    //Método que llena un ArrayList con items
    public ArrayList<ItemLista> obtenerLista(){
        ArrayList<ItemLista> lista = new ArrayList<ItemLista>();
        ItemLista item1 = new ItemLista(0,"Seba Fu Tzu", true, 0);
        ItemLista item2 = new ItemLista(1,"Jennifer Lawrence", true, 1);
        ItemLista item3 = new ItemLista(2,"Scarlett Johansson", true, 1);
        ItemLista item4 = new ItemLista(3,"George Lucas", true, 2);
        ItemLista item5 = new ItemLista(4,"Frank Sinatra", true, 0);
        ItemLista item6 = new ItemLista(5,"Tomas Anderson", true, 1);
        ItemLista item7 = new ItemLista(6,"Jesucristo", true, 2);
        ItemLista item8 = new ItemLista(7,"Lucifer", true, 1);
        ItemLista item9 = new ItemLista(8,"Cleopatra", true, 0);
        ItemLista item10 = new ItemLista(9,"Marilyn Monroe", true, 0);
        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
        lista.add(item4);
        lista.add(item5);
        lista.add(item6);
        lista.add(item7);
        lista.add(item8);
        lista.add(item9);
        lista.add(item10);
        return lista;
    }
}
