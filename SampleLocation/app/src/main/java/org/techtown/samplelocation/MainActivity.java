package org.techtown.samplelocation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import com.yanzhenjie.permission.Action;
import com.yanzhenjie.permission.AndPermission;
import com.yanzhenjie.permission.runtime.Permission;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                location();
            }
        });

        AndPermission.with(this)
                .runtime()
                .permission(
                        Permission.ACCESS_FINE_LOCATION,
                        Permission.ACCESS_COARSE_LOCATION)
                .onGranted(new Action<List<String>>() {
                    // Storage permission are allowed.
                    public void onAction(List<String> permissions){
                        showToast("허용된 권한 개수 : " + permissions.size());
                    }
                })
                .onDenied(new Action<List<String>>() {
                    public void onAction(List<String> permissions){
                        showToast("거부된 권한 개수 : " + permissions.size());
                    }
                    // Storage permission are not allowed.
                })
                .start();
    }

    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }


    public void location (){

        LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        try {
            Location location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if (location != null) {
                double latitue = location.getLatitude();
                double longitude = location.getLongitude();
                String message = "Latitude : " + latitue + "\n Longitude : " + longitude;

                textView.setText(message);
            }

            GPSListener gpsListener = new GPSListener();
            long minTime = 10000;
            float minDistance = 0;

            manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, minTime, minDistance, gpsListener);
            Toast.makeText(getApplicationContext(), "내 위치확인 요청함", Toast.LENGTH_SHORT).show();

        }
        catch (SecurityException e){
            e.printStackTrace();

            textView.setText("Failed");

        }

    }


    class GPSListener implements LocationListener{
        public void onLocationChanged(Location location){
            double latitue = location.getLatitude();
            double longitude = location.getLongitude();
            String message = "Latitude : " + latitue + "\n Longitude : " + longitude;

            textView.setText(message);
        }

        public void onProviderDisabled(String provider){}

        public void onProviderEnabled(String provider){}

        public void onStatusChanged(String provider, int status, Bundle extras){}

    }


}