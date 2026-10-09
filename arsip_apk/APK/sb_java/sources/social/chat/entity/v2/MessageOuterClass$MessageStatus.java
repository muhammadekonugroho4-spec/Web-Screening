package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum MessageOuterClass$MessageStatus extends Enum<MessageOuterClass$MessageStatus> implements Internal.EnumLite {
    public static final MessageOuterClass$MessageStatus MESSAGE_STATUS_READ = null;
    public static final int MESSAGE_STATUS_READ_VALUE = 2;
    public static final MessageOuterClass$MessageStatus MESSAGE_STATUS_SENT = null;
    public static final int MESSAGE_STATUS_SENT_VALUE = 1;
    public static final MessageOuterClass$MessageStatus MESSAGE_STATUS_UNSPECIFIED = null;
    public static final int MESSAGE_STATUS_UNSPECIFIED_VALUE = 0;
    public static final MessageOuterClass$MessageStatus UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184057a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MessageOuterClass$MessageStatus[] f184058b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184059a = null;

        static {
            f184059a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (MessageOuterClass$MessageStatus.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        MESSAGE_STATUS_UNSPECIFIED = new MessageOuterClass$MessageStatus("MESSAGE_STATUS_UNSPECIFIED", 0, 0);
        MESSAGE_STATUS_SENT = new MessageOuterClass$MessageStatus("MESSAGE_STATUS_SENT", 1, 1);
        MESSAGE_STATUS_READ = new MessageOuterClass$MessageStatus("MESSAGE_STATUS_READ", 2, 2);
        UNRECOGNIZED = new MessageOuterClass$MessageStatus("UNRECOGNIZED", 3, -1);
        f184058b = a();
        f184057a = new a();
    }

    MessageOuterClass$MessageStatus(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ MessageOuterClass$MessageStatus[] a() {
        return new MessageOuterClass$MessageStatus[]{MESSAGE_STATUS_UNSPECIFIED, MESSAGE_STATUS_SENT, MESSAGE_STATUS_READ, UNRECOGNIZED};
    }

    public static MessageOuterClass$MessageStatus forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return MESSAGE_STATUS_READ;
    L12:
        return MESSAGE_STATUS_SENT;
    L14:
        return MESSAGE_STATUS_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<MessageOuterClass$MessageStatus> internalGetValueMap() {
        return f184057a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184059a;
    }

    public static MessageOuterClass$MessageStatus valueOf(String r1) {
        return (MessageOuterClass$MessageStatus) Enum.valueOf(MessageOuterClass$MessageStatus.class, r1);
    }

    public static MessageOuterClass$MessageStatus[] values() {
        return (MessageOuterClass$MessageStatus[]) f184058b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MessageOuterClass$MessageStatus valueOf(int r02) {
        return forNumber(r02);
    }
}
