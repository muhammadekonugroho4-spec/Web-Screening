package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum TombstoneProtos$Architecture extends Enum<TombstoneProtos$Architecture> implements Internal.EnumLite {
    private static final /* synthetic */ TombstoneProtos$Architecture[] $VALUES = null;
    public static final TombstoneProtos$Architecture ARM32 = null;
    public static final int ARM32_VALUE = 0;
    public static final TombstoneProtos$Architecture ARM64 = null;
    public static final int ARM64_VALUE = 1;
    public static final TombstoneProtos$Architecture NONE = null;
    public static final int NONE_VALUE = 5;
    public static final TombstoneProtos$Architecture RISCV64 = null;
    public static final int RISCV64_VALUE = 4;
    public static final TombstoneProtos$Architecture UNRECOGNIZED = null;
    public static final TombstoneProtos$Architecture X86 = null;
    public static final TombstoneProtos$Architecture X86_64 = null;
    public static final int X86_64_VALUE = 3;
    public static final int X86_VALUE = 2;
    private static final Internal.EnumLiteMap<TombstoneProtos$Architecture> internalValueMap = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f175443a = null;

        static {
            f175443a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (TombstoneProtos$Architecture.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private static /* synthetic */ TombstoneProtos$Architecture[] $values() {
        return new TombstoneProtos$Architecture[]{ARM32, ARM64, X86, X86_64, RISCV64, NONE, UNRECOGNIZED};
    }

    static {
        ARM32 = new TombstoneProtos$Architecture("ARM32", 0, 0);
        ARM64 = new TombstoneProtos$Architecture("ARM64", 1, 1);
        X86 = new TombstoneProtos$Architecture("X86", 2, 2);
        X86_64 = new TombstoneProtos$Architecture("X86_64", 3, 3);
        RISCV64 = new TombstoneProtos$Architecture("RISCV64", 4, 4);
        NONE = new TombstoneProtos$Architecture("NONE", 5, 5);
        UNRECOGNIZED = new TombstoneProtos$Architecture("UNRECOGNIZED", 6, -1);
        $VALUES = $values();
        internalValueMap = new a();
    }

    TombstoneProtos$Architecture(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static TombstoneProtos$Architecture forNumber(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 4) goto L18;
        if (r1 == 5) goto L16;
        return null;
    L16:
        return NONE;
    L18:
        return RISCV64;
    L20:
        return X86_64;
    L22:
        return X86;
    L24:
        return ARM64;
    L26:
        return ARM32;
    }

    public static Internal.EnumLiteMap<TombstoneProtos$Architecture> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f175443a;
    }

    public static TombstoneProtos$Architecture valueOf(String r1) {
        return (TombstoneProtos$Architecture) Enum.valueOf(TombstoneProtos$Architecture.class, r1);
    }

    public static TombstoneProtos$Architecture[] values() {
        return (TombstoneProtos$Architecture[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static TombstoneProtos$Architecture valueOf(int r02) {
        return forNumber(r02);
    }
}
