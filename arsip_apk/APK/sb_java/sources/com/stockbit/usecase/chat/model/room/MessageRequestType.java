package com.stockbit.usecase.chat.model.room;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/chat/model/room/MessageRequestType;", "", "<init>", "(Ljava/lang/String;I)V", "ACTION_ACCEPT", "ACTION_REJECT", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MessageRequestType extends Enum<MessageRequestType> {
    public static final MessageRequestType ACTION_ACCEPT = null;
    public static final MessageRequestType ACTION_REJECT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageRequestType[] f155599a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155600b = null;

    static {
        ACTION_ACCEPT = new MessageRequestType("ACTION_ACCEPT", 0);
        ACTION_REJECT = new MessageRequestType("ACTION_REJECT", 1);
        MessageRequestType[] r02 = a();
        f155599a = r02;
        f155600b = b.a(r02);
    }

    MessageRequestType(String r1, int r2) {
    }

    public static final /* synthetic */ MessageRequestType[] a() {
        return new MessageRequestType[]{ACTION_ACCEPT, ACTION_REJECT};
    }

    public static a getEntries() {
        return f155600b;
    }

    public static MessageRequestType valueOf(String r1) {
        return (MessageRequestType) Enum.valueOf(MessageRequestType.class, r1);
    }

    public static MessageRequestType[] values() {
        return (MessageRequestType[]) f155599a.clone();
    }
}
