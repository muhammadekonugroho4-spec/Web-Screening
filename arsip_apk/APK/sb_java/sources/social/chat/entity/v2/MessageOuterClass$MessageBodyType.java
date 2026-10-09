package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum MessageOuterClass$MessageBodyType extends Enum<MessageOuterClass$MessageBodyType> implements Internal.EnumLite {
    public static final MessageOuterClass$MessageBodyType MESSAGE_BODY_TYPE_CONVERSATION = null;
    public static final int MESSAGE_BODY_TYPE_CONVERSATION_VALUE = 1;
    public static final MessageOuterClass$MessageBodyType MESSAGE_BODY_TYPE_EVENT = null;
    public static final int MESSAGE_BODY_TYPE_EVENT_VALUE = 2;
    public static final MessageOuterClass$MessageBodyType MESSAGE_BODY_TYPE_UNSPECIFIED = null;
    public static final int MESSAGE_BODY_TYPE_UNSPECIFIED_VALUE = 0;
    public static final MessageOuterClass$MessageBodyType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184051a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MessageOuterClass$MessageBodyType[] f184052b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184053a = null;

        static {
            f184053a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (MessageOuterClass$MessageBodyType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        MESSAGE_BODY_TYPE_UNSPECIFIED = new MessageOuterClass$MessageBodyType("MESSAGE_BODY_TYPE_UNSPECIFIED", 0, 0);
        MESSAGE_BODY_TYPE_CONVERSATION = new MessageOuterClass$MessageBodyType("MESSAGE_BODY_TYPE_CONVERSATION", 1, 1);
        MESSAGE_BODY_TYPE_EVENT = new MessageOuterClass$MessageBodyType("MESSAGE_BODY_TYPE_EVENT", 2, 2);
        UNRECOGNIZED = new MessageOuterClass$MessageBodyType("UNRECOGNIZED", 3, -1);
        f184052b = a();
        f184051a = new a();
    }

    MessageOuterClass$MessageBodyType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ MessageOuterClass$MessageBodyType[] a() {
        return new MessageOuterClass$MessageBodyType[]{MESSAGE_BODY_TYPE_UNSPECIFIED, MESSAGE_BODY_TYPE_CONVERSATION, MESSAGE_BODY_TYPE_EVENT, UNRECOGNIZED};
    }

    public static MessageOuterClass$MessageBodyType forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return MESSAGE_BODY_TYPE_EVENT;
    L12:
        return MESSAGE_BODY_TYPE_CONVERSATION;
    L14:
        return MESSAGE_BODY_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<MessageOuterClass$MessageBodyType> internalGetValueMap() {
        return f184051a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184053a;
    }

    public static MessageOuterClass$MessageBodyType valueOf(String r1) {
        return (MessageOuterClass$MessageBodyType) Enum.valueOf(MessageOuterClass$MessageBodyType.class, r1);
    }

    public static MessageOuterClass$MessageBodyType[] values() {
        return (MessageOuterClass$MessageBodyType[]) f184052b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MessageOuterClass$MessageBodyType valueOf(int r02) {
        return forNumber(r02);
    }
}
