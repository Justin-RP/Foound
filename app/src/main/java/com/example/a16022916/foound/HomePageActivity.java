package com.example.a16022916.foound;

import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HomePageActivity extends AppCompatActivity {
    FloatingActionButton editButton, map, button, edit;
    EditText editTitle;
    TextView textBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        editTitle = findViewById(R.id.editTitle);
        textBox = findViewById(R.id.textBoxView);
        editButton = findViewById(R.id.editTitleButton);
        map = findViewById(R.id.mapButton);
        button = findViewById(R.id.biikenButton);

        //Edit Title Button
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //for input
                LayoutInflater inflater =
                        (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input, null);

                // Obtain the UI component in the input.xml layout
                final EditText name = viewDialog.findViewById(R.id.editText);
                final EditText date = viewDialog.findViewById(R.id.editText2);
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(HomePageActivity.this);

                // Set the view of the dialog
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Change title");

                myBuilder.setPositiveButton("Save", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // Extract the Text entered by the user
                        String takeName = name.getText().toString();
                        String takeDate = date.getText().toString();
                        String message = "Name: " + takeName + "\n" + "Date: " + takeDate;
                        // Update the Text to Edit
                        editTitle.setText(message);
                    }
                });
                myBuilder.setNegativeButton("Cancel", null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();

            }
        });
    }
}
