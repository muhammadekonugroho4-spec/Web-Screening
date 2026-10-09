package androidx.work.impl;

import android.content.ContentValues;

/* renamed from: androidx.work.impl.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4186b implements androidx.room.migration.a {
    public C4186b() {
    }

    @Override // androidx.room.migration.a
    public void a(androidx.sqlite.db.c r8) {
        kotlin.jvm.internal.p.l(r8, "db");
        r8.D0("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues r4 = new ContentValues(1);
        r4.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        r8.p1("WorkSpec", 3, r4, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
