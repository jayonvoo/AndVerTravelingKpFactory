package and.travelingkp.com.andvertravelingkpfactory;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class PersonPage extends Fragment{

    PersonalRecycleView RvAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View personView = inflater.inflate(R.layout.person_page, null);

        ImageButton imgBtnLeft = personView.findViewById(R.id.imageButton2),
        imageButtonRight = personView.findViewById(R.id.imageButton3),
        imageButtonUname = personView.findViewById(R.id.imageButton4);

        TextView txtViewTitle = personView.findViewById(R.id.textView),
        textviewUname = personView.findViewById(R.id.textView3);

        RecyclerView personRV = personView.findViewById(R.id.personalRV);
        personRV.setLayoutManager(new LinearLayoutManager(getContext()));

        personRV.setAdapter(new PersonalRecycleView());

        return personView;
    }
}
