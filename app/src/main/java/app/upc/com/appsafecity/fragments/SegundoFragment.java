package app.upc.com.appsafecity.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import app.upc.com.appsafecity.R;


public class SegundoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_segundo, container, false);

        String[] menuItems = {"Serenazgo","Comisaria 1","Comisaria 2", "Bomberos zona 1"};


        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        ListView listView = (ListView) view.findViewById(R.id.listaTelefonos);

        listView.setAdapter(listViewAdapter);

        return view;
    }

    

}
