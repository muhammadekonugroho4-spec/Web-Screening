package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes5.dex */
public enum RemovalCause extends Enum<RemovalCause> {
    private static final /* synthetic */ RemovalCause[] $VALUES = null;
    public static final RemovalCause COLLECTED = null;
    public static final RemovalCause EXPIRED = null;
    public static final RemovalCause EXPLICIT = null;
    public static final RemovalCause REPLACED = null;
    public static final RemovalCause SIZE = null;

    private static /* synthetic */ RemovalCause[] $values() {
        return new RemovalCause[]{EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE};
    }

    static {
        final String r1 = "EXPLICIT";
        final int r2 = 0;
        EXPLICIT = new AnonymousClass1(r1, r2);
        final String r12 = "REPLACED";
        final int r22 = 1;
        REPLACED = new AnonymousClass2(r12, r22);
        final String r13 = "COLLECTED";
        final int r23 = 2;
        COLLECTED = new AnonymousClass3(r13, r23);
        final String r14 = "EXPIRED";
        final int r24 = 3;
        EXPIRED = new AnonymousClass4(r14, r24);
        final String r15 = "SIZE";
        final int r25 = 4;
        SIZE = new AnonymousClass5(r15, r25);
        $VALUES = $values();
    }

    RemovalCause(String r1, int r2) {
    }

    public static RemovalCause valueOf(String r1) {
        return (RemovalCause) Enum.valueOf(RemovalCause.class, r1);
    }

    public static RemovalCause[] values() {
        return (RemovalCause[]) $VALUES.clone();
    }

    public abstract boolean wasEvicted();

    /* synthetic */ RemovalCause(String r1, int r2, AnonymousClass1 r3) {
        this(r1, r2);
    }
}
