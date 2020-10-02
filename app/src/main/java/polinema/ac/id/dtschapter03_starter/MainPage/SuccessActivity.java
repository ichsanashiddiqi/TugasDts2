package polinema.ac.id.dtschapter03_starter.MainPage;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import polinema.ac.id.dtschapter03_starter.MainActivity;
import polinema.ac.id.dtschapter03_starter.R;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SuccessActivity.this, MainPageActivity.class);
                startActivity(i);
                finish();
            }
        }, 1500);
    }
}