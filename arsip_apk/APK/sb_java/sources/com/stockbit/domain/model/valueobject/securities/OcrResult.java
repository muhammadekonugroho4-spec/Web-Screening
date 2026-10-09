package com.stockbit.domain.model.valueobject.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/stockbit/domain/model/valueobject/securities/OcrResult;", "Landroid/os/Parcelable;", "eligible", "", "triggered", "used", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEligible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTriggered", "getUsed", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/domain/model/valueobject/securities/OcrResult;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OcrResult implements Parcelable {
    public static final Parcelable.Creator<OcrResult> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f86981a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f86982b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f86983c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OcrResult a(Parcel r8) {
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
            return new OcrResult(r1, r5, r4);
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

        public final OcrResult[] b(int r1) {
            return new OcrResult[r1];
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

    public OcrResult(Boolean r1, Boolean r2, Boolean r3) {
        this.f86981a = r1;
        this.f86982b = r2;
        this.f86983c = r3;
    }

    public final Boolean a() {
        return this.f86981a;
    }

    public final Boolean b() {
        return this.f86982b;
    }

    public final Boolean c() {
        return this.f86983c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OcrResult) == true) goto L8;
        return false;
    L8:
        OcrResult r52 = (OcrResult) r5;
        if (p.g(this.f86981a, r52.f86981a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86982b, r52.f86982b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86983c, r52.f86983c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.f86981a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.f86982b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.f86983c;
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
        return "OcrResult(eligible=" + this.f86981a + ", triggered=" + this.f86982b + ", used=" + this.f86983c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Boolean r42 = this.f86981a;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Boolean r43 = this.f86982b;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        Boolean r44 = this.f86983c;
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
}
