package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public class j implements androidx.sqlite.db.e {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f28120a;

    public j(SQLiteProgram r2) {
        p.l(r2, "delegate");
        this.f28120a = r2;
    }

    @Override // androidx.sqlite.db.e
    public void U(int r2, String r3) {
        p.l(r3, "value");
        this.f28120a.bindString(r2, r3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f28120a.close();
    }

    @Override // androidx.sqlite.db.e
    public void e0(int r2, byte[] r3) {
        p.l(r3, "value");
        this.f28120a.bindBlob(r2, r3);
    }

    @Override // androidx.sqlite.db.e
    public void m(int r2, long r3) {
        this.f28120a.bindLong(r2, r3);
    }

    @Override // androidx.sqlite.db.e
    public void o(int r2) {
        this.f28120a.bindNull(r2);
    }

    @Override // androidx.sqlite.db.e
    public void p(int r2, double r3) {
        this.f28120a.bindDouble(r2, r3);
    }
}
