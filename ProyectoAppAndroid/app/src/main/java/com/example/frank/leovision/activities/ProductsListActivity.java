package com.example.frank.leovision.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.frank.leovision.R;
import com.example.frank.leovision.generals.Settings;
import com.example.frank.leovision.models.Productos;

import java.util.ArrayList;

public class ProductsListActivity extends AppCompatActivity {
    ListView listViewProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_list);
        listViewProducts = (ListView) findViewById(R.id.listViewProducts);

        ArrayList<Productos> items = Productos.getProductsAsString();

        ArrayAdapter<Productos> itemsAdapter =
                new ArrayAdapter<Productos>(this, android.R.layout.simple_list_item_1, items);

        listViewProducts.setAdapter(itemsAdapter);

        listViewProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                Productos selItem = (Productos) adapter.getItemAtPosition(position);
                if ( selItem != null ) {
                    Intent o = new Intent(ProductsListActivity.this, ProductActivity.class);
                    o.putExtra("productId", selItem.getId());

                    startActivity(o);
                    Log.d(Settings.DEBUG, "La aplicacion dijo: " + selItem.getName());
                }
            }
        });
    }
    @Override
    public void onResume(){
        super.onResume();
        Intent myIntent = getIntent();
        String statusRequest = myIntent.getStringExtra("status");
        if (statusRequest != null && !statusRequest.isEmpty() ) {
            Toast.makeText(this,"Oops", Toast.LENGTH_SHORT).show();
        }
        // put your code here...

    }


}
