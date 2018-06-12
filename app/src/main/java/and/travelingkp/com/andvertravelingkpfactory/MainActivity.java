package and.travelingkp.com.andvertravelingkpfactory;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigationView;

    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new HomePage());

        //navigation click to page listener
        navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.homepage:

                        out.println("首頁");

                        fragment = new HomePage();

                        break;

                    case R.id.destination:

                        out.println("目的地");
                        break;

                    case R.id.shop:

                        fragment = new ShopPage();
                        break;

                    case R.id.personal:

                        fragment = new PersonPage();
                        break;

                    default:
                        return false;
                }

                return loadFragment(fragment);
            }
        });
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

            return true;
        }
        return false;
    }
}

