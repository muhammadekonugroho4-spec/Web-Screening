package com.stockbit.domain.model.chat.message.event;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/domain/model/chat/message/event/MessageEventFormatType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_FORMAT_REGULAR", "TEXT_FORMAT_BOLD", "TEXT_FORMAT_ITALIC", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum MessageEventFormatType extends Enum<MessageEventFormatType> {
    public static final a Companion = null;
    public static final MessageEventFormatType TEXT_FORMAT_BOLD = null;
    public static final MessageEventFormatType TEXT_FORMAT_ITALIC = null;
    public static final MessageEventFormatType TEXT_FORMAT_REGULAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageEventFormatType[] f81298a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f81299b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final MessageEventFormatType a(String r4) {
            Iterator<E> r02 = MessageEventFormatType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(r4, ((MessageEventFormatType) r1).name()) == false) goto L4;
        L9:
            MessageEventFormatType r12 = (MessageEventFormatType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return MessageEventFormatType.TEXT_FORMAT_REGULAR;
        L8:
            r1 = null;
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
        f81298a = r02;
        f81299b = b.a(r02);
        Companion = new a(null);
    }

    MessageEventFormatType(String r1, int r2) {
    }

    public static final /* synthetic */ MessageEventFormatType[] a() {
        return new MessageEventFormatType[]{TEXT_FORMAT_REGULAR, TEXT_FORMAT_BOLD, TEXT_FORMAT_ITALIC};
    }

    public static kotlin.enums.a getEntries() {
        return f81299b;
    }

    public static MessageEventFormatType valueOf(String r1) {
        return (MessageEventFormatType) Enum.valueOf(MessageEventFormatType.class, r1);
    }

    public static MessageEventFormatType[] values() {
        return (MessageEventFormatType[]) f81298a.clone();
    }
}
