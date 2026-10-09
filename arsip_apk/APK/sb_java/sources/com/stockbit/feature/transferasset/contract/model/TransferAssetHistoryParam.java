package com.stockbit.feature.transferasset.contract.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0083\u0004J\n\u00100\u001a\u00020+HÖ\u0081\u0004J\n\u00101\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u00067"}, d2 = {"Lcom/stockbit/feature/transferasset/contract/model/TransferAssetHistoryParam;", "Landroid/os/Parcelable;", "type", "Lcom/stockbit/feature/transferasset/contract/model/TransferAssetHistoryType;", "pageTitle", "", Constants.KEY_DATE, "source", FirebaseAnalytics.Param.DESTINATION, "transferAmount", "lotAmount", "averagePrice", "priceAmount", "symbol", NotificationCompat.CATEGORY_STATUS, "<init>", "(Lcom/stockbit/feature/transferasset/contract/model/TransferAssetHistoryType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/stockbit/feature/transferasset/contract/model/TransferAssetHistoryType;", "getPageTitle", "()Ljava/lang/String;", "getDate", "getSource", "getDestination", "getTransferAmount", "getLotAmount", "getAveragePrice", "getPriceAmount", "getSymbol", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "transferasset-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransferAssetHistoryParam implements Parcelable {
    public static final Parcelable.Creator<TransferAssetHistoryParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final TransferAssetHistoryType f116780a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116781b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116782c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116783e;

    /* renamed from: f, reason: collision with root package name */
    public final String f116784f;

    /* renamed from: g, reason: collision with root package name */
    public final String f116785g;

    /* renamed from: h, reason: collision with root package name */
    public final String f116786h;

    /* renamed from: i, reason: collision with root package name */
    public final String f116787i;

    /* renamed from: j, reason: collision with root package name */
    public final String f116788j;

    /* renamed from: k, reason: collision with root package name */
    public final String f116789k;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TransferAssetHistoryParam a(Parcel r14) {
            p.l(r14, "parcel");
            return new TransferAssetHistoryParam(TransferAssetHistoryType.valueOf(r14.readString()), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString(), r14.readString());
        }

        public final TransferAssetHistoryParam[] b(int r1) {
            return new TransferAssetHistoryParam[r1];
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

    public TransferAssetHistoryParam(TransferAssetHistoryType r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12) {
        p.l(r2, "type");
        p.l(r3, "pageTitle");
        p.l(r4, Constants.KEY_DATE);
        p.l(r5, "source");
        p.l(r6, FirebaseAnalytics.Param.DESTINATION);
        p.l(r7, "transferAmount");
        p.l(r8, "lotAmount");
        p.l(r9, "averagePrice");
        p.l(r10, "priceAmount");
        p.l(r11, "symbol");
        p.l(r12, NotificationCompat.CATEGORY_STATUS);
        this.f116780a = r2;
        this.f116781b = r3;
        this.f116782c = r4;
        this.d = r5;
        this.f116783e = r6;
        this.f116784f = r7;
        this.f116785g = r8;
        this.f116786h = r9;
        this.f116787i = r10;
        this.f116788j = r11;
        this.f116789k = r12;
    }

    public final String a() {
        return this.f116786h;
    }

    public final String b() {
        return this.f116782c;
    }

    public final String c() {
        return this.f116783e;
    }

    public final String d() {
        return this.f116785g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f116781b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TransferAssetHistoryParam) == true) goto L8;
        return false;
    L8:
        TransferAssetHistoryParam r52 = (TransferAssetHistoryParam) r5;
        if (this.f116780a == r52.f116780a) goto L12;
        return false;
    L12:
        if (p.g(this.f116781b, r52.f116781b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f116782c, r52.f116782c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f116783e, r52.f116783e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f116784f, r52.f116784f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f116785g, r52.f116785g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f116786h, r52.f116786h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f116787i, r52.f116787i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f116788j, r52.f116788j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f116789k, r52.f116789k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f116787i;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f116789k;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f116780a.hashCode() * 31) + this.f116781b.hashCode()) * 31) + this.f116782c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f116783e.hashCode()) * 31) + this.f116784f.hashCode()) * 31) + this.f116785g.hashCode()) * 31) + this.f116786h.hashCode()) * 31) + this.f116787i.hashCode()) * 31) + this.f116788j.hashCode()) * 31) + this.f116789k.hashCode();
    }

    public final String i() {
        return this.f116788j;
    }

    public final String j() {
        return this.f116784f;
    }

    public final TransferAssetHistoryType k() {
        return this.f116780a;
    }

    public String toString() {
        return "TransferAssetHistoryParam(type=" + this.f116780a + ", pageTitle=" + this.f116781b + ", date=" + this.f116782c + ", source=" + this.d + ", destination=" + this.f116783e + ", transferAmount=" + this.f116784f + ", lotAmount=" + this.f116785g + ", averagePrice=" + this.f116786h + ", priceAmount=" + this.f116787i + ", symbol=" + this.f116788j + ", status=" + this.f116789k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f116780a.name());
        r1.writeString(this.f116781b);
        r1.writeString(this.f116782c);
        r1.writeString(this.d);
        r1.writeString(this.f116783e);
        r1.writeString(this.f116784f);
        r1.writeString(this.f116785g);
        r1.writeString(this.f116786h);
        r1.writeString(this.f116787i);
        r1.writeString(this.f116788j);
        r1.writeString(this.f116789k);
    }
}
