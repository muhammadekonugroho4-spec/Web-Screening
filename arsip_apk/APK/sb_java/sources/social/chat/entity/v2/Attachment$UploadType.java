package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Attachment$UploadType extends Enum<Attachment$UploadType> implements Internal.EnumLite {
    public static final Attachment$UploadType UNRECOGNIZED = null;
    public static final Attachment$UploadType UPLOAD_TYPE_DOCUMENT = null;
    public static final int UPLOAD_TYPE_DOCUMENT_VALUE = 2;
    public static final Attachment$UploadType UPLOAD_TYPE_PICTURE = null;
    public static final int UPLOAD_TYPE_PICTURE_VALUE = 1;
    public static final Attachment$UploadType UPLOAD_TYPE_STICKER = null;
    public static final int UPLOAD_TYPE_STICKER_VALUE = 3;
    public static final Attachment$UploadType UPLOAD_TYPE_UNSPECIFIED = null;
    public static final int UPLOAD_TYPE_UNSPECIFIED_VALUE = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184023a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Attachment$UploadType[] f184024b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184025a = null;

        static {
            f184025a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Attachment$UploadType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        UPLOAD_TYPE_UNSPECIFIED = new Attachment$UploadType("UPLOAD_TYPE_UNSPECIFIED", 0, 0);
        UPLOAD_TYPE_PICTURE = new Attachment$UploadType("UPLOAD_TYPE_PICTURE", 1, 1);
        UPLOAD_TYPE_DOCUMENT = new Attachment$UploadType("UPLOAD_TYPE_DOCUMENT", 2, 2);
        UPLOAD_TYPE_STICKER = new Attachment$UploadType("UPLOAD_TYPE_STICKER", 3, 3);
        UNRECOGNIZED = new Attachment$UploadType("UNRECOGNIZED", 4, -1);
        f184024b = a();
        f184023a = new a();
    }

    Attachment$UploadType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Attachment$UploadType[] a() {
        return new Attachment$UploadType[]{UPLOAD_TYPE_UNSPECIFIED, UPLOAD_TYPE_PICTURE, UPLOAD_TYPE_DOCUMENT, UPLOAD_TYPE_STICKER, UNRECOGNIZED};
    }

    public static Attachment$UploadType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return UPLOAD_TYPE_STICKER;
    L14:
        return UPLOAD_TYPE_DOCUMENT;
    L16:
        return UPLOAD_TYPE_PICTURE;
    L18:
        return UPLOAD_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Attachment$UploadType> internalGetValueMap() {
        return f184023a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184025a;
    }

    public static Attachment$UploadType valueOf(String r1) {
        return (Attachment$UploadType) Enum.valueOf(Attachment$UploadType.class, r1);
    }

    public static Attachment$UploadType[] values() {
        return (Attachment$UploadType[]) f184024b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Attachment$UploadType valueOf(int r02) {
        return forNumber(r02);
    }
}
