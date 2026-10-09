package androidx.room;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f27630a = null;

    static {
        f27630a = new E();
    }

    public E() {
    }

    public static final String a(String r2) {
        kotlin.jvm.internal.p.l(r2, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + r2 + "')";
    }
}
