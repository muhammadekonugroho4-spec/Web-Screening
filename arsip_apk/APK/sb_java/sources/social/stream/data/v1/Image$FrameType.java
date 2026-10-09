package social.stream.data.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Image$FrameType extends Enum<Image$FrameType> implements Internal.EnumLite {
    public static final Image$FrameType FRAME_TYPE_LANDSCAPE = null;
    public static final int FRAME_TYPE_LANDSCAPE_VALUE = 3;
    public static final Image$FrameType FRAME_TYPE_PORTRAIT = null;
    public static final int FRAME_TYPE_PORTRAIT_VALUE = 2;
    public static final Image$FrameType FRAME_TYPE_SQUARE = null;
    public static final int FRAME_TYPE_SQUARE_VALUE = 1;
    public static final Image$FrameType FRAME_TYPE_UNSPECIFIED = null;
    public static final int FRAME_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Image$FrameType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184091a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Image$FrameType[] f184092b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184093a = null;

        static {
            f184093a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Image$FrameType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        FRAME_TYPE_UNSPECIFIED = new Image$FrameType("FRAME_TYPE_UNSPECIFIED", 0, 0);
        FRAME_TYPE_SQUARE = new Image$FrameType("FRAME_TYPE_SQUARE", 1, 1);
        FRAME_TYPE_PORTRAIT = new Image$FrameType("FRAME_TYPE_PORTRAIT", 2, 2);
        FRAME_TYPE_LANDSCAPE = new Image$FrameType("FRAME_TYPE_LANDSCAPE", 3, 3);
        UNRECOGNIZED = new Image$FrameType("UNRECOGNIZED", 4, -1);
        f184092b = a();
        f184091a = new a();
    }

    Image$FrameType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Image$FrameType[] a() {
        return new Image$FrameType[]{FRAME_TYPE_UNSPECIFIED, FRAME_TYPE_SQUARE, FRAME_TYPE_PORTRAIT, FRAME_TYPE_LANDSCAPE, UNRECOGNIZED};
    }

    public static Image$FrameType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return FRAME_TYPE_LANDSCAPE;
    L14:
        return FRAME_TYPE_PORTRAIT;
    L16:
        return FRAME_TYPE_SQUARE;
    L18:
        return FRAME_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Image$FrameType> internalGetValueMap() {
        return f184091a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184093a;
    }

    public static Image$FrameType valueOf(String r1) {
        return (Image$FrameType) Enum.valueOf(Image$FrameType.class, r1);
    }

    public static Image$FrameType[] values() {
        return (Image$FrameType[]) f184092b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Image$FrameType valueOf(int r02) {
        return forNumber(r02);
    }
}
