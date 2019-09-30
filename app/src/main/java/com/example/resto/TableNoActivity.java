package com.example.resto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TableNoActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner table;
    Button next;
    int pos = 0;
    DatabaseReference reff;
    int tableno;
    public static final String tableNumber = "com.example.resto.tableNumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_no);

        table = findViewById(R.id.spinner);
        next = findViewById(R.id.button_next);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.TableNo,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        table.setAdapter(adapter);
        table.setOnItemSelectedListener(this);
        reff = FirebaseDatabase.getInstance().getReference().child("Table");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (pos == table.getSelectedItemPosition())
                {
                    Toast.makeText(getApplicationContext(),"Please Select Table Number!",Toast.LENGTH_SHORT).show();
                }
                else{
                    String tNo = table.getSelectedItem().toString();

                    Intent intent = new Intent (TableNoActivity.this, MenuActivity.class);
                    intent.putExtra(tableNumber, tNo);
                    startActivity(intent);

                }


            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView , View view, int i, long l) {
        //String text =  adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
