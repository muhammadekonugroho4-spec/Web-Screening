package com.stockbit.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0003J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\nR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006%"}, d2 = {"Lcom/stockbit/model/entity/Connect;", "Landroid/os/Parcelable;", "facebook", "", "google", "apple", "twitter", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getFacebook", "()Ljava/lang/Integer;", "setFacebook", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getGoogle", "getApple", "getTwitter", "setTwitter", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/model/entity/Connect;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Connect implements Parcelable {
    public static final Parcelable.Creator<Connect> CREATOR = null;

    @SerializedName("apple")
    private final Integer apple;

    @SerializedName("facebook")
    private Integer facebook;

    @SerializedName("google")
    private final Integer google;

    @SerializedName("twitter")
    private Integer twitter;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final Connect a(Parcel r7) {
            p.l(r7, "parcel");
            Integer r2 = null;
            if (r7.readInt() != 0) goto L5;
            Integer r1 = null;
        L7:
            if (r7.readInt() != 0) goto L9;
            Integer r3 = null;
        L11:
            if (r7.readInt() != 0) goto L13;
            Integer r4 = null;
        L15:
            if (r7.readInt() == 0) goto L19;
            r2 = Integer.valueOf(r7.readInt());
        L19:
            return new Connect(r1, r3, r4, r2);
        L13:
            r4 = Integer.valueOf(r7.readInt());
            goto L15
        L9:
            r3 = Integer.valueOf(r7.readInt());
            goto L11
        L5:
            r1 = Integer.valueOf(r7.readInt());
            goto L7
        }

        public final Connect[] b(int r1) {
            return new Connect[r1];
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

    public Connect() {
        Integer r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        Integer r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final Integer a() {
        return this.apple;
    }

    public final Integer b() {
        return this.facebook;
    }

    public final Integer c() {
        return this.google;
    }

    public final Integer d() {
        return this.twitter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Connect) == true) goto L8;
        return false;
    L8:
        Connect r52 = (Connect) r5;
        if (p.g(this.facebook, r52.facebook) == true) goto L12;
        return false;
    L12:
        if (p.g(this.google, r52.google) == true) goto L15;
        return false;
    L15:
        if (p.g(this.apple, r52.apple) == true) goto L18;
        return false;
    L18:
        if (p.g(this.twitter, r52.twitter) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.facebook;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.google;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.apple;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Integer r25 = this.twitter;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
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
        return "Connect(facebook=" + this.facebook + ", google=" + this.google + ", apple=" + this.apple + ", twitter=" + this.twitter + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Integer r42 = this.facebook;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Integer r43 = this.google;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        Integer r44 = this.apple;
        if (r44 != null) goto L13;
        r3.writeInt(0);
    L14:
        Integer r45 = this.twitter;
        if (r45 != null) goto L18;
        r3.writeInt(0);
        return;
    L18:
        r3.writeInt(1);
        r3.writeInt(r45.intValue());
        return;
    L13:
        r3.writeInt(1);
        r3.writeInt(r44.intValue());
        goto L14
    L9:
        r3.writeInt(1);
        r3.writeInt(r43.intValue());
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.intValue());
        goto L6
    }

    public Connect(Integer r1, Integer r2, Integer r3, Integer r4) {
        this.facebook = r1;
        this.google = r2;
        this.apple = r3;
        this.twitter = r4;
    }

    public /* synthetic */ Connect(Integer r2, Integer r3, Integer r4, Integer r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
