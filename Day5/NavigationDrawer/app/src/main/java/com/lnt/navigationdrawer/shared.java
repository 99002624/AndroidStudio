package com.lnt.navigationdrawer;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link shared#newInstance} factory method to
 * create an instance of this fragment.
 */
public class shared extends Fragment {

    Button save,ret,clear,but;
    EditText name,pass;
    SharedPreferences shared1;

    public static final String mypreference123 = "myperf" ;
    public static final String NAME="namekey";
    public static final String VALUE="value";



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public shared() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment shared.
     */
    // TODO: Rename and change types and number of parameters
    public static shared newInstance(String param1, String param2) {
        shared fragment = new shared();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            //Button save =(Button) getView().findViewById(R.id.save);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         save =(Button) view.findViewById(R.id.save);
         ret =(Button) view.findViewById(R.id.retrive);
         clear =(Button) view.findViewById(R.id.clear);
         but =(Button) view.findViewById(R.id.button2234);
          name=(EditText) view.findViewById(R.id.editTextTextPersonName);
         pass=(EditText) view.findViewById(R.id.password);
        shared1=  getActivity().getSharedPreferences(mypreference123,Context.MODE_PRIVATE);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = name.getText().toString();
                String n = pass.getText().toString();
                SharedPreferences.Editor editor = shared1.edit();
                editor.putString(NAME,e);
                editor.putString(VALUE,n);
                editor.commit();
            }
        });

        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(shared1.contains(NAME)){

                    name.setText(shared1.getString(NAME,""));
                }
                if(shared1.contains(VALUE)){

                    pass.setText(shared1.getString(VALUE,""));
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                pass.setText("");

            }
        });


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NavController nav = Navigation.findNavController(v);
                nav.navigate(R.id.action_shared_to_internalStoreage1);


            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shared, container, false);
    }
}