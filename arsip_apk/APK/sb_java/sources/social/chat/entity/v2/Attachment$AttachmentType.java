package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Attachment$AttachmentType extends Enum<Attachment$AttachmentType> implements Internal.EnumLite {
    public static final Attachment$AttachmentType ATTACHMENT_TYPE_SHARED = null;
    public static final int ATTACHMENT_TYPE_SHARED_VALUE = 2;
    public static final Attachment$AttachmentType ATTACHMENT_TYPE_UNSPECIFIED = null;
    public static final int ATTACHMENT_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Attachment$AttachmentType ATTACHMENT_TYPE_UPLOADED = null;
    public static final int ATTACHMENT_TYPE_UPLOADED_VALUE = 1;
    public static final Attachment$AttachmentType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184019a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Attachment$AttachmentType[] f184020b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184021a = null;

        static {
            f184021a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Attachment$AttachmentType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ATTACHMENT_TYPE_UNSPECIFIED = new Attachment$AttachmentType("ATTACHMENT_TYPE_UNSPECIFIED", 0, 0);
        ATTACHMENT_TYPE_UPLOADED = new Attachment$AttachmentType("ATTACHMENT_TYPE_UPLOADED", 1, 1);
        ATTACHMENT_TYPE_SHARED = new Attachment$AttachmentType("ATTACHMENT_TYPE_SHARED", 2, 2);
        UNRECOGNIZED = new Attachment$AttachmentType("UNRECOGNIZED", 3, -1);
        f184020b = a();
        f184019a = new a();
    }

    Attachment$AttachmentType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Attachment$AttachmentType[] a() {
        return new Attachment$AttachmentType[]{ATTACHMENT_TYPE_UNSPECIFIED, ATTACHMENT_TYPE_UPLOADED, ATTACHMENT_TYPE_SHARED, UNRECOGNIZED};
    }

    public static Attachment$AttachmentType forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return ATTACHMENT_TYPE_SHARED;
    L12:
        return ATTACHMENT_TYPE_UPLOADED;
    L14:
        return ATTACHMENT_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Attachment$AttachmentType> internalGetValueMap() {
        return f184019a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184021a;
    }

    public static Attachment$AttachmentType valueOf(String r1) {
        return (Attachment$AttachmentType) Enum.valueOf(Attachment$AttachmentType.class, r1);
    }

    public static Attachment$AttachmentType[] values() {
        return (Attachment$AttachmentType[]) f184020b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Attachment$AttachmentType valueOf(int r02) {
        return forNumber(r02);
    }
}
