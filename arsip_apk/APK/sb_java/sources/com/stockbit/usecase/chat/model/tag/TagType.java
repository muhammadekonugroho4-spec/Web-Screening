package com.stockbit.usecase.chat.model.tag;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/usecase/chat/model/tag/TagType;", "", "symbol", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getValue", "SYMBOL", "ACCOUNT", "NONE", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TagType extends Enum<TagType> {
    public static final TagType ACCOUNT = null;
    public static final TagType NONE = null;
    public static final TagType SYMBOL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TagType[] f155705a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155706b = null;
    private final String symbol;
    private final String value;

    static {
        SYMBOL = new TagType("SYMBOL", 0, "$", "Symbol");
        ACCOUNT = new TagType("ACCOUNT", 1, "@", "Account");
        NONE = new TagType("NONE", 2, "", "None");
        TagType[] r02 = a();
        f155705a = r02;
        f155706b = b.a(r02);
    }

    TagType(String r1, int r2, String r3, String r4) {
        this.symbol = r3;
        this.value = r4;
    }

    public static final /* synthetic */ TagType[] a() {
        return new TagType[]{SYMBOL, ACCOUNT, NONE};
    }

    public static a getEntries() {
        return f155706b;
    }

    public static TagType valueOf(String r1) {
        return (TagType) Enum.valueOf(TagType.class, r1);
    }

    public static TagType[] values() {
        return (TagType[]) f155705a.clone();
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getValue() {
        return this.value;
    }
}
