package com.stockbit.usecase.chat.model.chat.message;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/message/MessageUploadType;", "", "<init>", "(Ljava/lang/String;I)V", "UPLOAD_TYPE_UNSPECIFIED", "UPLOAD_TYPE_PICTURE", "UPLOAD_TYPE_DOCUMENT", "UPLOAD_TYPE_STICKER", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MessageUploadType extends Enum<MessageUploadType> {
    public static final a Companion = null;
    public static final MessageUploadType UPLOAD_TYPE_DOCUMENT = null;
    public static final MessageUploadType UPLOAD_TYPE_PICTURE = null;
    public static final MessageUploadType UPLOAD_TYPE_STICKER = null;
    public static final MessageUploadType UPLOAD_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageUploadType[] f155247a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155248b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        UPLOAD_TYPE_UNSPECIFIED = new MessageUploadType("UPLOAD_TYPE_UNSPECIFIED", 0);
        UPLOAD_TYPE_PICTURE = new MessageUploadType("UPLOAD_TYPE_PICTURE", 1);
        UPLOAD_TYPE_DOCUMENT = new MessageUploadType("UPLOAD_TYPE_DOCUMENT", 2);
        UPLOAD_TYPE_STICKER = new MessageUploadType("UPLOAD_TYPE_STICKER", 3);
        MessageUploadType[] r02 = a();
        f155247a = r02;
        f155248b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    MessageUploadType(String r1, int r2) {
    }

    public static final /* synthetic */ MessageUploadType[] a() {
        return new MessageUploadType[]{UPLOAD_TYPE_UNSPECIFIED, UPLOAD_TYPE_PICTURE, UPLOAD_TYPE_DOCUMENT, UPLOAD_TYPE_STICKER};
    }

    public static kotlin.enums.a getEntries() {
        return f155248b;
    }

    public static MessageUploadType valueOf(String r1) {
        return (MessageUploadType) Enum.valueOf(MessageUploadType.class, r1);
    }

    public static MessageUploadType[] values() {
        return (MessageUploadType[]) f155247a.clone();
    }
}
