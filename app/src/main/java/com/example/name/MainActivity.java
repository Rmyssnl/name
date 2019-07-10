package com.example.name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView14;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView14= findViewById(R.id.imageView14);
        editText4= findViewById(R.id.editText4);
        editText5= findViewById(R.id.editText5);
        editText6= findViewById(R.id.editText6);
        editText7= findViewById(R.id.editText7);
        button2= findViewById(R.id.button2);

    }


    public void changeactivity(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("Name", editText4.getText().toString());
        startActivity(intent);
    }
}
