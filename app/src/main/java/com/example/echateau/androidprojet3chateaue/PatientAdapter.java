package com.example.echateau.androidprojet3chateaue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by echateau on 11/03/2015.
 */
public class PatientAdapter extends BaseAdapter{

    private List<Patient> listPatient;
    private LayoutInflater layoutInflater;
    public PatientAdapter(Context context, List<Patient> vListPatient) {
        layoutInflater = LayoutInflater.from(context);
        listPatient = vListPatient;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
