package com.school.malumewezingane;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {
    LinearLayout layout,btnLogin;

    EditText edtusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtusername =  findViewById(R.id.Logusername);
        btnLogin =  findViewById(R.id.btnlogin);
        layout =  findViewById(R.id.cat_lay);
        layout.getBackground().setAlpha(143);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtusername.getText().toString().equalsIgnoreCase("driver")){
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                }else
                    if(edtusername.getText().toString().equalsIgnoreCase("parent")){
                        startActivity(new Intent(LoginActivity.this,ParentActivity.class));
                    }

            }
        });
    }
}