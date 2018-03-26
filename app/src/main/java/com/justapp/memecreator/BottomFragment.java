package com.justapp.memecreator;

/**
 * Created by shagunbandi on 26/03/18.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomFragment extends Fragment{

    private static TextView topMText;
    private static TextView bottomMText;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);

        topMText = (TextView) view.findViewById(R.id.topMText);
        bottomMText = (TextView) view.findViewById(R.id.bottomMText);

        return view;
    }

    public void setMemeText(String top, String bottom){
        topMText.setText(top);
        bottomMText.setText(bottom);
    }

}
