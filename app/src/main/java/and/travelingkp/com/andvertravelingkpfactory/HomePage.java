package and.travelingkp.com.andvertravelingkpfactory;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Fragment{

    List<HomeTableModel> homeList;
    RecyclerView recycleView;
    RecycleViewAdapter recycleViewAdapter;
    Button button[];

    SearchView searchbar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View homeView = inflater.inflate(R.layout.home_page, null);


        searchbar = homeView.findViewById(R.id.search_bar);
        homeList = new ArrayList<>();
        recycleView = homeView.findViewById(R.id.mainRV);
        recycleView.setLayoutManager(new LinearLayoutManager(getContext()));


        //table list
        for (int i = 0; i < 5; i++) {
            homeList.add(new HomeTableModel("title" + (i + 1), "desc" + (i + 1)));
        }
        ViewGroup.MarginLayoutParams rcViewParams = (ViewGroup.MarginLayoutParams) recycleView.getLayoutParams();
        rcViewParams.setMarginStart(10);
        recycleViewAdapter = new RecycleViewAdapter(homeList);
        recycleView.setAdapter(recycleViewAdapter);
        recycleView.setLayoutParams(rcViewParams);

        searchbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent searchIntent = new Intent(getActivity(), HomeSearchPage.class);
                startActivity(searchIntent);
            }
        });


        return homeView;
    }
}
