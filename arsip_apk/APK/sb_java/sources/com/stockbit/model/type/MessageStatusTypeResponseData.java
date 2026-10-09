package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/model/type/MessageStatusTypeResponseData;", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGE_STATUS_UNSPECIFIED", "MESSAGE_STATUS_SENT", "MESSAGE_STATUS_READ", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum MessageStatusTypeResponseData extends Enum<MessageStatusTypeResponseData> {
    public static final MessageStatusTypeResponseData MESSAGE_STATUS_READ = null;
    public static final MessageStatusTypeResponseData MESSAGE_STATUS_SENT = null;
    public static final MessageStatusTypeResponseData MESSAGE_STATUS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageStatusTypeResponseData[] f122187a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122188b = null;

    static {
        MESSAGE_STATUS_UNSPECIFIED = new MessageStatusTypeResponseData("MESSAGE_STATUS_UNSPECIFIED", 0);
        MESSAGE_STATUS_SENT = new MessageStatusTypeResponseData("MESSAGE_STATUS_SENT", 1);
        MESSAGE_STATUS_READ = new MessageStatusTypeResponseData("MESSAGE_STATUS_READ", 2);
        MessageStatusTypeResponseData[] r02 = a();
        f122187a = r02;
        f122188b = kotlin.enums.b.a(r02);
    }

    MessageStatusTypeResponseData(String r1, int r2) {
    }

    public static final /* synthetic */ MessageStatusTypeResponseData[] a() {
        return new MessageStatusTypeResponseData[]{MESSAGE_STATUS_UNSPECIFIED, MESSAGE_STATUS_SENT, MESSAGE_STATUS_READ};
    }

    public static kotlin.enums.a getEntries() {
        return f122188b;
    }

    public static MessageStatusTypeResponseData valueOf(String r1) {
        return (MessageStatusTypeResponseData) Enum.valueOf(MessageStatusTypeResponseData.class, r1);
    }

    public static MessageStatusTypeResponseData[] values() {
        return (MessageStatusTypeResponseData[]) f122187a.clone();
    }
}
