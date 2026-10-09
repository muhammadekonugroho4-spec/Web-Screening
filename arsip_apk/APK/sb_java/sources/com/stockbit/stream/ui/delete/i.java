package com.stockbit.stream.ui.delete;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class i implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f142741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f142742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f142743c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(i.class.getClassLoader());
            int r2 = -1;
            if (r5.containsKey("itemPosition") == false) goto L5;
            int r02 = r5.getInt("itemPosition");
        L7:
            if (r5.containsKey("postId") == false) goto L10;
            r2 = r5.getInt("postId");
        L10:
            if (r5.containsKey("userId") == false) goto L12;
            int r52 = r5.getInt("userId");
        L14:
            return new i(r02, r2, r52);
        L12:
            r52 = 0;
            goto L14
        L5:
            r02 = -1;
            goto L7
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public i(int r1, int r2, int r3) {
        this.f142741a = r1;
        this.f142742b = r2;
        this.f142743c = r3;
    }

    public static final i fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final int a() {
        return this.f142741a;
    }

    public final int b() {
        return this.f142742b;
    }

    public final int c() {
        return this.f142743c;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putInt("itemPosition", this.f142741a);
        r02.putInt("postId", this.f142742b);
        r02.putInt("userId", this.f142743c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f142741a == r52.f142741a) goto L12;
        return false;
    L12:
        if (this.f142742b == r52.f142742b) goto L15;
        return false;
    L15:
        if (this.f142743c == r52.f142743c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f142741a) * 31) + Integer.hashCode(this.f142742b)) * 31) + Integer.hashCode(this.f142743c);
    }

    public String toString() {
        return "StreamDeleteFragmentArgs(itemPosition=" + this.f142741a + ", postId=" + this.f142742b + ", userId=" + this.f142743c + ')';
    }
}
