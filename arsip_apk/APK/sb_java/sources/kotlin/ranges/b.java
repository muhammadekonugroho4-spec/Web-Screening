package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.AbstractC11775t;

/* loaded from: classes3.dex */
public final class b extends AbstractC11775t {

    /* renamed from: a, reason: collision with root package name */
    public final int f177538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f177539b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f177540c;
    public int d;

    public b(char r3, char r4, int r5) {
        this.f177538a = r5;
        this.f177539b = r4;
        boolean r02 = false;
        if (r5 <= 0) goto L8;
        if (kotlin.jvm.internal.p.n(r3, r4) > 0) goto L10;
    L6:
        r02 = true;
    L10:
        this.f177540c = r02;
        if (r02 == true) goto L14;
        r3 = r4;
    L14:
        this.d = r3;
        return;
    L8:
        if (kotlin.jvm.internal.p.n(r3, r4) < 0) goto L10;
        goto L10
    }

    @Override // kotlin.collections.AbstractC11775t
    public char a() {
        int r02 = this.d;
        if (r02 == this.f177539b) goto L5;
        this.d = this.f177538a + r02;
    L11:
        return (char) r02;
    L5:
        if (this.f177540c == false) goto L8;
        this.f177540c = false;
        goto L11
    L8:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f177540c;
    }
}
