package com.example.dell_inspiron.sendmessage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {



@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_message);

    Intent Extra = getIntent();
    String textView = Extra.getStringExtra("NAME");

    TextView Name = (TextView) findViewById(R.id.UserOutput);
    Name.setText(textView);

String textView = Extra.getStringExtra("AGE");

    TextView Age = (TextView) findViewById(R.id.UserOutput);
    Age.setText(textView);

String textView = Extra.getStringExtra("BIO");

    TextView Bio = (TextView) findViewById(R.id.UserOutput);
    Bio.setText(textView);

String textView = Extra.getStringExtra("MOBILE NUMBER");

    TextView MobileNumber = (TextView) findViewById(R.id.UserOutput);
    MobileNumber.setText(textView);

String textView = Extra.getStringExtra("LOCATION");

    TextView Location = (TextView) findViewById(R.id.UserOutput);
    Location.setText(textView);



    final Button button = (Button) findViewById(R.id.button2);
    button.setOnClickListener(new View.OnClickListener()

    {
        public void onClick(View v) {
            launchActivity();

        }
    });
}

private void launchActivity() {

    Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);
}

}