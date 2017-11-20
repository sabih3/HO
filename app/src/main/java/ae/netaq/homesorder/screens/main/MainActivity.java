package ae.netaq.homesorder.screens.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.crashlytics.android.Crashlytics;

import ae.netaq.homesorder.R;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fabric.with(this, new Crashlytics());
    }

    public void forceCrash(View view) {
        throw new RuntimeException("Force Crash");
    }
}
