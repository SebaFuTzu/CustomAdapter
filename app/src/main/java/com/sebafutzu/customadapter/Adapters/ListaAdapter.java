package com.sebafutzu.customadapter.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import com.sebafutzu.customadapter.Entidades.ItemLista;
import com.sebafutzu.customadapter.R;

/**
 * Created by SebaFuTzu on 20-02-2018.
 */

public class ListaAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ItemLista> items;
    private View view;
    private TextView id;
    private TextView nombre;
    private ImageView imagen;
    private ListView lvItemsLista;

    public ListaAdapter(Context context, ArrayList<ItemLista> items, ListView lvItemsLista) {
        this.context = context;
        this.items = items;
        this.lvItemsLista = lvItemsLista;
    }

    public int getCount() {
        return items.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public void clearItems(){
        items.clear();
        notifyDataSetChanged();
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        //View view;
        if (convertView == null) {
            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.fila_listar_item, null);
        } else {
            view = convertView;
        }

        ItemLista item = items.get(position);

        id = (TextView) view.findViewById(R.id.txtIdLista);
        id.setText(item.getId() + "");

        nombre = (TextView) view.findViewById(R.id.txtNombreLista);
        nombre.setText(item.getNombre());

        imagen = (ImageView) view.findViewById(R.id.imgIconoLista);
        switch (item.getImagen()) {
            case 0:
                imagen.setBackgroundResource(R.mipmap.icono_blue);
                break;
            case 1:
                imagen.setBackgroundResource(R.mipmap.icono_red);
                break;
            case 2:
                imagen.setBackgroundResource(R.mipmap.icono_green);
                break;
            default:
                imagen.setBackgroundResource(R.mipmap.icono_blue);
                break;
        }

        //Acción del item
        lvItemsLista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id){
                Toast.makeText(context, "Item Lista: "+items.get(pos).getNombre(),Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
