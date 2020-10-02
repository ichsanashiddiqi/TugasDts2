package polinema.ac.id.dtschapter03_starter.MainPage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import polinema.ac.id.dtschapter03_starter.R;

public class WelcomeBack extends AppCompatActivity {

    Button login;
    EditText editEmail, editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);

        login = findViewById(R.id.login1);
        editEmail = findViewById(R.id.editTextTextEmailAddress);
        editPassword = findViewById(R.id.passwordEditText);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                postLogin(view);
//                passLogin(view);
//                startActivity(new Intent(WelcomeBack.this, MainPageActivity.class));
            }
        });
    }

    public static boolean isValidEmail(CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    public void postLogin(View view){
        if (TextUtils.isEmpty(editEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email tidak boleh kosong", Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(editPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "password tidak boleh kosong", Toast.LENGTH_LONG).show();
        }else if (TextUtils.isEmpty(editEmail.getText().toString().trim()) && TextUtils.isEmpty(editPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email atau password tidak boleh koaong", Toast.LENGTH_LONG).show();
        }

        else if (!isValidEmail(editEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email tidak valid", Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(WelcomeBack.this, SuccessActivity.class);
            startActivity(i);
        }
    }

    public void passLogin(View view){
        if (TextUtils.isEmpty(editPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "password tidak boleh kosong", Toast.LENGTH_LONG).show();
        }
        else if (!isValidEmail(editEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "password tidak valid", Toast.LENGTH_LONG).show();
        }else {
            Intent i = new Intent(WelcomeBack.this, SuccessActivity.class);
            startActivity(i);
        }
    }


    public void forgotPassword(View view){
        startActivity(new Intent(WelcomeBack.this, ForgotPassword.class));
    }
}