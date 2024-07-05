package com.pengxh.autodingding.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.pengxh.autodingding.bean.TaskTimeBean;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TASK_TIME_BEAN".
*/
public class TaskTimeBeanDao extends AbstractDao<TaskTimeBean, Long> {

    public static final String TABLENAME = "TASK_TIME_BEAN";

    /**
     * Properties of entity TaskTimeBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Uuid = new Property(1, String.class, "uuid", false, "UUID");
        public final static Property StartTime = new Property(2, String.class, "startTime", false, "START_TIME");
        public final static Property EndTime = new Property(3, String.class, "endTime", false, "END_TIME");
    }


    public TaskTimeBeanDao(DaoConfig config) {
        super(config);
    }
    
    public TaskTimeBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TASK_TIME_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"UUID\" TEXT," + // 1: uuid
                "\"START_TIME\" TEXT," + // 2: startTime
                "\"END_TIME\" TEXT);"); // 3: endTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TASK_TIME_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TaskTimeBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String uuid = entity.getUuid();
        if (uuid != null) {
            stmt.bindString(2, uuid);
        }
 
        String startTime = entity.getStartTime();
        if (startTime != null) {
            stmt.bindString(3, startTime);
        }
 
        String endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindString(4, endTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TaskTimeBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String uuid = entity.getUuid();
        if (uuid != null) {
            stmt.bindString(2, uuid);
        }
 
        String startTime = entity.getStartTime();
        if (startTime != null) {
            stmt.bindString(3, startTime);
        }
 
        String endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindString(4, endTime);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TaskTimeBean readEntity(Cursor cursor, int offset) {
        TaskTimeBean entity = new TaskTimeBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // uuid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // startTime
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // endTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TaskTimeBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUuid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setStartTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setEndTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TaskTimeBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TaskTimeBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TaskTimeBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}