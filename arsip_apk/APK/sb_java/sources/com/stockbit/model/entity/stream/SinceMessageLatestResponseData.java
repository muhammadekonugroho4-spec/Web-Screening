package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020 HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000f¨\u0006,"}, d2 = {"Lcom/stockbit/model/entity/stream/SinceMessageLatestResponseData;", "Landroid/os/Parcelable;", "lastprice", "", "change", "pchange", "volume", "avgvolume", Constants.KEY_DATE, "formattedPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLastprice", "()Ljava/lang/String;", "setLastprice", "(Ljava/lang/String;)V", "getChange", "getPchange", "getVolume", "getAvgvolume", "getDate", "getFormattedPrice", "setFormattedPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SinceMessageLatestResponseData implements Parcelable {
    public static final Parcelable.Creator<SinceMessageLatestResponseData> CREATOR = null;

    @SerializedName("avgvolume")
    private final String avgvolume;

    @SerializedName("change")
    private final String change;

    @SerializedName(Constants.KEY_DATE)
    private final String date;

    @SerializedName("formatted_price")
    private String formattedPrice;

    @SerializedName("lastprice")
    private String lastprice;

    @SerializedName("pchange")
    private final String pchange;

    @SerializedName("volume")
    private final String volume;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final SinceMessageLatestResponseData a(Parcel r10) {
            p.l(r10, "parcel");
            return new SinceMessageLatestResponseData(r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString(), r10.readString());
        }

        public final SinceMessageLatestResponseData[] b(int r1) {
            return new SinceMessageLatestResponseData[r1];
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

    public SinceMessageLatestResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
    }

    public final String a() {
        return this.avgvolume;
    }

    public final String b() {
        return this.change;
    }

    public final String c() {
        return this.date;
    }

    public final String d() {
        return this.formattedPrice;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.lastprice;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SinceMessageLatestResponseData) == true) goto L8;
        return false;
    L8:
        SinceMessageLatestResponseData r52 = (SinceMessageLatestResponseData) r5;
        if (p.g(this.lastprice, r52.lastprice) == true) goto L12;
        return false;
    L12:
        if (p.g(this.change, r52.change) == true) goto L15;
        return false;
    L15:
        if (p.g(this.pchange, r52.pchange) == true) goto L18;
        return false;
    L18:
        if (p.g(this.volume, r52.volume) == true) goto L21;
        return false;
    L21:
        if (p.g(this.avgvolume, r52.avgvolume) == true) goto L24;
        return false;
    L24:
        if (p.g(this.date, r52.date) == true) goto L27;
        return false;
    L27:
        if (p.g(this.formattedPrice, r52.formattedPrice) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.pchange;
    }

    public final String g() {
        return this.volume;
    }

    public int hashCode() {
        String r02 = this.lastprice;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.change;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.pchange;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.volume;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.avgvolume;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.date;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.formattedPrice;
        if (r211 == null) goto L31;
        r1 = r211.hashCode();
    L31:
        return r09 + r1;
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
        return "SinceMessageLatestResponseData(lastprice=" + this.lastprice + ", change=" + this.change + ", pchange=" + this.pchange + ", volume=" + this.volume + ", avgvolume=" + this.avgvolume + ", date=" + this.date + ", formattedPrice=" + this.formattedPrice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.lastprice);
        r1.writeString(this.change);
        r1.writeString(this.pchange);
        r1.writeString(this.volume);
        r1.writeString(this.avgvolume);
        r1.writeString(this.date);
        r1.writeString(this.formattedPrice);
    }

    public SinceMessageLatestResponseData(String r1, String r2, String r3, String r4, String r5, String r6, String r7) {
        this.lastprice = r1;
        this.change = r2;
        this.pchange = r3;
        this.volume = r4;
        this.avgvolume = r5;
        this.date = r6;
        this.formattedPrice = r7;
    }

    public /* synthetic */ SinceMessageLatestResponseData(String r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r9 & 64) == 0) goto L24;
        String r92 = null;
    L23:
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
