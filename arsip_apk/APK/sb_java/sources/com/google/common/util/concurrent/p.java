package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class p {
    public static /* synthetic */ boolean a(AtomicReferenceArray r1, int r2, Object r3, Object r4) {
    L3:
        if (r1.compareAndSet(r2, r3, r4) == true) goto L4;
        if (r1.get(r2) == r3) goto L3;
        return false;
    L4:
        return true;
    }
}
