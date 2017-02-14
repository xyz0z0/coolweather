package xyz.xyz0z0.coolweather.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import xyz.xyz0z0.coolweather.R;
import xyz.xyz0z0.coolweather.presenter.AboutPresenter;
import xyz.xyz0z0.coolweather.ui.fragment.AboutFragment;

public class AboutActivity extends AppCompatActivity {
    private AboutPresenter aboutPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("关于");
        AboutFragment aboutFragment = new AboutFragment();
        getFragmentManager().beginTransaction().add(R.id.about_fragment_container, aboutFragment).commit();

        aboutPresenter = new AboutPresenter(aboutFragment);
    }
}
