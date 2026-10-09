package com.stockbit.domain.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/stockbit/domain/model/type/StockTransferTypeStepper;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GRAY", "EMPTY_GREEN", "GREEN", "ORANGE", "RED", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StockTransferTypeStepper extends Enum<StockTransferTypeStepper> {
    public static final a Companion = null;
    public static final StockTransferTypeStepper EMPTY_GREEN = null;
    public static final StockTransferTypeStepper GRAY = null;
    public static final StockTransferTypeStepper GREEN = null;
    public static final StockTransferTypeStepper ORANGE = null;
    public static final StockTransferTypeStepper RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockTransferTypeStepper[] f86248a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86249b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final StockTransferTypeStepper a(Integer r7) {
            StockTransferTypeStepper[] r02 = StockTransferTypeStepper.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            StockTransferTypeStepper r3 = r02[r2];
            int r4 = r3.getValue();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return StockTransferTypeStepper.GRAY;
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
        GRAY = new StockTransferTypeStepper("GRAY", 0, 1);
        EMPTY_GREEN = new StockTransferTypeStepper("EMPTY_GREEN", 1, 2);
        GREEN = new StockTransferTypeStepper("GREEN", 2, 3);
        ORANGE = new StockTransferTypeStepper("ORANGE", 3, 4);
        RED = new StockTransferTypeStepper("RED", 4, 5);
        StockTransferTypeStepper[] r02 = a();
        f86248a = r02;
        f86249b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    StockTransferTypeStepper(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ StockTransferTypeStepper[] a() {
        return new StockTransferTypeStepper[]{GRAY, EMPTY_GREEN, GREEN, ORANGE, RED};
    }

    public static kotlin.enums.a getEntries() {
        return f86249b;
    }

    public static StockTransferTypeStepper valueOf(String r1) {
        return (StockTransferTypeStepper) Enum.valueOf(StockTransferTypeStepper.class, r1);
    }

    public static StockTransferTypeStepper[] values() {
        return (StockTransferTypeStepper[]) f86248a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
