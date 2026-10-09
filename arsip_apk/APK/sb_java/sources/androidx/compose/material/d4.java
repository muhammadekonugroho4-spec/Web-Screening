package androidx.compose.material;

/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public final float f11779a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11780b;

    static {
    }

    public /* synthetic */ d4(float r1, float r2, kotlin.jvm.internal.i r3) {
        this(r1, r2);
    }

    public final float a() {
        return this.f11779a;
    }

    public final float b() {
        return androidx.compose.ui.unit.i.h(this.f11779a + this.f11780b);
    }

    public final float c() {
        return this.f11780b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d4) == true) goto L8;
        return false;
    L8:
        d4 r52 = (d4) r5;
        if (androidx.compose.ui.unit.i.j(this.f11779a, r52.f11779a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.i.j(this.f11780b, r52.f11780b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (androidx.compose.ui.unit.i.k(this.f11779a) * 31) + androidx.compose.ui.unit.i.k(this.f11780b);
    }

    public String toString() {
        return "TabPosition(left=" + androidx.compose.ui.unit.i.l(this.f11779a) + ", right=" + androidx.compose.ui.unit.i.l(b()) + ", width=" + androidx.compose.ui.unit.i.l(this.f11780b) + ')';
    }

    public d4(float r1, float r2) {
        this.f11779a = r1;
        this.f11780b = r2;
    }
}
