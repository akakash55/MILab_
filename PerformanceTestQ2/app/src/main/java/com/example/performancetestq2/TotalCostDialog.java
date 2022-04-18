package com.example.performancetestq2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class TotalCostDialog extends DialogFragment {
    private String message;
    private int cost;
    public TotalCostDialog(String msg,int totalcost) {
        message=msg;
        cost=totalcost;
    }
    TextView selectedTextView,costTextView;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_layout, null);
        builder.setView(view);
        selectedTextView = view.findViewById(R.id.selected);
        costTextView = view.findViewById(R.id.total_cost);
        selectedTextView.setText(message);
        costTextView.setText("Total Cost is: "+String.valueOf(cost));
        builder.setMessage("Your Choices")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dismiss();
                    }
                });
        return builder.create();
    }
}
