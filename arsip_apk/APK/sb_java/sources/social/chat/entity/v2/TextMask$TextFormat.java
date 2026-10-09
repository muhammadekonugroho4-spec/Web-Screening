package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum TextMask$TextFormat extends Enum<TextMask$TextFormat> implements Internal.EnumLite {
    public static final TextMask$TextFormat TEXT_FORMAT_BOLD = null;
    public static final int TEXT_FORMAT_BOLD_VALUE = 1;
    public static final TextMask$TextFormat TEXT_FORMAT_ITALIC = null;
    public static final int TEXT_FORMAT_ITALIC_VALUE = 2;
    public static final TextMask$TextFormat TEXT_FORMAT_REGULAR = null;
    public static final int TEXT_FORMAT_REGULAR_VALUE = 0;
    public static final TextMask$TextFormat UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184075a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TextMask$TextFormat[] f184076b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184077a = null;

        static {
            f184077a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (TextMask$TextFormat.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        TEXT_FORMAT_REGULAR = new TextMask$TextFormat("TEXT_FORMAT_REGULAR", 0, 0);
        TEXT_FORMAT_BOLD = new TextMask$TextFormat("TEXT_FORMAT_BOLD", 1, 1);
        TEXT_FORMAT_ITALIC = new TextMask$TextFormat("TEXT_FORMAT_ITALIC", 2, 2);
        UNRECOGNIZED = new TextMask$TextFormat("UNRECOGNIZED", 3, -1);
        f184076b = a();
        f184075a = new a();
    }

    TextMask$TextFormat(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ TextMask$TextFormat[] a() {
        return new TextMask$TextFormat[]{TEXT_FORMAT_REGULAR, TEXT_FORMAT_BOLD, TEXT_FORMAT_ITALIC, UNRECOGNIZED};
    }

    public static TextMask$TextFormat forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return TEXT_FORMAT_ITALIC;
    L12:
        return TEXT_FORMAT_BOLD;
    L14:
        return TEXT_FORMAT_REGULAR;
    }

    public static Internal.EnumLiteMap<TextMask$TextFormat> internalGetValueMap() {
        return f184075a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184077a;
    }

    public static TextMask$TextFormat valueOf(String r1) {
        return (TextMask$TextFormat) Enum.valueOf(TextMask$TextFormat.class, r1);
    }

    public static TextMask$TextFormat[] values() {
        return (TextMask$TextFormat[]) f184076b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static TextMask$TextFormat valueOf(int r02) {
        return forNumber(r02);
    }
}
