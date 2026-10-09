package androidx.work.impl;

/* loaded from: classes4.dex */
public final class Q extends androidx.room.migration.b {
    public Q() {
        super(20, 21);
    }

    @Override // androidx.room.migration.b
    public void b(androidx.sqlite.db.c r2) {
        r2.D0("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
