package and.travelingkp.com.andvertravelingkpfactory;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import static java.lang.System.out;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<HomeTableModel> homeTableModelList;

    RecycleViewAdapter(List<HomeTableModel> homeTableModelList) {
        this.homeTableModelList = homeTableModelList;
    }


    @SuppressLint("SetTextI18n")
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType) {
            case 0:

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(100, 50);
                params.setMarginStart(10);
                Button[] button = new Button[10];
                View headerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_bar, parent, false);
                LinearLayout linearLayout = headerView.findViewById(R.id.ll01);

                //top_tag_bar
                for (int i = 0; i < 4; i++) {

                    button[i] = new Button(parent.getContext());
                    button[i].setText("button" + i);
                    button[i].setTag("button" + i);
                    button[i].setTextSize(10);
                    button[i].setLayoutParams(params);

                    out.println("Tag:" + button[i].getTag());
                    linearLayout.addView(button[i]);
                }

                return new HomeFirstHeaderBar(headerView);


            case 1:

                ImageButton[] imgBtn = new ImageButton[8];
                View inflateGridView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_row, parent, false);
                GridView gridView = inflateGridView.findViewById(R.id.grid01);

                //imgButton
                for (int i = 0; i < 8; i++) {
                    imgBtn[i] = new ImageButton(parent.getContext());
                }

                LinearLayout.LayoutParams gridParams = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                GridViewAdapter gridViewAdapter = new GridViewAdapter(imgBtn);
                gridView.setAdapter(gridViewAdapter);
                gridView.setLayoutParams(gridParams);

                return new HomeGridView(inflateGridView);

            case 2:

                View footerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.footer_bar, parent, false);

                return new FooterView(footerView);

            default:
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_table, parent, false);
                return new HomeTableViewHolder(v);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        switch (position) {
            case 0:

                break;

            case 1:
                break;

            case 2:
                break;

            default:

                position -= 3;

                ((HomeTableViewHolder) holder).titleView.setText(homeTableModelList.get(position).getTitle());
                ((HomeTableViewHolder) holder).descView.setText(homeTableModelList.get(position).getDesc());
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


    @Override
    public int getItemCount() {

        return homeTableModelList.size() + 3;

    }

    //first header bar
    class HomeFirstHeaderBar extends RecyclerView.ViewHolder {

        HomeFirstHeaderBar(View itemView) {
            super(itemView);
        }
    }

    //home grid view
    class HomeGridView extends RecyclerView.ViewHolder {

        HomeGridView(View itemView) {
            super(itemView);
        }
    }

    //footer view
    class FooterView extends RecyclerView.ViewHolder {
        FooterView(View itemView) {
            super(itemView);
        }
    }

    //home fourth table
    class HomeTableViewHolder extends RecyclerView.ViewHolder {

        TextView titleView;
        TextView descView;
        TextView dateView;
        ImageView imageView;

        HomeTableViewHolder(View itemView) {
            super(itemView);

            titleView = (TextView) itemView.findViewById(R.id.titleView);
            descView = (TextView) itemView.findViewById(R.id.descView);
            dateView = (TextView) itemView.findViewById(R.id.dateView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);

        }
    }
}
