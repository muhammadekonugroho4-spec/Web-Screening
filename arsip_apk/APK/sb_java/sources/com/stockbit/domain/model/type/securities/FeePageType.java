package com.stockbit.domain.model.type.securities;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/type/securities/FeePageType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BUY", "SELL", "ALL", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum FeePageType extends Enum<FeePageType> {
    public static final FeePageType ALL = null;
    public static final FeePageType BUY = null;
    public static final a Companion = null;
    public static final FeePageType SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FeePageType[] f86423a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86424b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        BUY = new FeePageType("BUY", 0, 1);
        SELL = new FeePageType("SELL", 1, 2);
        ALL = new FeePageType("ALL", 2, 3);
        FeePageType[] r02 = a();
        f86423a = r02;
        f86424b = b.a(r02);
        Companion = new a(null);
    }

    FeePageType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ FeePageType[] a() {
        return new FeePageType[]{BUY, SELL, ALL};
    }

    public static kotlin.enums.a getEntries() {
        return f86424b;
    }

    public static FeePageType valueOf(String r1) {
        return (FeePageType) Enum.valueOf(FeePageType.class, r1);
    }

    public static FeePageType[] values() {
        return (FeePageType[]) f86423a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
