package com.example.reddy.textwatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText user,pass;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        btn=findViewById(R.id.btn);

            user.addTextChangedListener(txtwatcher);
            pass.addTextChangedListener(txtwatcher);

    }
    private TextWatcher txtwatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String username=user.getText().toString().trim();
            String password=pass.getText().toString().trim();
            btn.setEnabled(!username.isEmpty()&&!password.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
