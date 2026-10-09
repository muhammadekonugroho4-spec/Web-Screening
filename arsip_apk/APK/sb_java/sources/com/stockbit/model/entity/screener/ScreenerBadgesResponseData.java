package com.stockbit.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\nHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/stockbit/model/entity/screener/ScreenerBadgesResponseData;", "Landroid/os/Parcelable;", "isNew", "", "<init>", "(Z)V", "()Z", "component1", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenerBadgesResponseData implements Parcelable {
    public static final Parcelable.Creator<ScreenerBadgesResponseData> CREATOR = null;

    @SerializedName("is_new")
    private final boolean isNew;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerBadgesResponseData a(Parcel r2) {
            p.l(r2, "parcel");
            if (r2.readInt() == 0) goto L5;
            boolean r22 = true;
        L7:
            return new ScreenerBadgesResponseData(r22);
        L5:
            r22 = false;
            goto L7
        }

        public final ScreenerBadgesResponseData[] b(int r1) {
            return new ScreenerBadgesResponseData[r1];
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

    public ScreenerBadgesResponseData() {
        boolean r2 = false;
        this(r2, 1, null);
    }

    public final boolean a() {
        return this.isNew;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof ScreenerBadgesResponseData) == true) goto L9;
        return false;
    L9:
        if (this.isNew == ((ScreenerBadgesResponseData) r4).isNew) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isNew);
    }

    public String toString() {
        return "ScreenerBadgesResponseData(isNew=" + this.isNew + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.isNew ? 1 : 0);
    }

    public ScreenerBadgesResponseData(boolean r1) {
        this.isNew = r1;
    }

    public /* synthetic */ ScreenerBadgesResponseData(boolean r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        this(r1);
    }
}
