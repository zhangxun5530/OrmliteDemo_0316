package com.feicuiedu.ormlitedemo_0316.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by gqq on 2017/3/16.
 */
// 数据库的帮助类：创建数据库和表等还有更新
public class DBHelp extends SQLiteOpenHelper{

    public DBHelp(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "user.db", null, 1);
    }

    // 数据库的创建、表的创建及数据填充
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table user(_id Integer(10) , username varchar(20)..........");
    }

    // 更新数据库：数据库删除、创建
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
}
