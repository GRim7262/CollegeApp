package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.collegeapp.notice.UploadNotice;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    CardView uploadNotice, addGalleryImage, addEbook, deleteNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uploadNotice = findViewById(R.id.addNotice);
        addGalleryImage = findViewById(R.id.addGalleryImage);
        addEbook = findViewById(R.id.addEbook);
        deleteNotice = findViewById(R.id.deleteNotice);

        uploadNotice.setOnClickListener(this);
        addGalleryImage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        deleteNotice.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.addNotice:
                Intent intent = new Intent(MainActivity.this, UploadNotice.class);
                startActivity(intent);
                break;

            case R.id.addGalleryImage:
                Intent intent1 = new Intent(MainActivity.this, UploadImage.class);
                startActivity(intent1);
                break;

            case R.id.addEbook:
                Intent intent2 = new Intent(MainActivity.this, UploadPdfActivity.class);
                startActivity(intent2);
                break;

            case R.id.deleteNotice:
                Intent intent3 = new Intent(MainActivity.this, DeleteNoticeActivity.class);
                startActivity(intent3);
                break;
        }
    }
}