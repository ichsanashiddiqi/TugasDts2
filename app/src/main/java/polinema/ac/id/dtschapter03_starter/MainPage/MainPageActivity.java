package polinema.ac.id.dtschapter03_starter.MainPage;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import polinema.ac.id.dtschapter03_starter.MainActivity;
import polinema.ac.id.dtschapter03_starter.R;
import polinema.ac.id.dtschapter03_starter.WelcomActivity;
import polinema.ac.id.dtschapter03_starter.newWalkthrough.IntroActivity;
import polinema.ac.id.dtschapter03_starter.newWalkthrough.IntroViewPagerAdapter;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i = new Intent(MainPageActivity.this, IntroActivity.class);
//                startActivity(i);
//                finish();
//            }
//        }, 1000);
    }
}