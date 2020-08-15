package com.vspna.mobilekeyboard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Connect extends AsyncTask<String, Void, String> {

    Activity activity;
    CoordinatorLayout coordinatorLayout;

    public Connect(Activity activity) {
        this.activity = activity;
    }

    @SuppressLint("WrongThread")
    @Override
    protected String doInBackground(String... voids) {
        Socket socket;
        PrintWriter printWriter;
        String status;

        try {
            socket = new Socket(voids[0],6000);
            printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.write("Connected");
            printWriter.flush();
            printWriter.close();
            socket.close();
            status = "Connected";
            activity.startActivity(new Intent(activity,KeyboardActivity.class).putExtra("IPAddress",voids[0]));
            activity.finish();
        } catch (IOException e) {
            e.printStackTrace();
            status = "Error";
        }

        return status;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if (s.equals("Error")) {
            Toast.makeText(activity, "Connection Failed", Toast.LENGTH_SHORT).show();
        }
    }
}
