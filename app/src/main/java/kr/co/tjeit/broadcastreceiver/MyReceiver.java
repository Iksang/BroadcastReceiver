package kr.co.tjeit.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by tjoeun on 2017-09-14.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        String fileName = intent.getStringExtra("fileName");

        Toast.makeText(context, fileName+"이(가) 다운로드 되었습니다.", Toast.LENGTH_SHORT).show();

    }
}
