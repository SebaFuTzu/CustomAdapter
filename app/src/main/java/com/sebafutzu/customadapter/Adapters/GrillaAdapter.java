package com.sebafutzu.customadapter.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.sebafutzu.customadapter.Entidades.ItemLista;
import com.sebafutzu.customadapter.R;

import java.util.ArrayList;

import static com.sebafutzu.customadapter.R.id.lvItemsLista;

/**
 * Created by SebaFuTzu on 20-02-2018.
 */

public class GrillaAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ItemLista> items;
    private View view;
    private TextView nombre;
    private LinearLayout imagen;
    private GridView gvItemsLista;

    public GrillaAdapter(Context context, ArrayList<ItemLista> items, GridView gvItemsLista) {
        this.context = context;
        this.items = items;
        this.gvItemsLista = gvItemsLista;
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
            view = li.inflate(R.layout.item_grilla, null);
        } else {
            view = convertView;
        }

        ItemLista item = items.get(position);

        nombre = (TextView) view.findViewById(R.id.txtNombreGrilla);
        nombre.setText(item.getNombre());

        imagen = (LinearLayout) view.findViewById(R.id.llItemGrilla);
        switch (item.getImagen()) {
            case 0:
                imagen.setBackgroundResource(R.mipmap.boton_azul);
                break;
            case 1:
                imagen.setBackgroundResource(R.mipmap.boton_red);
                break;
            case 2:
                imagen.setBackgroundResource(R.mipmap.boton_yellow);
                break;
            default:
                imagen.setBackgroundResource(R.mipmap.boton_azul);
                break;
        }

        //Acción del item
        gvItemsLista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id){
                Toast.makeText(context, "Item Grilla: "+items.get(pos).getNombre(),Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}