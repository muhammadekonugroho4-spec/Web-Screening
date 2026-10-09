package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum MessageContent$SharedContentType extends Enum<MessageContent$SharedContentType> implements Internal.EnumLite {
    public static final MessageContent$SharedContentType SHARED_CONTENT_TYPE_GROUP_INVITATION = null;
    public static final int SHARED_CONTENT_TYPE_GROUP_INVITATION_VALUE = 2;
    public static final MessageContent$SharedContentType SHARED_CONTENT_TYPE_SHARETRADE = null;
    public static final int SHARED_CONTENT_TYPE_SHARETRADE_VALUE = 3;
    public static final MessageContent$SharedContentType SHARED_CONTENT_TYPE_STREAM = null;
    public static final int SHARED_CONTENT_TYPE_STREAM_VALUE = 1;
    public static final MessageContent$SharedContentType SHARED_CONTENT_TYPE_UNSPECIFIED = null;
    public static final int SHARED_CONTENT_TYPE_UNSPECIFIED_VALUE = 0;
    public static final MessageContent$SharedContentType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184047a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MessageContent$SharedContentType[] f184048b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184049a = null;

        static {
            f184049a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (MessageContent$SharedContentType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        SHARED_CONTENT_TYPE_UNSPECIFIED = new MessageContent$SharedContentType("SHARED_CONTENT_TYPE_UNSPECIFIED", 0, 0);
        SHARED_CONTENT_TYPE_STREAM = new MessageContent$SharedContentType("SHARED_CONTENT_TYPE_STREAM", 1, 1);
        SHARED_CONTENT_TYPE_GROUP_INVITATION = new MessageContent$SharedContentType("SHARED_CONTENT_TYPE_GROUP_INVITATION", 2, 2);
        SHARED_CONTENT_TYPE_SHARETRADE = new MessageContent$SharedContentType("SHARED_CONTENT_TYPE_SHARETRADE", 3, 3);
        UNRECOGNIZED = new MessageContent$SharedContentType("UNRECOGNIZED", 4, -1);
        f184048b = a();
        f184047a = new a();
    }

    MessageContent$SharedContentType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ MessageContent$SharedContentType[] a() {
        return new MessageContent$SharedContentType[]{SHARED_CONTENT_TYPE_UNSPECIFIED, SHARED_CONTENT_TYPE_STREAM, SHARED_CONTENT_TYPE_GROUP_INVITATION, SHARED_CONTENT_TYPE_SHARETRADE, UNRECOGNIZED};
    }

    public static MessageContent$SharedContentType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return SHARED_CONTENT_TYPE_SHARETRADE;
    L14:
        return SHARED_CONTENT_TYPE_GROUP_INVITATION;
    L16:
        return SHARED_CONTENT_TYPE_STREAM;
    L18:
        return SHARED_CONTENT_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<MessageContent$SharedContentType> internalGetValueMap() {
        return f184047a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184049a;
    }

    public static MessageContent$SharedContentType valueOf(String r1) {
        return (MessageContent$SharedContentType) Enum.valueOf(MessageContent$SharedContentType.class, r1);
    }

    public static MessageContent$SharedContentType[] values() {
        return (MessageContent$SharedContentType[]) f184048b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MessageContent$SharedContentType valueOf(int r02) {
        return forNumber(r02);
    }
}
