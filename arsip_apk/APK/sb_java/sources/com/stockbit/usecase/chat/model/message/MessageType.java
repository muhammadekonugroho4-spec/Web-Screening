package com.stockbit.usecase.chat.model.message;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/stockbit/usecase/chat/model/message/MessageType;", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGE_TEXT_ME", "MESSAGE_IMAGE_ME", "MESSAGE_IMAGE_TEXT_ME", "MESSAGE_STICKER_ME", "MESSAGE_STREAM_ME", "MESSAGE_STREAM_TEXT_ME", "MESSAGE_INVITATION_ME", "MESSAGE_DOCUMENT_ME", "MESSAGE_SHARE_TRADE_ME", "MESSAGE_TEXT_OTHER", "MESSAGE_IMAGE_OTHER", "MESSAGE_IMAGE_TEXT_OTHER", "MESSAGE_STICKER_OTHER", "MESSAGE_STREAM_OTHER", "MESSAGE_STREAM_TEXT_OTHER", "MESSAGE_INVITATION_OTHER", "MESSAGE_DOCUMENT_OTHER", "MESSAGE_SHARE_TRADE_OTHER", "MESSAGE_DATE", "MESSAGE_EVENT", "MESSAGE_UNKNOWN", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MessageType extends Enum<MessageType> {
    public static final MessageType MESSAGE_DATE = null;
    public static final MessageType MESSAGE_DOCUMENT_ME = null;
    public static final MessageType MESSAGE_DOCUMENT_OTHER = null;
    public static final MessageType MESSAGE_EVENT = null;
    public static final MessageType MESSAGE_IMAGE_ME = null;
    public static final MessageType MESSAGE_IMAGE_OTHER = null;
    public static final MessageType MESSAGE_IMAGE_TEXT_ME = null;
    public static final MessageType MESSAGE_IMAGE_TEXT_OTHER = null;
    public static final MessageType MESSAGE_INVITATION_ME = null;
    public static final MessageType MESSAGE_INVITATION_OTHER = null;
    public static final MessageType MESSAGE_SHARE_TRADE_ME = null;
    public static final MessageType MESSAGE_SHARE_TRADE_OTHER = null;
    public static final MessageType MESSAGE_STICKER_ME = null;
    public static final MessageType MESSAGE_STICKER_OTHER = null;
    public static final MessageType MESSAGE_STREAM_ME = null;
    public static final MessageType MESSAGE_STREAM_OTHER = null;
    public static final MessageType MESSAGE_STREAM_TEXT_ME = null;
    public static final MessageType MESSAGE_STREAM_TEXT_OTHER = null;
    public static final MessageType MESSAGE_TEXT_ME = null;
    public static final MessageType MESSAGE_TEXT_OTHER = null;
    public static final MessageType MESSAGE_UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageType[] f155568a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155569b = null;

    static {
        MESSAGE_TEXT_ME = new MessageType("MESSAGE_TEXT_ME", 0);
        MESSAGE_IMAGE_ME = new MessageType("MESSAGE_IMAGE_ME", 1);
        MESSAGE_IMAGE_TEXT_ME = new MessageType("MESSAGE_IMAGE_TEXT_ME", 2);
        MESSAGE_STICKER_ME = new MessageType("MESSAGE_STICKER_ME", 3);
        MESSAGE_STREAM_ME = new MessageType("MESSAGE_STREAM_ME", 4);
        MESSAGE_STREAM_TEXT_ME = new MessageType("MESSAGE_STREAM_TEXT_ME", 5);
        MESSAGE_INVITATION_ME = new MessageType("MESSAGE_INVITATION_ME", 6);
        MESSAGE_DOCUMENT_ME = new MessageType("MESSAGE_DOCUMENT_ME", 7);
        MESSAGE_SHARE_TRADE_ME = new MessageType("MESSAGE_SHARE_TRADE_ME", 8);
        MESSAGE_TEXT_OTHER = new MessageType("MESSAGE_TEXT_OTHER", 9);
        MESSAGE_IMAGE_OTHER = new MessageType("MESSAGE_IMAGE_OTHER", 10);
        MESSAGE_IMAGE_TEXT_OTHER = new MessageType("MESSAGE_IMAGE_TEXT_OTHER", 11);
        MESSAGE_STICKER_OTHER = new MessageType("MESSAGE_STICKER_OTHER", 12);
        MESSAGE_STREAM_OTHER = new MessageType("MESSAGE_STREAM_OTHER", 13);
        MESSAGE_STREAM_TEXT_OTHER = new MessageType("MESSAGE_STREAM_TEXT_OTHER", 14);
        MESSAGE_INVITATION_OTHER = new MessageType("MESSAGE_INVITATION_OTHER", 15);
        MESSAGE_DOCUMENT_OTHER = new MessageType("MESSAGE_DOCUMENT_OTHER", 16);
        MESSAGE_SHARE_TRADE_OTHER = new MessageType("MESSAGE_SHARE_TRADE_OTHER", 17);
        MESSAGE_DATE = new MessageType("MESSAGE_DATE", 18);
        MESSAGE_EVENT = new MessageType("MESSAGE_EVENT", 19);
        MESSAGE_UNKNOWN = new MessageType("MESSAGE_UNKNOWN", 20);
        MessageType[] r02 = a();
        f155568a = r02;
        f155569b = b.a(r02);
    }

    MessageType(String r1, int r2) {
    }

    public static final /* synthetic */ MessageType[] a() {
        return new MessageType[]{MESSAGE_TEXT_ME, MESSAGE_IMAGE_ME, MESSAGE_IMAGE_TEXT_ME, MESSAGE_STICKER_ME, MESSAGE_STREAM_ME, MESSAGE_STREAM_TEXT_ME, MESSAGE_INVITATION_ME, MESSAGE_DOCUMENT_ME, MESSAGE_SHARE_TRADE_ME, MESSAGE_TEXT_OTHER, MESSAGE_IMAGE_OTHER, MESSAGE_IMAGE_TEXT_OTHER, MESSAGE_STICKER_OTHER, MESSAGE_STREAM_OTHER, MESSAGE_STREAM_TEXT_OTHER, MESSAGE_INVITATION_OTHER, MESSAGE_DOCUMENT_OTHER, MESSAGE_SHARE_TRADE_OTHER, MESSAGE_DATE, MESSAGE_EVENT, MESSAGE_UNKNOWN};
    }

    public static a getEntries() {
        return f155569b;
    }

    public static MessageType valueOf(String r1) {
        return (MessageType) Enum.valueOf(MessageType.class, r1);
    }

    public static MessageType[] values() {
        return (MessageType[]) f155568a.clone();
    }
}
