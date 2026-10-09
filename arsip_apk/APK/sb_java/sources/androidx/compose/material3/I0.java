package androidx.compose.material3;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12532a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.q f12533b;

    public I0(Object r1, kotlin.jvm.functions.q r2) {
        this.f12532a = r1;
        this.f12533b = r2;
    }

    public final Object a() {
        return this.f12532a;
    }

    public final kotlin.jvm.functions.q b() {
        return this.f12533b;
    }

    public final Object c() {
        return this.f12532a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof I0) == true) goto L8;
        return false;
    L8:
        I0 r52 = (I0) r5;
        if (kotlin.jvm.internal.p.g(this.f12532a, r52.f12532a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f12533b, r52.f12533b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Object r02 = this.f12532a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f12533b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12532a + ", transition=" + this.f12533b + ')';
    }
}
