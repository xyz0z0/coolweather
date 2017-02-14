package xyz.xyz0z0.coolweather.presenter;

import android.preference.Preference;

import xyz.xyz0z0.coolweather.R;
import xyz.xyz0z0.coolweather.ui.contract.AboutContract;
import xyz.xyz0z0.coolweather.ui.fragment.AboutFragment;

/**
 * Created by Administrator on 2017/2/14 0014.
 */

public class AboutPresenter implements AboutContract.Presenter {

    private final AboutContract.View mAboutView;

    public AboutPresenter(AboutContract.View aboutView) {
        mAboutView = aboutView;
        mAboutView.setPresenter(this);
    }

    @Override
    public void clickItem(Preference preference) {

    }

    @Override
    public void start() {

    }
}
