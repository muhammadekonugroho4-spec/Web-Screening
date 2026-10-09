package com.stockbit.model.entity.securitiesOA;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/stockbit/model/entity/securitiesOA/OcrResultResponseData;", "Landroid/os/Parcelable;", "eligible", "", "triggered", "used", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEligible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTriggered", "getUsed", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/model/entity/securitiesOA/OcrResultResponseData;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OcrResultResponseData implements Parcelable {
    public static final Parcelable.Creator<OcrResultResponseData> CREATOR = null;

    @SerializedName("eligible")
    private final Boolean eligible;

    @SerializedName("triggered")
    private final Boolean triggered;

    @SerializedName("used")
    private final Boolean used;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OcrResultResponseData a(Parcel r8) {
            p.l(r8, "parcel");
            boolean r2 = false;
            Boolean r4 = null;
            if (r8.readInt() != 0) goto L6;
            Boolean r1 = null;
        L11:
            if (r8.readInt() != 0) goto L14;
            Boolean r5 = null;
        L19:
            if (r8.readInt() == 0) goto L26;
            if (r8.readInt() == 0) goto L24;
            r2 = true;
        L24:
            r4 = Boolean.valueOf(r2);
        L26:
            return new OcrResultResponseData(r1, r5, r4);
        L14:
            if (r8.readInt() == 0) goto L16;
            boolean r52 = true;
        L17:
            r5 = Boolean.valueOf(r52);
            goto L19
        L16:
            r52 = false;
            goto L17
        L6:
            if (r8.readInt() == 0) goto L8;
            boolean r12 = true;
        L9:
            r1 = Boolean.valueOf(r12);
            goto L11
        L8:
            r12 = false;
            goto L9
        }

        public final OcrResultResponseData[] b(int r1) {
            return new OcrResultResponseData[r1];
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

    public OcrResultResponseData() {
        Boolean r1 = null;
        Boolean r2 = null;
        Boolean r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Boolean a() {
        return this.eligible;
    }

    public final Boolean b() {
        return this.triggered;
    }

    public final Boolean c() {
        return this.used;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OcrResultResponseData) == true) goto L8;
        return false;
    L8:
        OcrResultResponseData r52 = (OcrResultResponseData) r5;
        if (p.g(this.eligible, r52.eligible) == true) goto L12;
        return false;
    L12:
        if (p.g(this.triggered, r52.triggered) == true) goto L15;
        return false;
    L15:
        if (p.g(this.used, r52.used) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.eligible;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.triggered;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.used;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OcrResultResponseData(eligible=" + this.eligible + ", triggered=" + this.triggered + ", used=" + this.used + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Boolean r42 = this.eligible;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Boolean r43 = this.triggered;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        Boolean r44 = this.used;
        if (r44 != null) goto L14;
        r3.writeInt(0);
        return;
    L14:
        r3.writeInt(1);
        r3.writeInt(r44.booleanValue() ? 1 : 0);
        return;
    L9:
        r3.writeInt(1);
        r3.writeInt(r43.booleanValue() ? 1 : 0);
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.booleanValue() ? 1 : 0);
        goto L6
    }

    public OcrResultResponseData(Boolean r1, Boolean r2, Boolean r3) {
        this.eligible = r1;
        this.triggered = r2;
        this.used = r3;
    }

    public /* synthetic */ OcrResultResponseData(Boolean r2, Boolean r3, Boolean r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
