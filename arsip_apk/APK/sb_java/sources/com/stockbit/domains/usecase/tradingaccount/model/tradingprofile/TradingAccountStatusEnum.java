package com.stockbit.domains.usecase.tradingaccount.model.tradingprofile;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/domains/usecase/tradingaccount/model/tradingprofile/TradingAccountStatusEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_AMEND", "VERIFICATION", "IN_PROGRESS", "REJECTED", "Companion", "usecase-tradingaccount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TradingAccountStatusEnum extends Enum<TradingAccountStatusEnum> {
    public static final a Companion = null;
    public static final TradingAccountStatusEnum IN_PROGRESS = null;
    public static final TradingAccountStatusEnum NO_AMEND = null;
    public static final TradingAccountStatusEnum REJECTED = null;
    public static final TradingAccountStatusEnum VERIFICATION = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TradingAccountStatusEnum[] f88514a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f88515b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final TradingAccountStatusEnum a(int r4) {
            Iterator<E> r02 = TradingAccountStatusEnum.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((TradingAccountStatusEnum) r1).getValue() != r4) goto L4;
        L9:
            TradingAccountStatusEnum r12 = (TradingAccountStatusEnum) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return TradingAccountStatusEnum.NO_AMEND;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        NO_AMEND = new TradingAccountStatusEnum("NO_AMEND", 0, 1);
        VERIFICATION = new TradingAccountStatusEnum("VERIFICATION", 1, 2);
        IN_PROGRESS = new TradingAccountStatusEnum("IN_PROGRESS", 2, 3);
        REJECTED = new TradingAccountStatusEnum("REJECTED", 3, 4);
        TradingAccountStatusEnum[] r02 = a();
        f88514a = r02;
        f88515b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    TradingAccountStatusEnum(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TradingAccountStatusEnum[] a() {
        return new TradingAccountStatusEnum[]{NO_AMEND, VERIFICATION, IN_PROGRESS, REJECTED};
    }

    public static kotlin.enums.a getEntries() {
        return f88515b;
    }

    public static TradingAccountStatusEnum valueOf(String r1) {
        return (TradingAccountStatusEnum) Enum.valueOf(TradingAccountStatusEnum.class, r1);
    }

    public static TradingAccountStatusEnum[] values() {
        return (TradingAccountStatusEnum[]) f88514a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
