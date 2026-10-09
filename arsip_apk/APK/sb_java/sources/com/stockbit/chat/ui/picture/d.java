package com.stockbit.chat.ui.picture;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class d implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56925b = null;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56926a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final d a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(d.class.getClassLoader());
            if (r3.containsKey("hasImage") == false) goto L7;
            return new d(r3.getBoolean("hasImage"));
        L7:
            throw new IllegalArgumentException("Required argument \"hasImage\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f56925b = new a(null);
    }

    public d(boolean r1) {
        this.f56926a = r1;
    }

    public static final d fromBundle(Bundle r1) {
        return f56925b.a(r1);
    }

    public final boolean a() {
        return this.f56926a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (this.f56926a == ((d) r4).f56926a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f56926a);
    }

    public String toString() {
        return "ChatPictureChooserDialogArgs(hasImage=" + this.f56926a + ')';
    }
}
