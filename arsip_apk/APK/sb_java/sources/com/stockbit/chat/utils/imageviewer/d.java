package com.stockbit.chat.utils.imageviewer;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f59346b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f59347a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final d a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(d.class.getClassLoader());
            if (r3.containsKey("url") == false) goto L9;
            String r32 = r3.getString("url");
            if (r32 != null) goto L11;
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value.");
        L11:
            return new d(r32);
        L9:
            r32 = "";
            goto L11
        }

        public a() {
        }
    }

    static {
        f59346b = new a(null);
    }

    public d(String r2) {
        p.l(r2, "url");
        this.f59347a = r2;
    }

    public static final d fromBundle(Bundle r1) {
        return f59346b.a(r1);
    }

    public final String a() {
        return this.f59347a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f59347a, ((d) r4).f59347a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f59347a.hashCode();
    }

    public String toString() {
        return "ImageViewerDialogArgs(url=" + this.f59347a + ')';
    }
}
