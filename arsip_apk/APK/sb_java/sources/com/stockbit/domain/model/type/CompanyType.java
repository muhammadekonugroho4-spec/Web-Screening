package com.stockbit.domain.model.type;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/stockbit/domain/model/type/CompanyType;", "", "value", "", "boardType", "trackingValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getBoardType", "getTrackingValue", "RIGHT", "INDEX", "INDEX_ASING", "WARAN", "REKSADANA", "SAHAM", "COMMODITIES", "CRYPTO", "FX", "ETF", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public enum CompanyType extends Enum<CompanyType> {
    public static final CompanyType COMMODITIES = null;
    public static final CompanyType CRYPTO = null;
    public static final a Companion = null;
    public static final CompanyType ETF = null;
    public static final CompanyType FX = null;
    public static final CompanyType INDEX = null;
    public static final CompanyType INDEX_ASING = null;
    public static final CompanyType REKSADANA = null;
    public static final CompanyType RIGHT = null;
    public static final CompanyType SAHAM = null;
    public static final CompanyType WARAN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyType[] f86178a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86179b = null;
    private final String boardType;
    private final String trackingValue;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final CompanyType a(String r7) {
            CompanyType[] r02 = CompanyType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            CompanyType r3 = r02[r2];
            if (y.J(r3.getValue(), r7, true) == true) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return CompanyType.SAHAM;
        L8:
            r3 = null;
            goto L9
        }

        public final boolean b(String r3) {
            p.l(r3, "value");
            if (y.J(r3, CompanyType.INDEX.getValue(), true) == false) goto L5;
        L9:
            return true;
        L5:
            if (y.J(r3, CompanyType.INDEX_ASING.getValue(), true) == true) goto L9;
            return false;
        }

        public final boolean c(String r8) {
            CompanyType[] r02 = CompanyType.values();
            int r1 = r02.length;
            int r3 = 0;
        L4:
            if (r3 >= r1) goto L9;
            CompanyType r5 = r02[r3];
            if (y.J(r5.getValue(), r8, true) == true) goto L11;
            r3 = r3 + 1;
        L11:
            if (r5 != CompanyType.SAHAM) goto L13;
        L18:
            return true;
        L13:
            if (r5 == CompanyType.WARAN) goto L18;
            if (r5 == CompanyType.RIGHT) goto L18;
            return false;
        L9:
            r5 = null;
            goto L11
        }

        public a() {
        }
    }

    static {
        RIGHT = new CompanyType("RIGHT", 0, "right", "TN", "Right");
        INDEX = new CompanyType("INDEX", 1, FirebaseAnalytics.Param.INDEX, "RG", "Index");
        INDEX_ASING = new CompanyType("INDEX_ASING", 2, "index asing", "RG", "Index Asing");
        WARAN = new CompanyType("WARAN", 3, "waran", "RG", "Waran");
        REKSADANA = new CompanyType("REKSADANA", 4, "reksadana", "RG", "Reksa Dana");
        SAHAM = new CompanyType("SAHAM", 5, "saham", "RG", "Saham");
        COMMODITIES = new CompanyType("COMMODITIES", 6, "commodities", "RG", "Commodities");
        CRYPTO = new CompanyType("CRYPTO", 7, "crypto", "RG", "Crypto");
        FX = new CompanyType("FX", 8, "fx", "RG", "Fx");
        ETF = new CompanyType("ETF", 9, "etf", "RG", "Etf");
        CompanyType[] r02 = a();
        f86178a = r02;
        f86179b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CompanyType(String r1, int r2, String r3, String r4, String r5) {
        this.value = r3;
        this.boardType = r4;
        this.trackingValue = r5;
    }

    public static final /* synthetic */ CompanyType[] a() {
        return new CompanyType[]{RIGHT, INDEX, INDEX_ASING, WARAN, REKSADANA, SAHAM, COMMODITIES, CRYPTO, FX, ETF};
    }

    public static kotlin.enums.a getEntries() {
        return f86179b;
    }

    public static CompanyType valueOf(String r1) {
        return (CompanyType) Enum.valueOf(CompanyType.class, r1);
    }

    public static CompanyType[] values() {
        return (CompanyType[]) f86178a.clone();
    }

    public final String getBoardType() {
        return this.boardType;
    }

    public final String getTrackingValue() {
        return this.trackingValue;
    }

    public final String getValue() {
        return this.value;
    }
}
