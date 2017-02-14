package xyz.xyz0z0.coolweather.ui.contract;

import android.preference.Preference;

import xyz.xyz0z0.coolweather.presenter.BasePresenter;
import xyz.xyz0z0.coolweather.ui.view.BaseView;

/**
 * Created by Administrator on 2017/2/14 0014.
 */

public interface AboutContract {

    interface View extends BaseView<Presenter>{


    }

    interface Presenter extends BasePresenter{

        void clickItem(Preference preference);

    }
}
