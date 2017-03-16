package com.feicuiedu.ormlitedemo_0316.database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by gqq on 2017/3/16.
 */

public class DataBaseManager {

    private SQLiteDatabase mDatabase;
    private DBHelp mDBHelp;

    public DataBaseManager(SQLiteDatabase database) {
//        mDatabase = database;
        mDatabase = mDBHelp.getReadableDatabase();
    }

    // 表：添删改查的操作

    public void queryForAll(){
        mDatabase.query();
        mDatabase.execSQL("Select * from user where id=1;");
    }

    public void insert(Object obj){
        ContentValues values = new ContentValues();
        values.put("_id",1);
        values.put("username","123");
        mDatabase.insert("user",null,values);

        mDatabase.execSQL("insert into user values(?,?);",new Object[]{1,"123"});
    }
}
