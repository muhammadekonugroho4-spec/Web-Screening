package androidx.room.paging;

import android.database.Cursor;
import androidx.sqlite.d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f27916b = null;

    /* renamed from: a, reason: collision with root package name */
    public final Cursor f27917a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f27916b = new a(null);
    }

    public b(Cursor r2) {
        p.l(r2, "cursor");
        this.f27917a = r2;
    }

    @Override // androidx.sqlite.d
    public /* bridge */ /* synthetic */ void M0(int r1, String r2) {
        k(r1, r2);
    }

    public Void c(int r1, double r2) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.d, java.lang.AutoCloseable
    public void close() {
        this.f27917a.close();
    }

    public Void f(int r1, long r2) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.d
    public int getColumnCount() {
        return this.f27917a.getColumnCount();
    }

    @Override // androidx.sqlite.d
    public String getColumnName(int r2) {
        String r22 = this.f27917a.getColumnName(r2);
        p.k(r22, "getColumnName(...)");
        return r22;
    }

    @Override // androidx.sqlite.d
    public double getDouble(int r3) {
        return this.f27917a.getDouble(r3);
    }

    @Override // androidx.sqlite.d
    public long getLong(int r3) {
        return this.f27917a.getLong(r3);
    }

    public Void i(int r2) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.d
    public boolean isNull(int r2) {
        return this.f27917a.isNull(r2);
    }

    public Void k(int r1, String r2) {
        p.l(r2, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // androidx.sqlite.d
    public /* bridge */ /* synthetic */ void m(int r1, long r2) {
        f(r1, r2);
    }

    @Override // androidx.sqlite.d
    public /* bridge */ /* synthetic */ void o(int r1) {
        i(r1);
    }

    @Override // androidx.sqlite.d
    public /* bridge */ /* synthetic */ void p(int r1, double r2) {
        c(r1, r2);
    }

    @Override // androidx.sqlite.d
    public void reset() {
        this.f27917a.moveToPosition(-1);
    }

    @Override // androidx.sqlite.d
    public boolean u0() {
        return this.f27917a.moveToNext();
    }

    @Override // androidx.sqlite.d
    public String u1(int r2) {
        String r22 = this.f27917a.getString(r2);
        p.k(r22, "getString(...)");
        return r22;
    }
}
