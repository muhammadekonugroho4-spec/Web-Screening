package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes6.dex */
interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = null;

    static {
        IMMUTABLE = new AnonymousClass1();
    }

    void ensureMutable();
}
