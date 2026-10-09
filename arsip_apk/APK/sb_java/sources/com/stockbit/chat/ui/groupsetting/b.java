package com.stockbit.chat.ui.groupsetting;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56352b = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f56353a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(b.class.getClassLoader());
            if (r3.containsKey("groupId") == false) goto L7;
            return new b(r3.getInt("groupId"));
        L7:
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f56352b = new a(null);
    }

    public b(int r1) {
        this.f56353a = r1;
    }

    public static final b fromBundle(Bundle r1) {
        return f56352b.a(r1);
    }

    public final int a() {
        return this.f56353a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (this.f56353a == ((b) r4).f56353a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.f56353a);
    }

    public String toString() {
        return "GroupSettingFragmentArgs(groupId=" + this.f56353a + ')';
    }
}
