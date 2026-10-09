package com.stockbit.model.entity.referral;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/stockbit/model/entity/referral/ReferralHistoryResponseData;", "Landroid/os/Parcelable;", "createdAt", "", Constants.MessagePayloadKeys.FROM, com.clevertap.android.sdk.Constants.KEY_ID, NotificationCompat.CATEGORY_STATUS, "stock", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/String;", "getFrom", "getId", "getStatus", "getStock", "component1", "component2", "component3", "component4", "component5", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReferralHistoryResponseData implements Parcelable {
    public static final Parcelable.Creator<ReferralHistoryResponseData> CREATOR = null;

    @SerializedName("created_at")
    @Expose
    private final String createdAt;

    @SerializedName(Constants.MessagePayloadKeys.FROM)
    @Expose
    private final String from;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ID)
    @Expose
    private final String f122058id;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Expose
    private final String status;

    @SerializedName("stock")
    @Expose
    private final String stock;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ReferralHistoryResponseData a(Parcel r8) {
            p.l(r8, "parcel");
            return new ReferralHistoryResponseData(r8.readString(), r8.readString(), r8.readString(), r8.readString(), r8.readString());
        }

        public final ReferralHistoryResponseData[] b(int r1) {
            return new ReferralHistoryResponseData[r1];
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

    public ReferralHistoryResponseData(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "createdAt");
        p.l(r3, Constants.MessagePayloadKeys.FROM);
        p.l(r4, com.clevertap.android.sdk.Constants.KEY_ID);
        p.l(r5, NotificationCompat.CATEGORY_STATUS);
        p.l(r6, "stock");
        this.createdAt = r2;
        this.from = r3;
        this.f122058id = r4;
        this.status = r5;
        this.stock = r6;
    }

    public final String a() {
        return this.createdAt;
    }

    public final String b() {
        return this.from;
    }

    public final String c() {
        return this.f122058id;
    }

    public final String d() {
        return this.stock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ReferralHistoryResponseData) == true) goto L8;
        return false;
    L8:
        ReferralHistoryResponseData r52 = (ReferralHistoryResponseData) r5;
        if (p.g(this.createdAt, r52.createdAt) == true) goto L12;
        return false;
    L12:
        if (p.g(this.from, r52.from) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122058id, r52.f122058id) == true) goto L18;
        return false;
    L18:
        if (p.g(this.status, r52.status) == true) goto L21;
        return false;
    L21:
        if (p.g(this.stock, r52.stock) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.createdAt.hashCode() * 31) + this.from.hashCode()) * 31) + this.f122058id.hashCode()) * 31) + this.status.hashCode()) * 31) + this.stock.hashCode();
    }

    public String toString() {
        return "ReferralHistoryResponseData(createdAt=" + this.createdAt + ", from=" + this.from + ", id=" + this.f122058id + ", status=" + this.status + ", stock=" + this.stock + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.createdAt);
        r1.writeString(this.from);
        r1.writeString(this.f122058id);
        r1.writeString(this.status);
        r1.writeString(this.stock);
    }
}
