package com.umass.seabiscuit.criminalintent;

import android.app.Fragment;

/**
 * Created by seabiscuit on 9/29/15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}

