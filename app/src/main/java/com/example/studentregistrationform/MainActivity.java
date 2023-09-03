package com.example.studentregistrationform;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText Name, MobileNumber, Address;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.name);
        MobileNumber = findViewById(R.id.MobileNumber);
        Address = findViewById(R.id.address);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input from EditText fields
                String Stu_Name = Name.getText().toString();
                String number = MobileNumber.getText().toString();
                String address = Address.getText().toString();

                //show a toast message
                String message = "Registration successful: Name: "+Stu_Name+"\nMobile: " + number + "\nAddress: "+address;
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}