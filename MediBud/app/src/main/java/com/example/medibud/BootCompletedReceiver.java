//Developed By Renick. Open Source.

package com.example.medibud;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootCompletedReceiver extends BroadcastReceiver
{
  @Override
  public void onReceive(Context context, Intent intent)
  {
    // just create AlarmListAdapter and it will load alarms and start them
    new AlarmListAdapter(context);
  }
}

