package com.vspna.mobilekeyboard;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SendMessage extends AsyncTask<String,Void,Void> {
    @SuppressLint("WrongThread")
    @Override
    protected Void doInBackground(String... voids) {
        Socket socket;
        PrintWriter printWriter;

        try {
            socket = new Socket(voids[0],6000);
            printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.write(voids[1]);
            printWriter.flush();
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
