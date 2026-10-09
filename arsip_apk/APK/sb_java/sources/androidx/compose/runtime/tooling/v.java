package androidx.compose.runtime.tooling;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f16664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16665b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16666c;

    static {
    }

    public v(int r1, String r2, String r3) {
        this.f16664a = r1;
        this.f16665b = r2;
        this.f16666c = r3;
    }

    public final String a() {
        return this.f16666c;
    }

    public final String b() {
        return this.f16665b;
    }

    public final int c() {
        return this.f16664a;
    }

    public /* synthetic */ v(int r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 2) == 0) goto L6;
        r3 = null;
    L6:
        if ((r5 & 4) == 0) goto L8;
        r4 = null;
    L8:
        this(r2, r3, r4);
    }
}
