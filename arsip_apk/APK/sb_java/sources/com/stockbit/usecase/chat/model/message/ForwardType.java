package com.stockbit.usecase.chat.model.message;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/chat/model/message/ForwardType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SINGLE", "MULTIPLE", "NONE", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ForwardType extends Enum<ForwardType> {
    public static final ForwardType MULTIPLE = null;
    public static final ForwardType NONE = null;
    public static final ForwardType SINGLE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ForwardType[] f155563a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f155564b = null;
    private final String value;

    static {
        SINGLE = new ForwardType("SINGLE", 0, "Single");
        MULTIPLE = new ForwardType("MULTIPLE", 1, "Multiple");
        NONE = new ForwardType("NONE", 2, "None");
        ForwardType[] r02 = a();
        f155563a = r02;
        f155564b = b.a(r02);
    }

    ForwardType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ForwardType[] a() {
        return new ForwardType[]{SINGLE, MULTIPLE, NONE};
    }

    public static a getEntries() {
        return f155564b;
    }

    public static ForwardType valueOf(String r1) {
        return (ForwardType) Enum.valueOf(ForwardType.class, r1);
    }

    public static ForwardType[] values() {
        return (ForwardType[]) f155563a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
