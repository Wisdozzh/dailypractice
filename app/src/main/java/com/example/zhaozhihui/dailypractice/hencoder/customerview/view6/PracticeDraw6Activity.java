package com.example.zhaozhihui.dailypractice.hencoder.customerview.view6;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhaozhihui.dailypractice.R;

import java.util.ArrayList;
import java.util.List;

public class PracticeDraw6Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager pager;
    List<PageModel> pageModels = new ArrayList<>();

    {
        pageModels.add(new PageModel(R.layout.sample_translation, R.string.title_translation, R.layout.practice_translation));
        pageModels.add(new PageModel(R.layout.sample_rotation, R.string.title_rotation, R.layout.practice_rotation));
        pageModels.add(new PageModel(R.layout.sample_scale6, R.string.title_scale6, R.layout.practice_scale6));
        pageModels.add(new PageModel(R.layout.sample_alpha, R.string.title_alpha, R.layout.practice_alpha));
        pageModels.add(new PageModel(R.layout.sample_multi_properties, R.string.title_multi_properties, R.layout.practice_multi_properties));
        pageModels.add(new PageModel(R.layout.sample_duration, R.string.title_duration, R.layout.practice_duration));
        pageModels.add(new PageModel(R.layout.sample_interpolator, R.string.title_interpolator, R.layout.practice_interpolator));
        pageModels.add(new PageModel(R.layout.sample_object_anomator, R.string.title_object_animator, R.layout.practice_object_animator));
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, PracticeDraw6Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_draw6);

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                PageModel pageModel = pageModels.get(position);
                return PageFragment.newInstance(pageModel.sampleLayoutRes, pageModel.practiceLayoutRes);
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return getString(pageModels.get(position).titleRes);
            }
        });

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(pager);
    }


    private class PageModel {
        @LayoutRes
        int sampleLayoutRes;
        @StringRes
        int titleRes;
        @LayoutRes int practiceLayoutRes;

        PageModel(@LayoutRes int sampleLayoutRes, @StringRes int titleRes, @LayoutRes int practiceLayoutRes) {
            this.sampleLayoutRes = sampleLayoutRes;
            this.titleRes = titleRes;
            this.practiceLayoutRes = practiceLayoutRes;
        }
    }
}
