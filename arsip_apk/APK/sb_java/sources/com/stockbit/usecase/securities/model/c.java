package com.stockbit.usecase.securities.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.usecase.securities.model.formula.TradingFormulaUIState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f160392a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160393b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160394c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160395e;

    /* renamed from: f, reason: collision with root package name */
    public final String f160396f;

    /* renamed from: g, reason: collision with root package name */
    public final String f160397g;

    /* renamed from: h, reason: collision with root package name */
    public final String f160398h;

    /* renamed from: i, reason: collision with root package name */
    public final String f160399i;

    /* renamed from: j, reason: collision with root package name */
    public final String f160400j;

    /* renamed from: k, reason: collision with root package name */
    public final String f160401k;

    /* renamed from: l, reason: collision with root package name */
    public final String f160402l;

    /* renamed from: m, reason: collision with root package name */
    public final String f160403m;

    /* renamed from: n, reason: collision with root package name */
    public final String f160404n;

    /* renamed from: o, reason: collision with root package name */
    public final String f160405o;

    /* renamed from: p, reason: collision with root package name */
    public final String f160406p;

    /* renamed from: q, reason: collision with root package name */
    public final String f160407q;

    /* renamed from: r, reason: collision with root package name */
    public final String f160408r;

    /* renamed from: s, reason: collision with root package name */
    public final String f160409s;

    /* renamed from: t, reason: collision with root package name */
    public final String f160410t;

    /* renamed from: u, reason: collision with root package name */
    public final String f160411u;

    /* renamed from: v, reason: collision with root package name */
    public final String f160412v;

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160413a = null;

        static {
            int[] r02 = new int[TradingFormulaUIState.Type.values().length];
            r02[TradingFormulaUIState.Type.REGULAR.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L13:
            r02[TradingFormulaUIState.Type.BONDS.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L19:
            r02[TradingFormulaUIState.Type.DAY_TRADE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L15:
            r02[TradingFormulaUIState.Type.NEGO_ORDER.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L7:
            f160413a = r02;
        }
    }

    public c(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38) {
        p.l(r17, "buy");
        p.l(r18, "sell");
        p.l(r19, "broker");
        p.l(r20, "exchangeTotalBuy");
        p.l(r21, "exchangeTotalSell");
        p.l(r22, "exchangeTotalCaBuy");
        p.l(r23, "exchangeTotalCaSell");
        p.l(r24, "dayTradeBuy");
        p.l(r25, "dayTradeSell");
        p.l(r26, "dayTradeBroker");
        p.l(r27, "dayTradeExchangeTotalBuy");
        p.l(r28, "dayTradeExchangeTotalSell");
        p.l(r29, "dayTradeExchangeTotalCaBuy");
        p.l(r30, "dayTradeExchangeTotalCaSell");
        p.l(r31, "negoOrderBuy");
        p.l(r32, "negoOrderSell");
        p.l(r33, "negoOrderOtc");
        p.l(r34, "negoOrderBroker");
        p.l(r35, "negoOrderExchangeTotalBuy");
        p.l(r36, "negoOrderExchangeTotalSell");
        p.l(r37, "negoOrderExchangeTotalCaBuy");
        p.l(r38, "negoOrderExchangeTotalCaSell");
        this.f160392a = r17;
        this.f160393b = r18;
        this.f160394c = r19;
        this.d = r20;
        this.f160395e = r21;
        this.f160396f = r22;
        this.f160397g = r23;
        this.f160398h = r24;
        this.f160399i = r25;
        this.f160400j = r26;
        this.f160401k = r27;
        this.f160402l = r28;
        this.f160403m = r29;
        this.f160404n = r30;
        this.f160405o = r31;
        this.f160406p = r32;
        this.f160407q = r33;
        this.f160408r = r34;
        this.f160409s = r35;
        this.f160410t = r36;
        this.f160411u = r37;
        this.f160412v = r38;
    }

    public final String a() {
        return this.f160394c;
    }

    public final String b() {
        return this.f160392a;
    }

    public final String c() {
        return this.d;
    }

    public final String d(TradingFormulaUIState.Type r2) {
        p.l(r2, "type");
        int r22 = a.f160413a[r2.ordinal()];
        if (r22 == 1) goto L17;
        if (r22 == 2) goto L17;
        if (r22 == 3) goto L15;
        if (r22 != 4) goto L13;
        return this.f160408r;
    L13:
        throw new NoWhenBranchMatchedException();
    L15:
        return this.f160400j;
    L17:
        return this.f160394c;
    }

    public final String e(TradingFormulaUIState.Type r2) {
        p.l(r2, "type");
        int r22 = a.f160413a[r2.ordinal()];
        if (r22 == 1) goto L17;
        if (r22 == 2) goto L17;
        if (r22 == 3) goto L15;
        if (r22 != 4) goto L13;
        return this.f160405o;
    L13:
        throw new NoWhenBranchMatchedException();
    L15:
        return this.f160398h;
    L17:
        return this.f160392a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f160392a, r52.f160392a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160393b, r52.f160393b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160394c, r52.f160394c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f160395e, r52.f160395e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f160396f, r52.f160396f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f160397g, r52.f160397g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f160398h, r52.f160398h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f160399i, r52.f160399i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f160400j, r52.f160400j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f160401k, r52.f160401k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f160402l, r52.f160402l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f160403m, r52.f160403m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f160404n, r52.f160404n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f160405o, r52.f160405o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f160406p, r52.f160406p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f160407q, r52.f160407q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f160408r, r52.f160408r) == true) goto L63;
        return false;
    L63:
        if (p.g(this.f160409s, r52.f160409s) == true) goto L66;
        return false;
    L66:
        if (p.g(this.f160410t, r52.f160410t) == true) goto L69;
        return false;
    L69:
        if (p.g(this.f160411u, r52.f160411u) == true) goto L72;
        return false;
    L72:
        if (p.g(this.f160412v, r52.f160412v) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final String f(TradingFormulaUIState.Type r2, boolean r3) {
        p.l(r2, "type");
        int r22 = a.f160413a[r2.ordinal()];
        if (r22 != 1) goto L5;
    L22:
        if (r3 == false) goto L26;
        return this.f160396f;
    L26:
        return this.d;
    L5:
        if (r22 == 2) goto L22;
        if (r22 != 3) goto L9;
        if (r3 == false) goto L21;
        return this.f160403m;
    L21:
        return this.f160401k;
    L9:
        if (r22 != 4) goto L16;
        if (r3 == false) goto L14;
        return this.f160411u;
    L14:
        return this.f160409s;
    L16:
        throw new NoWhenBranchMatchedException();
    }

    public final String g(TradingFormulaUIState.Type r2, boolean r3) {
        p.l(r2, "type");
        int r22 = a.f160413a[r2.ordinal()];
        if (r22 != 1) goto L5;
    L22:
        if (r3 == false) goto L26;
        return this.f160397g;
    L26:
        return this.f160395e;
    L5:
        if (r22 == 2) goto L22;
        if (r22 != 3) goto L9;
        if (r3 == false) goto L21;
        return this.f160404n;
    L21:
        return this.f160402l;
    L9:
        if (r22 != 4) goto L16;
        if (r3 == false) goto L14;
        return this.f160412v;
    L14:
        return this.f160410t;
    L16:
        throw new NoWhenBranchMatchedException();
    }

    public final String h(TradingFormulaUIState.Type r2) {
        p.l(r2, "type");
        int r22 = a.f160413a[r2.ordinal()];
        if (r22 == 1) goto L17;
        if (r22 == 2) goto L17;
        if (r22 == 3) goto L15;
        if (r22 != 4) goto L13;
        return this.f160406p;
    L13:
        throw new NoWhenBranchMatchedException();
    L15:
        return this.f160399i;
    L17:
        return this.f160393b;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.f160392a.hashCode() * 31) + this.f160393b.hashCode()) * 31) + this.f160394c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160395e.hashCode()) * 31) + this.f160396f.hashCode()) * 31) + this.f160397g.hashCode()) * 31) + this.f160398h.hashCode()) * 31) + this.f160399i.hashCode()) * 31) + this.f160400j.hashCode()) * 31) + this.f160401k.hashCode()) * 31) + this.f160402l.hashCode()) * 31) + this.f160403m.hashCode()) * 31) + this.f160404n.hashCode()) * 31) + this.f160405o.hashCode()) * 31) + this.f160406p.hashCode()) * 31) + this.f160407q.hashCode()) * 31) + this.f160408r.hashCode()) * 31) + this.f160409s.hashCode()) * 31) + this.f160410t.hashCode()) * 31) + this.f160411u.hashCode()) * 31) + this.f160412v.hashCode();
    }

    public final String i() {
        return this.f160407q;
    }

    public final String j() {
        return this.f160393b;
    }

    public String toString() {
        return "FeeUIState(buy=" + this.f160392a + ", sell=" + this.f160393b + ", broker=" + this.f160394c + ", exchangeTotalBuy=" + this.d + ", exchangeTotalSell=" + this.f160395e + ", exchangeTotalCaBuy=" + this.f160396f + ", exchangeTotalCaSell=" + this.f160397g + ", dayTradeBuy=" + this.f160398h + ", dayTradeSell=" + this.f160399i + ", dayTradeBroker=" + this.f160400j + ", dayTradeExchangeTotalBuy=" + this.f160401k + ", dayTradeExchangeTotalSell=" + this.f160402l + ", dayTradeExchangeTotalCaBuy=" + this.f160403m + ", dayTradeExchangeTotalCaSell=" + this.f160404n + ", negoOrderBuy=" + this.f160405o + ", negoOrderSell=" + this.f160406p + ", negoOrderOtc=" + this.f160407q + ", negoOrderBroker=" + this.f160408r + ", negoOrderExchangeTotalBuy=" + this.f160409s + ", negoOrderExchangeTotalSell=" + this.f160410t + ", negoOrderExchangeTotalCaBuy=" + this.f160411u + ", negoOrderExchangeTotalCaSell=" + this.f160412v + ")";
    }

    public /* synthetic */ c(String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, String r39, String r40, String r41, String r42, String r43, String r44, String r45, int r46, kotlin.jvm.internal.i r47) {
        if ((r46 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r46 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r46 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r46 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r46 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r46 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r46 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r46 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r46 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r46 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r46 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r46 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r46 & 4096) == 0) goto L53;
        String r14 = "";
    L55:
        if ((r46 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = "";
    L58:
        String r242 = r1;
        if ((r46 & 16384) == 0) goto L61;
        String r16 = "";
    L63:
        if ((r46 & 32768) == 0) goto L65;
        String r162 = "";
    L67:
        if ((r46 & 65536) == 0) goto L69;
        String r17 = "";
    L71:
        if ((r46 & 131072) == 0) goto L73;
        String r18 = "";
    L75:
        if ((r46 & 262144) == 0) goto L77;
        String r19 = "";
    L79:
        if ((r46 & 524288) == 0) goto L81;
        String r20 = "";
    L83:
        if ((r46 & 1048576) == 0) goto L85;
        String r21 = "";
    L87:
        if ((r46 & 2097152) == 0) goto L90;
        String r462 = "";
    L91:
        this(r242, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r162, r17, r18, r19, r20, r21, r462);
        return;
    L90:
        r462 = r45;
        goto L91
    L85:
        r21 = r44;
        goto L87
    L81:
        r20 = r43;
        goto L83
    L77:
        r19 = r42;
        goto L79
    L73:
        r18 = r41;
        goto L75
    L69:
        r17 = r40;
        goto L71
    L65:
        r162 = r39;
        goto L67
    L61:
        r16 = r38;
        goto L63
    L57:
        r15 = r37;
        goto L58
    L53:
        r14 = r36;
        goto L55
    L49:
        r13 = r35;
        goto L51
    L45:
        r12 = r34;
        goto L47
    L41:
        r11 = r33;
        goto L43
    L37:
        r10 = r32;
        goto L39
    L33:
        r9 = r31;
        goto L35
    L29:
        r8 = r30;
        goto L31
    L25:
        r7 = r29;
        goto L27
    L21:
        r6 = r28;
        goto L23
    L17:
        r5 = r27;
        goto L19
    L13:
        r4 = r26;
        goto L15
    L9:
        r3 = r25;
        goto L11
    L5:
        r1 = r24;
        goto L7
    }
}
