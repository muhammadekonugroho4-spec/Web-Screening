package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
final class CollectPreconditions {
    public CollectPreconditions() {
    }

    public static void checkEntryNotNull(Object r2, Object r3) {
        if (r2 == null) goto L7;
        if (r3 == null) goto L5;
        return;
    L5:
        String r22 = String.valueOf(r2);
        StringBuilder r1 = new StringBuilder(r22.length() + 26);
        r1.append("null value in entry: ");
        r1.append(r22);
        r1.append("=null");
        throw new NullPointerException(r1.toString());
    L7:
        String r32 = String.valueOf(r3);
        StringBuilder r12 = new StringBuilder(r32.length() + 24);
        r12.append("null key in entry: null=");
        r12.append(r32);
        throw new NullPointerException(r12.toString());
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int r3, String r4) {
        if (r3 < 0) goto L4;
        return r3;
    L4:
        StringBuilder r2 = new StringBuilder(String.valueOf(r4).length() + 40);
        r2.append(r4);
        r2.append(" cannot be negative but was: ");
        r2.append(r3);
        throw new IllegalArgumentException(r2.toString());
    }

    public static void checkPositive(int r3, String r4) {
        if (r3 <= 0) goto L4;
        return;
    L4:
        StringBuilder r2 = new StringBuilder(String.valueOf(r4).length() + 38);
        r2.append(r4);
        r2.append(" must be positive but was: ");
        r2.append(r3);
        throw new IllegalArgumentException(r2.toString());
    }

    public static void checkRemove(boolean r1) {
        Preconditions.checkState(r1, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long r3, String r5) {
        if (r3 < 0) goto L5;
        return r3;
    L5:
        StringBuilder r2 = new StringBuilder(String.valueOf(r5).length() + 49);
        r2.append(r5);
        r2.append(" cannot be negative but was: ");
        r2.append(r3);
        throw new IllegalArgumentException(r2.toString());
    }
}
