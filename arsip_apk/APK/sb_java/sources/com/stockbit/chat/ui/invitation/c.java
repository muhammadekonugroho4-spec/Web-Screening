package com.stockbit.chat.ui.invitation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56435b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f56436a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final c a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(c.class.getClassLoader());
            if (r3.containsKey("invitationCode") == false) goto L11;
            String r32 = r3.getString("invitationCode");
            if (r32 == null) goto L9;
            return new c(r32);
        L9:
            throw new IllegalArgumentException("Argument \"invitationCode\" is marked as non-null but was passed a null value.");
        L11:
            throw new IllegalArgumentException("Required argument \"invitationCode\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f56435b = new a(null);
    }

    public c(String r2) {
        p.l(r2, "invitationCode");
        this.f56436a = r2;
    }

    public static final c fromBundle(Bundle r1) {
        return f56435b.a(r1);
    }

    public final String a() {
        return this.f56436a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("invitationCode", this.f56436a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f56436a, ((c) r4).f56436a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f56436a.hashCode();
    }

    public String toString() {
        return "InvitationDialogArgs(invitationCode=" + this.f56436a + ')';
    }
}
