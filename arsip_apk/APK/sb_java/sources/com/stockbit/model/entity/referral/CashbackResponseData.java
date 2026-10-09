package com.stockbit.model.entity.referral;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0003J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006!"}, d2 = {"Lcom/stockbit/model/entity/referral/CashbackResponseData;", "Landroid/os/Parcelable;", "amount", "", FirebaseAnalytics.Param.PRICE, NotificationCompat.CATEGORY_STATUS, "", "stock_code", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "getAmount", "()I", "getPrice", "getStatus", "()Ljava/lang/String;", "getStock_code", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CashbackResponseData implements Parcelable {
    public static final Parcelable.Creator<CashbackResponseData> CREATOR = null;

    @SerializedName("amount")
    @Expose
    private final int amount;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Expose
    private final int price;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Expose
    private final String status;

    @SerializedName("stock_code")
    @Expose
    private final String stock_code;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final CashbackResponseData a(Parcel r5) {
            p.l(r5, "parcel");
            return new CashbackResponseData(r5.readInt(), r5.readInt(), r5.readString(), r5.readString());
        }

        public final CashbackResponseData[] b(int r1) {
            return new CashbackResponseData[r1];
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

    public CashbackResponseData(int r2, int r3, String r4, String r5) {
        p.l(r4, NotificationCompat.CATEGORY_STATUS);
        p.l(r5, "stock_code");
        this.amount = r2;
        this.price = r3;
        this.status = r4;
        this.stock_code = r5;
    }

    public final int a() {
        return this.amount;
    }

    public final int b() {
        return this.price;
    }

    public final String c() {
        return this.status;
    }

    public final String d() {
        return this.stock_code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CashbackResponseData) == true) goto L8;
        return false;
    L8:
        CashbackResponseData r52 = (CashbackResponseData) r5;
        if (this.amount == r52.amount) goto L12;
        return false;
    L12:
        if (this.price == r52.price) goto L15;
        return false;
    L15:
        if (p.g(this.status, r52.status) == true) goto L18;
        return false;
    L18:
        if (p.g(this.stock_code, r52.stock_code) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.amount) * 31) + Integer.hashCode(this.price)) * 31) + this.status.hashCode()) * 31) + this.stock_code.hashCode();
    }

    public String toString() {
        return "CashbackResponseData(amount=" + this.amount + ", price=" + this.price + ", status=" + this.status + ", stock_code=" + this.stock_code + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.amount);
        r1.writeInt(this.price);
        r1.writeString(this.status);
        r1.writeString(this.stock_code);
    }
}
