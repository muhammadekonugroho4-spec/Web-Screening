package androidx.compose.animation;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final float f6974a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.animation.core.E f6975b;

    static {
    }

    public p(float r1, androidx.compose.animation.core.E r2) {
        this.f6974a = r1;
        this.f6975b = r2;
    }

    public final float a() {
        return this.f6974a;
    }

    public final androidx.compose.animation.core.E b() {
        return this.f6975b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (Float.compare(this.f6974a, r52.f6974a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f6975b, r52.f6975b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f6974a) * 31) + this.f6975b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f6974a + ", animationSpec=" + this.f6975b + ')';
    }
}
