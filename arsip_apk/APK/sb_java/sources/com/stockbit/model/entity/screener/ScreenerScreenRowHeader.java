package com.stockbit.model.entity.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003Bk\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\fHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003Jm\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fHÆ\u0001J\u0006\u00101\u001a\u00020\u0007J\u0014\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010%HÖ\u0083\u0004J\n\u00104\u001a\u00020\u0007HÖ\u0081\u0004J\n\u00105\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u001e\"\u0004\b!\u0010 ¨\u0006;"}, d2 = {"Lcom/stockbit/model/entity/screener/ScreenerScreenRowHeader;", "Lcom/evrencoskun/tableview/filter/IFilterableModel;", "Lcom/evrencoskun/tableview/sort/ISortableModel;", "Landroid/os/Parcelable;", "mId", "", "companyId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "symbol", "columnSize", "", "iconUrl", "isNew", "", "isChecked", "isAddWatchlistMode", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZZ)V", "getMId", "()Ljava/lang/String;", "getCompanyId", "()I", "getName", "getData", "getSymbol", "getColumnSize", "()J", "getIconUrl", "()Z", "setChecked", "(Z)V", "setAddWatchlistMode", "getFilterableKeyword", "getId", "getContent", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", com.clevertap.android.sdk.Constants.COPY_TYPE, "describeContents", "equals", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ScreenerScreenRowHeader implements Parcelable {
    public static final Parcelable.Creator<ScreenerScreenRowHeader> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f122078a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122079b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122080c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f122081e;

    /* renamed from: f, reason: collision with root package name */
    public final long f122082f;

    /* renamed from: g, reason: collision with root package name */
    public final String f122083g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f122084h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f122085i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f122086j;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ScreenerScreenRowHeader a(Parcel r14) {
            p.l(r14, "parcel");
            String r2 = r14.readString();
            int r3 = r14.readInt();
            String r4 = r14.readString();
            String r5 = r14.readString();
            String r6 = r14.readString();
            long r7 = r14.readLong();
            String r9 = r14.readString();
            boolean r10 = false;
            boolean r11 = true;
            if (r14.readInt() == 0) goto L5;
            boolean r02 = false;
            r10 = true;
        L7:
            if (r14.readInt() == 0) goto L9;
            boolean r12 = true;
        L11:
            if (r14.readInt() != 0) goto L15;
            r12 = r02;
        L15:
            return new ScreenerScreenRowHeader(r2, r3, r4, r5, r6, r7, r9, r10, r11, r12);
        L9:
            r12 = true;
            r11 = r02;
            goto L11
        L5:
            r02 = false;
            goto L7
        }

        public final ScreenerScreenRowHeader[] b(int r1) {
            return new ScreenerScreenRowHeader[r1];
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

    public ScreenerScreenRowHeader(String r2, int r3, String r4, String r5, String r6, long r7, String r9, boolean r10, boolean r11, boolean r12) {
        p.l(r2, "mId");
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        p.l(r6, "symbol");
        p.l(r9, "iconUrl");
        this.f122078a = r2;
        this.f122079b = r3;
        this.f122080c = r4;
        this.d = r5;
        this.f122081e = r6;
        this.f122082f = r7;
        this.f122083g = r9;
        this.f122084h = r10;
        this.f122085i = r11;
        this.f122086j = r12;
    }

    public final int a() {
        return this.f122079b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f122083g;
    }

    public String d() {
        return this.f122078a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f122080c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ScreenerScreenRowHeader) == true) goto L8;
        return false;
    L8:
        ScreenerScreenRowHeader r82 = (ScreenerScreenRowHeader) r8;
        if (p.g(this.f122078a, r82.f122078a) == true) goto L12;
        return false;
    L12:
        if (this.f122079b == r82.f122079b) goto L15;
        return false;
    L15:
        if (p.g(this.f122080c, r82.f122080c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f122081e, r82.f122081e) == true) goto L24;
        return false;
    L24:
        if (this.f122082f == r82.f122082f) goto L27;
        return false;
    L27:
        if (p.g(this.f122083g, r82.f122083g) == true) goto L30;
        return false;
    L30:
        if (this.f122084h == r82.f122084h) goto L33;
        return false;
    L33:
        if (this.f122085i == r82.f122085i) goto L36;
        return false;
    L36:
        if (this.f122086j == r82.f122086j) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f122081e;
    }

    public final boolean g() {
        return this.f122086j;
    }

    public final boolean h() {
        return this.f122085i;
    }

    public int hashCode() {
        return (((((((((((((((((this.f122078a.hashCode() * 31) + Integer.hashCode(this.f122079b)) * 31) + this.f122080c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f122081e.hashCode()) * 31) + Long.hashCode(this.f122082f)) * 31) + this.f122083g.hashCode()) * 31) + Boolean.hashCode(this.f122084h)) * 31) + Boolean.hashCode(this.f122085i)) * 31) + Boolean.hashCode(this.f122086j);
    }

    public final boolean i() {
        return this.f122084h;
    }

    public final void j(boolean r1) {
        this.f122086j = r1;
    }

    public final void k(boolean r1) {
        this.f122085i = r1;
    }

    public String toString() {
        return "ScreenerScreenRowHeader(mId=" + this.f122078a + ", companyId=" + this.f122079b + ", name=" + this.f122080c + ", data=" + this.d + ", symbol=" + this.f122081e + ", columnSize=" + this.f122082f + ", iconUrl=" + this.f122083g + ", isNew=" + this.f122084h + ", isChecked=" + this.f122085i + ", isAddWatchlistMode=" + this.f122086j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.f122078a);
        r3.writeInt(this.f122079b);
        r3.writeString(this.f122080c);
        r3.writeString(this.d);
        r3.writeString(this.f122081e);
        r3.writeLong(this.f122082f);
        r3.writeString(this.f122083g);
        r3.writeInt(this.f122084h ? 1 : 0);
        r3.writeInt(this.f122085i ? 1 : 0);
        r3.writeInt(this.f122086j ? 1 : 0);
    }
}
