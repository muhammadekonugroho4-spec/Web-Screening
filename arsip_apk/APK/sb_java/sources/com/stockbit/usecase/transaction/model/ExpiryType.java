package com.stockbit.usecase.transaction.model;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/transaction/model/ExpiryType;", "", "value", "", "valueInt", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getValueInt", "()I", "EXPIRY_GOOD_FOR_DAY", "EXPIRY_GOOD_TILL_CANCELLED", "EXPIRY_FILL_AND_KILL", "Companion", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum ExpiryType extends Enum<ExpiryType> {
    public static final a Companion = null;
    public static final ExpiryType EXPIRY_FILL_AND_KILL = null;
    public static final ExpiryType EXPIRY_GOOD_FOR_DAY = null;
    public static final ExpiryType EXPIRY_GOOD_TILL_CANCELLED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ExpiryType[] f163762a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163763b = null;
    private final String value;
    private final int valueInt;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final ExpiryType a(int r4) {
            Iterator<E> r02 = ExpiryType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((ExpiryType) r1).getValueInt() != r4) goto L4;
        L9:
            ExpiryType r12 = (ExpiryType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return ExpiryType.EXPIRY_GOOD_FOR_DAY;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        EXPIRY_GOOD_FOR_DAY = new ExpiryType("EXPIRY_GOOD_FOR_DAY", 0, "Good For Day", 0);
        EXPIRY_GOOD_TILL_CANCELLED = new ExpiryType("EXPIRY_GOOD_TILL_CANCELLED", 1, "Good Till Cancelled", 1);
        EXPIRY_FILL_AND_KILL = new ExpiryType("EXPIRY_FILL_AND_KILL", 2, "Fill And Kill", 2);
        ExpiryType[] r02 = a();
        f163762a = r02;
        f163763b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    ExpiryType(String r1, int r2, String r3, int r4) {
        this.value = r3;
        this.valueInt = r4;
    }

    public static final /* synthetic */ ExpiryType[] a() {
        return new ExpiryType[]{EXPIRY_GOOD_FOR_DAY, EXPIRY_GOOD_TILL_CANCELLED, EXPIRY_FILL_AND_KILL};
    }

    public static kotlin.enums.a getEntries() {
        return f163763b;
    }

    public static ExpiryType valueOf(String r1) {
        return (ExpiryType) Enum.valueOf(ExpiryType.class, r1);
    }

    public static ExpiryType[] values() {
        return (ExpiryType[]) f163762a.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int getValueInt() {
        return this.valueInt;
    }
}
