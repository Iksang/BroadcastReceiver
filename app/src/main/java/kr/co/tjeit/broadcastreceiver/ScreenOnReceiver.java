package kr.co.tjeit.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by tjoeun on 2017-09-14.
 */

public class ScreenOnReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "화면이 켜짐!!", Toast.LENGTH_SHORT).show();
    }
}
