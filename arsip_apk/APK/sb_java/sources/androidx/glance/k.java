package androidx.glance;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.F;

/* loaded from: classes4.dex */
public abstract class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public int f25262a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25263b;

    /* renamed from: c, reason: collision with root package name */
    public final List f25264c;

    static {
    }

    public k(int r1, boolean r2) {
        this.f25262a = r1;
        this.f25263b = r2;
        this.f25264c = new ArrayList();
    }

    public final String d() {
        return kotlin.text.r.i(F.D0(this.f25264c, ",\n", null, null, 0, null, null, 62, null), "  ");
    }

    public final List e() {
        return this.f25264c;
    }

    public final int f() {
        return this.f25262a;
    }

    public final boolean g() {
        return this.f25263b;
    }

    public final void h(int r1) {
        this.f25262a = r1;
    }

    public /* synthetic */ k(int r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = Integer.MAX_VALUE;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2);
    }
}
