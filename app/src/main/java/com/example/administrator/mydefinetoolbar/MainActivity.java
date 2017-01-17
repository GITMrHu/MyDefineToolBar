package com.example.administrator.mydefinetoolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseDetailActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        setTitleName("adsklfj");//title
        setTitleBack(false,R.mipmap.ic_back);//有图标，但不是返回
        setTitleBack(true, 0);//返回
        setTitleRightText("保存");//右侧文字
    }


    @Override
    protected void onActivityCreate(Bundle savedInstanceState) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_back:
                Toast.makeText(this, "点击了返回按钮", Toast.LENGTH_SHORT).show();
                break;

            case R.id.title_rightTv:
                Toast.makeText(this, "点击了右键", Toast.LENGTH_SHORT).show();
                break;
        }
    }
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }*/
}
