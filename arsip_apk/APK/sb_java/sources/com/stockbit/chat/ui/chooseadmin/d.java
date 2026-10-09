package com.stockbit.chat.ui.chooseadmin;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final long f55860a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55861b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55862c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(d.class.getClassLoader());
            if (r6.containsKey("roomId") == false) goto L19;
            long r02 = r6.getLong("roomId");
            if (r6.containsKey("groupId") == false) goto L17;
            int r2 = r6.getInt("groupId");
            if (r6.containsKey("groupName") == false) goto L15;
            String r62 = r6.getString("groupName");
            if (r62 == null) goto L13;
            return new d(r02, r2, r62);
        L13:
            throw new IllegalArgumentException("Argument \"groupName\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"groupName\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        L19:
            throw new IllegalArgumentException("Required argument \"roomId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public d(long r2, int r4, String r5) {
        p.l(r5, "groupName");
        this.f55860a = r2;
        this.f55861b = r4;
        this.f55862c = r5;
    }

    public static final d fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final int a() {
        return this.f55861b;
    }

    public final String b() {
        return this.f55862c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (this.f55860a == r82.f55860a) goto L12;
        return false;
    L12:
        if (this.f55861b == r82.f55861b) goto L15;
        return false;
    L15:
        if (p.g(this.f55862c, r82.f55862c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f55860a) * 31) + Integer.hashCode(this.f55861b)) * 31) + this.f55862c.hashCode();
    }

    public String toString() {
        return "ChooseAdminFragmentArgs(roomId=" + this.f55860a + ", groupId=" + this.f55861b + ", groupName=" + this.f55862c + ')';
    }
}
