package com.stockbit.domain.model.entity.withdrawal.balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/stockbit/domain/model/entity/withdrawal/balance/BalanceQueue;", "Landroid/os/Parcelable;", Constants.KEY_TITLE, "", Constants.KEY_DATE, "balance", "", "balanceFormatIdr", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDate", "getBalance", "()D", "getBalanceFormatIdr", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BalanceQueue implements Parcelable {
    public static final Parcelable.Creator<BalanceQueue> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f83937a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83938b;

    /* renamed from: c, reason: collision with root package name */
    public final double f83939c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BalanceQueue a(Parcel r8) {
            p.l(r8, "parcel");
            return new BalanceQueue(r8.readString(), r8.readString(), r8.readDouble(), r8.readString());
        }

        public final BalanceQueue[] b(int r1) {
            return new BalanceQueue[r1];
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

    public BalanceQueue(String r2, String r3, double r4, String r6) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, Constants.KEY_DATE);
        p.l(r6, "balanceFormatIdr");
        this.f83937a = r2;
        this.f83938b = r3;
        this.f83939c = r4;
        this.d = r6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f83938b;
    }

    public final String c() {
        return this.f83937a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BalanceQueue) == true) goto L8;
        return false;
    L8:
        BalanceQueue r82 = (BalanceQueue) r8;
        if (p.g(this.f83937a, r82.f83937a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f83938b, r82.f83938b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f83939c, r82.f83939c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f83937a.hashCode() * 31) + this.f83938b.hashCode()) * 31) + Double.hashCode(this.f83939c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BalanceQueue(title=" + this.f83937a + ", date=" + this.f83938b + ", balance=" + this.f83939c + ", balanceFormatIdr=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f83937a);
        r3.writeString(this.f83938b);
        r3.writeDouble(this.f83939c);
        r3.writeString(this.d);
    }

    public /* synthetic */ BalanceQueue(String r2, String r3, double r4, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0.0d;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = "0";
    L14:
        double r5 = r4;
        String r42 = r3;
        String r32 = r2;
        this(r32, r42, r5, r6);
    }
}
