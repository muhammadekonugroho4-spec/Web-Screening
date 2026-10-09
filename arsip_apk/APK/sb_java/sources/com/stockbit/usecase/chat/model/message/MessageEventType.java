package com.stockbit.usecase.chat.model.message;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/chat/model/message/MessageEventType;", "", Constants.KEY_TEXT, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "CHANGED", "REMOVE", "ADDED", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum MessageEventType extends Enum<MessageEventType> {
    public static final MessageEventType ADDED = null;
    public static final MessageEventType CHANGED = null;
    public static final MessageEventType REMOVE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MessageEventType[] f155566a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155567b = null;
    private final String text;

    static {
        CHANGED = new MessageEventType("CHANGED", 0, "changed");
        REMOVE = new MessageEventType("REMOVE", 1, "removed");
        ADDED = new MessageEventType("ADDED", 2, "added");
        MessageEventType[] r02 = a();
        f155566a = r02;
        f155567b = b.a(r02);
    }

    MessageEventType(String r1, int r2, String r3) {
        this.text = r3;
    }

    public static final /* synthetic */ MessageEventType[] a() {
        return new MessageEventType[]{CHANGED, REMOVE, ADDED};
    }

    public static a getEntries() {
        return f155567b;
    }

    public static MessageEventType valueOf(String r1) {
        return (MessageEventType) Enum.valueOf(MessageEventType.class, r1);
    }

    public static MessageEventType[] values() {
        return (MessageEventType[]) f155566a.clone();
    }

    public final String getText() {
        return this.text;
    }
}
