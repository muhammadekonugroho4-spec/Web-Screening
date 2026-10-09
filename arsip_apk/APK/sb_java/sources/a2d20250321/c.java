package a2d20250321;

/* loaded from: classes.dex */
public enum c extends Enum<c> {
    public static final c O0OOOoOooo = null;
    public static final c OOOOooOOOO = null;
    public static final c OOOoooooo = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f1512a = null;

    static {
        OOOOooOOOO = new c("JUST_PREPARE", 0);
        O0OOOoOooo = new c("JUST_ACTION", 1);
        OOOoooooo = new c("FULL_PROCESS", 2);
        f1512a = a();
    }

    c(String r1, int r2) {
    }

    public static /* synthetic */ c[] a() {
        return new c[]{OOOOooOOOO, O0OOOoOooo, OOOoooooo};
    }

    public static c valueOf(String r1) {
        return (c) Enum.valueOf(c.class, r1);
    }

    public static c[] values() {
        return (c[]) f1512a.clone();
    }
}
