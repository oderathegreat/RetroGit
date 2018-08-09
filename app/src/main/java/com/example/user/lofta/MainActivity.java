package com.example.user.lofta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputUsername;
    Button login;
    private Intent i;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      inputUsername = findViewById(R.id.edtUsername);
      login = findViewById(R.id.btnSignIn);

      login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              //login logic



              i = new Intent(MainActivity.this, User.class);
              i.putExtra("String_nedeed", inputUsername.getText().toString().trim());
              startActivity(i);

          }
      });




    }
}
