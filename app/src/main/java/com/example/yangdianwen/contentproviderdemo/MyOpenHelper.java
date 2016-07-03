package com.example.yangdianwen.contentproviderdemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yangdianwen on 16-7-3.
 * 这是一个创建数据库的类继承SQLiteOpenHelper
 */
public class MyOpenHelper extends SQLiteOpenHelper {

    public MyOpenHelper(Context context){
        //四个参数分别是context，数据库名，cursor工厂，数据库版本，版本号不能小于1
        super(context,"Account.db",null,1);
    }
    //当数据库第一次创建的时候调用，该方法特别适合做表结构的初始化
    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("create table info(_id integer primary key autoincrement,name varchar(20),money varchar(20))");
       db.execSQL("insert into info(name,money) values(?,?)",new String[]{"张三","5000"});
       db.execSQL("insert into info(name,money) values(?,?)",new String[]{"李四","3000"});
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
