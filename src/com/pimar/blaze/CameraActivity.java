package com.pimar.blaze;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import java.io.FileOutputStream;
import android.view.View.MeasureSpec;

public class CameraActivity extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cameraactivity);
	}
	
	public void onStart()
	{
		super.onStart();	
	    TextView textview = (TextView) findViewById(R.id.hellotext);
		//View v1 = getWindow().getDecorView().findViewById(android.R.id.content);
	    textview.setDrawingCacheEnabled(true);
	    
	    textview.measure(MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED), MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED)); textview.layout(0, 0, textview.getMeasuredWidth(), textview.getMeasuredHeight()); 
	    
	    textview.buildDrawingCache();	   	   
	    Bitmap bitmap = textview.getDrawingCache();
		textview.setDrawingCacheEnabled(false);
		
		if (bitmap == null)
		{
			System.out.println("hell no"); 
		}
		else
		{
			System.out.println("hell yes"); 
		}
		ImageView img = (ImageView) findViewById(R.id.image1);		
		img.setImageBitmap(bitmap);	
		//Drawable bitDrawable = new BitmapDrawable(getResources(),bitmap);
		//img.setBackground(bitDrawable);				
		
		/*try {
		       FileOutputStream out = new FileOutputStream("screenie");
		       bitmap.compress(Bitmap.CompressFormat.PNG, 90, out);
		} catch (Exception e) {
		       e.printStackTrace();
		}*/		
		
	}

	@Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

	    setDrawingCacheEnabled(true); // cache
	}
	
}
