package com.example.yangdianwen.contentproviderdemo;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends Activity {
         @Override
        public void onCreate(Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_main);
             //实例化数据库的辅助类
               MyOpenHelper myOpenHelper=new MyOpenHelper(this);
             //创建一个数据库表格
               SQLiteDatabase db = myOpenHelper.getWritableDatabase();
             //七个参数：数据库的名称，列（null代表查询所有的），
             Cursor cursor = db.query("info", null, null, null, null, null, null);
             if (cursor!=null&&cursor.getCount()>0){
                 while (cursor.moveToNext()){
                 String name = cursor.getString(1);
                 String money = cursor.getString(2);
                     System.out.println("name:"+name+"money:"+money);
             }

         }
         }
     }