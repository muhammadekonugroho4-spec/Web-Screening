package com.stockbit.domain.model.entity.virtual;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.calendar.CalendarEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\bY\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010M\u001a\u00020\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010U\u001a\u00020\rHÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\rHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0085\u0002\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010d\u001a\u00020\u0003J\u0014\u0010e\u001a\u00020\r2\b\u0010f\u001a\u0004\u0018\u00010gHÖ\u0083\u0004J\n\u0010h\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010i\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u00101\"\u0004\b2\u00103R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u0010 R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u0010 R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u00101\"\u0004\b8\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\"\"\u0004\b<\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\"\"\u0004\bD\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010$R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\"\"\u0004\bH\u0010$R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010$R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\"\"\u0004\bL\u0010$¨\u0006o"}, d2 = {"Lcom/stockbit/domain/model/entity/virtual/TradingConfirmationDialogModel;", "Landroid/os/Parcelable;", CalendarEntryPoint.KEY_PAGE_DETAIL, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "symbol", "lot", FirebaseAnalytics.Param.PRICE, "proceedAmount", "profitLoss", "fee", "isLoginReal", "", "expirySymbol", "currentProfitLossColor", "isOverLimit", "amountCreditLimit", "remainingLimit", "estimatedBalanced", "orderId", "gtc", "boardtype", "orderKey", "brokerFee", "exchangeFee", "companyType", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPage", "()I", "setPage", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getLot", "setLot", "getPrice", "setPrice", "getProceedAmount", "setProceedAmount", "getProfitLoss", "setProfitLoss", "getFee", "setFee", "()Z", "setLoginReal", "(Z)V", "getExpirySymbol", "setExpirySymbol", "getCurrentProfitLossColor", "setCurrentProfitLossColor", "setOverLimit", "getAmountCreditLimit", "setAmountCreditLimit", "getRemainingLimit", "setRemainingLimit", "getEstimatedBalanced", "setEstimatedBalanced", "getOrderId", "setOrderId", "getGtc", "setGtc", "getBoardtype", "setBoardtype", "getOrderKey", "setOrderKey", "getBrokerFee", "setBrokerFee", "getExchangeFee", "setExchangeFee", "getCompanyType", "setCompanyType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingConfirmationDialogModel implements Parcelable {
    public static final Parcelable.Creator<TradingConfirmationDialogModel> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public int f83784a;

    /* renamed from: b, reason: collision with root package name */
    public String f83785b;

    /* renamed from: c, reason: collision with root package name */
    public String f83786c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f83787e;

    /* renamed from: f, reason: collision with root package name */
    public String f83788f;

    /* renamed from: g, reason: collision with root package name */
    public String f83789g;

    /* renamed from: h, reason: collision with root package name */
    public String f83790h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f83791i;

    /* renamed from: j, reason: collision with root package name */
    public int f83792j;

    /* renamed from: k, reason: collision with root package name */
    public int f83793k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f83794l;

    /* renamed from: m, reason: collision with root package name */
    public String f83795m;

    /* renamed from: n, reason: collision with root package name */
    public String f83796n;

    /* renamed from: o, reason: collision with root package name */
    public String f83797o;

    /* renamed from: p, reason: collision with root package name */
    public String f83798p;

    /* renamed from: q, reason: collision with root package name */
    public int f83799q;

    /* renamed from: r, reason: collision with root package name */
    public String f83800r;

    /* renamed from: s, reason: collision with root package name */
    public String f83801s;

    /* renamed from: t, reason: collision with root package name */
    public String f83802t;

    /* renamed from: u, reason: collision with root package name */
    public String f83803u;

    /* renamed from: v, reason: collision with root package name */
    public String f83804v;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingConfirmationDialogModel a(Parcel r25) {
            p.l(r25, "parcel");
            int r2 = r25.readInt();
            String r3 = r25.readString();
            String r4 = r25.readString();
            String r5 = r25.readString();
            String r6 = r25.readString();
            String r7 = r25.readString();
            String r8 = r25.readString();
            String r9 = r25.readString();
            boolean r10 = false;
            if (r25.readInt() == 0) goto L5;
            boolean r02 = false;
            r10 = true;
            boolean r12 = true;
        L6:
            int r11 = r25.readInt();
            boolean r13 = r12;
            int r122 = r25.readInt();
            if (r25.readInt() != 0) goto L11;
            r13 = r02;
        L11:
            return new TradingConfirmationDialogModel(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r122, r13, r25.readString(), r25.readString(), r25.readString(), r25.readString(), r25.readInt(), r25.readString(), r25.readString(), r25.readString(), r25.readString(), r25.readString());
        L5:
            r02 = false;
            r12 = true;
            goto L6
        }

        public final TradingConfirmationDialogModel[] b(int r1) {
            return new TradingConfirmationDialogModel[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    public TradingConfirmationDialogModel(int r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9, int r10, int r11, boolean r12, String r13, String r14, String r15, String r16, int r17, String r18, String r19, String r20, String r21, String r22) {
        this.f83784a = r1;
        this.f83785b = r2;
        this.f83786c = r3;
        this.d = r4;
        this.f83787e = r5;
        this.f83788f = r6;
        this.f83789g = r7;
        this.f83790h = r8;
        this.f83791i = r9;
        this.f83792j = r10;
        this.f83793k = r11;
        this.f83794l = r12;
        this.f83795m = r13;
        this.f83796n = r14;
        this.f83797o = r15;
        this.f83798p = r16;
        this.f83799q = r17;
        this.f83800r = r18;
        this.f83801s = r19;
        this.f83802t = r20;
        this.f83803u = r21;
        this.f83804v = r22;
    }

    public final void A(String r1) {
        this.f83798p = r1;
    }

    public final void B(String r1) {
        this.f83801s = r1;
    }

    public final void C(boolean r1) {
        this.f83794l = r1;
    }

    public final void D(int r1) {
        this.f83784a = r1;
    }

    public final void E(String r1) {
        this.f83787e = r1;
    }

    public final void F(String r1) {
        this.f83788f = r1;
    }

    public final void G(String r1) {
        this.f83789g = r1;
    }

    public final void H(String r1) {
        this.f83796n = r1;
    }

    public final void I(String r1) {
        this.f83786c = r1;
    }

    public final String a() {
        return this.f83795m;
    }

    public final String b() {
        return this.f83804v;
    }

    public final int c() {
        return this.f83793k;
    }

    public final String d() {
        return this.f83797o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f83792j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingConfirmationDialogModel) == true) goto L8;
        return false;
    L8:
        TradingConfirmationDialogModel r52 = (TradingConfirmationDialogModel) r5;
        if (this.f83784a == r52.f83784a) goto L12;
        return false;
    L12:
        if (p.g(this.f83785b, r52.f83785b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f83786c, r52.f83786c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f83787e, r52.f83787e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f83788f, r52.f83788f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f83789g, r52.f83789g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f83790h, r52.f83790h) == true) goto L33;
        return false;
    L33:
        if (this.f83791i == r52.f83791i) goto L36;
        return false;
    L36:
        if (this.f83792j == r52.f83792j) goto L39;
        return false;
    L39:
        if (this.f83793k == r52.f83793k) goto L42;
        return false;
    L42:
        if (this.f83794l == r52.f83794l) goto L45;
        return false;
    L45:
        if (p.g(this.f83795m, r52.f83795m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f83796n, r52.f83796n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f83797o, r52.f83797o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f83798p, r52.f83798p) == true) goto L57;
        return false;
    L57:
        if (this.f83799q == r52.f83799q) goto L60;
        return false;
    L60:
        if (p.g(this.f83800r, r52.f83800r) == true) goto L63;
        return false;
    L63:
        if (p.g(this.f83801s, r52.f83801s) == true) goto L66;
        return false;
    L66:
        if (p.g(this.f83802t, r52.f83802t) == true) goto L69;
        return false;
    L69:
        if (p.g(this.f83803u, r52.f83803u) == true) goto L72;
        return false;
    L72:
        if (p.g(this.f83804v, r52.f83804v) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final String f() {
        return this.f83790h;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f83798p;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f83784a) * 31;
        String r1 = this.f83785b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f83786c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f83787e;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.f83788f;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.f83789g;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (r07 + r112) * 31;
        String r113 = this.f83790h;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (((((((((r08 + r114) * 31) + Boolean.hashCode(this.f83791i)) * 31) + Integer.hashCode(this.f83792j)) * 31) + Integer.hashCode(this.f83793k)) * 31) + Boolean.hashCode(this.f83794l)) * 31;
        String r115 = this.f83795m;
        if (r115 != null) goto L33;
        int r116 = 0;
    L34:
        int r010 = (r09 + r116) * 31;
        String r117 = this.f83796n;
        if (r117 != null) goto L37;
        int r118 = 0;
    L38:
        int r011 = (r010 + r118) * 31;
        String r119 = this.f83797o;
        if (r119 != null) goto L41;
        int r120 = 0;
    L42:
        int r012 = (r011 + r120) * 31;
        String r121 = this.f83798p;
        if (r121 != null) goto L45;
        int r122 = 0;
    L46:
        int r013 = (((r012 + r122) * 31) + Integer.hashCode(this.f83799q)) * 31;
        String r123 = this.f83800r;
        if (r123 != null) goto L49;
        int r124 = 0;
    L50:
        int r014 = (r013 + r124) * 31;
        String r125 = this.f83801s;
        if (r125 != null) goto L53;
        int r126 = 0;
    L54:
        int r015 = (r014 + r126) * 31;
        String r127 = this.f83802t;
        if (r127 != null) goto L57;
        int r128 = 0;
    L58:
        int r016 = (r015 + r128) * 31;
        String r129 = this.f83803u;
        if (r129 != null) goto L61;
        int r130 = 0;
    L62:
        int r017 = (r016 + r130) * 31;
        String r131 = this.f83804v;
        if (r131 == null) goto L67;
        r2 = r131.hashCode();
    L67:
        return r017 + r2;
    L61:
        r130 = r129.hashCode();
        goto L62
    L57:
        r128 = r127.hashCode();
        goto L58
    L53:
        r126 = r125.hashCode();
        goto L54
    L49:
        r124 = r123.hashCode();
        goto L50
    L45:
        r122 = r121.hashCode();
        goto L46
    L41:
        r120 = r119.hashCode();
        goto L42
    L37:
        r118 = r117.hashCode();
        goto L38
    L33:
        r116 = r115.hashCode();
        goto L34
    L29:
        r114 = r113.hashCode();
        goto L30
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f83801s;
    }

    public final int j() {
        return this.f83784a;
    }

    public final String k() {
        return this.f83787e;
    }

    public final String l() {
        return this.f83788f;
    }

    public final String m() {
        return this.f83789g;
    }

    public final String n() {
        return this.f83796n;
    }

    public final String o() {
        return this.f83786c;
    }

    public final boolean p() {
        return this.f83791i;
    }

    public final boolean q() {
        return this.f83794l;
    }

    public final void r(String r1) {
        this.f83795m = r1;
    }

    public final void s(int r1) {
        this.f83793k = r1;
    }

    public final void t(String r1) {
        this.f83797o = r1;
    }

    public String toString() {
        return "TradingConfirmationDialogModel(page=" + this.f83784a + ", name=" + this.f83785b + ", symbol=" + this.f83786c + ", lot=" + this.d + ", price=" + this.f83787e + ", proceedAmount=" + this.f83788f + ", profitLoss=" + this.f83789g + ", fee=" + this.f83790h + ", isLoginReal=" + this.f83791i + ", expirySymbol=" + this.f83792j + ", currentProfitLossColor=" + this.f83793k + ", isOverLimit=" + this.f83794l + ", amountCreditLimit=" + this.f83795m + ", remainingLimit=" + this.f83796n + ", estimatedBalanced=" + this.f83797o + ", orderId=" + this.f83798p + ", gtc=" + this.f83799q + ", boardtype=" + this.f83800r + ", orderKey=" + this.f83801s + ", brokerFee=" + this.f83802t + ", exchangeFee=" + this.f83803u + ", companyType=" + this.f83804v + ')';
    }

    public final void u(int r1) {
        this.f83792j = r1;
    }

    public final void v(String r1) {
        this.f83790h = r1;
    }

    public final void w(int r1) {
        this.f83799q = r1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f83784a);
        r1.writeString(this.f83785b);
        r1.writeString(this.f83786c);
        r1.writeString(this.d);
        r1.writeString(this.f83787e);
        r1.writeString(this.f83788f);
        r1.writeString(this.f83789g);
        r1.writeString(this.f83790h);
        r1.writeInt(this.f83791i ? 1 : 0);
        r1.writeInt(this.f83792j);
        r1.writeInt(this.f83793k);
        r1.writeInt(this.f83794l ? 1 : 0);
        r1.writeString(this.f83795m);
        r1.writeString(this.f83796n);
        r1.writeString(this.f83797o);
        r1.writeString(this.f83798p);
        r1.writeInt(this.f83799q);
        r1.writeString(this.f83800r);
        r1.writeString(this.f83801s);
        r1.writeString(this.f83802t);
        r1.writeString(this.f83803u);
        r1.writeString(this.f83804v);
    }

    public final void x(boolean r1) {
        this.f83791i = r1;
    }

    public final void y(String r1) {
        this.d = r1;
    }

    public final void z(String r1) {
        this.f83785b = r1;
    }

    public /* synthetic */ TradingConfirmationDialogModel(int r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, boolean r32, int r33, int r34, boolean r35, String r36, String r37, String r38, String r39, int r40, String r41, String r42, String r43, String r44, String r45, int r46, i r47) {
        if ((r46 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r46 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r46 & 4) == 0) goto L13;
        String r5 = null;
    L15:
        if ((r46 & 8) == 0) goto L17;
        String r6 = null;
    L19:
        if ((r46 & 16) == 0) goto L21;
        String r7 = null;
    L23:
        if ((r46 & 32) == 0) goto L25;
        String r8 = null;
    L27:
        if ((r46 & 64) == 0) goto L29;
        String r9 = null;
    L31:
        if ((r46 & 128) == 0) goto L33;
        String r10 = null;
    L35:
        if ((r46 & 256) == 0) goto L37;
        boolean r11 = false;
    L39:
        if ((r46 & 512) == 0) goto L41;
        int r12 = 0;
    L43:
        if ((r46 & 1024) == 0) goto L45;
        int r13 = 0;
    L47:
        if ((r46 & 2048) == 0) goto L49;
        boolean r14 = false;
    L51:
        if ((r46 & 4096) == 0) goto L53;
        String r15 = null;
    L55:
        if ((r46 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r2 = null;
    L59:
        if ((r46 & 16384) == 0) goto L61;
        String r4 = null;
    L63:
        if ((r46 & 32768) == 0) goto L65;
        String r16 = null;
    L67:
        if ((r46 & 65536) == 0) goto L69;
        int r17 = 0;
    L71:
        if ((r46 & 131072) == 0) goto L73;
        String r18 = null;
    L75:
        if ((r46 & 262144) == 0) goto L77;
        String r19 = null;
    L79:
        if ((r46 & 524288) == 0) goto L81;
        String r20 = null;
    L83:
        if ((r46 & 1048576) == 0) goto L85;
        String r21 = null;
    L87:
        if ((r46 & 2097152) == 0) goto L90;
        String r462 = null;
    L91:
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r4, r16, r17, r18, r19, r20, r21, r462);
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
        r16 = r39;
        goto L67
    L61:
        r4 = r38;
        goto L63
    L57:
        r2 = r37;
        goto L59
    L53:
        r15 = r36;
        goto L55
    L49:
        r14 = r35;
        goto L51
    L45:
        r13 = r34;
        goto L47
    L41:
        r12 = r33;
        goto L43
    L37:
        r11 = r32;
        goto L39
    L33:
        r10 = r31;
        goto L35
    L29:
        r9 = r30;
        goto L31
    L25:
        r8 = r29;
        goto L27
    L21:
        r7 = r28;
        goto L23
    L17:
        r6 = r27;
        goto L19
    L13:
        r5 = r26;
        goto L15
    L9:
        r3 = r25;
        goto L11
    L5:
        r1 = r24;
        goto L7
    }
}
