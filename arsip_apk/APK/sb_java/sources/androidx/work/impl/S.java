package androidx.work.impl;

/* loaded from: classes4.dex */
public final class S extends androidx.room.migration.b {
    public S() {
        super(22, 23);
    }

    @Override // androidx.room.migration.b
    public void b(androidx.sqlite.db.c r2) {
        r2.D0("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
