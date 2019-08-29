package com.prospace.imagemachine.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.prospace.imagemachine.MachineDataDetail;
import com.prospace.imagemachine.MainActivity;
import com.prospace.imagemachine.R;
import com.prospace.imagemachine.model.MachineDataModel;
import com.prospace.imagemachine.MachineDataList;

import java.util.ArrayList;
import java.util.List;

////////////////////////////////////////////
//             Model Adapter              //
//      Adapter Custom untuk ListView     //
//              Version 1.0               //
//            Denny Pradipta              //
////////////////////////////////////////////

public class MachineDataAdapter extends ArrayAdapter<MachineDataModel>{

    private ArrayList<MachineDataModel> daftarBarang;
    Context context;
    int layoutResourceId;
    MachineDataModel data[] = null;



    // Constructor ModelAdaptor
    public MachineDataAdapter(Context context, int layoutResourceId, MachineDataModel[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    // Method untuk membuat layout pada ListView
    public View getView(final int position, View convertView, ViewGroup parent) {
        View row = convertView;
        TempatHolder holder = null;

        // Jika tidak ada View...
        if(row == null)
        {
            // View dibuat terlebih dahulu
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            // Deklarasi komponen-komponen yang ada di View
            holder = new TempatHolder();
            holder.nama = (TextView)row.findViewById(R.id.machine_name);
            holder.tipe = (TextView)row.findViewById(R.id.machine_type);
            holder.klik = (LinearLayout)row.findViewById(R.id.grid_1_menu);

            // Memberi tag pada View
            row.setTag(holder);
        }
        else
        {
            // Jika ada, cukup ambil tag-nya saja
            holder = (TempatHolder)row.getTag();
        }

        // Mengisi nilai-nilai komponen
        // Seperti gambar, nama, alamat, dan lain-lain
        final MachineDataModel tempat = data[position];
        holder.nama.setText(tempat.nama);
        holder.tipe.setText(tempat.tipe);
        holder.klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, MachineDataDetail.class);
                intent.putExtra("nama", tempat.nama);
                intent.putExtra("tipe", tempat.tipe);
                intent.putExtra("id", tempat.id);
                intent.putExtra("QR", tempat.QR);
                intent.putExtra("date", tempat.date);
                intent.putExtra("gambar", tempat.gambar);

                context.startActivity(intent);

            }
        });

        return row;
    }

    // Class untuk komponen-komponen untuk variabel row
    static class TempatHolder
    {
        LinearLayout klik;
        TextView nama, tipe ;
    }

}

