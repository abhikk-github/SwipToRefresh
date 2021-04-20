package com.abhikk.swiptorefresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    SwipeRefreshLayout refreshLayout;
    TextView tv_count;

    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_count = findViewById(R.id.tv_count);
        refreshLayout = findViewById(R.id.SwipeRefreshLayout_id);

        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                num++;
                tv_count.setText(String.valueOf(num));
                refreshLayout.setRefreshing(false);
            }
        });

    }
}