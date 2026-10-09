package com.skydoves.balloon.overlay;

import kotlin.Pair;
import kotlin.jvm.internal.i;

/* loaded from: classes6.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Pair f44170a;

    /* renamed from: b, reason: collision with root package name */
    public final Pair f44171b;

    public /* synthetic */ b(Pair r2, Pair r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }

    public final Pair a() {
        return this.f44170a;
    }

    public final Pair b() {
        return this.f44171b;
    }

    public b(Pair r2, Pair r3) {
        super(null);
        this.f44170a = r2;
        this.f44171b = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(float r2, float r3) {
        this(new Pair(Float.valueOf(r2), Float.valueOf(r3)), null, 2, 0 == true ? 1 : 0);
    }
}
