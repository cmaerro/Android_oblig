package com.android.carina.tecnologoandroid.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.carina.tecnologoandroid.R;


public class FragmentConfiguracion extends Fragment {

    private static final String ITEM_SELECCIONADO = "key_title";

    public FragmentConfiguracion() {
        // Required empty public constructor
    }

    public static FragmentConfiguracion newInstance(String titulo) {
        FragmentConfiguracion fragmentConfiguracion= new FragmentConfiguracion();
        Bundle args = new Bundle();
        args.putString(ITEM_SELECCIONADO, titulo);
        fragmentConfiguracion.setArguments(args);

        return fragmentConfiguracion;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_configuracion, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String opcion_seleccionada = getArguments().getString(ITEM_SELECCIONADO);
        ((TextView) view.findViewById(R.id.opcion_seleccionada)).setText(opcion_seleccionada);
    }

}
