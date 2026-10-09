package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.appcompat.widget.v;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.x;
import androidx.appcompat.widget.y;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f22877e = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f22878a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22879b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22880c;
    public final int d;

    public static class a {
        public static Insets a(int r02, int r1, int r2, int r3) {
            return Insets.of(r02, r1, r2, r3);
        }
    }

    static {
        f22877e = new e(0, 0, 0, 0);
    }

    public e(int r1, int r2, int r3, int r4) {
        this.f22878a = r1;
        this.f22879b = r2;
        this.f22880c = r3;
        this.d = r4;
    }

    public static e a(e r4, e r5) {
        return c(Math.max(r4.f22878a, r5.f22878a), Math.max(r4.f22879b, r5.f22879b), Math.max(r4.f22880c, r5.f22880c), Math.max(r4.d, r5.d));
    }

    public static e b(e r4, e r5) {
        return c(Math.min(r4.f22878a, r5.f22878a), Math.min(r4.f22879b, r5.f22879b), Math.min(r4.f22880c, r5.f22880c), Math.min(r4.d, r5.d));
    }

    public static e c(int r1, int r2, int r3, int r4) {
        if (r1 != 0) goto L9;
        if (r2 != 0) goto L9;
        if (r3 != 0) goto L9;
        if (r4 != 0) goto L9;
        return f22877e;
    L9:
        return new e(r1, r2, r3, r4);
    }

    public static e d(Rect r3) {
        return c(r3.left, r3.top, r3.right, r3.bottom);
    }

    public static e e(Insets r3) {
        return c(v.a(r3), w.a(r3), x.a(r3), y.a(r3));
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L23:
        return false;
    L8:
        if (e.class != r5.getClass()) goto L23;
        e r52 = (e) r5;
        if (this.d == r52.d) goto L14;
        return false;
    L14:
        if (this.f22878a == r52.f22878a) goto L17;
        return false;
    L17:
        if (this.f22880c == r52.f22880c) goto L20;
        return false;
    L20:
        if (this.f22879b == r52.f22879b) goto L22;
        return false;
    L22:
        return true;
    }

    public Insets f() {
        return a.a(this.f22878a, this.f22879b, this.f22880c, this.d);
    }

    public int hashCode() {
        return (((((this.f22878a * 31) + this.f22879b) * 31) + this.f22880c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.f22878a + ", top=" + this.f22879b + ", right=" + this.f22880c + ", bottom=" + this.d + '}';
    }
}
