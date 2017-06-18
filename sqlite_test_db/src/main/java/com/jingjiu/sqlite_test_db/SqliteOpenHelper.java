package com.jingjiu.sqlite_test_db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
public class SqliteOpenHelper extends SQLiteOpenHelper {
    //类没有实例化,是不能用作父类构造器的参数,必须声明为静态
    private static final String name = "myrenqing"; //数据库名称
    private static final int version = 1; //数据库版本

    public SqliteOpenHelper(Context context) {
        //第三个参数CursorFactory指定在执行查询时获得一个游标实例的工厂类,设置为null,代表使用系统默认的工厂类
        super(context, name, null, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
//        private int id;
//        private int age;
//        private String name;
//        private boolean type;
//        private int count;
        db.execSQL("CREATE TABLE IF NOT EXISTS RenQing (" +
                "id integer primary key autoincrement," +
                "name varchar(20), " +
                "age INTEGER," +
                "type boolean," +
                "count INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL(" ALTER TABLE person ADD phone VARCHAR(12) NULL "); //往表中增加一列

    }
}
