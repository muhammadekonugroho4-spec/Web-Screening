package androidx.room.migration;

import androidx.sqlite.db.c;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f27898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27899b;

    public b(int r1, int r2) {
        this.f27898a = r1;
        this.f27899b = r2;
    }

    public void a(androidx.sqlite.b r2) {
        p.l(r2, "connection");
        if ((r2 instanceof androidx.room.driver.a) == false) goto L7;
        b(((androidx.room.driver.a) r2).c());
        return;
    L7:
        throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }

    public abstract void b(c r1);
}
