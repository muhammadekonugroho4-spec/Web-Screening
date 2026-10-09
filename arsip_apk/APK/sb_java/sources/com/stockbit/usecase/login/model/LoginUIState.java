package com.stockbit.usecase.login.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0014\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0083\u0004J\n\u0010+\u001a\u00020'HÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u00062"}, d2 = {"Lcom/stockbit/usecase/login/model/LoginUIState;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "username", "fullname", "email", "avatar", "exchange", "country", "watchlistId", "isVerified", "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUsername", "getFullname", "getEmail", "getAvatar", "getExchange", "getCountry", "getWatchlistId", "()Z", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "usecase-login_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginUIState implements Parcelable {
    public static final Parcelable.Creator<LoginUIState> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f158336a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158337b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158338c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158339e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158340f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158341g;

    /* renamed from: h, reason: collision with root package name */
    public final String f158342h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f158343i;

    /* renamed from: j, reason: collision with root package name */
    public final String f158344j;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final LoginUIState a(Parcel r13) {
            kotlin.jvm.internal.p.l(r13, "parcel");
            String r2 = r13.readString();
            String r3 = r13.readString();
            String r4 = r13.readString();
            String r5 = r13.readString();
            String r6 = r13.readString();
            String r7 = r13.readString();
            String r8 = r13.readString();
            String r9 = r13.readString();
            if (r13.readInt() == 0) goto L6;
            boolean r02 = true;
        L5:
            boolean r10 = r02;
            return new LoginUIState(r2, r3, r4, r5, r6, r7, r8, r9, r10, r13.readString());
        L6:
            r02 = false;
            goto L5
        }

        public final LoginUIState[] b(int r1) {
            return new LoginUIState[r1];
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

    public LoginUIState(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, boolean r10, String r11) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "username");
        kotlin.jvm.internal.p.l(r4, "fullname");
        kotlin.jvm.internal.p.l(r5, "email");
        kotlin.jvm.internal.p.l(r6, "avatar");
        kotlin.jvm.internal.p.l(r7, "exchange");
        kotlin.jvm.internal.p.l(r8, "country");
        kotlin.jvm.internal.p.l(r9, "watchlistId");
        this.f158336a = r2;
        this.f158337b = r3;
        this.f158338c = r4;
        this.d = r5;
        this.f158339e = r6;
        this.f158340f = r7;
        this.f158341g = r8;
        this.f158342h = r9;
        this.f158343i = r10;
        this.f158344j = r11;
    }

    public final String a() {
        return this.f158339e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f158338c;
    }

    public final String d() {
        return this.f158336a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f158343i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof LoginUIState) == true) goto L8;
        return false;
    L8:
        LoginUIState r52 = (LoginUIState) r5;
        if (kotlin.jvm.internal.p.g(this.f158336a, r52.f158336a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f158337b, r52.f158337b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f158338c, r52.f158338c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f158339e, r52.f158339e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f158340f, r52.f158340f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f158341g, r52.f158341g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f158342h, r52.f158342h) == true) goto L33;
        return false;
    L33:
        if (this.f158343i == r52.f158343i) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f158344j, r52.f158344j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String getUsername() {
        return this.f158337b;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((this.f158336a.hashCode() * 31) + this.f158337b.hashCode()) * 31) + this.f158338c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158339e.hashCode()) * 31) + this.f158340f.hashCode()) * 31) + this.f158341g.hashCode()) * 31) + this.f158342h.hashCode()) * 31) + Boolean.hashCode(this.f158343i)) * 31;
        String r1 = this.f158344j;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LoginUIState(id=" + this.f158336a + ", username=" + this.f158337b + ", fullname=" + this.f158338c + ", email=" + this.d + ", avatar=" + this.f158339e + ", exchange=" + this.f158340f + ", country=" + this.f158341g + ", watchlistId=" + this.f158342h + ", isVerified=" + this.f158343i + ", token=" + this.f158344j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        kotlin.jvm.internal.p.l(r1, "dest");
        r1.writeString(this.f158336a);
        r1.writeString(this.f158337b);
        r1.writeString(this.f158338c);
        r1.writeString(this.d);
        r1.writeString(this.f158339e);
        r1.writeString(this.f158340f);
        r1.writeString(this.f158341g);
        r1.writeString(this.f158342h);
        r1.writeInt(this.f158343i ? 1 : 0);
        r1.writeString(this.f158344j);
    }
}
