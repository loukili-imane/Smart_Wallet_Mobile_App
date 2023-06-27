package com.example.SmartWallet_Project.usermoney.ui;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.SmartWallet_Project.R;
import com.example.SmartWallet_Project.usermoney.UserWallet;

public class UserWalletFragment extends DialogFragment implements View.OnClickListener {

    View userWalletView;
    TextView userMoneyTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        userWalletView = inflater.inflate(R.layout.fragment_user_wallet,container,false);

        userMoneyTextView= userWalletView.findViewById(R.id.user_money);
        Button addIncomeButton = userWalletView.findViewById(R.id.close_button);

        userMoneyTextView.setText("MAD "+String.valueOf(UserWallet.getUserMoney()));

        addIncomeButton.setOnClickListener(this);
        return userWalletView;
    }

    @Override
    public void onClick(View view) {
        this.dismiss();
    }
}