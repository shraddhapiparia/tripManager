package android.learn.com.tripmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        /* This calls Login activity class, should be called from login button click*/
        Intent mainIntent = new Intent(WelcomePage.this,TripDetails.class);
        WelcomePage.this.startActivity(mainIntent);
        WelcomePage.this.finish();




    }
}
