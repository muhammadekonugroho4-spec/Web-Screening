package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class k extends j implements androidx.sqlite.db.g {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f28121b;

    public k(SQLiteStatement r2) {
        p.l(r2, "delegate");
        super(r2);
        this.f28121b = r2;
    }

    @Override // androidx.sqlite.db.g
    public long e1() {
        return this.f28121b.executeInsert();
    }

    @Override // androidx.sqlite.db.g
    public void execute() {
        this.f28121b.execute();
    }

    @Override // androidx.sqlite.db.g
    public int v() {
        return this.f28121b.executeUpdateDelete();
    }
}
