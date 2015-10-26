package com.umass.seabiscuit.criminalintent;

import android.app.Fragment;

/**
 * Created by seabiscuit on 10/1/15.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}
