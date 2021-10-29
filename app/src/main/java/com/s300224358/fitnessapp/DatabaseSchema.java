package com.s300224358.fitnessapp;

import android.provider.BaseColumns;


public class DatabaseSchema {

    private DatabaseSchema() {}

    public static class DatabaseSchemaInner implements BaseColumns{
        public static final String USER_TABLE_NAME = "users";
        public static final String USER_COLUMN_NAME = "name";
        public static final String USER_COLUMN_EMAIL = "email";
        public static final String USER_COLUMN_AGE = "age";
        public static final String USER_COLUMN_GENDER = "gender";
        public static final String USER_COLUMN_DOB = "DOB";

        public static final String SQL_CREATE_USER_ENTRIES =
                "Create Table " + DatabaseSchemaInner.USER_COLUMN_NAME + " (" +
                        DatabaseSchemaInner._ID + " INTEGER PRIMARY KEY, " +
                        DatabaseSchemaInner.USER_COLUMN_NAME + "TEXT," +
                        DatabaseSchemaInner.USER_COLUMN_EMAIL + "TEXT," +
                        DatabaseSchemaInner.USER_COLUMN_AGE + "INTEGER," +
                        DatabaseSchemaInner.USER_COLUMN_GENDER+ "TEXT," +
                        DatabaseSchemaInner.USER_COLUMN_DOB + "TEXT)";

        private static final String SQL_DELETE_USER_ENTRIES =
                "DROP TABLE IF EXISTS " + DatabaseSchemaInner.USER_TABLE_NAME;
    }
}
