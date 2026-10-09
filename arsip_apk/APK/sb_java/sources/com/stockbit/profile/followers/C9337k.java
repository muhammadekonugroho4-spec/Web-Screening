package com.stockbit.profile.followers;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.usecase.profile.model.FollowerTabType;
import java.io.Serializable;

/* renamed from: com.stockbit.profile.followers.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9337k implements InterfaceC4094y {

    /* renamed from: i, reason: collision with root package name */
    public static final a f127581i = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f127582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f127583b;

    /* renamed from: c, reason: collision with root package name */
    public final FollowerTabType f127584c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f127585e;

    /* renamed from: f, reason: collision with root package name */
    public final int f127586f;

    /* renamed from: g, reason: collision with root package name */
    public final int f127587g;

    /* renamed from: h, reason: collision with root package name */
    public final int f127588h;

    /* renamed from: com.stockbit.profile.followers.k$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C9337k a(Bundle r12) {
            kotlin.jvm.internal.p.l(r12, "bundle");
            r12.setClassLoader(C9337k.class.getClassLoader());
            if (r12.containsKey("userId") == false) goto L53;
            String r3 = r12.getString("userId");
            if (r3 == null) goto L51;
            if (r12.containsKey("username") == false) goto L49;
            String r4 = r12.getString("username");
            if (r4 == null) goto L47;
            int r2 = 0;
            if (r12.containsKey("isMe") == false) goto L13;
            boolean r6 = r12.getBoolean("isMe");
        L15:
            if (r12.containsKey("isOfficial") == false) goto L17;
            boolean r7 = r12.getBoolean("isOfficial");
        L19:
            if (r12.containsKey("followingCount") == false) goto L21;
            int r8 = r12.getInt("followingCount");
        L23:
            if (r12.containsKey("followerCount") == false) goto L25;
            int r9 = r12.getInt("followerCount");
        L27:
            if (r12.containsKey("mutualCount") == false) goto L29;
            r2 = r12.getInt("mutualCount");
        L29:
            int r10 = r2;
            if (r12.containsKey("activeTab") == false) goto L45;
            if (Parcelable.class.isAssignableFrom(FollowerTabType.class) == false) goto L34;
        L38:
            FollowerTabType r5 = (FollowerTabType) r12.get("activeTab");
            if (r5 == null) goto L43;
            return new C9337k(r3, r4, r5, r6, r7, r8, r9, r10);
        L43:
            throw new IllegalArgumentException("Argument \"activeTab\" is marked as non-null but was passed a null value.");
        L34:
            if (Serializable.class.isAssignableFrom(FollowerTabType.class) == true) goto L38;
            throw new UnsupportedOperationException(FollowerTabType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L45:
            throw new IllegalArgumentException("Required argument \"activeTab\" is missing and does not have an android:defaultValue");
        L25:
            r9 = 0;
            goto L27
        L21:
            r8 = 0;
            goto L23
        L17:
            r7 = false;
            goto L19
        L13:
            r6 = false;
            goto L15
        L47:
            throw new IllegalArgumentException("Argument \"username\" is marked as non-null but was passed a null value.");
        L49:
            throw new IllegalArgumentException("Required argument \"username\" is missing and does not have an android:defaultValue");
        L51:
            throw new IllegalArgumentException("Argument \"userId\" is marked as non-null but was passed a null value.");
        L53:
            throw new IllegalArgumentException("Required argument \"userId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f127581i = new a(null);
    }

    public C9337k(String r2, String r3, FollowerTabType r4, boolean r5, boolean r6, int r7, int r8, int r9) {
        kotlin.jvm.internal.p.l(r2, "userId");
        kotlin.jvm.internal.p.l(r3, "username");
        kotlin.jvm.internal.p.l(r4, "activeTab");
        this.f127582a = r2;
        this.f127583b = r3;
        this.f127584c = r4;
        this.d = r5;
        this.f127585e = r6;
        this.f127586f = r7;
        this.f127587g = r8;
        this.f127588h = r9;
    }

    public static final C9337k fromBundle(Bundle r1) {
        return f127581i.a(r1);
    }

    public final FollowerTabType a() {
        return this.f127584c;
    }

    public final int b() {
        return this.f127587g;
    }

    public final int c() {
        return this.f127586f;
    }

    public final int d() {
        return this.f127588h;
    }

    public final String e() {
        return this.f127582a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C9337k) == true) goto L8;
        return false;
    L8:
        C9337k r52 = (C9337k) r5;
        if (kotlin.jvm.internal.p.g(this.f127582a, r52.f127582a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f127583b, r52.f127583b) == true) goto L15;
        return false;
    L15:
        if (this.f127584c == r52.f127584c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f127585e == r52.f127585e) goto L24;
        return false;
    L24:
        if (this.f127586f == r52.f127586f) goto L27;
        return false;
    L27:
        if (this.f127587g == r52.f127587g) goto L30;
        return false;
    L30:
        if (this.f127588h == r52.f127588h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f127583b;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.f127585e;
    }

    public int hashCode() {
        return (((((((((((((this.f127582a.hashCode() * 31) + this.f127583b.hashCode()) * 31) + this.f127584c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f127585e)) * 31) + Integer.hashCode(this.f127586f)) * 31) + Integer.hashCode(this.f127587g)) * 31) + Integer.hashCode(this.f127588h);
    }

    public final Bundle i() {
        Bundle r02 = new Bundle();
        r02.putString("userId", this.f127582a);
        r02.putString("username", this.f127583b);
        r02.putBoolean("isMe", this.d);
        r02.putBoolean("isOfficial", this.f127585e);
        r02.putInt("followingCount", this.f127586f);
        r02.putInt("followerCount", this.f127587g);
        r02.putInt("mutualCount", this.f127588h);
        if (Parcelable.class.isAssignableFrom(FollowerTabType.class) == false) goto L7;
        FollowerTabType r1 = this.f127584c;
        kotlin.jvm.internal.p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("activeTab", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(FollowerTabType.class) == false) goto L11;
        FollowerTabType r12 = this.f127584c;
        kotlin.jvm.internal.p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("activeTab", r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(FollowerTabType.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public String toString() {
        return "UserFollowersFragmentArgs(userId=" + this.f127582a + ", username=" + this.f127583b + ", activeTab=" + this.f127584c + ", isMe=" + this.d + ", isOfficial=" + this.f127585e + ", followingCount=" + this.f127586f + ", followerCount=" + this.f127587g + ", mutualCount=" + this.f127588h + ')';
    }
}
