package com.example.aruna.countdowndialog;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by aruna on 12/21/18.
 */

public class CountDownDialog extends DialogFragment {

    private TextView mCountdownView;

    public CountDownDialog(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countdowntimer_dialog, container);
        mCountdownView = (TextView) view.findViewById(R.id.countdownTimer);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        CountDownTimer gameTimer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long l) {
                mCountdownView.setText(""+((int)Math.round(l/1000.0)-1));
            }

            @Override
            public void onFinish() {
                dismiss();
            }
        };
        gameTimer.start();
    }
}
