package polinema.ac.id.dtschapter03_starter.MainPage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.dtschapter03_starter.R;
import polinema.ac.id.dtschapter03_starter.WelcomActivity;

public class WelcomeSlideAssign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_assign);
    }

    public void welcomeSlide(View view){
        startActivity(new Intent(WelcomeSlideAssign.this, WelcomeBack.class));
    }

    public void assignLogin(View view){
        startActivity(new Intent(WelcomeSlideAssign.this, WelcomeBack.class));
    }
}