//Developed By Renick. Open Source.

package com.example.medibud;

import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class About extends Activity
{
  private TextView mTextView;

  @Override
  protected void onCreate(Bundle bundle)
  {
    super.onCreate(bundle);
    setContentView(R.layout.about);
    LinearLayout ll = (LinearLayout) findViewById(R.id.ll_about);
    WallpaperManager wallpaperManager = WallpaperManager.getInstance(this);
    Drawable wallpaperDrawable = wallpaperManager.getDrawable();
    ll.setBackground(wallpaperDrawable);

    long nextId = DataSource.getInstance(null).getNextId() - 1;

    mTextView = (TextView)findViewById(R.id.alarms_created_text);
    mTextView.setText("Alarms created: " + nextId);
  }
}

