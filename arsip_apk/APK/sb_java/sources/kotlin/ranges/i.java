package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.L;

/* loaded from: classes3.dex */
public final class i extends L {

    /* renamed from: a, reason: collision with root package name */
    public final int f177550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f177551b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f177552c;
    public int d;

    public i(int r3, int r4, int r5) {
        this.f177550a = r5;
        this.f177551b = r4;
        boolean r02 = false;
        if (r5 <= 0) goto L6;
        if (r3 > r4) goto L8;
    L5:
        r02 = true;
    L8:
        this.f177552c = r02;
        if (r02 == true) goto L12;
        r3 = r4;
    L12:
        this.d = r3;
        return;
    L6:
        if (r3 < r4) goto L8;
        goto L8
    }

    @Override // kotlin.collections.L
    public int a() {
        int r02 = this.d;
        if (r02 == this.f177551b) goto L5;
        this.d = this.f177550a + r02;
        return r02;
    L5:
        if (this.f177552c == false) goto L9;
        this.f177552c = false;
        return r02;
    L9:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f177552c;
    }
}
