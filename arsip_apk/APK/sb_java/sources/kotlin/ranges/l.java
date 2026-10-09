package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.M;

/* loaded from: classes3.dex */
public final class l extends M {

    /* renamed from: a, reason: collision with root package name */
    public final long f177558a;

    /* renamed from: b, reason: collision with root package name */
    public final long f177559b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f177560c;
    public long d;

    public l(long r3, long r5, long r7) {
        this.f177558a = r7;
        this.f177559b = r5;
        boolean r8 = false;
        if (r7 <= 0) goto L8;
        if (r3 > r5) goto L10;
    L6:
        r8 = true;
    L10:
        this.f177560c = r8;
        if (r8 == true) goto L14;
        r3 = r5;
    L14:
        this.d = r3;
        return;
    L8:
        if (r3 < r5) goto L10;
        goto L10
    }

    @Override // kotlin.collections.M
    public long a() {
        long r02 = this.d;
        if (r02 == this.f177559b) goto L5;
        this.d = this.f177558a + r02;
        return r02;
    L5:
        if (this.f177560c == false) goto L9;
        this.f177560c = false;
        return r02;
    L9:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f177560c;
    }
}
