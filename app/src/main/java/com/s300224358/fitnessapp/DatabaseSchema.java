package com.s300224358.fitnessapp;

import android.provider.BaseColumns;


public class DatabaseSchema {

    private DatabaseSchema() {}

    public static class DatabaseSchemaInner implements BaseColumns{

        //User declarations
        public static final String USER_TABLE_NAME = "users";
        public static final String USER_COLUMN_NAME = "name";
        public static final String USER_COLUMN_EMAIL = "email";
        public static final String USER_COLUMN_AGE = "age";
        public static final String USER_COLUMN_GENDER = "gender";
        public static final String USER_COLUMN_DOB = "DOB";

        //Workout declarations
        public static String WORKOUT_TABLE_NAME = "workouts";
        public static String WORKOUT_COLUMN_NAME = "name";
        public static String WORKOUT_COLUMN_INTENSITY = "intensity";
        public static String WORKOUT_COLUMN_VIDEO = "video";
        public static String WORKOUT_COLUMN_DESCRIPTION = "description";

        //Workout Log declarations
        public static String LOG_TABLE_NAME = "Logs";
        public static String LOG_COLUMN_DATE = "date";
        public static String LOG_COLUMN_DURATION = "duration";
        public static String LOG_COLUMN_ACTIVITIES = "activities";

        //User table
        public static final String SQL_CREATE_USER_ENTRIES =
                "Create Table " + DatabaseSchemaInner.USER_TABLE_NAME + " (" +
                        DatabaseSchemaInner._ID + " INTEGER PRIMARY KEY, " +
                        DatabaseSchemaInner.USER_COLUMN_NAME + "TEXT," +
                        DatabaseSchemaInner.USER_COLUMN_EMAIL + "TEXT," +
                        DatabaseSchemaInner.USER_COLUMN_AGE + "INTEGER," +
                        DatabaseSchemaInner.USER_COLUMN_GENDER+ "TEXT," +
                        DatabaseSchemaInner.USER_COLUMN_DOB + "TEXT)";
        //Delete user table
        private static final String SQL_DELETE_USER_ENTRIES =
                "DROP TABLE IF EXISTS " + DatabaseSchemaInner.USER_TABLE_NAME;

        //Workout table
        public static final String SQL_CREATE_WORKOUT_ENTRIES =
                "Create Table " + DatabaseSchemaInner.WORKOUT_TABLE_NAME + " (" +
                        DatabaseSchemaInner._ID + " INTEGER PRIMARY KEY, " +
                        DatabaseSchemaInner.WORKOUT_COLUMN_NAME + "TEXT," +
                        DatabaseSchemaInner.WORKOUT_COLUMN_INTENSITY + "TEXT," +
                        DatabaseSchemaInner.WORKOUT_COLUMN_VIDEO + "TEXT," +
                        DatabaseSchemaInner.WORKOUT_COLUMN_DESCRIPTION + "TEXT)";

        //Delete workout table
        private static final String SQL_DELETE_WORKOUT_ENTRIES =
                "DROP TABLE IF EXISTS " + DatabaseSchemaInner.WORKOUT_TABLE_NAME;

        //Workout log table
        public static final String SQL_CREATE_LOG_ENTRIES =
                "Create Table " + DatabaseSchemaInner.LOG_TABLE_NAME + " (" +
                        DatabaseSchemaInner._ID + " INTEGER PRIMARY KEY, " +
                        DatabaseSchemaInner.LOG_COLUMN_DATE + "TEXT," +
                        DatabaseSchemaInner.LOG_COLUMN_ACTIVITIES + "TEXT," +
                        DatabaseSchemaInner.LOG_COLUMN_DURATION + "TEXT)";

        //Delete workout log table
        private static final String SQL_DELETE_LOG_ENTRIES =
                "DROP TABLE IF EXISTS " + DatabaseSchemaInner.LOG_TABLE_NAME;

    }
}
