package T;

/* loaded from: classes.dex */
public enum q extends Enum {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q[] f1226a = null;

    static {
        f1226a = new q[]{new q("NOT_SUBMITTED", 0), new q("AWAITING_IDENTITY_APPROVAL", 1), new q("IDENTITY_REJECTED", 2), new q("AWAITING_PARTNER_APPROVAL", 3), new q("PARTNER_REJECTED", 4), new q("APPROVED", 5), new q("IDENTITY_SHARING_REJECTED", 6)};
    }

    q(String r1, int r2) {
    }

    public static q valueOf(String r1) {
        return (q) Enum.valueOf(q.class, r1);
    }

    public static q[] values() {
        return (q[]) f1226a.clone();
    }
}
