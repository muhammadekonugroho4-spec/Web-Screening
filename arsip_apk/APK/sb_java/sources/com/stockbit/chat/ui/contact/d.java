package com.stockbit.chat.ui.contact;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f55964a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55965b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f55966c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(d.class.getClassLoader());
            if (r6.containsKey("groupId") == false) goto L5;
            int r02 = r6.getInt("groupId");
        L6:
            boolean r3 = false;
            if (r6.containsKey("maximumSelection") == false) goto L9;
            int r1 = r6.getInt("maximumSelection");
        L11:
            if (r6.containsKey("isSelectionMode") == false) goto L14;
            r3 = r6.getBoolean("isSelectionMode");
        L14:
            return new d(r02, r1, r3);
        L9:
            r1 = 0;
            goto L11
        L5:
            r02 = -1;
            goto L6
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public d(int r1, int r2, boolean r3) {
        this.f55964a = r1;
        this.f55965b = r2;
        this.f55966c = r3;
    }

    public static final d fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final int a() {
        return this.f55964a;
    }

    public final int b() {
        return this.f55965b;
    }

    public final boolean c() {
        return this.f55966c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f55964a == r52.f55964a) goto L12;
        return false;
    L12:
        if (this.f55965b == r52.f55965b) goto L15;
        return false;
    L15:
        if (this.f55966c == r52.f55966c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f55964a) * 31) + Integer.hashCode(this.f55965b)) * 31) + Boolean.hashCode(this.f55966c);
    }

    public String toString() {
        return "ChatContactFragmentArgs(groupId=" + this.f55964a + ", maximumSelection=" + this.f55965b + ", isSelectionMode=" + this.f55966c + ')';
    }
}
