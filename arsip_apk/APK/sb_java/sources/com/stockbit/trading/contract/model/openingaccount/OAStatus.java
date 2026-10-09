package com.stockbit.trading.contract.model.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stockbit/trading/contract/model/openingaccount/OAStatus;", "Landroid/os/Parcelable;", NotificationCompat.CATEGORY_PROGRESS, "Lcom/stockbit/trading/contract/model/openingaccount/OAStatusProgress;", "note", "Lcom/stockbit/trading/contract/model/openingaccount/OANote;", "<init>", "(Lcom/stockbit/trading/contract/model/openingaccount/OAStatusProgress;Lcom/stockbit/trading/contract/model/openingaccount/OANote;)V", "getProgress", "()Lcom/stockbit/trading/contract/model/openingaccount/OAStatusProgress;", "getNote", "()Lcom/stockbit/trading/contract/model/openingaccount/OANote;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "trading-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OAStatus implements Parcelable {
    public static final Parcelable.Creator<OAStatus> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final OAStatusProgress f146256a;

    /* renamed from: b, reason: collision with root package name */
    public final OANote f146257b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OAStatus a(Parcel r5) {
            p.l(r5, "parcel");
            OANote r2 = null;
            if (r5.readInt() != 0) goto L5;
            OAStatusProgress r1 = null;
        L6:
            OAStatusProgress r12 = r1;
            if (r5.readInt() == 0) goto L11;
            r2 = OANote.CREATOR.createFromParcel(r5);
        L11:
            return new OAStatus(r12, r2);
        L5:
            r1 = OAStatusProgress.CREATOR.createFromParcel(r5);
            goto L6
        }

        public final OAStatus[] b(int r1) {
            return new OAStatus[r1];
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

    public OAStatus(OAStatusProgress r1, OANote r2) {
        this.f146256a = r1;
        this.f146257b = r2;
    }

    public final OANote a() {
        return this.f146257b;
    }

    public final OAStatusProgress b() {
        return this.f146256a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OAStatus) == true) goto L8;
        return false;
    L8:
        OAStatus r52 = (OAStatus) r5;
        if (p.g(this.f146256a, r52.f146256a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f146257b, r52.f146257b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        OAStatusProgress r02 = this.f146256a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        OANote r2 = this.f146257b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OAStatus(progress=" + this.f146256a + ", note=" + this.f146257b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r4, int r5) {
        p.l(r4, "dest");
        OAStatusProgress r02 = this.f146256a;
        if (r02 != null) goto L5;
        r4.writeInt(0);
    L6:
        OANote r03 = this.f146257b;
        if (r03 != null) goto L10;
        r4.writeInt(0);
        return;
    L10:
        r4.writeInt(1);
        r03.writeToParcel(r4, r5);
        return;
    L5:
        r4.writeInt(1);
        r02.writeToParcel(r4, r5);
        goto L6
    }
}
