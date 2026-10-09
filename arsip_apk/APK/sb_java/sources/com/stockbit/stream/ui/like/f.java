package com.stockbit.stream.ui.like;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: e, reason: collision with root package name */
    public static final a f143494e = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f143495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f143496b;

    /* renamed from: c, reason: collision with root package name */
    public final String f143497c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(f.class.getClassLoader());
            if (r6.containsKey("streamPostId") == false) goto L31;
            String r02 = r6.getString("streamPostId");
            if (r02 == null) goto L29;
            if (r6.containsKey("userId") == false) goto L27;
            String r1 = r6.getString("userId");
            if (r1 == null) goto L25;
            if (r6.containsKey("watchlistId") == false) goto L23;
            String r2 = r6.getString("watchlistId");
            if (r2 == null) goto L21;
            if (r6.containsKey("streamLikeContent") == false) goto L17;
            String r62 = r6.getString("streamLikeContent");
        L19:
            return new f(r02, r1, r2, r62);
        L17:
            r62 = null;
            goto L19
        L21:
            throw new IllegalArgumentException("Argument \"watchlistId\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"watchlistId\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"userId\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"userId\" is missing and does not have an android:defaultValue");
        L29:
            throw new IllegalArgumentException("Argument \"streamPostId\" is marked as non-null but was passed a null value.");
        L31:
            throw new IllegalArgumentException("Required argument \"streamPostId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f143494e = new a(null);
    }

    public f(String r2, String r3, String r4, String r5) {
        p.l(r2, "streamPostId");
        p.l(r3, "userId");
        p.l(r4, "watchlistId");
        this.f143495a = r2;
        this.f143496b = r3;
        this.f143497c = r4;
        this.d = r5;
    }

    public static final f fromBundle(Bundle r1) {
        return f143494e.a(r1);
    }

    public final String a() {
        return this.f143495a;
    }

    public final String b() {
        return this.f143496b;
    }

    public final String c() {
        return this.f143497c;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putString("streamPostId", this.f143495a);
        r02.putString("userId", this.f143496b);
        r02.putString("watchlistId", this.f143497c);
        r02.putString("streamLikeContent", this.d);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f143495a, r52.f143495a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f143496b, r52.f143496b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f143497c, r52.f143497c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((this.f143495a.hashCode() * 31) + this.f143496b.hashCode()) * 31) + this.f143497c.hashCode()) * 31;
        String r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LikeFragmentArgs(streamPostId=" + this.f143495a + ", userId=" + this.f143496b + ", watchlistId=" + this.f143497c + ", streamLikeContent=" + this.d + ')';
    }
}
