package polinema.ac.id.dtschapter03_starter.newWalkthrough;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import polinema.ac.id.dtschapter03_starter.MainPage.WelcomeBack;
import polinema.ac.id.dtschapter03_starter.R;

public class IntroActivity extends AppCompatActivity {

    private ViewPager viewPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabIndicator;
    int position = 0;
    List<ScreenItems> mlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        tabIndicator = findViewById(R.id.tabIndicator);

        mlist = new ArrayList<>();
        mlist.add(new ScreenItems("Welcome to DTS VSGA", "Whats Is Going To Happen Tomorrow?", R.drawable.ic_eventlist, R.drawable.bg_red));
        mlist.add(new ScreenItems("Work Happens", "task and assign them to colleagues", R.drawable.ic_superhero, R.drawable.bg_blue));
        mlist.add(new ScreenItems("Tasks and Assign", "Get notified when work happens", R.drawable.ic_assign, R.drawable.bg_purple));

        viewPager = findViewById(R.id.view);
        introViewPagerAdapter = new IntroViewPagerAdapter(this, mlist);
        viewPager.setAdapter(introViewPagerAdapter);


        tabIndicator.setupWithViewPager(viewPager);

    }

    public void click(View view){
        position = viewPager.getCurrentItem();
        if (position < mlist.size()){
            position++;
            viewPager.setCurrentItem(position);
            if (position == 3){
                startActivity(new Intent(IntroActivity.this, WelcomeBack.class));
            }
        }
    }

    public void lg(View view){
        startActivity(new Intent(IntroActivity.this, WelcomeBack.class));
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