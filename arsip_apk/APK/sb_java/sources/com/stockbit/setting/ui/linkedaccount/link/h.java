package com.stockbit.setting.ui.linkedaccount.link;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class h implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f136097b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f136098a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final h a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(h.class.getClassLoader());
            if (r3.containsKey("EXTRALINKEDACCOUNTTYPE") == false) goto L11;
            String r32 = r3.getString("EXTRALINKEDACCOUNTTYPE");
            if (r32 == null) goto L9;
            return new h(r32);
        L9:
            throw new IllegalArgumentException("Argument \"EXTRALINKEDACCOUNTTYPE\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"EXTRALINKEDACCOUNTTYPE\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f136097b = new a(null);
    }

    public h(String r2) {
        p.l(r2, "EXTRALINKEDACCOUNTTYPE");
        this.f136098a = r2;
    }

    public static final h fromBundle(Bundle r1) {
        return f136097b.a(r1);
    }

    public final String a() {
        return this.f136098a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f136098a, ((h) r4).f136098a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f136098a.hashCode();
    }

    public String toString() {
        return "SettingLinkedAccountLinkFragmentArgs(EXTRALINKEDACCOUNTTYPE=" + this.f136098a + ')';
    }
}
