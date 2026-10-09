package com.stockbit.component.sharecontent.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0004J\u0014\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011¨\u0006\""}, d2 = {"Lcom/stockbit/component/sharecontent/navigation/RoomPersonalNavParam;", "Lcom/stockbit/component/sharecontent/navigation/ShareNavParam;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "username", "", "avatar", "isVerified", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "getUsername", "()Ljava/lang/String;", "getAvatar", "()Z", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sharecontent_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoomPersonalNavParam implements ShareNavParam, Parcelable {
    public static final Parcelable.Creator<RoomPersonalNavParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f77085a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77086b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77087c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final RoomPersonalNavParam a(Parcel r5) {
            p.l(r5, "parcel");
            int r1 = r5.readInt();
            String r2 = r5.readString();
            String r3 = r5.readString();
            if (r5.readInt() == 0) goto L5;
            boolean r52 = true;
        L7:
            return new RoomPersonalNavParam(r1, r2, r3, r52);
        L5:
            r52 = false;
            goto L7
        }

        public final RoomPersonalNavParam[] b(int r1) {
            return new RoomPersonalNavParam[r1];
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

    public RoomPersonalNavParam(int r2, String r3, String r4, boolean r5) {
        p.l(r3, "username");
        p.l(r4, "avatar");
        this.f77085a = r2;
        this.f77086b = r3;
        this.f77087c = r4;
        this.d = r5;
    }

    public String a() {
        return this.f77087c;
    }

    public int b() {
        return this.f77085a;
    }

    public boolean c() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RoomPersonalNavParam) == true) goto L8;
        return false;
    L8:
        RoomPersonalNavParam r52 = (RoomPersonalNavParam) r5;
        if (this.f77085a == r52.f77085a) goto L12;
        return false;
    L12:
        if (p.g(this.f77086b, r52.f77086b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f77087c, r52.f77087c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public String getUsername() {
        return this.f77086b;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f77085a) * 31) + this.f77086b.hashCode()) * 31) + this.f77087c.hashCode()) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "RoomPersonalNavParam(id=" + this.f77085a + ", username=" + this.f77086b + ", avatar=" + this.f77087c + ", isVerified=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f77085a);
        r1.writeString(this.f77086b);
        r1.writeString(this.f77087c);
        r1.writeInt(this.d ? 1 : 0);
    }
}
