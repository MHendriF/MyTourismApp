package com.mhendrif.mytourismapp.core.data.source.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mhendrif.mytourismapp.core.data.source.local.entity.TourismEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TourismDao_Impl implements TourismDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TourismEntity> __insertionAdapterOfTourismEntity;

  private final EntityDeletionOrUpdateAdapter<TourismEntity> __updateAdapterOfTourismEntity;

  public TourismDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTourismEntity = new EntityInsertionAdapter<TourismEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tourism` (`tourismId`,`name`,`description`,`address`,`latitude`,`longitude`,`like`,`image`,`isFavorite`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TourismEntity value) {
        if (value.getTourismId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTourismId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress());
        }
        stmt.bindDouble(5, value.getLatitude());
        stmt.bindDouble(6, value.getLongitude());
        stmt.bindLong(7, value.getLike());
        if (value.getImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImage());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(9, _tmp);
      }
    };
    this.__updateAdapterOfTourismEntity = new EntityDeletionOrUpdateAdapter<TourismEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tourism` SET `tourismId` = ?,`name` = ?,`description` = ?,`address` = ?,`latitude` = ?,`longitude` = ?,`like` = ?,`image` = ?,`isFavorite` = ? WHERE `tourismId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TourismEntity value) {
        if (value.getTourismId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTourismId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAddress());
        }
        stmt.bindDouble(5, value.getLatitude());
        stmt.bindDouble(6, value.getLongitude());
        stmt.bindLong(7, value.getLike());
        if (value.getImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImage());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        if (value.getTourismId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTourismId());
        }
      }
    };
  }

  @Override
  public Object insertTourism(final List<TourismEntity> tourism,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTourismEntity.insert(tourism);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void updateFavoriteTourism(final TourismEntity tourism) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTourismEntity.handle(tourism);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<TourismEntity>> getAllTourism() {
    final String _sql = "SELECT * FROM tourism";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tourism"}, new Callable<List<TourismEntity>>() {
      @Override
      public List<TourismEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTourismId = CursorUtil.getColumnIndexOrThrow(_cursor, "tourismId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfLike = CursorUtil.getColumnIndexOrThrow(_cursor, "like");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<TourismEntity> _result = new ArrayList<TourismEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TourismEntity _item;
            final String _tmpTourismId;
            _tmpTourismId = _cursor.getString(_cursorIndexOfTourismId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final int _tmpLike;
            _tmpLike = _cursor.getInt(_cursorIndexOfLike);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new TourismEntity(_tmpTourismId,_tmpName,_tmpDescription,_tmpAddress,_tmpLatitude,_tmpLongitude,_tmpLike,_tmpImage,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TourismEntity>> getFavoriteTourism() {
    final String _sql = "SELECT * FROM tourism where isFavorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tourism"}, new Callable<List<TourismEntity>>() {
      @Override
      public List<TourismEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTourismId = CursorUtil.getColumnIndexOrThrow(_cursor, "tourismId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfLike = CursorUtil.getColumnIndexOrThrow(_cursor, "like");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<TourismEntity> _result = new ArrayList<TourismEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TourismEntity _item;
            final String _tmpTourismId;
            _tmpTourismId = _cursor.getString(_cursorIndexOfTourismId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final int _tmpLike;
            _tmpLike = _cursor.getInt(_cursorIndexOfLike);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new TourismEntity(_tmpTourismId,_tmpName,_tmpDescription,_tmpAddress,_tmpLatitude,_tmpLongitude,_tmpLike,_tmpImage,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
