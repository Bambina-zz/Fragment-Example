package com.example.bambi.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Bambi on 2016/01/26.
 */
public class DetailFragment extends Fragment {
    TextView title, number;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.detail_fragment, container, false);
        title = (TextView) view.findViewById(R.id.title);
        number = (TextView) view.findViewById(R.id.number);
        return view;
    }

    public void change(String text1, String text2){
        title.setText(text1);
        number.setText(text2);
    }
}
