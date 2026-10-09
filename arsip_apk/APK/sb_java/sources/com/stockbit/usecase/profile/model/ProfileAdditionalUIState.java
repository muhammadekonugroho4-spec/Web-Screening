package com.stockbit.usecase.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u0003J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010$\u001a\u00020\bHÖ\u0081\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006*"}, d2 = {"Lcom/stockbit/usecase/profile/model/ProfileAdditionalUIState;", "Landroid/os/Parcelable;", "reputations", "", "followers", "ideas", "following", "followersString", "", "ideasString", "followingString", "<init>", "(IIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReputations", "()I", "getFollowers", "getIdeas", "getFollowing", "getFollowersString", "()Ljava/lang/String;", "getIdeasString", "getFollowingString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "usecase-profile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileAdditionalUIState implements Parcelable {
    public static final Parcelable.Creator<ProfileAdditionalUIState> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f159401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f159402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159403c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159404e;

    /* renamed from: f, reason: collision with root package name */
    public final String f159405f;

    /* renamed from: g, reason: collision with root package name */
    public final String f159406g;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ProfileAdditionalUIState a(Parcel r10) {
            p.l(r10, "parcel");
            return new ProfileAdditionalUIState(r10.readInt(), r10.readInt(), r10.readInt(), r10.readInt(), r10.readString(), r10.readString(), r10.readString());
        }

        public final ProfileAdditionalUIState[] b(int r1) {
            return new ProfileAdditionalUIState[r1];
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

    public ProfileAdditionalUIState(int r2, int r3, int r4, int r5, String r6, String r7, String r8) {
        p.l(r6, "followersString");
        p.l(r7, "ideasString");
        p.l(r8, "followingString");
        this.f159401a = r2;
        this.f159402b = r3;
        this.f159403c = r4;
        this.d = r5;
        this.f159404e = r6;
        this.f159405f = r7;
        this.f159406g = r8;
    }

    public static /* synthetic */ ProfileAdditionalUIState b(ProfileAdditionalUIState r02, int r1, int r2, int r3, int r4, String r5, String r6, String r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f159401a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f159402b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f159403c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f159404e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f159405f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f159406g;
    L23:
        String r82 = r6;
        String r92 = r7;
        int r62 = r4;
        String r72 = r5;
        int r52 = r3;
        int r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92);
    }

    public final ProfileAdditionalUIState a(int r10, int r11, int r12, int r13, String r14, String r15, String r16) {
        p.l(r14, "followersString");
        p.l(r15, "ideasString");
        p.l(r16, "followingString");
        return new ProfileAdditionalUIState(r10, r11, r12, r13, r14, r15, r16);
    }

    public final int c() {
        return this.f159402b;
    }

    public final String d() {
        return this.f159404e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ProfileAdditionalUIState) == true) goto L8;
        return false;
    L8:
        ProfileAdditionalUIState r52 = (ProfileAdditionalUIState) r5;
        if (this.f159401a == r52.f159401a) goto L12;
        return false;
    L12:
        if (this.f159402b == r52.f159402b) goto L15;
        return false;
    L15:
        if (this.f159403c == r52.f159403c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f159404e, r52.f159404e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f159405f, r52.f159405f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f159406g, r52.f159406g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f159406g;
    }

    public final String g() {
        return this.f159405f;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f159401a) * 31) + Integer.hashCode(this.f159402b)) * 31) + Integer.hashCode(this.f159403c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f159404e.hashCode()) * 31) + this.f159405f.hashCode()) * 31) + this.f159406g.hashCode();
    }

    public String toString() {
        return "ProfileAdditionalUIState(reputations=" + this.f159401a + ", followers=" + this.f159402b + ", ideas=" + this.f159403c + ", following=" + this.d + ", followersString=" + this.f159404e + ", ideasString=" + this.f159405f + ", followingString=" + this.f159406g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f159401a);
        r1.writeInt(this.f159402b);
        r1.writeInt(this.f159403c);
        r1.writeInt(this.d);
        r1.writeString(this.f159404e);
        r1.writeString(this.f159405f);
        r1.writeString(this.f159406g);
    }

    public /* synthetic */ ProfileAdditionalUIState(int r2, int r3, int r4, int r5, String r6, String r7, String r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = "0";
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = "0";
    L21:
        if ((r9 & 64) == 0) goto L24;
        String r92 = "0";
    L23:
        String r82 = r7;
        String r72 = r6;
        int r62 = r5;
        int r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
