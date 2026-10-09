package androidx.compose.material3;

/* loaded from: classes.dex */
public final class H3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f12528a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12529b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12530c;

    static {
    }

    public /* synthetic */ H3(float r1, float r2, float r3, kotlin.jvm.internal.i r4) {
        this(r1, r2, r3);
    }

    public final float a() {
        return this.f12530c;
    }

    public final float b() {
        return this.f12528a;
    }

    public final float c() {
        return androidx.compose.ui.unit.i.h(this.f12528a + this.f12529b);
    }

    public final float d() {
        return this.f12529b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof H3) == true) goto L8;
        return false;
    L8:
        H3 r52 = (H3) r5;
        if (androidx.compose.ui.unit.i.j(this.f12528a, r52.f12528a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.i.j(this.f12529b, r52.f12529b) == true) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.unit.i.j(this.f12530c, r52.f12530c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((androidx.compose.ui.unit.i.k(this.f12528a) * 31) + androidx.compose.ui.unit.i.k(this.f12529b)) * 31) + androidx.compose.ui.unit.i.k(this.f12530c);
    }

    public String toString() {
        return "TabPosition(left=" + androidx.compose.ui.unit.i.l(this.f12528a) + ", right=" + androidx.compose.ui.unit.i.l(c()) + ", width=" + androidx.compose.ui.unit.i.l(this.f12529b) + ", contentWidth=" + androidx.compose.ui.unit.i.l(this.f12530c) + ')';
    }

    public H3(float r1, float r2, float r3) {
        this.f12528a = r1;
        this.f12529b = r2;
        this.f12530c = r3;
    }
}
