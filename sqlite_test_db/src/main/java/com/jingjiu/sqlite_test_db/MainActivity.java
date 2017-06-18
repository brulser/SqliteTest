package com.jingjiu.sqlite_test_db;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SqliteOpenHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void AddManyData(View view) {
        List<RenQing> list = new ArrayList<>();
        list.add(new RenQing(0, 16, "張三", true, 100));
        list.add(new RenQing(1, 16, "李四", false, 300));
        list.add(new RenQing(2, 16, "王五", false, 200));
        list.add(new RenQing(3, 16, "赵六", true, 100));
        list.add(new RenQing(4, 16, "孙七", true, 200));
        list.add(new RenQing(5, 16, "周八", false, 100));
        list.add(new RenQing(6, 16, "郑久", true, 100));
        RenQingDao dao = new RenQingDao(MainActivity.this);
        dao.addAll(list);
    }

    public void SeleteAll(View view) {
        RenQingDao dao=new RenQingDao(MainActivity.this);
        dao.queryall();
    }

    public void SunTable(View view) {
        RenQingDao dao=new RenQingDao(MainActivity.this);
        dao.querySum();

    }
}


