package com.example.jorge.gasolinator.BBDD.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GASTOS".
*/
public class GastosDao extends AbstractDao<Gastos, Void> {

    public static final String TABLENAME = "GASTOS";

    /**
     * Properties of entity Gastos.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property IdVehiculo = new Property(0, String.class, "idVehiculo", false, "ID_VEHICULO");
        public final static Property Tipo_operacion = new Property(1, String.class, "tipo_operacion", false, "TIPO_OPERACION");
        public final static Property Coste = new Property(2, String.class, "coste", false, "COSTE");
        public final static Property Acciones = new Property(3, String.class, "acciones", false, "ACCIONES");
        public final static Property Foto_uri_gasto = new Property(4, String.class, "foto_uri_gasto", false, "FOTO_URI_GASTO");
    }


    public GastosDao(DaoConfig config) {
        super(config);
    }
    
    public GastosDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GASTOS\" (" + //
                "\"ID_VEHICULO\" TEXT," + // 0: idVehiculo
                "\"TIPO_OPERACION\" TEXT NOT NULL ," + // 1: tipo_operacion
                "\"COSTE\" TEXT NOT NULL ," + // 2: coste
                "\"ACCIONES\" TEXT NOT NULL ," + // 3: acciones
                "\"FOTO_URI_GASTO\" TEXT NOT NULL );"); // 4: foto_uri_gasto
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GASTOS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Gastos entity) {
        stmt.clearBindings();
 
        String idVehiculo = entity.getIdVehiculo();
        if (idVehiculo != null) {
            stmt.bindString(1, idVehiculo);
        }
        stmt.bindString(2, entity.getTipo_operacion());
        stmt.bindString(3, entity.getCoste());
        stmt.bindString(4, entity.getAcciones());
        stmt.bindString(5, entity.getFoto_uri_gasto());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Gastos entity) {
        stmt.clearBindings();
 
        String idVehiculo = entity.getIdVehiculo();
        if (idVehiculo != null) {
            stmt.bindString(1, idVehiculo);
        }
        stmt.bindString(2, entity.getTipo_operacion());
        stmt.bindString(3, entity.getCoste());
        stmt.bindString(4, entity.getAcciones());
        stmt.bindString(5, entity.getFoto_uri_gasto());
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public Gastos readEntity(Cursor cursor, int offset) {
        Gastos entity = new Gastos( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // idVehiculo
            cursor.getString(offset + 1), // tipo_operacion
            cursor.getString(offset + 2), // coste
            cursor.getString(offset + 3), // acciones
            cursor.getString(offset + 4) // foto_uri_gasto
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Gastos entity, int offset) {
        entity.setIdVehiculo(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setTipo_operacion(cursor.getString(offset + 1));
        entity.setCoste(cursor.getString(offset + 2));
        entity.setAcciones(cursor.getString(offset + 3));
        entity.setFoto_uri_gasto(cursor.getString(offset + 4));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(Gastos entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(Gastos entity) {
        return null;
    }

    @Override
    public boolean hasKey(Gastos entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
