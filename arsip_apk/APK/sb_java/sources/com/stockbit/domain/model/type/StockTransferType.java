package com.stockbit.domain.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/domain/model/type/StockTransferType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DRAFT", "PENDING", "PROCESSING", "COMPLETED", "PARTIAL_COMPLETED", "FAILED", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StockTransferType extends Enum<StockTransferType> {
    public static final StockTransferType COMPLETED = null;
    public static final a Companion = null;
    public static final StockTransferType DRAFT = null;
    public static final StockTransferType FAILED = null;
    public static final StockTransferType PARTIAL_COMPLETED = null;
    public static final StockTransferType PENDING = null;
    public static final StockTransferType PROCESSING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockTransferType[] f86246a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86247b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final StockTransferType a(Integer r7) {
            StockTransferType[] r02 = StockTransferType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            StockTransferType r3 = r02[r2];
            int r4 = r3.getValue();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return StockTransferType.DRAFT;
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
        DRAFT = new StockTransferType("DRAFT", 0, 1);
        PENDING = new StockTransferType("PENDING", 1, 2);
        PROCESSING = new StockTransferType("PROCESSING", 2, 3);
        COMPLETED = new StockTransferType("COMPLETED", 3, 4);
        PARTIAL_COMPLETED = new StockTransferType("PARTIAL_COMPLETED", 4, 5);
        FAILED = new StockTransferType("FAILED", 5, 6);
        StockTransferType[] r02 = a();
        f86246a = r02;
        f86247b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    StockTransferType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ StockTransferType[] a() {
        return new StockTransferType[]{DRAFT, PENDING, PROCESSING, COMPLETED, PARTIAL_COMPLETED, FAILED};
    }

    public static kotlin.enums.a getEntries() {
        return f86247b;
    }

    public static StockTransferType valueOf(String r1) {
        return (StockTransferType) Enum.valueOf(StockTransferType.class, r1);
    }

    public static StockTransferType[] values() {
        return (StockTransferType[]) f86246a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
