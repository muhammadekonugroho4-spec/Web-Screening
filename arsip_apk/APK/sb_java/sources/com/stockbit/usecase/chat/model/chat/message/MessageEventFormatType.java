package com.stockbit.usecase.chat.model.chat.message;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/message/MessageEventFormatType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_FORMAT_REGULAR", "TEXT_FORMAT_BOLD", "TEXT_FORMAT_ITALIC", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MessageEventFormatType extends Enum<MessageEventFormatType> {
    public static final a Companion = null;
    public static final MessageEventFormatType TEXT_FORMAT_BOLD = null;
    public static final MessageEventFormatType TEXT_FORMAT_ITALIC = null;
    public static final MessageEventFormatType TEXT_FORMAT_REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageEventFormatType[] f155243a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155244b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final MessageEventFormatType a(String r6) {
            MessageEventFormatType[] r02 = MessageEventFormatType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            MessageEventFormatType r3 = r02[r2];
            if (kotlin.jvm.internal.p.g(r6, r3.name()) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return MessageEventFormatType.TEXT_FORMAT_REGULAR;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        TEXT_FORMAT_REGULAR = new MessageEventFormatType("TEXT_FORMAT_REGULAR", 0);
        TEXT_FORMAT_BOLD = new MessageEventFormatType("TEXT_FORMAT_BOLD", 1);
        TEXT_FORMAT_ITALIC = new MessageEventFormatType("TEXT_FORMAT_ITALIC", 2);
        MessageEventFormatType[] r02 = a();
        f155243a = r02;
        f155244b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    MessageEventFormatType(String r1, int r2) {
    }

    public static final /* synthetic */ MessageEventFormatType[] a() {
        return new MessageEventFormatType[]{TEXT_FORMAT_REGULAR, TEXT_FORMAT_BOLD, TEXT_FORMAT_ITALIC};
    }

    public static kotlin.enums.a getEntries() {
        return f155244b;
    }

    public static MessageEventFormatType valueOf(String r1) {
        return (MessageEventFormatType) Enum.valueOf(MessageEventFormatType.class, r1);
    }

    public static MessageEventFormatType[] values() {
        return (MessageEventFormatType[]) f155243a.clone();
    }
}
