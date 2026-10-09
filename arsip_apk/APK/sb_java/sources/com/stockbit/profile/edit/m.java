package com.stockbit.profile.edit;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class m implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f127433c = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f127434a;

    /* renamed from: b, reason: collision with root package name */
    public final String f127435b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(m.class.getClassLoader());
            if (r4.containsKey("isShowImageDialog") == false) goto L5;
            boolean r02 = r4.getBoolean("isShowImageDialog");
        L7:
            if (r4.containsKey("requestKey") == false) goto L9;
            String r42 = r4.getString("requestKey");
        L11:
            return new m(r02, r42);
        L9:
            r42 = null;
            goto L11
        L5:
            r02 = false;
            goto L7
        }

        public a() {
        }
    }

    static {
        f127433c = new a(null);
    }

    public m(boolean r1, String r2) {
        this.f127434a = r1;
        this.f127435b = r2;
    }

    public static final m fromBundle(Bundle r1) {
        return f127433c.a(r1);
    }

    public final String a() {
        return this.f127435b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (this.f127434a == r52.f127434a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f127435b, r52.f127435b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f127434a) * 31;
        String r1 = this.f127435b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "EditProfileFragmentArgs(isShowImageDialog=" + this.f127434a + ", requestKey=" + this.f127435b + ')';
    }
}
