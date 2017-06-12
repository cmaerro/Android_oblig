package com.android.carina.tecnologoandroid.datasource;

import android.content.Context;

import com.android.carina.tecnologoandroid.R;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class ExpandableListDataSource {

    public static Map<String, List<String>> getData(Context context) {
        Map<String, List<String>> expandableListData = new TreeMap<>();

        List<String> menu = Arrays.asList(context.getResources().getStringArray(R.array.menu));

        List<String> gestionar = Arrays.asList(context.getResources().getStringArray(R.array.gestionar));
        List<String> caja = Arrays.asList(context.getResources().getStringArray(R.array.caja));
        List<String> configuracion = Arrays.asList(context.getResources().getStringArray(R.array.configuracion));


        expandableListData.put(menu.get(0), gestionar);
        expandableListData.put(menu.get(1), caja);
        expandableListData.put(menu.get(2), configuracion);
        return expandableListData;
    }
}
