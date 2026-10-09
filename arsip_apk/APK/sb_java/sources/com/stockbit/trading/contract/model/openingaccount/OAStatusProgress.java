package com.stockbit.trading.contract.model.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0003J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/stockbit/trading/contract/model/openingaccount/OAStatusProgress;", "Landroid/os/Parcelable;", Constants.KEY_ENCRYPTION_INAPP_CS, "", "ksei", "bank", "<init>", "(III)V", "getCs", "()I", "getKsei", "getBank", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "trading-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OAStatusProgress implements Parcelable {
    public static final Parcelable.Creator<OAStatusProgress> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f146258a;

    /* renamed from: b, reason: collision with root package name */
    public final int f146259b;

    /* renamed from: c, reason: collision with root package name */
    public final int f146260c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OAStatusProgress a(Parcel r4) {
            p.l(r4, "parcel");
            return new OAStatusProgress(r4.readInt(), r4.readInt(), r4.readInt());
        }

        public final OAStatusProgress[] b(int r1) {
            return new OAStatusProgress[r1];
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

    public OAStatusProgress(int r1, int r2, int r3) {
        this.f146258a = r1;
        this.f146259b = r2;
        this.f146260c = r3;
    }

    public final int a() {
        return this.f146260c;
    }

    public final int b() {
        return this.f146258a;
    }

    public final int c() {
        return this.f146259b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OAStatusProgress) == true) goto L8;
        return false;
    L8:
        OAStatusProgress r52 = (OAStatusProgress) r5;
        if (this.f146258a == r52.f146258a) goto L12;
        return false;
    L12:
        if (this.f146259b == r52.f146259b) goto L15;
        return false;
    L15:
        if (this.f146260c == r52.f146260c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f146258a) * 31) + Integer.hashCode(this.f146259b)) * 31) + Integer.hashCode(this.f146260c);
    }

    public String toString() {
        return "OAStatusProgress(cs=" + this.f146258a + ", ksei=" + this.f146259b + ", bank=" + this.f146260c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f146258a);
        r1.writeInt(this.f146259b);
        r1.writeInt(this.f146260c);
    }
}
