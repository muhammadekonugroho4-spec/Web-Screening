package com.stockbit.chat.component;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/chat/component/ChatComposeIconType;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "KEYBOARD", "STICKER", "chat_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ChatComposeIconType extends Enum<ChatComposeIconType> {
    public static final ChatComposeIconType HIDDEN = null;
    public static final ChatComposeIconType KEYBOARD = null;
    public static final ChatComposeIconType STICKER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ChatComposeIconType[] f53012a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f53013b = null;

    static {
        HIDDEN = new ChatComposeIconType("HIDDEN", 0);
        KEYBOARD = new ChatComposeIconType("KEYBOARD", 1);
        STICKER = new ChatComposeIconType("STICKER", 2);
        ChatComposeIconType[] r02 = a();
        f53012a = r02;
        f53013b = kotlin.enums.b.a(r02);
    }

    ChatComposeIconType(String r1, int r2) {
    }

    public static final /* synthetic */ ChatComposeIconType[] a() {
        return new ChatComposeIconType[]{HIDDEN, KEYBOARD, STICKER};
    }

    public static kotlin.enums.a getEntries() {
        return f53013b;
    }

    public static ChatComposeIconType valueOf(String r1) {
        return (ChatComposeIconType) Enum.valueOf(ChatComposeIconType.class, r1);
    }

    public static ChatComposeIconType[] values() {
        return (ChatComposeIconType[]) f53012a.clone();
    }
}
