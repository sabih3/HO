package ae.netaq.homesorder.screens.splash;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import ae.netaq.homesorder.R;
import ae.netaq.homesorder.utils.NavigationController;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class ScreenSplash extends AppCompatActivity implements SplashView{

    private SplashPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_screen_splash);

        presenter = new SplashPresenter(this);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                NavigationController.showMainScreen(ScreenSplash.this);
            }
        },5000);
    }

}
