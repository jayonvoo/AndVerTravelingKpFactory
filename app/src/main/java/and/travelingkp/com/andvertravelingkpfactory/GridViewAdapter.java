package and.travelingkp.com.andvertravelingkpfactory;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;

//Horizontal button
public class GridViewAdapter extends BaseAdapter {

    private ImageButton imgBtn[];

    public GridViewAdapter(ImageButton imgBtn[]) {
        this.imgBtn = imgBtn;
    }

    @Override
    public int getCount() {
        return imgBtn.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        imgBtn[position].setLayoutParams(new LinearLayout.LayoutParams(50, 50));
        return imgBtn[position];
    }
}