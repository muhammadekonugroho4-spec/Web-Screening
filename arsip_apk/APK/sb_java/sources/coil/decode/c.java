package coil.decode;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f29910a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29911b;

    public c(Drawable r1, boolean r2) {
        this.f29910a = r1;
        this.f29911b = r2;
    }

    public final Drawable a() {
        return this.f29910a;
    }

    public final boolean b() {
        return this.f29911b;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == false) goto L12;
        c r42 = (c) r4;
        if (p.g(this.f29910a, r42.f29910a) == true) goto L10;
        return false;
    L10:
        if (this.f29911b != r42.f29911b) goto L15;
        return true;
    L15:
        return false;
    L12:
        return false;
    }

    public int hashCode() {
        return (this.f29910a.hashCode() * 31) + Boolean.hashCode(this.f29911b);
    }
}
