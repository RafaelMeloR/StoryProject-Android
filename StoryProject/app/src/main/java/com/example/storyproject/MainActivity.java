package com.example.storyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputNameEditText;
    private EditText inputAgeEditText;
    private EditText inputCityEditText;
    private EditText inputCollegeEditText;
    private EditText inputProfessionEditText;
    private EditText inputAnimalEditText;
    private EditText inputPetNameEditText;
    private TextView storyTextView;
    private Button displayButton;

    private String story;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.display_button);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNameEditText= (EditText) findViewById(R.id.input_name_edit_text);
                name = inputNameEditText.getText().toString();
                story = "There once was a person named "+name;
                inputCityEditText= (EditText) findViewById(R.id.input_city_edit_text);
                story += " who lived in "+inputCityEditText.getText().toString();;
                inputAgeEditText= (EditText) findViewById(R.id.input_age_edit_text);
                story += " At the age of "+ inputAgeEditText.getText().toString();;
                inputCollegeEditText= (EditText) findViewById(R.id.input_college_edit_text);
                story += " "+name+" went to college at "+inputCollegeEditText.getText().toString();
                inputProfessionEditText= (EditText) findViewById(R.id.input_profession_edit_text);
                story += " "+name+" graduated and went to work as "+inputProfessionEditText.getText().toString();
                inputAnimalEditText= (EditText) findViewById(R.id.input_animal_edit_text);
                story += " Then "+name+" adopted a (n) "+ inputAnimalEditText.getText().toString();
                inputPetNameEditText= (EditText) findViewById(R.id.input_pet_name_edit_text);
                story += " named "+inputPetNameEditText.getText().toString()+" they both lived happily ever after.";

                storyTextView = (TextView) findViewById(R.id.story_text_view);
                storyTextView.setText(story);
            }
        });
    }
}