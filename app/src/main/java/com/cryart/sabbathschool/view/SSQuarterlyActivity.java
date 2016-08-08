/*
 * Copyright (c) 2016 Adventech <info@adventech.io>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.cryart.sabbathschool.view;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.cryart.sabbathschool.R;
import com.cryart.sabbathschool.databinding.SsQuarterlyActivityBinding;
import com.cryart.sabbathschool.viewmodel.SSQuarterlyViewModel;

public class SSQuarterlyActivity extends AppCompatActivity {
    private static final String TAG = SSQuarterlyActivity.class.getSimpleName();
    private static final String EXTRA_QUARTERLY = "EXTRA_QUARTERLY";

    private SsQuarterlyActivityBinding binding;
    private SSQuarterlyViewModel ssQuarterlyViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.ss_quarterly_activity);

        binding.ssAppBar.ssAppBarLayout.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        binding.ssAppBar.ssToolbar.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));


        setSupportActionBar(binding.ssAppBar.ssToolbar);
        ActionBar ssToolbar = getSupportActionBar();
        if (ssToolbar != null) {
            ssToolbar.setDisplayHomeAsUpEnabled(true);
        }

//
//        ssQuarterlyViewModel = new SSQuarterlyViewModel(this, ssQuarterly);
//        binding.executePendingBindings();
//        binding.setViewModel(ssQuarterlyViewModel);
//
//        setTitle(ssQuarterly.title);
    }

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, SSQuarterlyActivity.class);
//        intent.putExtra(EXTRA_QUARTERLY, ssQuarterly);
        return intent;
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
//        ssQuarterlyViewModel.destroy();
    }
}
