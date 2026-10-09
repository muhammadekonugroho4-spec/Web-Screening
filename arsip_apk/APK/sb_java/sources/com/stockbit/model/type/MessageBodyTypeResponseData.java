package com.stockbit.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/model/type/MessageBodyTypeResponseData;", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGE_BODY_TYPE_UNSPECIFIED", "MESSAGE_BODY_TYPE_CONVERSATION", "MESSAGE_BODY_TYPE_EVENT", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum MessageBodyTypeResponseData extends Enum<MessageBodyTypeResponseData> {
    public static final a Companion = null;
    public static final MessageBodyTypeResponseData MESSAGE_BODY_TYPE_CONVERSATION = null;
    public static final MessageBodyTypeResponseData MESSAGE_BODY_TYPE_EVENT = null;
    public static final MessageBodyTypeResponseData MESSAGE_BODY_TYPE_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageBodyTypeResponseData[] f122181a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122182b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        MESSAGE_BODY_TYPE_UNSPECIFIED = new MessageBodyTypeResponseData("MESSAGE_BODY_TYPE_UNSPECIFIED", 0);
        MESSAGE_BODY_TYPE_CONVERSATION = new MessageBodyTypeResponseData("MESSAGE_BODY_TYPE_CONVERSATION", 1);
        MESSAGE_BODY_TYPE_EVENT = new MessageBodyTypeResponseData("MESSAGE_BODY_TYPE_EVENT", 2);
        MessageBodyTypeResponseData[] r02 = a();
        f122181a = r02;
        f122182b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    MessageBodyTypeResponseData(String r1, int r2) {
    }

    public static final /* synthetic */ MessageBodyTypeResponseData[] a() {
        return new MessageBodyTypeResponseData[]{MESSAGE_BODY_TYPE_UNSPECIFIED, MESSAGE_BODY_TYPE_CONVERSATION, MESSAGE_BODY_TYPE_EVENT};
    }

    public static kotlin.enums.a getEntries() {
        return f122182b;
    }

    public static MessageBodyTypeResponseData valueOf(String r1) {
        return (MessageBodyTypeResponseData) Enum.valueOf(MessageBodyTypeResponseData.class, r1);
    }

    public static MessageBodyTypeResponseData[] values() {
        return (MessageBodyTypeResponseData[]) f122181a.clone();
    }
}
