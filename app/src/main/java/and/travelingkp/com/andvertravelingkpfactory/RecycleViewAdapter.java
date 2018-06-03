package and.travelingkp.com.andvertravelingkpfactory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<HomeTableModel> homeTableModelList;
    Context context;

    public RecycleViewAdapter(List<HomeTableModel> homeTableModelList, Context context) {
        this.homeTableModelList = homeTableModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        switch (viewType) {
            case 0:

                View headerView = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_bar, parent, false);
                return new FirstHeaderBar(headerView);

            default:
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_table, parent, false);
                return new HomeTableViewHolder(v);
        }


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

  /*  @Override
    public void onBindViewHolder(@NonNull HomeTableViewHolder holder, int position) {

        holder.titleView.setText(homeTableModelList.get(position).getTitle());
        holder.descView.setText(homeTableModelList.get(position).getDesc());
    }*/

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }


    @Override
    public int getItemCount() {
        return homeTableModelList.size();
    }

    //first header bar
    class FirstHeaderBar extends RecyclerView.ViewHolder {


        FirstHeaderBar(View itemView) {
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
