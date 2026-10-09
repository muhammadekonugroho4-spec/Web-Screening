package com.stockbit.usecase.transaction.model.type;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.e;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/transaction/model/type/GTCType;", "", "value", "", "nameType", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getNameType", "()Ljava/lang/String;", "EXPIRY_GOOD_FOR_DAY", "EXPIRY_GOOD_TILL_CANCEL", "EXPIRY_FILL_AND_KILL", "Companion", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes2.dex */
public enum GTCType extends Enum<GTCType> {
    public static final a Companion = null;
    public static final GTCType EXPIRY_FILL_AND_KILL = null;
    public static final GTCType EXPIRY_GOOD_FOR_DAY = null;
    public static final GTCType EXPIRY_GOOD_TILL_CANCEL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GTCType[] f163952a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163953b = null;
    private final String nameType;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final GTCType a(int r4) {
            Iterator<E> r02 = GTCType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((GTCType) r1).getValue() != r4) goto L4;
        L9:
            GTCType r12 = (GTCType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return GTCType.EXPIRY_GOOD_FOR_DAY;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        EXPIRY_GOOD_FOR_DAY = new GTCType("EXPIRY_GOOD_FOR_DAY", 0, 0, "Good For Day");
        EXPIRY_GOOD_TILL_CANCEL = new GTCType("EXPIRY_GOOD_TILL_CANCEL", 1, 1, "Good Till Cancelled");
        EXPIRY_FILL_AND_KILL = new GTCType("EXPIRY_FILL_AND_KILL", 2, 2, "Fill And Kill");
        GTCType[] r02 = a();
        f163952a = r02;
        f163953b = b.a(r02);
        Companion = new a(null);
    }

    GTCType(String r1, int r2, int r3, String r4) {
        this.value = r3;
        this.nameType = r4;
    }

    public static final /* synthetic */ GTCType[] a() {
        return new GTCType[]{EXPIRY_GOOD_FOR_DAY, EXPIRY_GOOD_TILL_CANCEL, EXPIRY_FILL_AND_KILL};
    }

    public static kotlin.enums.a getEntries() {
        return f163953b;
    }

    public static GTCType valueOf(String r1) {
        return (GTCType) Enum.valueOf(GTCType.class, r1);
    }

    public static GTCType[] values() {
        return (GTCType[]) f163952a.clone();
    }

    public final String getNameType() {
        return this.nameType;
    }

    public final int getValue() {
        return this.value;
    }
}
