package financial.emitten.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum CompanyDetailOuterClass$Status extends Enum<CompanyDetailOuterClass$Status> implements Internal.EnumLite {
    public static final CompanyDetailOuterClass$Status STATUS_ACTIVE = null;
    public static final int STATUS_ACTIVE_VALUE = 0;
    public static final CompanyDetailOuterClass$Status STATUS_DELISTED = null;
    public static final int STATUS_DELISTED_VALUE = 2;
    public static final CompanyDetailOuterClass$Status STATUS_SUSPENDED = null;
    public static final int STATUS_SUSPENDED_VALUE = 1;
    public static final CompanyDetailOuterClass$Status UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174176a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ CompanyDetailOuterClass$Status[] f174177b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174178a = null;

        static {
            f174178a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (CompanyDetailOuterClass$Status.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        STATUS_ACTIVE = new CompanyDetailOuterClass$Status("STATUS_ACTIVE", 0, 0);
        STATUS_SUSPENDED = new CompanyDetailOuterClass$Status("STATUS_SUSPENDED", 1, 1);
        STATUS_DELISTED = new CompanyDetailOuterClass$Status("STATUS_DELISTED", 2, 2);
        UNRECOGNIZED = new CompanyDetailOuterClass$Status("UNRECOGNIZED", 3, -1);
        f174177b = a();
        f174176a = new a();
    }

    CompanyDetailOuterClass$Status(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ CompanyDetailOuterClass$Status[] a() {
        return new CompanyDetailOuterClass$Status[]{STATUS_ACTIVE, STATUS_SUSPENDED, STATUS_DELISTED, UNRECOGNIZED};
    }

    public static CompanyDetailOuterClass$Status forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return STATUS_DELISTED;
    L12:
        return STATUS_SUSPENDED;
    L14:
        return STATUS_ACTIVE;
    }

    public static Internal.EnumLiteMap<CompanyDetailOuterClass$Status> internalGetValueMap() {
        return f174176a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174178a;
    }

    public static CompanyDetailOuterClass$Status valueOf(String r1) {
        return (CompanyDetailOuterClass$Status) Enum.valueOf(CompanyDetailOuterClass$Status.class, r1);
    }

    public static CompanyDetailOuterClass$Status[] values() {
        return (CompanyDetailOuterClass$Status[]) f174177b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CompanyDetailOuterClass$Status valueOf(int r02) {
        return forNumber(r02);
    }
}
