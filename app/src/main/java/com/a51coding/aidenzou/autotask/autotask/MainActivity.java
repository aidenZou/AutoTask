package com.a51coding.aidenzou.autotask.autotask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.a51coding.aidenzou.autotask.autotask.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // System.out.println("开始...");
        // Log.d("HelloWorldActivity", "onCreate execute");
    }

    // 启动新的 Activity
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        // 启动 Intent 指定的 DisplayMessageActivity 实例
        startActivity(intent);
    }
}
