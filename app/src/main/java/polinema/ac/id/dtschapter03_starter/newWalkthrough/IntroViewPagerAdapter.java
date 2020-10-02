package polinema.ac.id.dtschapter03_starter.newWalkthrough;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import polinema.ac.id.dtschapter03_starter.R;

public class IntroViewPagerAdapter extends PagerAdapter {
    Context mcontext;
    List<ScreenItems> screenItems;

    public IntroViewPagerAdapter(Context context, List<ScreenItems> itemsList){
        this.mcontext = context;
        this.screenItems = itemsList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutView = inflater.inflate(R.layout.layout_screen, null);

        ImageView imageView = layoutView.findViewById(R.id.Image1);
        ImageView img = layoutView.findViewById(R.id.foreground);
        TextView tittle = layoutView.findViewById(R.id.Text1);
        TextView description = layoutView.findViewById(R.id.Text2);

        tittle.setText(screenItems.get(position).getTittle());
        description.setText(screenItems.get(position).getDescription());
        imageView.setImageResource(screenItems.get(position).getScreenImg());
        img.setImageResource(screenItems.get(position).getForeground());

        container.addView(layoutView);
        return layoutView;
    }


    @Override
    public int getCount() {
        return screenItems.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

}
