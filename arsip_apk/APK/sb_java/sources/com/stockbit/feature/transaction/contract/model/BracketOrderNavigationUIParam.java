package com.stockbit.feature.transaction.contract.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.stockbit.usecase.securities.model.type.OrderExpiryType;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020 HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006."}, d2 = {"Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam;", "Landroid/os/Parcelable;", "asset", "Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderAssetNavigationUIParam;", "buyOrderPrice", "", "shares", "stopLossTrigger", "Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderTriggerTypeNavigationUIParam;", "takeProfitTrigger", "expiry", "Lcom/stockbit/usecase/securities/model/type/OrderExpiryType;", "<init>", "(Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderAssetNavigationUIParam;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderTriggerTypeNavigationUIParam;Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderTriggerTypeNavigationUIParam;Lcom/stockbit/usecase/securities/model/type/OrderExpiryType;)V", "getAsset", "()Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderAssetNavigationUIParam;", "getBuyOrderPrice", "()Ljava/lang/String;", "getShares", "getStopLossTrigger", "()Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderTriggerTypeNavigationUIParam;", "getTakeProfitTrigger", "getExpiry", "()Lcom/stockbit/usecase/securities/model/type/OrderExpiryType;", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BracketOrderOrderAssetNavigationUIParam", "BracketOrderOrderTriggerTypeNavigationUIParam", "transaction-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BracketOrderNavigationUIParam implements Parcelable {
    public static final Parcelable.Creator<BracketOrderNavigationUIParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final BracketOrderOrderAssetNavigationUIParam f107432a;

    /* renamed from: b, reason: collision with root package name */
    public final String f107433b;

    /* renamed from: c, reason: collision with root package name */
    public final String f107434c;
    public final BracketOrderOrderTriggerTypeNavigationUIParam d;

    /* renamed from: e, reason: collision with root package name */
    public final BracketOrderOrderTriggerTypeNavigationUIParam f107435e;

    /* renamed from: f, reason: collision with root package name */
    public final OrderExpiryType f107436f;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderAssetNavigationUIParam;", "Landroid/os/Parcelable;", "code", "", "marketBoard", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMarketBoard", "getType", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "transaction-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BracketOrderOrderAssetNavigationUIParam implements Parcelable {
        public static final Parcelable.Creator<BracketOrderOrderAssetNavigationUIParam> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f107437a;

        /* renamed from: b, reason: collision with root package name */
        public final String f107438b;

        /* renamed from: c, reason: collision with root package name */
        public final String f107439c;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final BracketOrderOrderAssetNavigationUIParam a(Parcel r4) {
                p.l(r4, "parcel");
                return new BracketOrderOrderAssetNavigationUIParam(r4.readString(), r4.readString(), r4.readString());
            }

            public final BracketOrderOrderAssetNavigationUIParam[] b(int r1) {
                return new BracketOrderOrderAssetNavigationUIParam[r1];
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

        public BracketOrderOrderAssetNavigationUIParam(String r2, String r3, String r4) {
            p.l(r2, "code");
            p.l(r3, "marketBoard");
            p.l(r4, "type");
            this.f107437a = r2;
            this.f107438b = r3;
            this.f107439c = r4;
        }

        public final String a() {
            return this.f107437a;
        }

        public final String b() {
            return this.f107438b;
        }

        public final String c() {
            return this.f107439c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof BracketOrderOrderAssetNavigationUIParam) == true) goto L8;
            return false;
        L8:
            BracketOrderOrderAssetNavigationUIParam r52 = (BracketOrderOrderAssetNavigationUIParam) r5;
            if (p.g(this.f107437a, r52.f107437a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f107438b, r52.f107438b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f107439c, r52.f107439c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f107437a.hashCode() * 31) + this.f107438b.hashCode()) * 31) + this.f107439c.hashCode();
        }

        public String toString() {
            return "BracketOrderOrderAssetNavigationUIParam(code=" + this.f107437a + ", marketBoard=" + this.f107438b + ", type=" + this.f107439c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f107437a);
            r1.writeString(this.f107438b);
            r1.writeString(this.f107439c);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/feature/transaction/contract/model/BracketOrderNavigationUIParam$BracketOrderOrderTriggerTypeNavigationUIParam;", "Landroid/os/Parcelable;", NotificationCompat.CATEGORY_STATUS, "", "triggerPrice", "orderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getTriggerPrice", "getOrderType", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "transaction-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BracketOrderOrderTriggerTypeNavigationUIParam implements Parcelable {
        public static final Parcelable.Creator<BracketOrderOrderTriggerTypeNavigationUIParam> CREATOR = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f107440a;

        /* renamed from: b, reason: collision with root package name */
        public final String f107441b;

        /* renamed from: c, reason: collision with root package name */
        public final String f107442c;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final BracketOrderOrderTriggerTypeNavigationUIParam a(Parcel r4) {
                p.l(r4, "parcel");
                return new BracketOrderOrderTriggerTypeNavigationUIParam(r4.readString(), r4.readString(), r4.readString());
            }

            public final BracketOrderOrderTriggerTypeNavigationUIParam[] b(int r1) {
                return new BracketOrderOrderTriggerTypeNavigationUIParam[r1];
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

        public BracketOrderOrderTriggerTypeNavigationUIParam(String r2, String r3, String r4) {
            p.l(r2, NotificationCompat.CATEGORY_STATUS);
            p.l(r3, "triggerPrice");
            p.l(r4, "orderType");
            this.f107440a = r2;
            this.f107441b = r3;
            this.f107442c = r4;
        }

        public final String a() {
            return this.f107442c;
        }

        public final String b() {
            return this.f107440a;
        }

        public final String c() {
            return this.f107441b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof BracketOrderOrderTriggerTypeNavigationUIParam) == true) goto L8;
            return false;
        L8:
            BracketOrderOrderTriggerTypeNavigationUIParam r52 = (BracketOrderOrderTriggerTypeNavigationUIParam) r5;
            if (p.g(this.f107440a, r52.f107440a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f107441b, r52.f107441b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f107442c, r52.f107442c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f107440a.hashCode() * 31) + this.f107441b.hashCode()) * 31) + this.f107442c.hashCode();
        }

        public String toString() {
            return "BracketOrderOrderTriggerTypeNavigationUIParam(status=" + this.f107440a + ", triggerPrice=" + this.f107441b + ", orderType=" + this.f107442c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r1, int r2) {
            p.l(r1, "dest");
            r1.writeString(this.f107440a);
            r1.writeString(this.f107441b);
            r1.writeString(this.f107442c);
        }
    }

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BracketOrderNavigationUIParam a(Parcel r9) {
            p.l(r9, "parcel");
            BracketOrderOrderAssetNavigationUIParam r2 = BracketOrderOrderAssetNavigationUIParam.CREATOR.createFromParcel(r9);
            String r3 = r9.readString();
            String r4 = r9.readString();
            Parcelable.Creator<BracketOrderOrderTriggerTypeNavigationUIParam> r02 = BracketOrderOrderTriggerTypeNavigationUIParam.CREATOR;
            return new BracketOrderNavigationUIParam(r2, r3, r4, r02.createFromParcel(r9), r02.createFromParcel(r9), OrderExpiryType.valueOf(r9.readString()));
        }

        public final BracketOrderNavigationUIParam[] b(int r1) {
            return new BracketOrderNavigationUIParam[r1];
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

    public BracketOrderNavigationUIParam(BracketOrderOrderAssetNavigationUIParam r2, String r3, String r4, BracketOrderOrderTriggerTypeNavigationUIParam r5, BracketOrderOrderTriggerTypeNavigationUIParam r6, OrderExpiryType r7) {
        p.l(r2, "asset");
        p.l(r3, "buyOrderPrice");
        p.l(r4, "shares");
        p.l(r5, "stopLossTrigger");
        p.l(r6, "takeProfitTrigger");
        p.l(r7, "expiry");
        this.f107432a = r2;
        this.f107433b = r3;
        this.f107434c = r4;
        this.d = r5;
        this.f107435e = r6;
        this.f107436f = r7;
    }

    public final BracketOrderOrderAssetNavigationUIParam a() {
        return this.f107432a;
    }

    public final String b() {
        return this.f107433b;
    }

    public final OrderExpiryType c() {
        return this.f107436f;
    }

    public final String d() {
        return this.f107434c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BracketOrderOrderTriggerTypeNavigationUIParam e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BracketOrderNavigationUIParam) == true) goto L8;
        return false;
    L8:
        BracketOrderNavigationUIParam r52 = (BracketOrderNavigationUIParam) r5;
        if (p.g(this.f107432a, r52.f107432a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f107433b, r52.f107433b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f107434c, r52.f107434c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f107435e, r52.f107435e) == true) goto L24;
        return false;
    L24:
        if (this.f107436f == r52.f107436f) goto L26;
        return false;
    L26:
        return true;
    }

    public final BracketOrderOrderTriggerTypeNavigationUIParam f() {
        return this.f107435e;
    }

    public int hashCode() {
        return (((((((((this.f107432a.hashCode() * 31) + this.f107433b.hashCode()) * 31) + this.f107434c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f107435e.hashCode()) * 31) + this.f107436f.hashCode();
    }

    public String toString() {
        return "BracketOrderNavigationUIParam(asset=" + this.f107432a + ", buyOrderPrice=" + this.f107433b + ", shares=" + this.f107434c + ", stopLossTrigger=" + this.d + ", takeProfitTrigger=" + this.f107435e + ", expiry=" + this.f107436f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        this.f107432a.writeToParcel(r2, r3);
        r2.writeString(this.f107433b);
        r2.writeString(this.f107434c);
        this.d.writeToParcel(r2, r3);
        this.f107435e.writeToParcel(r2, r3);
        r2.writeString(this.f107436f.name());
    }
}
