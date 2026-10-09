package androidx.work.impl;

/* renamed from: androidx.work.impl.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4187c implements androidx.room.migration.a {
    public C4187c() {
    }

    @Override // androidx.room.migration.a
    public void a(androidx.sqlite.db.c r2) {
        kotlin.jvm.internal.p.l(r2, "db");
        r2.D0("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
