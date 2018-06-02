package and.travelingkp.com.andvertravelingkpfactory;

import android.annotation.SuppressLint;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.constraint.Constraints;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import static java.lang.System.in;
import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {


    ConstraintSet set;
    LinearLayout.LayoutParams params;
    LinearLayout linearLayout;
    GridView gridView;
    Button button[];
    ImageButton imgBtn[];

    @SuppressLint({"SetTextI18n", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.ll01);
        gridView = (GridView) findViewById(R.id.grid01);

        params = new LinearLayout.LayoutParams(100, 50);
        params.setMarginStart(10);

        button = new Button[10];
        imgBtn = new ImageButton[8];

        //top_tag_bar
        for (int i = 0; i < 4; i++) {

            button[i] = new Button(this);
            button[i].setText("button" + i);
            button[i].setTag("button" + i);
            button[i].setTextSize(10);
            button[i].setLayoutParams(params);


            out.println("Tag:" + button[i].getTag());

            linearLayout.addView(button[i]);

        }

        for (int i = 0; i < 8; i++) {

            imgBtn[i] = new ImageButton(this);

            //gridView.setAdapter();
        }

        /*
        constraintLayout = (ConstraintLayout) findViewById(R.id.mainConstraint);
        set = new ConstraintSet();

        Button btn = new Button(this);
        btn.setId(View.generateViewId());
        btn.setText("new btn");
        constraintLayout.addView(btn);
        set.clone(constraintLayout);
        set.connect(btn.getId(), ConstraintSet.LEFT, R.id.button, ConstraintSet.RIGHT);
        //set.connect(btn.getId(), ConstraintSet.RIGHT, R.id.parent, ConstraintSet.RIGHT);
        set.connect(btn.getId(), ConstraintSet.TOP, R.id.toolbar2, ConstraintSet.TOP);
        set.connect(btn.getId(), ConstraintSet.BOTTOM, R.id.toolbar2, ConstraintSet.BOTTOM);
        set.applyTo(constraintLayout);
*/
    }
}
