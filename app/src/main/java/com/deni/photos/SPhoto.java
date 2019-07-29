package com.dika.photos;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SPhoto extends AppCompatActivity {
    ImageAdapter myImageAdapter;
    ArrayList<String> myList;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphoto);

        String imgPath = this.getIntent().getExtras().getString("Path");
        ImageView iv = (ImageView) findViewById(R.id.singLeimage);
        BitmapFactory.Options myBitmap = new BitmapFactory.Options();
        myBitmap.inJustDecodeBounds=false;
        myBitmap.inSampleSize=4;
        myBitmap.inPurgeable=true;
        Bitmap bitmap = BitmapFactory.decodeFile(imgPath, myBitmap);
        iv.setImageBitmap(bitmap);
    }
}