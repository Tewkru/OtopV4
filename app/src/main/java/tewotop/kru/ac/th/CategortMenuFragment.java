package tewotop.kru.ac.th;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategortMenuFragment extends Fragment implements View.OnClickListener {
    private Button menu1Button, menu2Button, menu3Button, menu4Button, menu5Button;


    public CategortMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


//Ininial
        menu1Button = getView().findViewById(R.id.imvMenu1);
//        menu2Button = getView().findViewById(R.id.imvMenu2);
//        menu3Button = getView().findViewById(R.id.imvMenu3);
//        menu4Button = getView().findViewById(R.id.imvMenu4);
//        menu5Button = getView().findViewById(R.id.imvMenu5);
//
//        menu1Button.setOnClickListener(this);
//        menu2Button.setOnClickListener(this);
//        menu3Button.setOnClickListener(this);
//        menu4Button.setOnClickListener(this);
//        menu5Button.setOnClickListener(this);


        // Main Main Mthod
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categort_menu, container, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imvMenu1:
                showlistView(0);
                break;
            case R.id.imvMenu2:
                showlistView(1);
                break;
            case R.id.imvMenu3:
                showlistView(2);
                break;
            case R.id.imvMenu4:
                showlistView(3);
                break;
            case R.id.imvMenu5:
                showlistView(4);
                break;
        }


    }

    private void showlistView(int i) {

    }
}
