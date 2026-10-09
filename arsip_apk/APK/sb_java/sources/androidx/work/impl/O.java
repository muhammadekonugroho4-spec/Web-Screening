package androidx.work.impl;

/* loaded from: classes4.dex */
public final class O extends androidx.room.migration.b {
    public O() {
        super(18, 19);
    }

    @Override // androidx.room.migration.b
    public void b(androidx.sqlite.db.c r2) {
        r2.D0("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
