package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes4.dex */
public interface c extends Closeable {
    void D();

    void D0(String r1);

    boolean D1();

    Cursor J(f r1);

    void P0();

    void Q0(String r1, Object[] r2);

    void U0();

    default void Y() {
        r();
    }

    String getPath();

    g i1(String r1);

    boolean isOpen();

    int p1(String r1, int r2, ContentValues r3, String r4, Object[] r5);

    void r();

    List s();

    Cursor t1(String r1);

    boolean y1();

    Cursor z(f r1, CancellationSignal r2);
}
