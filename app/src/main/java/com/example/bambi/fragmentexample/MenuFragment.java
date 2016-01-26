package com.example.bambi.fragmentexample;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Bambi on 2016/01/26.
 */
public class MenuFragment extends ListFragment {
    String[] titles = {"friends","dogs","cats"};
    String[] numbers = {"1","2","3"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, titles);
        setListAdapter(adapter);

        return view;
    }

    @Override
    public void onListItemClick(ListView lv, View v, int position, long id){
        DetailFragment df = (DetailFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        df.change("title:"+titles[position],"number:"+numbers[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}
