package androidx.compose.ui.semantics;

/* loaded from: classes.dex */
public final class SemanticsPropertyKey {

    /* renamed from: e, reason: collision with root package name */
    public static final int f19520e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final String f19521a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.p f19522b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19523c;
    public String d;

    static {
    }

    public SemanticsPropertyKey(String r1, kotlin.jvm.functions.p r2) {
        this.f19521a = r1;
        this.f19522b = r2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f19521a;
    }

    public final boolean c() {
        return this.f19523c;
    }

    public final Object d(Object r2, Object r3) {
        return this.f19522b.invoke(r2, r3);
    }

    public final void e(y r1, kotlin.reflect.l r2, Object r3) {
        r1.a(this, r3);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f19521a;
    }

    public /* synthetic */ SemanticsPropertyKey(String r1, kotlin.jvm.functions.p r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = AnonymousClass1.f19524g;
    L5:
        this(r1, r2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsPropertyKey(String r3, boolean r4) {
        this(r3, null, 2, 0 == true ? 1 : 0);
        this.f19523c = r4;
    }

    public /* synthetic */ SemanticsPropertyKey(String r1, boolean r2, kotlin.jvm.functions.p r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 8) == 0) goto L5;
        r4 = null;
    L5:
        this(r1, r2, r3, r4);
    }

    public SemanticsPropertyKey(String r1, boolean r2, kotlin.jvm.functions.p r3, String r4) {
        this(r1, r3);
        this.f19523c = r2;
        this.d = r4;
    }
}
