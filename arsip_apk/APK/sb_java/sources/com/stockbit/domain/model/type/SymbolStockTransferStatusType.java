package com.stockbit.domain.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/stockbit/domain/model/type/SymbolStockTransferStatusType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APPROVED", "REJECTED", "PROCESSING", "SKIP", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SymbolStockTransferStatusType extends Enum<SymbolStockTransferStatusType> {
    public static final SymbolStockTransferStatusType APPROVED = null;
    public static final a Companion = null;
    public static final SymbolStockTransferStatusType PROCESSING = null;
    public static final SymbolStockTransferStatusType REJECTED = null;
    public static final SymbolStockTransferStatusType SKIP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SymbolStockTransferStatusType[] f86256a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86257b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final SymbolStockTransferStatusType a(Integer r7) {
            SymbolStockTransferStatusType[] r02 = SymbolStockTransferStatusType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            SymbolStockTransferStatusType r3 = r02[r2];
            int r4 = r3.getValue();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return SymbolStockTransferStatusType.SKIP;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            r3 = null;
            goto L12
        }

        public a() {
        }
    }

    static {
        APPROVED = new SymbolStockTransferStatusType("APPROVED", 0, 1);
        REJECTED = new SymbolStockTransferStatusType("REJECTED", 1, 2);
        PROCESSING = new SymbolStockTransferStatusType("PROCESSING", 2, 3);
        SKIP = new SymbolStockTransferStatusType("SKIP", 3, 4);
        SymbolStockTransferStatusType[] r02 = a();
        f86256a = r02;
        f86257b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    SymbolStockTransferStatusType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SymbolStockTransferStatusType[] a() {
        return new SymbolStockTransferStatusType[]{APPROVED, REJECTED, PROCESSING, SKIP};
    }

    public static kotlin.enums.a getEntries() {
        return f86257b;
    }

    public static SymbolStockTransferStatusType valueOf(String r1) {
        return (SymbolStockTransferStatusType) Enum.valueOf(SymbolStockTransferStatusType.class, r1);
    }

    public static SymbolStockTransferStatusType[] values() {
        return (SymbolStockTransferStatusType[]) f86256a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
