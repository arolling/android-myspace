package com.epicodus.myspaceclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.content.Context;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageUri = "https://images.unsplash.com/photo-1446426156356-92b664d86b77?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&s=92e96949ac731e7cbcac943aa5934554";
        ImageView ivBackgroundImage = (ImageView) findViewById(R.id.imageViewBackground);
        Picasso.with(this).load(imageUri).into(ivBackgroundImage);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           public void onItemClick(AdapterView<?> parent, View v, int position, long id){
               Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
           }
        });
    }
}
