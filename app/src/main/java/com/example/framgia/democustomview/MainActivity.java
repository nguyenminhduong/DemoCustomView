package com.example.framgia.democustomview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.framgia.democustomview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    String title="依頼リスト!";
    String description="依頼リスト依頼リスト";
    ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        mBinding.setViewModel(this);
    }

    public String getTitleMain() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
