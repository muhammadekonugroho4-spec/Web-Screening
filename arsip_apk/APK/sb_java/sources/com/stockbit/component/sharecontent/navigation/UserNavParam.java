package com.stockbit.component.sharecontent.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u0004J\u0014\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0006HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012¨\u0006$"}, d2 = {"Lcom/stockbit/component/sharecontent/navigation/UserNavParam;", "Lcom/stockbit/component/sharecontent/navigation/ShareNavParam;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "username", "", "avatar", "isVerified", "", "isShareable", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZZ)V", "getId", "()I", "getUsername", "()Ljava/lang/String;", "getAvatar", "()Z", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sharecontent_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UserNavParam implements ShareNavParam, Parcelable {
    public static final Parcelable.Creator<UserNavParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f77090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77091b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77092c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f77093e;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final UserNavParam a(Parcel r8) {
            p.l(r8, "parcel");
            int r2 = r8.readInt();
            String r3 = r8.readString();
            String r4 = r8.readString();
            boolean r5 = false;
            boolean r6 = true;
            if (r8.readInt() == 0) goto L5;
            boolean r02 = false;
            r5 = true;
        L7:
            if (r8.readInt() != 0) goto L11;
            r6 = r02;
        L11:
            return new UserNavParam(r2, r3, r4, r5, r6);
        L5:
            r02 = false;
            goto L7
        }

        public final UserNavParam[] b(int r1) {
            return new UserNavParam[r1];
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

    public UserNavParam(int r2, String r3, String r4, boolean r5, boolean r6) {
        p.l(r3, "username");
        p.l(r4, "avatar");
        this.f77090a = r2;
        this.f77091b = r3;
        this.f77092c = r4;
        this.d = r5;
        this.f77093e = r6;
    }

    public String a() {
        return this.f77092c;
    }

    public int b() {
        return this.f77090a;
    }

    public final boolean c() {
        return this.f77093e;
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
        if ((r5 instanceof UserNavParam) == true) goto L8;
        return false;
    L8:
        UserNavParam r52 = (UserNavParam) r5;
        if (this.f77090a == r52.f77090a) goto L12;
        return false;
    L12:
        if (p.g(this.f77091b, r52.f77091b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f77092c, r52.f77092c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f77093e == r52.f77093e) goto L23;
        return false;
    L23:
        return true;
    }

    public String getUsername() {
        return this.f77091b;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f77090a) * 31) + this.f77091b.hashCode()) * 31) + this.f77092c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f77093e);
    }

    public String toString() {
        return "UserNavParam(id=" + this.f77090a + ", username=" + this.f77091b + ", avatar=" + this.f77092c + ", isVerified=" + this.d + ", isShareable=" + this.f77093e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f77090a);
        r1.writeString(this.f77091b);
        r1.writeString(this.f77092c);
        r1.writeInt(this.d ? 1 : 0);
        r1.writeInt(this.f77093e ? 1 : 0);
    }

    public /* synthetic */ UserNavParam(int r3, String r4, String r5, boolean r6, boolean r7, int r8, i r9) {
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
        if ((r8 & 16) == 0) goto L17;
        r7 = true;
    L17:
        boolean r82 = r7;
        boolean r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82);
    }
}
