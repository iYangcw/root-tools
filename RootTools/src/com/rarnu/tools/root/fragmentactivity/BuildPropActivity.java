package com.rarnu.tools.root.fragmentactivity;

import android.app.Fragment;
import com.rarnu.devlib.base.BaseActivity;
import com.rarnu.tools.root.Fragments;
import com.rarnu.tools.root.GlobalInstance;
import com.rarnu.tools.root.R;
import com.rarnu.tools.root.common.FragmentNameConst;

public class BuildPropActivity extends BaseActivity {

    @Override
    public int getIcon() {
        return R.drawable.icon;
    }

    @Override
    public Fragment replaceFragment() {
        return Fragments.getFragment(FragmentNameConst.FN_BUILD_PROP);
    }

    @Override
    public int customTheme() {
        return GlobalInstance.theme ? android.R.style.Theme_Holo_Light : android.R.style.Theme_Holo;
    }
}
