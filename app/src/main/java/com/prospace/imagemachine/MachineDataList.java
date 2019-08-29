package com.prospace.imagemachine;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.prospace.imagemachine.adapter.MachineDataAdapter;
import com.prospace.imagemachine.model.MachineDataModel;

import java.util.ArrayList;

public class MachineDataList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_data_list);


        final MachineDataModel[] data_tempat = new MachineDataModel[]
                {
                        new MachineDataModel(R.drawable.mac1, "Tea Bag machine", "76c6u756ux64", "Automatic", "872364", "13-March-2019"),
                        new MachineDataModel(R.drawable.mac2, "Paper Bag machine", "o86e6disy", "Automatic", "2489876", "14-March-2019"),
                        new MachineDataModel(R.drawable.mac3, "AT-09 Machine", "i6uyraus6d4", "Manual", "626379334", "15-March-2019"),
                        new MachineDataModel(R.drawable.mac4, "Fish Fillet machine", "07urtewcbk", "Automatic", "9741953", "16-March-2019"),
                        new MachineDataModel(R.drawable.mac5, "AB-N012 machine", "v677645453", "Manual", "53982117", "17-March-2019")
                };


        // Deklarasi Adapter untuk ListView
        MachineDataAdapter adapter = new MachineDataAdapter(this,
                R.layout.adapter_data_list, data_tempat);

        // Deklarasi komponen ListView
        // Serta memberi ListView adapter untuk menampilkan data
        ListView listView = (ListView)findViewById(R.id.menu_item);
        listView.setAdapter(adapter);

    }

    public static Intent getActIntent(Activity activity){
        return new Intent(activity, MachineDataList.class);
    }


}
