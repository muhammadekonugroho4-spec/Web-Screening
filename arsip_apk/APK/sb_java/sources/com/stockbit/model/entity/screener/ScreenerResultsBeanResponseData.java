package com.stockbit.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0003J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006&"}, d2 = {"Lcom/stockbit/model/entity/screener/ScreenerResultsBeanResponseData;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "item", "", "raw", "", Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItem", "()Ljava/lang/String;", "getRaw", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDisplay", "component1", "component2", "component3", "component4", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/stockbit/model/entity/screener/ScreenerResultsBeanResponseData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenerResultsBeanResponseData implements Parcelable {
    public static final Parcelable.Creator<ScreenerResultsBeanResponseData> CREATOR = null;

    @SerializedName(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)
    @Expose
    private final String display;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(com.clevertap.android.sdk.Constants.KEY_ID)
    @Expose
    private final Integer f122068id;

    @SerializedName("item")
    @Expose
    private final String item;

    @SerializedName("raw")
    @Expose
    private final Double raw;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerResultsBeanResponseData a(Parcel r7) {
            p.l(r7, "parcel");
            Double r2 = null;
            if (r7.readInt() != 0) goto L5;
            Integer r1 = null;
        L6:
            String r3 = r7.readString();
            if (r7.readInt() == 0) goto L11;
            r2 = Double.valueOf(r7.readDouble());
        L11:
            return new ScreenerResultsBeanResponseData(r1, r3, r2, r7.readString());
        L5:
            r1 = Integer.valueOf(r7.readInt());
            goto L6
        }

        public final ScreenerResultsBeanResponseData[] b(int r1) {
            return new ScreenerResultsBeanResponseData[r1];
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

    public ScreenerResultsBeanResponseData(Integer r2, String r3, Double r4, String r5) {
        p.l(r5, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        this.f122068id = r2;
        this.item = r3;
        this.raw = r4;
        this.display = r5;
    }

    public final String a() {
        return this.display;
    }

    public final Integer b() {
        return this.f122068id;
    }

    public final String c() {
        return this.item;
    }

    public final Double d() {
        return this.raw;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ScreenerResultsBeanResponseData) == true) goto L8;
        return false;
    L8:
        ScreenerResultsBeanResponseData r52 = (ScreenerResultsBeanResponseData) r5;
        if (p.g(this.f122068id, r52.f122068id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.item, r52.item) == true) goto L15;
        return false;
    L15:
        if (p.g(this.raw, r52.raw) == true) goto L18;
        return false;
    L18:
        if (p.g(this.display, r52.display) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f122068id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.item;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.raw;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return ((r05 + r1) * 31) + this.display.hashCode();
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ScreenerResultsBeanResponseData(id=" + this.f122068id + ", item=" + this.item + ", raw=" + this.raw + ", display=" + this.display + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Integer r42 = this.f122068id;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        r3.writeString(this.item);
        Double r43 = this.raw;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        r3.writeString(this.display);
        return;
    L9:
        r3.writeInt(1);
        r3.writeDouble(r43.doubleValue());
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.intValue());
        goto L6
    }

    public /* synthetic */ ScreenerResultsBeanResponseData(Integer r2, String r3, Double r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4, r5);
    }
}
