package com.jingjiu.sqlite_test_db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.List;

/**
 * Created by pc on 2017/6/18.
 * Email:565881738@qq.com wellcome For Your Letters
 * Tel： 13638667479
 * Company：lafons
 * Alias： Brulser
 * Name：Shun Yao
 * 中文名：姚舜
 * Label：Focus, Seriousness, Efficiency, Results.
 */
public class RenQingDao {


    public RenQingDao(Context context) {
        dbhelper = new SqliteOpenHelper(context);
    }

    private SqliteOpenHelper dbhelper;


    public void add() {
        SQLiteDatabase writableDatabase = dbhelper.getWritableDatabase();

        writableDatabase.execSQL("Select * from ");
    }

//    private int id;
//    private int age;
//    private String name;
//    private boolean type;
//    private int count;

    public void addAll(List<RenQing> lists) {
        SQLiteDatabase writableDatabase = dbhelper.getWritableDatabase();

        for (RenQing rq : lists) {
            ContentValues values = new ContentValues();
            values.put("id", rq.getId());
            values.put("age", rq.getAge());
            values.put("name", rq.getName());
            values.put("type", rq.isType());
            values.put("count", rq.getCount());
            writableDatabase.insert("RenQing", null, values);
            Log.d("test", "插入成功");
        }


    }

    public void queryall() {

        SQLiteDatabase writableDatabase = dbhelper.getWritableDatabase();

        Cursor cursor = writableDatabase.rawQuery("select * from RenQing", null);
        while (cursor.moveToNext()) {
            Log.d("test", cursor.getString(cursor.getColumnIndex("id")));
        }

    }

    public void querySum() {
        SQLiteDatabase writableDatabase = dbhelper.getWritableDatabase();

//        writableDatabase.execSQL("select sum(count) from RenQing");

        Cursor cursor = writableDatabase.rawQuery("select sum(count) from RenQing", null);
        while (cursor.moveToNext()) {
            Log.d("test", cursor.getString(0));
        }

    }


}
