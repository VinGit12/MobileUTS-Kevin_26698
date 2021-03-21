package id.ac.umn.musicuts.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.umn.musicuts.MusicApp.MainMusicActivity;
import id.ac.umn.musicuts.R;

public class LoginActivity extends AppCompatActivity {

    private EditText Uname;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Uname = (EditText) findViewById(R.id.etUname);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Uname.getText().toString().equals("uasmobile") &&
                        Password.getText().toString().equals("uasmobilegenap")) {
                    startActivity(new Intent(LoginActivity.this, MainMusicActivity.class));
                }
            }
        });
    }
}