package com.stockbit.stream.ui.mute;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class i implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f144320a;

    /* renamed from: b, reason: collision with root package name */
    public final int f144321b;

    /* renamed from: c, reason: collision with root package name */
    public final int f144322c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(i.class.getClassLoader());
            int r2 = -1;
            if (r5.containsKey("parentPostId") == false) goto L5;
            int r02 = r5.getInt("parentPostId");
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
        this.f144320a = r1;
        this.f144321b = r2;
        this.f144322c = r3;
    }

    public static final i fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final int a() {
        return this.f144320a;
    }

    public final int b() {
        return this.f144321b;
    }

    public final int c() {
        return this.f144322c;
    }

    public final Bundle d() {
        Bundle r02 = new Bundle();
        r02.putInt("parentPostId", this.f144320a);
        r02.putInt("postId", this.f144321b);
        r02.putInt("userId", this.f144322c);
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
        if (this.f144320a == r52.f144320a) goto L12;
        return false;
    L12:
        if (this.f144321b == r52.f144321b) goto L15;
        return false;
    L15:
        if (this.f144322c == r52.f144322c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f144320a) * 31) + Integer.hashCode(this.f144321b)) * 31) + Integer.hashCode(this.f144322c);
    }

    public String toString() {
        return "StreamMuteFragmentArgs(parentPostId=" + this.f144320a + ", postId=" + this.f144321b + ", userId=" + this.f144322c + ')';
    }
}
