package com.stockbit.usecase.chat.model.chat;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/usecase/chat/model/chat/EmojiTextType;", "", "<init>", "(Ljava/lang/String;I)V", "ONE_ONLY", "TWO_ONLY", "THREE_ONLY", "OTHER_ONLY_EMOJI", "OTHER", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum EmojiTextType extends Enum<EmojiTextType> {
    public static final EmojiTextType ONE_ONLY = null;
    public static final EmojiTextType OTHER = null;
    public static final EmojiTextType OTHER_ONLY_EMOJI = null;
    public static final EmojiTextType THREE_ONLY = null;
    public static final EmojiTextType TWO_ONLY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EmojiTextType[] f155168a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f155169b = null;

    static {
        ONE_ONLY = new EmojiTextType("ONE_ONLY", 0);
        TWO_ONLY = new EmojiTextType("TWO_ONLY", 1);
        THREE_ONLY = new EmojiTextType("THREE_ONLY", 2);
        OTHER_ONLY_EMOJI = new EmojiTextType("OTHER_ONLY_EMOJI", 3);
        OTHER = new EmojiTextType("OTHER", 4);
        EmojiTextType[] r02 = a();
        f155168a = r02;
        f155169b = kotlin.enums.b.a(r02);
    }

    EmojiTextType(String r1, int r2) {
    }

    public static final /* synthetic */ EmojiTextType[] a() {
        return new EmojiTextType[]{ONE_ONLY, TWO_ONLY, THREE_ONLY, OTHER_ONLY_EMOJI, OTHER};
    }

    public static kotlin.enums.a getEntries() {
        return f155169b;
    }

    public static EmojiTextType valueOf(String r1) {
        return (EmojiTextType) Enum.valueOf(EmojiTextType.class, r1);
    }

    public static EmojiTextType[] values() {
        return (EmojiTextType[]) f155168a.clone();
    }
}
