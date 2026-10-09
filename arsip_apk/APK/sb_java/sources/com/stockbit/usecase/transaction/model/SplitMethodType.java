package com.stockbit.usecase.transaction.model;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/usecase/transaction/model/SplitMethodType;", "", "value", "", "apiValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getApiValue", "EQUAL", "RANDOM", "UNSPECIFIED", "Companion", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SplitMethodType extends Enum<SplitMethodType> {
    public static final a Companion = null;
    public static final SplitMethodType EQUAL = null;
    public static final SplitMethodType RANDOM = null;
    public static final SplitMethodType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SplitMethodType[] f163770a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163771b = null;
    private final String apiValue;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final SplitMethodType a(String r6) {
            p.l(r6, "stringValue");
            SplitMethodType[] r02 = SplitMethodType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            SplitMethodType r3 = r02[r2];
            if (p.g(r3.getValue(), r6) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return SplitMethodType.UNSPECIFIED;
        L8:
            r3 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        EQUAL = new SplitMethodType("EQUAL", 0, "Equal", "SPLIT_ORDER_METHOD_EQUAL");
        RANDOM = new SplitMethodType("RANDOM", 1, "Random", "SPLIT_ORDER_METHOD_RANDOM_RANGE");
        UNSPECIFIED = new SplitMethodType("UNSPECIFIED", 2, "Unspecified", "SPLIT_ORDER_METHOD_UNSPECIFIED");
        SplitMethodType[] r02 = a();
        f163770a = r02;
        f163771b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SplitMethodType(String r1, int r2, String r3, String r4) {
        this.value = r3;
        this.apiValue = r4;
    }

    public static final /* synthetic */ SplitMethodType[] a() {
        return new SplitMethodType[]{EQUAL, RANDOM, UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f163771b;
    }

    public static SplitMethodType valueOf(String r1) {
        return (SplitMethodType) Enum.valueOf(SplitMethodType.class, r1);
    }

    public static SplitMethodType[] values() {
        return (SplitMethodType[]) f163770a.clone();
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final String getValue() {
        return this.value;
    }
}
