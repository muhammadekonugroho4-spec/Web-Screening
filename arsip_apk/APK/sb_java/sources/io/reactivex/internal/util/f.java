package io.reactivex.internal.util;

/* loaded from: classes2.dex */
public abstract class f {
    public static int a(int r1) {
        return 1 << (32 - Integer.numberOfLeadingZeros(r1 - 1));
    }
}
