package com.stockbit.domain.model.valueobject.trading;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/domain/model/valueobject/trading/TradingFormula;", "Landroid/os/Parcelable;", "version", "", "formula", "Lcom/stockbit/domain/model/valueobject/trading/TradingFormulaDataEntity;", "<init>", "(Ljava/lang/String;Lcom/stockbit/domain/model/valueobject/trading/TradingFormulaDataEntity;)V", "getVersion", "()Ljava/lang/String;", "getFormula", "()Lcom/stockbit/domain/model/valueobject/trading/TradingFormulaDataEntity;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradingFormula implements Parcelable {
    public static final Parcelable.Creator<TradingFormula> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f87189a;

    /* renamed from: b, reason: collision with root package name */
    public final TradingFormulaDataEntity f87190b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final TradingFormula a(Parcel r4) {
            p.l(r4, "parcel");
            String r1 = r4.readString();
            if (r4.readInt() != 0) goto L5;
            TradingFormulaDataEntity r42 = null;
        L7:
            return new TradingFormula(r1, r42);
        L5:
            r42 = TradingFormulaDataEntity.CREATOR.createFromParcel(r4);
            goto L7
        }

        public final TradingFormula[] b(int r1) {
            return new TradingFormula[r1];
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

    public TradingFormula(String r1, TradingFormulaDataEntity r2) {
        this.f87189a = r1;
        this.f87190b = r2;
    }

    public final TradingFormulaDataEntity a() {
        return this.f87190b;
    }

    public final String b() {
        return this.f87189a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradingFormula) == true) goto L8;
        return false;
    L8:
        TradingFormula r52 = (TradingFormula) r5;
        if (p.g(this.f87189a, r52.f87189a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87190b, r52.f87190b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f87189a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        TradingFormulaDataEntity r2 = this.f87190b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "TradingFormula(version=" + this.f87189a + ", formula=" + this.f87190b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f87189a);
        TradingFormulaDataEntity r02 = this.f87190b;
        if (r02 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
    }
}
