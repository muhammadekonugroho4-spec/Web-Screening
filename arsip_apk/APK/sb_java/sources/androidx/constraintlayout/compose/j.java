package androidx.constraintlayout.compose;

import androidx.compose.ui.layout.InterfaceC3618x;

/* loaded from: classes.dex */
public final class j implements InterfaceC3618x {

    /* renamed from: a, reason: collision with root package name */
    public final f f20947a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.l f20948b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20949c;

    public j(f r1, kotlin.jvm.functions.l r2) {
        this.f20947a = r1;
        this.f20948b = r2;
        this.f20949c = r1.a();
    }

    @Override // androidx.compose.ui.layout.InterfaceC3618x
    public Object P1() {
        return this.f20949c;
    }

    public final kotlin.jvm.functions.l a() {
        return this.f20948b;
    }

    public final f b() {
        return this.f20947a;
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof j) == false) goto L10;
        j r32 = (j) r3;
        if (kotlin.jvm.internal.p.g(this.f20947a.a(), r32.f20947a.a()) == true) goto L7;
        return false;
    L7:
        if (this.f20948b != r32.f20948b) goto L13;
        return true;
    L13:
        return false;
    L10:
        return false;
    }

    public int hashCode() {
        return (this.f20947a.a().hashCode() * 31) + this.f20948b.hashCode();
    }
}
