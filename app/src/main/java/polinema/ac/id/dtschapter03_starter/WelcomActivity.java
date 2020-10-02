package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import polinema.ac.id.dtschapter03_starter.MainPage.WelcomeBack;
import polinema.ac.id.dtschapter03_starter.MainPage.WelcomeSlideAssign;
import polinema.ac.id.dtschapter03_starter.MainPage.WelcomeSlideSuperHero;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
    }

    public void ClickGetStarted(View view){
        startActivity(new Intent(WelcomActivity.this, WelcomeSlideSuperHero.class));
    }

    public void clickLogin(View view){
        startActivity(new Intent(WelcomActivity.this, WelcomeBack.class));
    }

    public void ContactUs(View view){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"dts@polinema.co.id"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Testing");
        i.putExtra(Intent.EXTRA_TEXT, "Email percobaan");
        startActivity(i.createChooser(i, "select"));
    }
}