package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.x;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f18180a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f18181b;

    static {
    }

    public e() {
        this.f18181b = new long[2];
    }

    public final boolean a(long r2) {
        if (c(r2) == true) goto L6;
        j(this.f18180a, r2);
        return true;
    L6:
        return false;
    }

    public final void b() {
        this.f18180a = 0;
    }

    public final boolean c(long r7) {
        int r02 = this.f18180a;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L9;
        if (this.f18181b[r2] == r7) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public final long d(int r4) {
        return x.a(this.f18181b[r4]);
    }

    public final int e() {
        return this.f18180a;
    }

    public final boolean f() {
        if (this.f18180a != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean g(long r7) {
        int r02 = this.f18180a;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L12;
        if (r7 == this.f18181b[r2]) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        int r72 = this.f18180a - 1;
    L7:
        if (r2 >= r72) goto L9;
        long[] r03 = this.f18181b;
        int r1 = r2 + 1;
        r03[r2] = r03[r1];
        r2 = r1;
        goto L7
    L9:
        this.f18180a--;
        return true;
    L12:
        return false;
    }

    public final boolean h(int r7) {
        int r02 = this.f18180a;
        if (r7 >= r02) goto L9;
        int r03 = r02 - 1;
    L5:
        if (r7 >= r03) goto L7;
        long[] r2 = this.f18181b;
        int r3 = r7 + 1;
        r2[r7] = r2[r3];
        r7 = r3;
        goto L5
    L7:
        this.f18180a--;
        return true;
    L9:
        return false;
    }

    public final long[] i(int r3) {
        long[] r02 = this.f18181b;
        long[] r32 = Arrays.copyOf(r02, Math.max(r3, r02.length * 2));
        p.k(r32, "copyOf(...)");
        this.f18181b = r32;
        return r32;
    }

    public final void j(int r3, long r4) {
        long[] r02 = this.f18181b;
        if (r3 < r02.length) goto L5;
        r02 = i(r3 + 1);
    L5:
        r02[r3] = r4;
        if (r3 < this.f18180a) goto L9;
        this.f18180a = r3 + 1;
        return;
    }
}
