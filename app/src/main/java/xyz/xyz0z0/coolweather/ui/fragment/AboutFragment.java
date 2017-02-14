package xyz.xyz0z0.coolweather.ui.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

import com.tencent.bugly.beta.Beta;

import xyz.xyz0z0.coolweather.BuildConfig;
import xyz.xyz0z0.coolweather.R;
import xyz.xyz0z0.coolweather.ui.contract.AboutContract;

/**
 * Created by Administrator on 2017/2/14 0014.
 */

public class AboutFragment extends PreferenceFragment implements Preference.OnPreferenceClickListener,AboutContract.View {
    private Preference mVersion;
    private Preference mUpdate;
    private Preference mStar;
    private Preference mWeibo;
    private Preference mGithub;

    private AboutContract.Presenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_about);

        mVersion = findPreference("version");
        mUpdate = findPreference("update");
        mStar = findPreference("star");
        mWeibo = findPreference("weibo");
        mGithub = findPreference("github");

        mVersion.setSummary("v " + BuildConfig.VERSION_NAME);
        setListener();
    }

    private void setListener() {
        mUpdate.setOnPreferenceClickListener(this);
        mStar.setOnPreferenceClickListener(this);
        mWeibo.setOnPreferenceClickListener(this);
        mGithub.setOnPreferenceClickListener(this);
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        if (preference == mUpdate) {
            Beta.checkUpgrade();
            return true;
        } else if (preference == mStar) {
            openUrl(getString(R.string.about_project_url));
            return true;
        } else if (preference == mWeibo || preference == mGithub) {
            openUrl(preference.getSummary().toString());
            return true;
        }
        return false;
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public void setPresenter(AboutContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
