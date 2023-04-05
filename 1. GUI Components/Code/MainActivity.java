package com.example.gui;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btnAuthenticate;
    EditText edtUsername, edtPassword;
    ConstraintLayout canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAuthenticate = (Button)findViewById(R.id.btnAuthenticate);
        edtUsername = (EditText)findViewById(R.id.edtUsername);
        edtPassword = (EditText)findViewById(R.id.edtPassword);
        canvas = (ConstraintLayout) findViewById(R.id.canvas);
        btnAuthenticate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = null, password = null;
                username=edtUsername.getText().toString();
                password=edtPassword.getText().toString();
                if(username.equals("Demo") && password.equals("welcome")){
                    Toast.makeText(getApplicationContext(),"User Authenticated",
                            Toast.LENGTH_LONG).show();
                    canvas.setBackgroundResource(R.color.authenticatedColor);
                } else {
                    Toast.makeText(getApplicationContext(),"Please enter correct username or password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}