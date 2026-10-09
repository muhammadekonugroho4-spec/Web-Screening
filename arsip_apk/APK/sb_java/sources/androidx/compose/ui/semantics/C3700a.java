package androidx.compose.ui.semantics;

/* renamed from: androidx.compose.ui.semantics.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3700a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19534a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.g f19535b;

    static {
    }

    public C3700a(String r1, kotlin.g r2) {
        this.f19534a = r1;
        this.f19535b = r2;
    }

    public final kotlin.g a() {
        return this.f19535b;
    }

    public final String b() {
        return this.f19534a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3700a) == true) goto L8;
        return false;
    L8:
        C3700a r52 = (C3700a) r5;
        if (kotlin.jvm.internal.p.g(this.f19534a, r52.f19534a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f19535b, r52.f19535b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f19534a;
        int r1 = 0;
        if (r02 == null) goto L5;
        int r03 = r02.hashCode();
    L6:
        int r04 = r03 * 31;
        kotlin.g r2 = this.f19535b;
        if (r2 == null) goto L10;
        r1 = r2.hashCode();
    L10:
        return r04 + r1;
    L5:
        r03 = 0;
        goto L6
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f19534a + ", action=" + this.f19535b + ')';
    }
}
