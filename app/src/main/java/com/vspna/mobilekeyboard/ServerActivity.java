package com.vspna.mobilekeyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ServerActivity extends AppCompatActivity {

    private EditText ServerIpAddress;
    private Button Connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);

        ServerIpAddress = findViewById(R.id.ServerIpAddress);
        Connect = findViewById(R.id.Connect);

        Connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ServerIpAddress.getText().toString().isEmpty()) {
                    Toast.makeText(ServerActivity.this, "Server Ip Address Required", Toast.LENGTH_SHORT).show();
                } else {
                    Connect connect = new Connect(ServerActivity.this);
                    connect.execute(ServerIpAddress.getText().toString());
                }
            }
        });

    }

}
