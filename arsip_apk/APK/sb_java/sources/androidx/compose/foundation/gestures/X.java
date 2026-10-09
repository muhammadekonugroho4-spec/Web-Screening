package androidx.compose.foundation.gestures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.AbstractC11772p;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final List f7650a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f7651b;

    static {
    }

    public X() {
        this.f7650a = new ArrayList();
        float[] r1 = new float[5];
        int r2 = 0;
    L3:
        if (r2 >= 5) goto L5;
        r1[r2] = Float.NaN;
        r2 = r2 + 1;
        goto L3
    L5:
        this.f7651b = r1;
    }

    public final void a(Object r2, float r3) {
        this.f7650a.add(r2);
        if (this.f7651b.length >= this.f7650a.size()) goto L5;
        d();
    L5:
        this.f7651b[this.f7650a.size() - 1] = r3;
    }

    public final List b() {
        return this.f7650a;
    }

    public final float[] c() {
        return AbstractC11772p.v(this.f7651b, 0, this.f7650a.size());
    }

    public final void d() {
        float[] r02 = Arrays.copyOf(this.f7651b, this.f7650a.size() + 2);
        kotlin.jvm.internal.p.k(r02, "copyOf(...)");
        this.f7651b = r02;
    }
}
