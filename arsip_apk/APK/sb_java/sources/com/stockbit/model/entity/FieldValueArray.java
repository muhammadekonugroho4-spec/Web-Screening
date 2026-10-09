package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\tJ\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0083\u0004J\n\u0010(\u001a\u00020\tHÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006/"}, d2 = {"Lcom/stockbit/model/entity/FieldValueArray;", "Landroid/os/Parcelable;", Constants.ScionAnalytics.PARAM_LABEL, "", com.clevertap.android.sdk.Constants.KEY_ICON, "symbol", "total", FirebaseAnalytics.Param.PRICE, NotificationCompat.CATEGORY_STATUS, "", "statusText", "documentLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getIcon", "getSymbol", "getTotal", "getPrice", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatusText", "getDocumentLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/model/entity/FieldValueArray;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes10.dex */
public final class FieldValueArray implements Parcelable {
    public static final Parcelable.Creator<FieldValueArray> CREATOR = null;

    @SerializedName("document_link")
    private final String documentLink;

    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ICON)
    private final String icon;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final Integer status;

    @SerializedName("status_text")
    private final String statusText;

    @SerializedName(alternate = {AppMeasurementSdk.ConditionalUserProperty.NAME}, value = "symbol")
    private final String symbol;

    @SerializedName("total")
    private final String total;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final FieldValueArray a(Parcel r11) {
            p.l(r11, "parcel");
            String r2 = r11.readString();
            String r3 = r11.readString();
            String r4 = r11.readString();
            String r5 = r11.readString();
            String r6 = r11.readString();
            if (r11.readInt() != 0) goto L6;
            Integer r02 = null;
        L5:
            Integer r7 = r02;
            return new FieldValueArray(r2, r3, r4, r5, r6, r7, r11.readString(), r11.readString());
        L6:
            r02 = Integer.valueOf(r11.readInt());
            goto L5
        }

        public final FieldValueArray[] b(int r1) {
            return new FieldValueArray[r1];
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

    public FieldValueArray() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        Integer r6 = null;
        String r7 = null;
        String r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final String a() {
        return this.documentLink;
    }

    public final String b() {
        return this.icon;
    }

    public final String c() {
        return this.label;
    }

    public final String d() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.status;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FieldValueArray) == true) goto L8;
        return false;
    L8:
        FieldValueArray r52 = (FieldValueArray) r5;
        if (p.g(this.label, r52.label) == true) goto L12;
        return false;
    L12:
        if (p.g(this.icon, r52.icon) == true) goto L15;
        return false;
    L15:
        if (p.g(this.symbol, r52.symbol) == true) goto L18;
        return false;
    L18:
        if (p.g(this.total, r52.total) == true) goto L21;
        return false;
    L21:
        if (p.g(this.price, r52.price) == true) goto L24;
        return false;
    L24:
        if (p.g(this.status, r52.status) == true) goto L27;
        return false;
    L27:
        if (p.g(this.statusText, r52.statusText) == true) goto L30;
        return false;
    L30:
        if (p.g(this.documentLink, r52.documentLink) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.statusText;
    }

    public final String g() {
        return this.symbol;
    }

    public final String h() {
        return this.total;
    }

    public int hashCode() {
        String r02 = this.label;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.icon;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.symbol;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.total;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.price;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Integer r29 = this.status;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.statusText;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.documentLink;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "FieldValueArray(label=" + this.label + ", icon=" + this.icon + ", symbol=" + this.symbol + ", total=" + this.total + ", price=" + this.price + ", status=" + this.status + ", statusText=" + this.statusText + ", documentLink=" + this.documentLink + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeString(this.label);
        r2.writeString(this.icon);
        r2.writeString(this.symbol);
        r2.writeString(this.total);
        r2.writeString(this.price);
        Integer r32 = this.status;
        if (r32 != null) goto L6;
        int r33 = 0;
    L5:
        r2.writeInt(r33);
        r2.writeString(this.statusText);
        r2.writeString(this.documentLink);
        return;
    L6:
        r2.writeInt(1);
        r33 = r32.intValue();
        goto L5
    }

    public FieldValueArray(String r1, String r2, String r3, String r4, String r5, Integer r6, String r7, String r8) {
        this.label = r1;
        this.icon = r2;
        this.symbol = r3;
        this.total = r4;
        this.price = r5;
        this.status = r6;
        this.statusText = r7;
        this.documentLink = r8;
    }

    public /* synthetic */ FieldValueArray(String r2, String r3, String r4, String r5, String r6, Integer r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r102 = null;
    L26:
        String r92 = r8;
        Integer r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
