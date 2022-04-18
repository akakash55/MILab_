package com.gaurav.bhag.loginform;

import static com.gaurav.bhag.loginform.MainActivity.users;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class LoginDialog extends DialogFragment {
    Button submit;
    EditText username,password;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        LayoutInflater inflater=getActivity().getLayoutInflater();
        View loginform=inflater.inflate(R.layout.login_form,null);
        submit=loginform.findViewById(R.id.submit);
        username=loginform.findViewById(R.id.username);
        password=loginform.findViewById(R.id.password);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int check=0;
                for(User u: users)
                {
                    if(u.getUsername().compareTo(username.getText().toString())==0 && u.getPassword().compareTo(password.getText().toString())==0)
                    {
                        check=1;
                        break;
                    }
                }
                if(check==1)
                {
                    Toast.makeText(getActivity(),"Successfull",Toast.LENGTH_LONG).show();
                    dismiss();
                }
                else
                {
                    username.setText("");
                    password.setText("");
                    Toast.makeText(getActivity(),"Unsuccessfull",Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.setView(loginform);
        return builder.create();

    }
}
