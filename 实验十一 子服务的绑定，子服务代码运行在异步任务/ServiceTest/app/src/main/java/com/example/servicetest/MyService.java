package com.example.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private DownloadBinder mBinder =new DownloadBinder();
    class DownloadBinder  extends Binder{
        public void startDownlaod(){
            Log.d("MyService","startDownload executed");
        }
        public int getProgress(){
            Log.d("MyService","getProgress executed");
            return 0;
        }
    }
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;

    }
    @Override
    public void onCreate(){
        super.onCreate();
        Log.d("Myservice","onCreate executed");
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.d("Myservice","onStartCommand executed");
        return super.onStartCommand(intent, flags,startId);
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("Myservice","onDestroy executed");
    }


}
