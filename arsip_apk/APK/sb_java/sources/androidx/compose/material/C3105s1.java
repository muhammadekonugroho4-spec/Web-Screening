package androidx.compose.material;

/* renamed from: androidx.compose.material.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3105s1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12071a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.q f12072b;

    public C3105s1(Object r1, kotlin.jvm.functions.q r2) {
        this.f12071a = r1;
        this.f12072b = r2;
    }

    public final Object a() {
        return this.f12071a;
    }

    public final kotlin.jvm.functions.q b() {
        return this.f12072b;
    }

    public final Object c() {
        return this.f12071a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C3105s1) == true) goto L8;
        return false;
    L8:
        C3105s1 r52 = (C3105s1) r5;
        if (kotlin.jvm.internal.p.g(this.f12071a, r52.f12071a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f12072b, r52.f12072b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f12071a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f12072b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12071a + ", transition=" + this.f12072b + ')';
    }
}
