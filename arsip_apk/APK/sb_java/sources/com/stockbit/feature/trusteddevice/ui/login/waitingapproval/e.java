package com.stockbit.feature.trusteddevice.ui.login.waitingapproval;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class e implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f118562a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118563b;

    /* renamed from: c, reason: collision with root package name */
    public final String f118564c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final e a(Bundle r5) {
            p.l(r5, "bundle");
            r5.setClassLoader(e.class.getClassLoader());
            if (r5.containsKey("token") == false) goto L27;
            String r02 = r5.getString("token");
            if (r02 == null) goto L25;
            if (r5.containsKey("deviceName") == false) goto L23;
            String r1 = r5.getString("deviceName");
            if (r1 == null) goto L21;
            if (r5.containsKey("channel") == false) goto L19;
            String r52 = r5.getString("channel");
            if (r52 == null) goto L17;
            return new e(r02, r1, r52);
        L17:
            throw new IllegalArgumentException("Argument \"channel\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"channel\" is missing and does not have an android:defaultValue");
        L21:
            throw new IllegalArgumentException("Argument \"deviceName\" is marked as non-null but was passed a null value.");
        L23:
            throw new IllegalArgumentException("Required argument \"deviceName\" is missing and does not have an android:defaultValue");
        L25:
            throw new IllegalArgumentException("Argument \"token\" is marked as non-null but was passed a null value.");
        L27:
            throw new IllegalArgumentException("Required argument \"token\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public e(String r2, String r3, String r4) {
        p.l(r2, "token");
        p.l(r3, "deviceName");
        p.l(r4, "channel");
        this.f118562a = r2;
        this.f118563b = r3;
        this.f118564c = r4;
    }

    public static final e fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f118563b;
    }

    public final String b() {
        return this.f118562a;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("token", this.f118562a);
        r02.putString("deviceName", this.f118563b);
        r02.putString("channel", this.f118564c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f118562a, r52.f118562a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f118563b, r52.f118563b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f118564c, r52.f118564c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f118562a.hashCode() * 31) + this.f118563b.hashCode()) * 31) + this.f118564c.hashCode();
    }

    public String toString() {
        return "LoginWaitingApprovalFragmentArgs(token=" + this.f118562a + ", deviceName=" + this.f118563b + ", channel=" + this.f118564c + ')';
    }
}
