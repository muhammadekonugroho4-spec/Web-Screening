package com.stockbit.setting.ui.linkedaccount.unlink;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f136161b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f136162a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final f a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(f.class.getClassLoader());
            if (r3.containsKey("EXTRA_LINKED_ACCOUNT_TYPE") == false) goto L7;
            return new f(r3.getString("EXTRA_LINKED_ACCOUNT_TYPE"));
        L7:
            throw new IllegalArgumentException("Required argument \"EXTRA_LINKED_ACCOUNT_TYPE\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f136161b = new a(null);
    }

    public f(String r1) {
        this.f136162a = r1;
    }

    public static final f fromBundle(Bundle r1) {
        return f136161b.a(r1);
    }

    public final String a() {
        return this.f136162a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f136162a, ((f) r4).f136162a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f136162a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "SettingLinkedAccountUnlinkFragmentArgs(EXTRALINKEDACCOUNTTYPE=" + this.f136162a + ')';
    }
}
