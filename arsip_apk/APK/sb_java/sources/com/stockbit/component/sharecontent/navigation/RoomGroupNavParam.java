package com.stockbit.component.sharecontent.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0004J\u0014\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006%"}, d2 = {"Lcom/stockbit/component/sharecontent/navigation/RoomGroupNavParam;", "Lcom/stockbit/component/sharecontent/navigation/ShareNavParam;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "username", "", "avatar", "isVerified", "", "shortName", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()I", "getUsername", "()Ljava/lang/String;", "getAvatar", "()Z", "getShortName", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sharecontent_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoomGroupNavParam implements ShareNavParam, Parcelable {
    public static final Parcelable.Creator<RoomGroupNavParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f77081a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77082b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77083c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f77084e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final RoomGroupNavParam a(Parcel r8) {
            p.l(r8, "parcel");
            int r2 = r8.readInt();
            String r3 = r8.readString();
            String r4 = r8.readString();
            if (r8.readInt() == 0) goto L6;
            boolean r02 = true;
        L5:
            boolean r5 = r02;
            return new RoomGroupNavParam(r2, r3, r4, r5, r8.readString());
        L6:
            r02 = false;
            goto L5
        }

        public final RoomGroupNavParam[] b(int r1) {
            return new RoomGroupNavParam[r1];
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

    public RoomGroupNavParam(int r2, String r3, String r4, boolean r5, String r6) {
        p.l(r3, "username");
        p.l(r4, "avatar");
        p.l(r6, "shortName");
        this.f77081a = r2;
        this.f77082b = r3;
        this.f77083c = r4;
        this.d = r5;
        this.f77084e = r6;
    }

    public String a() {
        return this.f77083c;
    }

    public int b() {
        return this.f77081a;
    }

    public final String c() {
        return this.f77084e;
    }

    public boolean d() {
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
        if ((r5 instanceof RoomGroupNavParam) == true) goto L8;
        return false;
    L8:
        RoomGroupNavParam r52 = (RoomGroupNavParam) r5;
        if (this.f77081a == r52.f77081a) goto L12;
        return false;
    L12:
        if (p.g(this.f77082b, r52.f77082b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f77083c, r52.f77083c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f77084e, r52.f77084e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public String getUsername() {
        return this.f77082b;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f77081a) * 31) + this.f77082b.hashCode()) * 31) + this.f77083c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + this.f77084e.hashCode();
    }

    public String toString() {
        return "RoomGroupNavParam(id=" + this.f77081a + ", username=" + this.f77082b + ", avatar=" + this.f77083c + ", isVerified=" + this.d + ", shortName=" + this.f77084e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f77081a);
        r1.writeString(this.f77082b);
        r1.writeString(this.f77083c);
        r1.writeInt(this.d ? 1 : 0);
        r1.writeString(this.f77084e);
    }

    public /* synthetic */ RoomGroupNavParam(int r3, String r4, String r5, boolean r6, String r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r6 = false;
    L15:
        if ((r8 & 16) == 0) goto L18;
        String r82 = "";
    L17:
        boolean r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82);
        return;
    L18:
        r82 = r7;
        goto L17
    }
}
