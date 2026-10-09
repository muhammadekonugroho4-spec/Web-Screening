package androidx.compose.animation;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.l f6495a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.animation.core.E f6496b;

    static {
    }

    public A(kotlin.jvm.functions.l r1, androidx.compose.animation.core.E r2) {
        this.f6495a = r1;
        this.f6496b = r2;
    }

    public final androidx.compose.animation.core.E a() {
        return this.f6496b;
    }

    public final kotlin.jvm.functions.l b() {
        return this.f6495a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof A) == true) goto L8;
        return false;
    L8:
        A r52 = (A) r5;
        if (kotlin.jvm.internal.p.g(this.f6495a, r52.f6495a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f6496b, r52.f6496b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f6495a.hashCode() * 31) + this.f6496b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f6495a + ", animationSpec=" + this.f6496b + ')';
    }
}
