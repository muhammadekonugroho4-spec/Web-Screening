package androidx.camera.core.streamsharing;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f6019a;

    /* renamed from: b, reason: collision with root package name */
    public final Size f6020b;

    /* renamed from: c, reason: collision with root package name */
    public final Size f6021c;

    public b(Rect r2, Size r3, Size r4) {
        kotlin.jvm.internal.p.l(r2, "cropRectBeforeScaling");
        kotlin.jvm.internal.p.l(r3, "childSizeToScale");
        kotlin.jvm.internal.p.l(r4, "originalSelectedChildSize");
        this.f6019a = r2;
        this.f6020b = r3;
        this.f6021c = r4;
    }

    public final Size a() {
        return this.f6020b;
    }

    public final Rect b() {
        return this.f6019a;
    }

    public final Size c() {
        return this.f6021c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f6019a, r52.f6019a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f6020b, r52.f6020b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f6021c, r52.f6021c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f6019a.hashCode() * 31) + this.f6020b.hashCode()) * 31) + this.f6021c.hashCode();
    }

    public String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f6019a + ", childSizeToScale=" + this.f6020b + ", originalSelectedChildSize=" + this.f6021c + ')';
    }
}
