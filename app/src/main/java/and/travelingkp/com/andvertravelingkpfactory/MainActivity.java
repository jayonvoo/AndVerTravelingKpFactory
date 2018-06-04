package and.travelingkp.com.andvertravelingkpfactory;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintSet;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ConstraintSet set;
    List<HomeTableModel> homeList;
    LinearLayout.LayoutParams params, gridParams;
    LinearLayout linearLayout;
    GridView gridView;
    GridViewAdapter gridViewAdapter;
    RecyclerView recycleView;
    RecycleViewAdapter recycleViewAdapter;
    Button button[];
    ImageButton imgBtn[];
    LayoutInflater layoutInflater;
    View v;
    BottomNavigationView navigationView;

    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = layoutInflater.inflate(R.layout.header_bar, null);
        homeList = new ArrayList<>();
        linearLayout = v.findViewById(R.id.ll01);
        gridView = (GridView) findViewById(R.id.grid01);
        recycleView = (RecyclerView) findViewById(R.id.mainRV);

        recycleView.setLayoutManager(new LinearLayoutManager(this));

        params = new LinearLayout.LayoutParams(100, 50);
        params.setMarginStart(10);

        button = new Button[10];
        imgBtn = new ImageButton[8];


        //table list
        for (int i = 0; i < 5; i++) {

            homeList.add(new HomeTableModel("title" + (i + 1), "desc" + (i + 1)));
        }
        ViewGroup.MarginLayoutParams rcViewParams = (ViewGroup.MarginLayoutParams) recycleView.getLayoutParams();
        rcViewParams.setMarginStart(10);
        recycleViewAdapter = new RecycleViewAdapter(homeList, this);
        recycleView.setAdapter(recycleViewAdapter);
        recycleView.setLayoutParams(rcViewParams);


    }
}

