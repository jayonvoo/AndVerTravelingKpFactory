package and.travelingkp.com.andvertravelingkpfactory;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {

    List<HomeTableModel> homeList;
    RecyclerView recycleView;
    RecycleViewAdapter recycleViewAdapter;
    Button button[];
    BottomNavigationView navigationView;
    SearchView searchbar;


    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchbar = findViewById(R.id.search_bar);
        navigationView = findViewById(R.id.navigation);
        homeList = new ArrayList<>();
        recycleView = findViewById(R.id.mainRV);
        recycleView.setLayoutManager(new LinearLayoutManager(this));


        //table list
        for (int i = 0; i < 5; i++) {
            homeList.add(new HomeTableModel("title" + (i + 1), "desc" + (i + 1)));
        }
        ViewGroup.MarginLayoutParams rcViewParams = (ViewGroup.MarginLayoutParams) recycleView.getLayoutParams();
        rcViewParams.setMarginStart(10);
        recycleViewAdapter = new RecycleViewAdapter(homeList);
        recycleView.setAdapter(recycleViewAdapter);
        recycleView.setLayoutParams(rcViewParams);


        //searchbar.setOnClickListener(this);

        //navigation click to page listener
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {
                    case R.id.homepage:

                        out.println("首頁");
                        break;

                    case R.id.destination:

                        out.println("目的地");
                        break;

                    case R.id.shop:
                        out.println("隨行商店");
                        break;

                    case R.id.personal:
                        out.println("個人");
                        break;

                    default:
                        return false;
                }
                return true;
            }
        });
    }
}

