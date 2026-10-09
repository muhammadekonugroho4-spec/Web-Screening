package com.stockbit.usecase.tradingperformance.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/tradingperformance/model/type/PortfolioAllocationType;", "", Constants.KEY_TEXT, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "STOCKS", "SUB_SECTOR", "Companion", "usecase-tradingperformance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum PortfolioAllocationType extends Enum<PortfolioAllocationType> {
    public static final a Companion = null;
    public static final PortfolioAllocationType STOCKS = null;
    public static final PortfolioAllocationType SUB_SECTOR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PortfolioAllocationType[] f163587a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163588b = null;
    private final String text;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        STOCKS = new PortfolioAllocationType("STOCKS", 0, "Stocks");
        SUB_SECTOR = new PortfolioAllocationType("SUB_SECTOR", 1, "Sub-Sector");
        PortfolioAllocationType[] r02 = a();
        f163587a = r02;
        f163588b = b.a(r02);
        Companion = new a(null);
    }

    PortfolioAllocationType(String r1, int r2, String r3) {
        this.text = r3;
    }

    public static final /* synthetic */ PortfolioAllocationType[] a() {
        return new PortfolioAllocationType[]{STOCKS, SUB_SECTOR};
    }

    public static kotlin.enums.a getEntries() {
        return f163588b;
    }

    public static PortfolioAllocationType valueOf(String r1) {
        return (PortfolioAllocationType) Enum.valueOf(PortfolioAllocationType.class, r1);
    }

    public static PortfolioAllocationType[] values() {
        return (PortfolioAllocationType[]) f163587a.clone();
    }

    public final String getText() {
        return this.text;
    }
}
