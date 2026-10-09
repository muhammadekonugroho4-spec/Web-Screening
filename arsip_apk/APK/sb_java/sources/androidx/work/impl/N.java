package androidx.work.impl;

/* loaded from: classes4.dex */
public final class N extends androidx.room.migration.b {
    public N() {
        super(17, 18);
    }

    @Override // androidx.room.migration.b
    public void b(androidx.sqlite.db.c r2) {
        r2.D0("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        r2.D0("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
