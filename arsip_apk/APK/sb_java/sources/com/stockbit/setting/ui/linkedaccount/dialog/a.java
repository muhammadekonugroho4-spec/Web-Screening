package com.stockbit.setting.ui.linkedaccount.dialog;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final C1226a f136062c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f136063a;

    /* renamed from: b, reason: collision with root package name */
    public final String f136064b;

    /* renamed from: com.stockbit.setting.ui.linkedaccount.dialog.a$a, reason: collision with other inner class name */
    public static final class C1226a {
        public /* synthetic */ C1226a(i r1) {
            this();
        }

        public final a a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(a.class.getClassLoader());
            if (r4.containsKey(Constants.KEY_TITLE) == false) goto L11;
            String r02 = r4.getString(Constants.KEY_TITLE);
            if (r4.containsKey("message") == false) goto L9;
            return new a(r02, r4.getString("message"));
        L9:
            throw new IllegalArgumentException("Required argument \"message\" is missing and does not have an android:defaultValue");
        L11:
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }

        public C1226a() {
        }
    }

    static {
        f136062c = new C1226a(null);
    }

    public a(String r1, String r2) {
        this.f136063a = r1;
        this.f136064b = r2;
    }

    public static final a fromBundle(Bundle r1) {
        return f136062c.a(r1);
    }

    public final String a() {
        return this.f136064b;
    }

    public final String b() {
        return this.f136063a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f136063a, r52.f136063a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f136064b, r52.f136064b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f136063a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f136064b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "SettingLinkedAccountUnlinkSuccessDialogFragmentArgs(title=" + this.f136063a + ", message=" + this.f136064b + ')';
    }
}
