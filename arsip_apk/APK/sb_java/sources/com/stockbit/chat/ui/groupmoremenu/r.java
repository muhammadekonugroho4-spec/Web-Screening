package com.stockbit.chat.ui.groupmoremenu;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes7.dex */
public final class r implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f56277c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f56278a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56279b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final r a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(r.class.getClassLoader());
            if (r4.containsKey("roomId") == false) goto L5;
            String r02 = r4.getString("roomId");
        L7:
            if (r4.containsKey("isActive") == false) goto L9;
            boolean r42 = r4.getBoolean("isActive");
        L11:
            return new r(r02, r42);
        L9:
            r42 = false;
            goto L11
        L5:
            r02 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f56277c = new a(null);
    }

    public r(String r1, boolean r2) {
        this.f56278a = r1;
        this.f56279b = r2;
    }

    public static final r fromBundle(Bundle r1) {
        return f56277c.a(r1);
    }

    public final String a() {
        return this.f56278a;
    }

    public final boolean b() {
        return this.f56279b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f56278a, r52.f56278a) == true) goto L12;
        return false;
    L12:
        if (this.f56279b == r52.f56279b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f56278a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f56279b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "MenuMoreGroupShareTradeInfoDialogArgs(roomId=" + this.f56278a + ", isActive=" + this.f56279b + ')';
    }
}
