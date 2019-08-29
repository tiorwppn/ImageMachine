package com.prospace.imagemachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MachineDataDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_data_detail);

        TextView MachineID = (TextView) findViewById(R.id.machineID);
        TextView MachineType = (TextView) findViewById(R.id.machine_type);
        TextView MachineName = (TextView) findViewById(R.id.machine_name);
        TextView MachineQR = (TextView) findViewById(R.id.machine_QR);
        TextView MachineDate = (TextView) findViewById(R.id.machine_Date);
        ImageView ImgTumb = (ImageView)  findViewById(R.id.imageTumb);

        MachineID.setText(getIntent().getStringExtra("id"));
        MachineName.setText(getIntent().getStringExtra("nama"));
        MachineType.setText(getIntent().getStringExtra("tipe"));
        MachineQR.setText(getIntent().getStringExtra("QR"));
        MachineDate.setText(getIntent().getStringExtra("date"));
        //ImgTumb.setImageDrawable(getIntent().getIntExtra("gambar"));

    }
}
