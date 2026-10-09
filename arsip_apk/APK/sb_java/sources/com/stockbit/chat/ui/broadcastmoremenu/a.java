package com.stockbit.chat.ui.broadcastmoremenu;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final C0569a f55805c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f55806a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f55807b;

    /* renamed from: com.stockbit.chat.ui.broadcastmoremenu.a$a, reason: collision with other inner class name */
    public static final class C0569a {
        public /* synthetic */ C0569a(i r1) {
            this();
        }

        public final a a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(a.class.getClassLoader());
            if (r4.containsKey("roomId") == false) goto L11;
            String r02 = r4.getString("roomId");
            if (r4.containsKey("isMuted") == false) goto L7;
            boolean r42 = r4.getBoolean("isMuted");
        L9:
            return new a(r02, r42);
        L7:
            r42 = false;
            goto L9
        L11:
            throw new IllegalArgumentException("Required argument \"roomId\" is missing and does not have an android:defaultValue");
        }

        public C0569a() {
        }
    }

    static {
        f55805c = new C0569a(null);
    }

    public a(String r1, boolean r2) {
        this.f55806a = r1;
        this.f55807b = r2;
    }

    public static final a fromBundle(Bundle r1) {
        return f55805c.a(r1);
    }

    public final String a() {
        return this.f55806a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f55806a, r52.f55806a) == true) goto L12;
        return false;
    L12:
        if (this.f55807b == r52.f55807b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f55806a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + Boolean.hashCode(this.f55807b);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "BroadcastMoreMenuDialogArgs(roomId=" + this.f55806a + ", isMuted=" + this.f55807b + ')';
    }
}
