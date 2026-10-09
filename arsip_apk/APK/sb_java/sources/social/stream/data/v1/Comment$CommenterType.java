package social.stream.data.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Comment$CommenterType extends Enum<Comment$CommenterType> implements Internal.EnumLite {
    public static final Comment$CommenterType COMMENTER_TYPE_EVERYONE = null;
    public static final int COMMENTER_TYPE_EVERYONE_VALUE = 0;
    public static final Comment$CommenterType COMMENTER_TYPE_FOLLOWING = null;
    public static final int COMMENTER_TYPE_FOLLOWING_VALUE = 1;
    public static final Comment$CommenterType COMMENTER_TYPE_MENTION = null;
    public static final int COMMENTER_TYPE_MENTION_VALUE = 2;
    public static final Comment$CommenterType COMMENTER_TYPE_ONLY_YOU = null;
    public static final int COMMENTER_TYPE_ONLY_YOU_VALUE = 3;
    public static final Comment$CommenterType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184088a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Comment$CommenterType[] f184089b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184090a = null;

        static {
            f184090a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Comment$CommenterType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        COMMENTER_TYPE_EVERYONE = new Comment$CommenterType("COMMENTER_TYPE_EVERYONE", 0, 0);
        COMMENTER_TYPE_FOLLOWING = new Comment$CommenterType("COMMENTER_TYPE_FOLLOWING", 1, 1);
        COMMENTER_TYPE_MENTION = new Comment$CommenterType("COMMENTER_TYPE_MENTION", 2, 2);
        COMMENTER_TYPE_ONLY_YOU = new Comment$CommenterType("COMMENTER_TYPE_ONLY_YOU", 3, 3);
        UNRECOGNIZED = new Comment$CommenterType("UNRECOGNIZED", 4, -1);
        f184089b = a();
        f184088a = new a();
    }

    Comment$CommenterType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Comment$CommenterType[] a() {
        return new Comment$CommenterType[]{COMMENTER_TYPE_EVERYONE, COMMENTER_TYPE_FOLLOWING, COMMENTER_TYPE_MENTION, COMMENTER_TYPE_ONLY_YOU, UNRECOGNIZED};
    }

    public static Comment$CommenterType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return COMMENTER_TYPE_ONLY_YOU;
    L14:
        return COMMENTER_TYPE_MENTION;
    L16:
        return COMMENTER_TYPE_FOLLOWING;
    L18:
        return COMMENTER_TYPE_EVERYONE;
    }

    public static Internal.EnumLiteMap<Comment$CommenterType> internalGetValueMap() {
        return f184088a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184090a;
    }

    public static Comment$CommenterType valueOf(String r1) {
        return (Comment$CommenterType) Enum.valueOf(Comment$CommenterType.class, r1);
    }

    public static Comment$CommenterType[] values() {
        return (Comment$CommenterType[]) f184089b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Comment$CommenterType valueOf(int r02) {
        return forNumber(r02);
    }
}
