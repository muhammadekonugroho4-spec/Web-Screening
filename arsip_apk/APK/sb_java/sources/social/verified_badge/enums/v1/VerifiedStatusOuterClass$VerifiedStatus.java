package social.verified_badge.enums.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum VerifiedStatusOuterClass$VerifiedStatus extends Enum<VerifiedStatusOuterClass$VerifiedStatus> implements Internal.EnumLite {
    public static final VerifiedStatusOuterClass$VerifiedStatus UNRECOGNIZED = null;
    public static final VerifiedStatusOuterClass$VerifiedStatus VERIFIED_STATUS_COMMUNITY = null;
    public static final int VERIFIED_STATUS_COMMUNITY_VALUE = 2;
    public static final VerifiedStatusOuterClass$VerifiedStatus VERIFIED_STATUS_IDENTITY = null;
    public static final int VERIFIED_STATUS_IDENTITY_VALUE = 1;
    public static final VerifiedStatusOuterClass$VerifiedStatus VERIFIED_STATUS_UNVERIFIED = null;
    public static final int VERIFIED_STATUS_UNVERIFIED_VALUE = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184118a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VerifiedStatusOuterClass$VerifiedStatus[] f184119b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184120a = null;

        static {
            f184120a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (VerifiedStatusOuterClass$VerifiedStatus.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        VERIFIED_STATUS_UNVERIFIED = new VerifiedStatusOuterClass$VerifiedStatus("VERIFIED_STATUS_UNVERIFIED", 0, 0);
        VERIFIED_STATUS_IDENTITY = new VerifiedStatusOuterClass$VerifiedStatus("VERIFIED_STATUS_IDENTITY", 1, 1);
        VERIFIED_STATUS_COMMUNITY = new VerifiedStatusOuterClass$VerifiedStatus("VERIFIED_STATUS_COMMUNITY", 2, 2);
        UNRECOGNIZED = new VerifiedStatusOuterClass$VerifiedStatus("UNRECOGNIZED", 3, -1);
        f184119b = a();
        f184118a = new a();
    }

    VerifiedStatusOuterClass$VerifiedStatus(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ VerifiedStatusOuterClass$VerifiedStatus[] a() {
        return new VerifiedStatusOuterClass$VerifiedStatus[]{VERIFIED_STATUS_UNVERIFIED, VERIFIED_STATUS_IDENTITY, VERIFIED_STATUS_COMMUNITY, UNRECOGNIZED};
    }

    public static VerifiedStatusOuterClass$VerifiedStatus forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return VERIFIED_STATUS_COMMUNITY;
    L12:
        return VERIFIED_STATUS_IDENTITY;
    L14:
        return VERIFIED_STATUS_UNVERIFIED;
    }

    public static Internal.EnumLiteMap<VerifiedStatusOuterClass$VerifiedStatus> internalGetValueMap() {
        return f184118a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184120a;
    }

    public static VerifiedStatusOuterClass$VerifiedStatus valueOf(String r1) {
        return (VerifiedStatusOuterClass$VerifiedStatus) Enum.valueOf(VerifiedStatusOuterClass$VerifiedStatus.class, r1);
    }

    public static VerifiedStatusOuterClass$VerifiedStatus[] values() {
        return (VerifiedStatusOuterClass$VerifiedStatus[]) f184119b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static VerifiedStatusOuterClass$VerifiedStatus valueOf(int r02) {
        return forNumber(r02);
    }
}
