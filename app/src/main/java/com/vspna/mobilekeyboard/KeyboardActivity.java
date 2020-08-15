package com.vspna.mobilekeyboard;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.charset.StandardCharsets;

public class KeyboardActivity extends AppCompatActivity implements View.OnTouchListener {

    private Button ESC, F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, F12, PRINTSCREEN, DELETE, INSERT, PAUSE;
    private Button BACK_QUOTE, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, ZERO, MINUS, EQUALS, BACK_SPACE, HOME;
    private Button TAB, Q, W, E, r, T, Y, U, I, O, P, OPEN_BRACKET, CLOSE_BRACKET, BACK_SLASH, PAGE_UP;
    private Button CAPS_LOCK, A, S, D, F, G, H, J, K, L, SEMICOLON, QUOTE, ENTER, PAGE_DOWN;
    private Button SHIFT1, Z, X, C, V, B, N, M, COMMA, PERIOD, SLASH, SHIFT2, UP, END;
    private Button CONTROL1, WINDOW1, ALT, SPACE, ALT_GRAPH, WINDOW2, CONTEXT_MENU, CONTROL2, LEFT, DOWN, RIGHT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);

        ESC = findViewById(R.id.ESC);
        F1 = findViewById(R.id.F1);
        F2 = findViewById(R.id.F2);
        F3 = findViewById(R.id.F3);
        F4 = findViewById(R.id.F4);
        F5 = findViewById(R.id.F5);
        F6 = findViewById(R.id.F6);
        F7 = findViewById(R.id.F7);
        F8 = findViewById(R.id.F8);
        F9 = findViewById(R.id.F9);
        F10 = findViewById(R.id.F10);
        F11 = findViewById(R.id.F11);
        F12 = findViewById(R.id.F12);
        PRINTSCREEN = findViewById(R.id.PRINTSCREEN);
        DELETE = findViewById(R.id.DELETE);
        INSERT = findViewById(R.id.INSERT);
        PAUSE = findViewById(R.id.PAUSE);

        BACK_QUOTE = findViewById(R.id.BACK_QUOTE);
        ONE = findViewById(R.id.ONE);
        TWO = findViewById(R.id.TWO);
        THREE = findViewById(R.id.THREE);
        FOUR = findViewById(R.id.FOUR);
        FIVE = findViewById(R.id.FIVE);
        SIX = findViewById(R.id.SIX);
        SEVEN = findViewById(R.id.SEVEN);
        EIGHT = findViewById(R.id.EIGHT);
        NINE = findViewById(R.id.NINE);
        ZERO = findViewById(R.id.ZERO);
        MINUS = findViewById(R.id.MINUS);
        EQUALS = findViewById(R.id.EQUALS);
        BACK_SPACE = findViewById(R.id.BACK_SPACE);
        HOME = findViewById(R.id.HOME);

        TAB = findViewById(R.id.TAB);
        Q = findViewById(R.id.Q);
        W = findViewById(R.id.W);
        E = findViewById(R.id.E);
        r = findViewById(R.id.R);
        T = findViewById(R.id.T);
        Y = findViewById(R.id.Y);
        U = findViewById(R.id.U);
        I = findViewById(R.id.I);
        O = findViewById(R.id.O);
        P = findViewById(R.id.P);
        OPEN_BRACKET = findViewById(R.id.OPEN_BRACKET);
        CLOSE_BRACKET = findViewById(R.id.CLOSE_BRACKET);
        BACK_SLASH = findViewById(R.id.BACK_SLASH);
        PAGE_UP = findViewById(R.id.PAGE_UP);

        CAPS_LOCK = findViewById(R.id.CAPS_LOCK);
        A = findViewById(R.id.A);
        S = findViewById(R.id.S);
        D = findViewById(R.id.D);
        F = findViewById(R.id.F);
        G = findViewById(R.id.G);
        H = findViewById(R.id.H);
        J = findViewById(R.id.J);
        K = findViewById(R.id.K);
        L = findViewById(R.id.L);
        SEMICOLON = findViewById(R.id.SEMICOLON);
        QUOTE = findViewById(R.id.QUOTE);
        ENTER = findViewById(R.id.ENTER);
        PAGE_DOWN = findViewById(R.id.PAGE_DOWN);

        SHIFT1 = findViewById(R.id.SHIFT1);
        Z = findViewById(R.id.Z);
        X = findViewById(R.id.X);
        C = findViewById(R.id.C);
        V = findViewById(R.id.V);
        B = findViewById(R.id.B);
        N = findViewById(R.id.N);
        M = findViewById(R.id.M);
        COMMA = findViewById(R.id.COMMA);
        PERIOD = findViewById(R.id.PERIOD);
        SLASH = findViewById(R.id.SLASH);
        SHIFT2 = findViewById(R.id.SHIFT2);
        UP = findViewById(R.id.UP);
        END = findViewById(R.id.END);

        CONTROL1 = findViewById(R.id.CONTROL1);
        WINDOW1 = findViewById(R.id.WINDOW1);
        ALT = findViewById(R.id.ALT);
        SPACE = findViewById(R.id.SPACE);
        ALT_GRAPH = findViewById(R.id.ALT_GRAPH);
        WINDOW2 = findViewById(R.id.WINDOW2);
        CONTEXT_MENU = findViewById(R.id.CONTEXT_MENU);
        CONTROL2 = findViewById(R.id.CONTROL2);
        LEFT = findViewById(R.id.LEFT);
        DOWN = findViewById(R.id.DOWN);
        RIGHT = findViewById(R.id.RIGHT);

        ESC.setOnTouchListener(this);
        F1.setOnTouchListener(this);
        F2.setOnTouchListener(this);
        F3.setOnTouchListener(this);
        F4.setOnTouchListener(this);
        F5.setOnTouchListener(this);
        F6.setOnTouchListener(this);
        F7.setOnTouchListener(this);
        F8.setOnTouchListener(this);
        F9.setOnTouchListener(this);
        F10.setOnTouchListener(this);
        F11.setOnTouchListener(this);
        F12.setOnTouchListener(this);
        PRINTSCREEN.setOnTouchListener(this);
        DELETE.setOnTouchListener(this);
        INSERT.setOnTouchListener(this);
        PAUSE.setOnTouchListener(this);

        BACK_QUOTE.setOnTouchListener(this);
        ONE.setOnTouchListener(this);
        TWO.setOnTouchListener(this);
        THREE.setOnTouchListener(this);
        FOUR.setOnTouchListener(this);
        FIVE.setOnTouchListener(this);
        SIX.setOnTouchListener(this);
        SEVEN.setOnTouchListener(this);
        EIGHT.setOnTouchListener(this);
        NINE.setOnTouchListener(this);
        ZERO.setOnTouchListener(this);
        MINUS.setOnTouchListener(this);
        EQUALS.setOnTouchListener(this);
        BACK_SPACE.setOnTouchListener(this);
        HOME.setOnTouchListener(this);

        TAB.setOnTouchListener(this);
        Q.setOnTouchListener(this);
        W.setOnTouchListener(this);
        E.setOnTouchListener(this);
        r.setOnTouchListener(this);
        T.setOnTouchListener(this);
        Y.setOnTouchListener(this);
        U.setOnTouchListener(this);
        I.setOnTouchListener(this);
        O.setOnTouchListener(this);
        P.setOnTouchListener(this);
        OPEN_BRACKET.setOnTouchListener(this);
        CLOSE_BRACKET.setOnTouchListener(this);
        BACK_SLASH.setOnTouchListener(this);
        PAGE_UP.setOnTouchListener(this);

        CAPS_LOCK.setOnTouchListener(this);
        A.setOnTouchListener(this);
        S.setOnTouchListener(this);
        D.setOnTouchListener(this);
        F.setOnTouchListener(this);
        G.setOnTouchListener(this);
        H.setOnTouchListener(this);
        J.setOnTouchListener(this);
        K.setOnTouchListener(this);
        L.setOnTouchListener(this);
        SEMICOLON.setOnTouchListener(this);
        QUOTE.setOnTouchListener(this);
        ENTER.setOnTouchListener(this);
        PAGE_DOWN.setOnTouchListener(this);

        SHIFT1.setOnTouchListener(this);
        Z.setOnTouchListener(this);
        X.setOnTouchListener(this);
        C.setOnTouchListener(this);
        V.setOnTouchListener(this);
        B.setOnTouchListener(this);
        N.setOnTouchListener(this);
        M.setOnTouchListener(this);
        COMMA.setOnTouchListener(this);
        PERIOD.setOnTouchListener(this);
        SLASH.setOnTouchListener(this);
        SHIFT2.setOnTouchListener(this);
        UP.setOnTouchListener(this);
        END.setOnTouchListener(this);

        CONTROL1.setOnTouchListener(this);
        WINDOW1.setOnTouchListener(this);
        ALT.setOnTouchListener(this);
        SPACE.setOnTouchListener(this);
        ALT_GRAPH.setOnTouchListener(this);
        WINDOW2.setOnTouchListener(this);
        CONTEXT_MENU.setOnTouchListener(this);
        CONTROL2.setOnTouchListener(this);
        LEFT.setOnTouchListener(this);
        DOWN.setOnTouchListener(this);
        RIGHT.setOnTouchListener(this);

    }

    private void sendData(String ipAddress, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.execute(ipAddress, s);
    }

    private String StringToAscii(View view) {
        String id = view.getResources().getResourceName(view.getId());
        String[] temp = id.split("/");
        if (temp[1].length() == 1) {
            byte[] bytes = temp[1].getBytes(StandardCharsets.US_ASCII);
            return String.valueOf(bytes[0]);
        } else {
            return GetAscii(temp[1]);
        }
    }

    private String GetAscii(String val) {
        String ascii = null;
        switch (val) {
            case "ESC":
                ascii = "27";
                break;
            case "F1":
                ascii = "112";
                break;
            case "F2":
                ascii = "113";
                break;
            case "F3":
                ascii = "114";
                break;
            case "F4":
                ascii = "115";
                break;
            case "F5":
                ascii = "116";
                break;
            case "F6":
                ascii = "117";
                break;
            case "F7":
                ascii = "118";
                break;
            case "F8":
                ascii = "119";
                break;
            case "F9":
                ascii = "120";
                break;
            case "F10":
                ascii = "121";
                break;
            case "F11":
                ascii = "122";
                break;
            case "F12":
                ascii = "123";
                break;
            case "PRINTSCREEN":
                ascii = "154";
                break;
            case "DELETE":
                ascii = "127";
                break;
            case "INSERT":
                ascii = "155";
                break;
            case "PAUSE":
                ascii = "19";
                break;
            case "BACK_QUOTE":
                    ascii = "192";
                break;
            case "ONE":
                    ascii = "49";
                break;
            case "TWO":
                    ascii = "50";
                break;
            case "THREE":
                    ascii = "51";
                break;
            case "FOUR":
                    ascii = "52";
                break;
            case "FIVE":
                    ascii = "53";
                break;
            case "SIX":
                    ascii = "54";
                break;
            case "SEVEN":
                    ascii = "55";
                break;
            case "EIGHT":
                    ascii = "56";
                break;
            case "NINE":
                    ascii = "57";
                break;
            case "ZERO":
                    ascii = "48";
                break;
            case "MINUS":
                    ascii = "45";
                break;
            case "EQUALS":
                    ascii = "61";
                break;
            case "BACK_SPACE":
                    ascii = "8";
                break;
            case "HOME":
                    ascii = "36";
                break;
            case "TAB":
                ascii = "9";
                break;
            case "OPEN_BRACKET":
                    ascii = "91";
                break;
            case "CLOSE_BRACKET":
                    ascii = "93";
                break;
            case "BACK_SLASH":
                    ascii = "92";
                break;
            case "PAGE_UP":
                ascii = "33";
                break;
            case "CAPS_LOCK":
                ascii = "20";
                break;
            case "SEMICOLON":
                    ascii = "59";
                break;
            case "QUOTE":
                    ascii = "222";
                break;
            case "ENTER":
                ascii = "10";
                break;
            case "PAGE_DOWN":
                ascii = "34";
                break;
            case "SHIFT1":
                ascii = "16";
                break;
            case "COMMA":
                    ascii = "44";
                break;
            case "PERIOD":
                    ascii = "46";
                break;
            case "SLASH":
                    ascii = "47";
                break;
            case "SHIFT2":
                ascii = "16";
                break;
            case "UP":
                ascii = "38";
                break;
            case "END":
                ascii = "35";
                break;
            case "CONTROL1":
                ascii = "17";
                break;
            case "WINDOW1":
                ascii = "524";
                break;
            case "ALT":
                ascii = "18";
                break;
            case "SPACE":
                ascii = "32";
                break;
            case "ALT_GRAPH":
                ascii = "65406";
                break;
            case "WINDOW2":
                ascii = "524";
                break;
            case "CONTEXT_MENU":
                ascii = "525";
                break;
            case "CONTROL2":
                ascii = "17";
                break;
            case "LEFT":
                ascii = "37";
                break;
            case "DOWN":
                ascii = "40";
                break;
            case "RIGHT":
                ascii = "39";
                break;
        }
        return ascii;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("PRESSED : ", StringToAscii(view));
                sendData(getIntent().getExtras().getString("IPAddress"), "Press=" + StringToAscii(view));
                break;
            case MotionEvent.ACTION_UP:
                Log.i("RELEASED : ", StringToAscii(view));
                sendData(getIntent().getExtras().getString("IPAddress"), "Release=" + StringToAscii(view));
                break;
        }
        return false;
    }
}

