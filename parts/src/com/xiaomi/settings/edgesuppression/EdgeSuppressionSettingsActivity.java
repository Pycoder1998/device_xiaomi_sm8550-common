/*
 * Copyright (C) 2024 Paranoid Android
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.xiaomi.settings.edgesuppression;

import android.app.Fragment;
import android.os.Bundle;

import com.android.settingslib.collapsingtoolbar.CollapsingToolbarBaseActivity;

public class EdgeSuppressionSettingsActivity extends CollapsingToolbarBaseActivity {

    private EdgeSuppressionSettingsFragment mEdgeSuppressionSettingsFragment;
    private static final String TAG = "edgesuppression";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Fragment fragment = getFragmentManager().findFragmentById(com.android.settingslib.collapsingtoolbar.R.id.content_frame);
        if (fragment == null) {
            mEdgeSuppressionSettingsFragment = new EdgeSuppressionSettingsFragment();
            getFragmentManager().beginTransaction()
                .add(com.android.settingslib.collapsingtoolbar.R.id.content_frame, mEdgeSuppressionSettingsFragment, TAG)
                .commit();
        } else {
            mEdgeSuppressionSettingsFragment = (EdgeSuppressionSettingsFragment) 
fragment;
        }
    }
}
