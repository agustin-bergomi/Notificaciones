package com.agustinbergomi.notificaciones;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_1_ID = "channel1";
    public static final String CHANNEL_2_ID = "channel2";
    TextView aaa;
    private NotificationManagerCompat notificationManager;
    private EditText editTextTitle;
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationManager = NotificationManagerCompat.from(this);

        editTextTitle = findViewById(R.id.edit_text_title);
        editTextMessage = findViewById(R.id.edit_text_message);

        aaa = (TextView) findViewById(R.id.a);

        aaa.setText("asdasds");

    }

    public void sendOnChannel1(View v){
        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Notification notification = new NotificationCompat.Builder(this, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_1)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManager.notify(1,notification);
    }

    public void sendOnChannel2(View v){
        String title = editTextTitle.getText().toString();
        String message = editTextMessage.getText().toString();

        Notification notification = new NotificationCompat.Builder(this, CHANNEL_2_ID)
                .setSmallIcon(R.drawable.ic_2)
                .setContentTitle(title)
                .setContentText(message)
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .build();

        notificationManager.notify(2,notification);
    }
}