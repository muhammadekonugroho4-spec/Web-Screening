package com.stockbit.lib.pocket.domain.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/lib/pocket/domain/entity/FlagDataType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FLAG_BOOL", "FLAG_NUMBER", "FLAG_DECIMAL", "FLAG_CHAR", "FLAG_STRING", "Companion", "pocket"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum FlagDataType extends Enum<FlagDataType> {
    public static final a Companion = null;
    public static final FlagDataType FLAG_BOOL = null;
    public static final FlagDataType FLAG_CHAR = null;
    public static final FlagDataType FLAG_DECIMAL = null;
    public static final FlagDataType FLAG_NUMBER = null;
    public static final FlagDataType FLAG_STRING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FlagDataType[] f120335a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f120336b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        FLAG_BOOL = new FlagDataType("FLAG_BOOL", 0, "boolean");
        FLAG_NUMBER = new FlagDataType("FLAG_NUMBER", 1, "int");
        FLAG_DECIMAL = new FlagDataType("FLAG_DECIMAL", 2, "double");
        FLAG_CHAR = new FlagDataType("FLAG_CHAR", 3, "char");
        FLAG_STRING = new FlagDataType("FLAG_STRING", 4, "string");
        FlagDataType[] r02 = a();
        f120335a = r02;
        f120336b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    FlagDataType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ FlagDataType[] a() {
        return new FlagDataType[]{FLAG_BOOL, FLAG_NUMBER, FLAG_DECIMAL, FLAG_CHAR, FLAG_STRING};
    }

    public static kotlin.enums.a getEntries() {
        return f120336b;
    }

    public static FlagDataType valueOf(String r1) {
        return (FlagDataType) Enum.valueOf(FlagDataType.class, r1);
    }

    public static FlagDataType[] values() {
        return (FlagDataType[]) f120335a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
