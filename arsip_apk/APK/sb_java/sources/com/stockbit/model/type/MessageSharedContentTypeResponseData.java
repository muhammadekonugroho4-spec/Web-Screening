package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/model/type/MessageSharedContentTypeResponseData;", "", "<init>", "(Ljava/lang/String;I)V", "SHARED_CONTENT_TYPE_UNSPECIFIED", "SHARED_CONTENT_TYPE_STREAM", "SHARED_CONTENT_TYPE_GROUP_INVITATION", "SHARED_CONTENT_TYPE_SHARETRADE", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum MessageSharedContentTypeResponseData extends Enum<MessageSharedContentTypeResponseData> {
    public static final MessageSharedContentTypeResponseData SHARED_CONTENT_TYPE_GROUP_INVITATION = null;
    public static final MessageSharedContentTypeResponseData SHARED_CONTENT_TYPE_SHARETRADE = null;
    public static final MessageSharedContentTypeResponseData SHARED_CONTENT_TYPE_STREAM = null;
    public static final MessageSharedContentTypeResponseData SHARED_CONTENT_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageSharedContentTypeResponseData[] f122185a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122186b = null;

    static {
        SHARED_CONTENT_TYPE_UNSPECIFIED = new MessageSharedContentTypeResponseData("SHARED_CONTENT_TYPE_UNSPECIFIED", 0);
        SHARED_CONTENT_TYPE_STREAM = new MessageSharedContentTypeResponseData("SHARED_CONTENT_TYPE_STREAM", 1);
        SHARED_CONTENT_TYPE_GROUP_INVITATION = new MessageSharedContentTypeResponseData("SHARED_CONTENT_TYPE_GROUP_INVITATION", 2);
        SHARED_CONTENT_TYPE_SHARETRADE = new MessageSharedContentTypeResponseData("SHARED_CONTENT_TYPE_SHARETRADE", 3);
        MessageSharedContentTypeResponseData[] r02 = a();
        f122185a = r02;
        f122186b = kotlin.enums.b.a(r02);
    }

    MessageSharedContentTypeResponseData(String r1, int r2) {
    }

    public static final /* synthetic */ MessageSharedContentTypeResponseData[] a() {
        return new MessageSharedContentTypeResponseData[]{SHARED_CONTENT_TYPE_UNSPECIFIED, SHARED_CONTENT_TYPE_STREAM, SHARED_CONTENT_TYPE_GROUP_INVITATION, SHARED_CONTENT_TYPE_SHARETRADE};
    }

    public static kotlin.enums.a getEntries() {
        return f122186b;
    }

    public static MessageSharedContentTypeResponseData valueOf(String r1) {
        return (MessageSharedContentTypeResponseData) Enum.valueOf(MessageSharedContentTypeResponseData.class, r1);
    }

    public static MessageSharedContentTypeResponseData[] values() {
        return (MessageSharedContentTypeResponseData[]) f122185a.clone();
    }
}
