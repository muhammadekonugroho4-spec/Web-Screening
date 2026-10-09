package financial.emitten.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum CompanyDetailOuterClass$StatusV2 extends Enum<CompanyDetailOuterClass$StatusV2> implements Internal.EnumLite {
    public static final CompanyDetailOuterClass$StatusV2 STATUS_V2_ACTIVE = null;
    public static final int STATUS_V2_ACTIVE_VALUE = 1;
    public static final CompanyDetailOuterClass$StatusV2 STATUS_V2_DELISTED = null;
    public static final int STATUS_V2_DELISTED_VALUE = 3;
    public static final CompanyDetailOuterClass$StatusV2 STATUS_V2_SUSPENDED = null;
    public static final int STATUS_V2_SUSPENDED_VALUE = 2;
    public static final CompanyDetailOuterClass$StatusV2 STATUS_V2_UNSPECIFIED = null;
    public static final int STATUS_V2_UNSPECIFIED_VALUE = 0;
    public static final CompanyDetailOuterClass$StatusV2 UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174179a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CompanyDetailOuterClass$StatusV2[] f174180b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174181a = null;

        static {
            f174181a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (CompanyDetailOuterClass$StatusV2.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        STATUS_V2_UNSPECIFIED = new CompanyDetailOuterClass$StatusV2("STATUS_V2_UNSPECIFIED", 0, 0);
        STATUS_V2_ACTIVE = new CompanyDetailOuterClass$StatusV2("STATUS_V2_ACTIVE", 1, 1);
        STATUS_V2_SUSPENDED = new CompanyDetailOuterClass$StatusV2("STATUS_V2_SUSPENDED", 2, 2);
        STATUS_V2_DELISTED = new CompanyDetailOuterClass$StatusV2("STATUS_V2_DELISTED", 3, 3);
        UNRECOGNIZED = new CompanyDetailOuterClass$StatusV2("UNRECOGNIZED", 4, -1);
        f174180b = a();
        f174179a = new a();
    }

    CompanyDetailOuterClass$StatusV2(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ CompanyDetailOuterClass$StatusV2[] a() {
        return new CompanyDetailOuterClass$StatusV2[]{STATUS_V2_UNSPECIFIED, STATUS_V2_ACTIVE, STATUS_V2_SUSPENDED, STATUS_V2_DELISTED, UNRECOGNIZED};
    }

    public static CompanyDetailOuterClass$StatusV2 forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return STATUS_V2_DELISTED;
    L14:
        return STATUS_V2_SUSPENDED;
    L16:
        return STATUS_V2_ACTIVE;
    L18:
        return STATUS_V2_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<CompanyDetailOuterClass$StatusV2> internalGetValueMap() {
        return f174179a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174181a;
    }

    public static CompanyDetailOuterClass$StatusV2 valueOf(String r1) {
        return (CompanyDetailOuterClass$StatusV2) Enum.valueOf(CompanyDetailOuterClass$StatusV2.class, r1);
    }

    public static CompanyDetailOuterClass$StatusV2[] values() {
        return (CompanyDetailOuterClass$StatusV2[]) f174180b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CompanyDetailOuterClass$StatusV2 valueOf(int r02) {
        return forNumber(r02);
    }
}
