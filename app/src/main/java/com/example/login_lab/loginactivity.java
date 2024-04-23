/*package com.example.login_lab;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_loginactivity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}*/
package com.example.login_lab;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {
    EditText emailEditText,passwordEditText;
    Button login_btn;
    int counter=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        emailEditText=(EditText)findViewById(R.id.EmaileditText);
        passwordEditText=(EditText)findViewById(R.id.passEditText);
        login_btn=(Button)findViewById(R.id.loginBtn);
        String registeredEmail = getIntent().getStringExtra("email");
        String registeredPassword= getIntent().getStringExtra("password");
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                if(registeredEmail.equals(email) &&
                        registeredPassword.equals(password))
                {
                    Intent intent= new Intent(loginactivity.this,Loginsuccessactivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(loginactivity.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                }
                counter--;
                if(counter==0){
                    Toast.makeText(getBaseContext(),"failed to login attempts",Toast.LENGTH_SHORT).show();
                    login_btn.setEnabled(false);
                }
            }
        });
    }
}