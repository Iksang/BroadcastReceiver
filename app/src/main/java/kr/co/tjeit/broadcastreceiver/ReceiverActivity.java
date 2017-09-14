package kr.co.tjeit.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ReceiverActivity extends AppCompatActivity {
    BroadcastReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        BroadcastReceiver screenOnReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context, "앱을 켜둔 상태에서 화면이 다시 열림", Toast.LENGTH_SHORT).show();
            }
        };

        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.SCREEN_ON");

        registerReceiver(screenOnReceiver,intentFilter2);


        mReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String fileName = intent.getStringExtra("fileName");

                Toast.makeText(context, fileName+"이(가) 다운로드 되었습니다. 이는 동적리시버로 수신되었습니다.", Toast.LENGTH_SHORT).show();
            }
        };

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("kr.co.tjeit.broadcast.action.FILE_DOWNLOADED");

        registerReceiver(mReceiver,intentFilter);


    }
}
