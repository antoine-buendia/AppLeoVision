package com.example.frank.leovision.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.frank.leovision.R;
import com.example.frank.leovision.models.Productos;

public class ProductActivity extends AppCompatActivity {
    Productos productObject;
    TextView productName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        Intent myIntent = getIntent(); // gets the previously created intent
        int _productId = myIntent.getIntExtra(  "productId", 0);

        try {
//            int _productId = Integer.parseInt(productId);
            productObject = Productos.getById(_productId);
        } catch (Exception e) {

        }

        if ( productObject == null ) {
            Intent o = new Intent(ProductActivity.this, ProductsListActivity.class);
            o.putExtra("status", "error");
            startActivity(o);
            finish();
            return;
        }

        productName = (TextView)findViewById(R.id.textViewName);
        productName.setText(productObject.getName());
    }

}
