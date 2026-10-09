package kotlin.time;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f180412a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal[] f180413b = null;

    static {
        ThreadLocal[] r1 = new ThreadLocal[4];
        int r2 = 0;
    L3:
        if (r2 >= 4) goto L5;
        r1[r2] = new ThreadLocal();
        r2 = r2 + 1;
        goto L3
    L5:
        f180413b = r1;
    }

    public static final boolean a() {
        return f180412a;
    }
}
