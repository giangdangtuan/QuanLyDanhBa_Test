package com.abc.quanlydanhba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    private TabHost myTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewByIds();
        myTabHost.setup();

        TabHost.TabSpec spec1 = myTabHost.newTabSpec("action");
        spec1.setIndicator("Đơn vị");
        spec1.setContent(R.id.tabDV);
        myTabHost.addTab(spec1);

        TabHost.TabSpec spec2 = myTabHost.newTabSpec("action");
        spec2.setIndicator("Nhân viên");
        spec2.setContent(R.id.tabNV);
        myTabHost.addTab(spec2);
    }


    private void findViewByIds() {
        myTabHost = (TabHost) findViewById(R.id.myTabHost);
    }


}