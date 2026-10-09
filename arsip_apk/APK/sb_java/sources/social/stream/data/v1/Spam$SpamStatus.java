package social.stream.data.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Spam$SpamStatus extends Enum<Spam$SpamStatus> implements Internal.EnumLite {
    public static final Spam$SpamStatus SPAM_STATUS_DELETED = null;
    public static final int SPAM_STATUS_DELETED_VALUE = 2;
    public static final Spam$SpamStatus SPAM_STATUS_DETECTED = null;
    public static final int SPAM_STATUS_DETECTED_VALUE = 1;
    public static final Spam$SpamStatus SPAM_STATUS_NOT_SPAM = null;
    public static final int SPAM_STATUS_NOT_SPAM_VALUE = 3;
    public static final Spam$SpamStatus SPAM_STATUS_UNSPECIFIED = null;
    public static final int SPAM_STATUS_UNSPECIFIED_VALUE = 0;
    public static final Spam$SpamStatus UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184094a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Spam$SpamStatus[] f184095b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184096a = null;

        static {
            f184096a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Spam$SpamStatus.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        SPAM_STATUS_UNSPECIFIED = new Spam$SpamStatus("SPAM_STATUS_UNSPECIFIED", 0, 0);
        SPAM_STATUS_DETECTED = new Spam$SpamStatus("SPAM_STATUS_DETECTED", 1, 1);
        SPAM_STATUS_DELETED = new Spam$SpamStatus("SPAM_STATUS_DELETED", 2, 2);
        SPAM_STATUS_NOT_SPAM = new Spam$SpamStatus("SPAM_STATUS_NOT_SPAM", 3, 3);
        UNRECOGNIZED = new Spam$SpamStatus("UNRECOGNIZED", 4, -1);
        f184095b = a();
        f184094a = new a();
    }

    Spam$SpamStatus(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Spam$SpamStatus[] a() {
        return new Spam$SpamStatus[]{SPAM_STATUS_UNSPECIFIED, SPAM_STATUS_DETECTED, SPAM_STATUS_DELETED, SPAM_STATUS_NOT_SPAM, UNRECOGNIZED};
    }

    public static Spam$SpamStatus forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return SPAM_STATUS_NOT_SPAM;
    L14:
        return SPAM_STATUS_DELETED;
    L16:
        return SPAM_STATUS_DETECTED;
    L18:
        return SPAM_STATUS_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Spam$SpamStatus> internalGetValueMap() {
        return f184094a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184096a;
    }

    public static Spam$SpamStatus valueOf(String r1) {
        return (Spam$SpamStatus) Enum.valueOf(Spam$SpamStatus.class, r1);
    }

    public static Spam$SpamStatus[] values() {
        return (Spam$SpamStatus[]) f184095b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Spam$SpamStatus valueOf(int r02) {
        return forNumber(r02);
    }
}
