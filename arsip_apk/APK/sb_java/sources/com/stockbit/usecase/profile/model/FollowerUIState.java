package com.stockbit.usecase.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J~\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00102J\u0006\u00103\u001a\u00020\rJ\u0014\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0083\u0004J\n\u00107\u001a\u00020\rHÖ\u0081\u0004J\n\u00108\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 ¨\u0006>"}, d2 = {"Lcom/stockbit/usecase/profile/model/FollowerUIState;", "Landroid/os/Parcelable;", Constants.KEY_ID, "", "username", "", "fullname", "avatar", "followed", "", "alert", "about", "official", "", "isVerified", "uiType", "Lcom/stockbit/usecase/profile/model/FollowerTypeUIState;", "isMe", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;IZLcom/stockbit/usecase/profile/model/FollowerTypeUIState;Z)V", "getId", "()J", "getUsername", "()Ljava/lang/String;", "getFullname", "getAvatar", "getFollowed", "()Ljava/lang/Boolean;", "setFollowed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAlert", "()Z", "getAbout", "getOfficial", "()I", "getUiType", "()Lcom/stockbit/usecase/profile/model/FollowerTypeUIState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/String;IZLcom/stockbit/usecase/profile/model/FollowerTypeUIState;Z)Lcom/stockbit/usecase/profile/model/FollowerUIState;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "usecase-profile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FollowerUIState implements Parcelable {
    public static final Parcelable.Creator<FollowerUIState> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f159387a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159388b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159389c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f159390e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f159391f;

    /* renamed from: g, reason: collision with root package name */
    public final String f159392g;

    /* renamed from: h, reason: collision with root package name */
    public final int f159393h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f159394i;

    /* renamed from: j, reason: collision with root package name */
    public final FollowerTypeUIState f159395j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f159396k;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final FollowerUIState a(Parcel r15) {
            p.l(r15, "parcel");
            long r2 = r15.readLong();
            String r4 = r15.readString();
            String r5 = r15.readString();
            String r6 = r15.readString();
            boolean r8 = true;
            if (r15.readInt() != 0) goto L6;
            Boolean r02 = null;
        L11:
            if (r15.readInt() == 0) goto L13;
            boolean r9 = true;
        L14:
            String r10 = r15.readString();
            boolean r11 = r9;
            int r102 = r15.readInt();
            if (r15.readInt() == 0) goto L17;
            boolean r12 = r11;
        L18:
            FollowerTypeUIState r13 = FollowerTypeUIState.valueOf(r15.readString());
            if (r15.readInt() == 0) goto L22;
            boolean r132 = r12;
            FollowerTypeUIState r122 = r13;
        L24:
            return new FollowerUIState(r2, r4, r5, r6, r02, r8, r10, r102, r11, r122, r132);
        L22:
            r122 = r13;
            r132 = false;
            goto L24
        L17:
            r12 = r11;
            r11 = false;
            goto L18
        L13:
            r9 = true;
            r8 = false;
            goto L14
        L6:
            if (r15.readInt() == 0) goto L8;
            boolean r03 = true;
        L9:
            r02 = Boolean.valueOf(r03);
            goto L11
        L8:
            r03 = false;
            goto L9
        }

        public final FollowerUIState[] b(int r1) {
            return new FollowerUIState[r1];
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

    public FollowerUIState(long r2, String r4, String r5, String r6, Boolean r7, boolean r8, String r9, int r10, boolean r11, FollowerTypeUIState r12, boolean r13) {
        p.l(r4, "username");
        p.l(r5, "fullname");
        p.l(r6, "avatar");
        p.l(r9, "about");
        p.l(r12, "uiType");
        this.f159387a = r2;
        this.f159388b = r4;
        this.f159389c = r5;
        this.d = r6;
        this.f159390e = r7;
        this.f159391f = r8;
        this.f159392g = r9;
        this.f159393h = r10;
        this.f159394i = r11;
        this.f159395j = r12;
        this.f159396k = r13;
    }

    public static /* synthetic */ FollowerUIState b(FollowerUIState r13, long r14, String r16, String r17, String r18, Boolean r19, boolean r20, String r21, int r22, boolean r23, FollowerTypeUIState r24, boolean r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L5;
        r14 = r13.f159387a;
    L5:
        long r1 = r14;
        if ((r26 & 2) == 0) goto L8;
        String r3 = r13.f159388b;
    L10:
        if ((r26 & 4) == 0) goto L12;
        String r4 = r13.f159389c;
    L14:
        if ((r26 & 8) == 0) goto L16;
        String r5 = r13.d;
    L18:
        if ((r26 & 16) == 0) goto L20;
        Boolean r6 = r13.f159390e;
    L22:
        if ((r26 & 32) == 0) goto L24;
        boolean r7 = r13.f159391f;
    L26:
        if ((r26 & 64) == 0) goto L28;
        String r8 = r13.f159392g;
    L30:
        if ((r26 & 128) == 0) goto L32;
        int r9 = r13.f159393h;
    L34:
        if ((r26 & 256) == 0) goto L36;
        boolean r10 = r13.f159394i;
    L38:
        if ((r26 & 512) == 0) goto L40;
        FollowerTypeUIState r11 = r13.f159395j;
    L42:
        if ((r26 & 1024) == 0) goto L45;
        boolean r12 = r13.f159396k;
    L47:
        return r13.a(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L45:
        r12 = r25;
        goto L47
    L40:
        r11 = r24;
        goto L42
    L36:
        r10 = r23;
        goto L38
    L32:
        r9 = r22;
        goto L34
    L28:
        r8 = r21;
        goto L30
    L24:
        r7 = r20;
        goto L26
    L20:
        r6 = r19;
        goto L22
    L16:
        r5 = r18;
        goto L18
    L12:
        r4 = r17;
        goto L14
    L8:
        r3 = r16;
        goto L10
    }

    public final FollowerUIState a(long r15, String r17, String r18, String r19, Boolean r20, boolean r21, String r22, int r23, boolean r24, FollowerTypeUIState r25, boolean r26) {
        p.l(r17, "username");
        p.l(r18, "fullname");
        p.l(r19, "avatar");
        p.l(r22, "about");
        p.l(r25, "uiType");
        return new FollowerUIState(r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public final boolean c() {
        return this.f159391f;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.f159390e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof FollowerUIState) == true) goto L8;
        return false;
    L8:
        FollowerUIState r82 = (FollowerUIState) r8;
        if (this.f159387a == r82.f159387a) goto L12;
        return false;
    L12:
        if (p.g(this.f159388b, r82.f159388b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159389c, r82.f159389c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f159390e, r82.f159390e) == true) goto L24;
        return false;
    L24:
        if (this.f159391f == r82.f159391f) goto L27;
        return false;
    L27:
        if (p.g(this.f159392g, r82.f159392g) == true) goto L30;
        return false;
    L30:
        if (this.f159393h == r82.f159393h) goto L33;
        return false;
    L33:
        if (this.f159394i == r82.f159394i) goto L36;
        return false;
    L36:
        if (this.f159395j == r82.f159395j) goto L39;
        return false;
    L39:
        if (this.f159396k == r82.f159396k) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f159389c;
    }

    public final long g() {
        return this.f159387a;
    }

    public final String getUsername() {
        return this.f159388b;
    }

    public final int h() {
        return this.f159393h;
    }

    public int hashCode() {
        int r02 = ((((((Long.hashCode(this.f159387a) * 31) + this.f159388b.hashCode()) * 31) + this.f159389c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Boolean r1 = this.f159390e;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((((((r02 + r12) * 31) + Boolean.hashCode(this.f159391f)) * 31) + this.f159392g.hashCode()) * 31) + Integer.hashCode(this.f159393h)) * 31) + Boolean.hashCode(this.f159394i)) * 31) + this.f159395j.hashCode()) * 31) + Boolean.hashCode(this.f159396k);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final FollowerTypeUIState i() {
        return this.f159395j;
    }

    public final boolean j() {
        return this.f159396k;
    }

    public final boolean k() {
        return this.f159394i;
    }

    public final void l(Boolean r1) {
        this.f159390e = r1;
    }

    public String toString() {
        return "FollowerUIState(id=" + this.f159387a + ", username=" + this.f159388b + ", fullname=" + this.f159389c + ", avatar=" + this.d + ", followed=" + this.f159390e + ", alert=" + this.f159391f + ", about=" + this.f159392g + ", official=" + this.f159393h + ", isVerified=" + this.f159394i + ", uiType=" + this.f159395j + ", isMe=" + this.f159396k + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeLong(this.f159387a);
        r3.writeString(this.f159388b);
        r3.writeString(this.f159389c);
        r3.writeString(this.d);
        Boolean r42 = this.f159390e;
        if (r42 != null) goto L6;
        int r43 = 0;
    L5:
        r3.writeInt(r43);
        r3.writeInt(this.f159391f ? 1 : 0);
        r3.writeString(this.f159392g);
        r3.writeInt(this.f159393h);
        r3.writeInt(this.f159394i ? 1 : 0);
        r3.writeString(this.f159395j.name());
        r3.writeInt(this.f159396k ? 1 : 0);
        return;
    L6:
        r3.writeInt(1);
        r43 = r42.booleanValue();
        goto L5
    }
}
