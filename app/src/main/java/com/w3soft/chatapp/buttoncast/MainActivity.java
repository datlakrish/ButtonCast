package com.w3soft.chatapp.buttoncast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etText;
    private TextView tvText;
    private Button btnSubmit;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etText = findViewById(R.id.etText);
        tvText = findViewById(R.id.tvText);
        btnSubmit = findViewById(R.id.btnSubmit);
        layout = findViewById(R.id.linear);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = etText.getText().toString().trim();

                final String[] index = name.split("");
                tvText.setText(name);
                for (int i = 1; i <= name.length(); i++) {

                    Button btn = new Button(getApplicationContext());
                    btn.setId(i);
                    final int id = btn.getId();
                    btn.setText(index[id]);
                    layout.addView(btn);

                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                         
                        }

                    });
                }

            }
        });

    }
}
