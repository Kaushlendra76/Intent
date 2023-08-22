package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText name, password;
    String name1, password1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.btnlogin);
        name = (EditText) findViewById(R.id.enametxt);
        password = (EditText) findViewById(R.id.epasstxt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name1 = name.getText().toString();
                password1 = password.getText().toString();

                if(name1.equals("Rishu") && password1.equals("rishu@123")){
                    Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                    i.putExtra(  "username", name.getText().toString());
                    startActivity(i);

                }
                else {
                    Toast.makeText(getApplicationContext(),  "Invalid user id or password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}