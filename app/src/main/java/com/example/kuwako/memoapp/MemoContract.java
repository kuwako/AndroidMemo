package com.example.kuwako.memoapp;

import android.provider.BaseColumns;

/**
 * Created by m_kuwako on 16/04/21.
 */
public final class MemoContract {

    public MemoContract() {}

    public static abstract class Memos implements BaseColumns {
        public static final String TABLE_NAME  = "memos";
        public static final String COL_TITLE   = "title";
        public static final String COL_BODY    = "body";
        public static final String COL_STATUS  = "status";
        public static final String COL_CREATED = "created";
        public static final String COL_UPDATED = "updated";
    }
}
