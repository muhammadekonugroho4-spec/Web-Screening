package com.stockbit.usecase.chat.model.chat.message;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/message/MessageCursorType;", "", "<init>", "(Ljava/lang/String;I)V", "CURSOR_DIRECTION_UNSPECIFIED", "CURSOR_DIRECTION_IN_FRONT", "CURSOR_DIRECTION_BEHIND", "CURSOR_DIRECTION_BETWEEN", "Companion", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MessageCursorType extends Enum<MessageCursorType> {
    public static final MessageCursorType CURSOR_DIRECTION_BEHIND = null;
    public static final MessageCursorType CURSOR_DIRECTION_BETWEEN = null;
    public static final MessageCursorType CURSOR_DIRECTION_IN_FRONT = null;
    public static final MessageCursorType CURSOR_DIRECTION_UNSPECIFIED = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageCursorType[] f155241a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155242b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        CURSOR_DIRECTION_UNSPECIFIED = new MessageCursorType("CURSOR_DIRECTION_UNSPECIFIED", 0);
        CURSOR_DIRECTION_IN_FRONT = new MessageCursorType("CURSOR_DIRECTION_IN_FRONT", 1);
        CURSOR_DIRECTION_BEHIND = new MessageCursorType("CURSOR_DIRECTION_BEHIND", 2);
        CURSOR_DIRECTION_BETWEEN = new MessageCursorType("CURSOR_DIRECTION_BETWEEN", 3);
        MessageCursorType[] r02 = a();
        f155241a = r02;
        f155242b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    MessageCursorType(String r1, int r2) {
    }

    public static final /* synthetic */ MessageCursorType[] a() {
        return new MessageCursorType[]{CURSOR_DIRECTION_UNSPECIFIED, CURSOR_DIRECTION_IN_FRONT, CURSOR_DIRECTION_BEHIND, CURSOR_DIRECTION_BETWEEN};
    }

    public static kotlin.enums.a getEntries() {
        return f155242b;
    }

    public static MessageCursorType valueOf(String r1) {
        return (MessageCursorType) Enum.valueOf(MessageCursorType.class, r1);
    }

    public static MessageCursorType[] values() {
        return (MessageCursorType[]) f155241a.clone();
    }
}
