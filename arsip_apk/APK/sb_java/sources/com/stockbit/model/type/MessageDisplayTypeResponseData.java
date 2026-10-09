package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/model/type/MessageDisplayTypeResponseData;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAYED_AS_UNSPECIFIED", "DISPLAYED_AS_SENDER", "DISPLAYED_AS_RECEIVER", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum MessageDisplayTypeResponseData extends Enum<MessageDisplayTypeResponseData> {
    public static final MessageDisplayTypeResponseData DISPLAYED_AS_RECEIVER = null;
    public static final MessageDisplayTypeResponseData DISPLAYED_AS_SENDER = null;
    public static final MessageDisplayTypeResponseData DISPLAYED_AS_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageDisplayTypeResponseData[] f122183a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122184b = null;

    static {
        DISPLAYED_AS_UNSPECIFIED = new MessageDisplayTypeResponseData("DISPLAYED_AS_UNSPECIFIED", 0);
        DISPLAYED_AS_SENDER = new MessageDisplayTypeResponseData("DISPLAYED_AS_SENDER", 1);
        DISPLAYED_AS_RECEIVER = new MessageDisplayTypeResponseData("DISPLAYED_AS_RECEIVER", 2);
        MessageDisplayTypeResponseData[] r02 = a();
        f122183a = r02;
        f122184b = kotlin.enums.b.a(r02);
    }

    MessageDisplayTypeResponseData(String r1, int r2) {
    }

    public static final /* synthetic */ MessageDisplayTypeResponseData[] a() {
        return new MessageDisplayTypeResponseData[]{DISPLAYED_AS_UNSPECIFIED, DISPLAYED_AS_SENDER, DISPLAYED_AS_RECEIVER};
    }

    public static kotlin.enums.a getEntries() {
        return f122184b;
    }

    public static MessageDisplayTypeResponseData valueOf(String r1) {
        return (MessageDisplayTypeResponseData) Enum.valueOf(MessageDisplayTypeResponseData.class, r1);
    }

    public static MessageDisplayTypeResponseData[] values() {
        return (MessageDisplayTypeResponseData[]) f122183a.clone();
    }
}
