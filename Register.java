package com.bowling.edward.bowling;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {
    Button registerButton;
    EditText pword, email, confirmPword;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;
    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference("server/saving-data/fireblog");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        registerButton =  findViewById(R.id.registerButton);
        mAuth = FirebaseAuth.getInstance();

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });
    }

    public void Register() {
        String rPword, rEmail, rConfirmPword;
        email = findViewById(R.id.rEmail);
        pword = findViewById(R.id.rPword);
        confirmPword = findViewById(R.id.rPword2);

        rPword = pword.getText().toString();
        rEmail = email.getText().toString();
        rConfirmPword = confirmPword.getText().toString();

        if (rPword.equals(rConfirmPword)) {
            mAuth.createUserWithEmailAndPassword(rEmail, rPword).addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (!task.isSuccessful()) {
                        Toast.makeText(getApplicationContext(), "Register Unnsuccessful", Toast.LENGTH_SHORT).show();
                    } else {
                        String user_id = mAuth.getCurrentUser().getUid();
                        DatabaseReference current_user_db = FirebaseDatabase.getInstance().getReference().child("users").child(user_id);
                        current_user_db.setValue(true);
                        Intent i = new Intent(Register.this, Homepage.class);
                        startActivity(i);
                        finish();
                    }
                }
            });

        }
        else {
            Toast.makeText(getApplicationContext(), "Passwords must match", Toast.LENGTH_SHORT).show();
        }
    }



}
