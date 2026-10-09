package com.clevertap.android.sdk.login;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f34575a;

    public e(String[] r2) {
        this.f34575a = new HashSet();
        e(r2);
    }

    public static e b(String r2) {
        return new e(r2.split(Constants.SEPARATOR_COMMA));
    }

    public static e c(String[] r1) {
        return new e(r1);
    }

    public static e d() {
        return new e(Constants.LEGACY_IDENTITY_KEYS);
    }

    public boolean a(String r2) {
        return Utils.c(this.f34575a, r2);
    }

    public final void e(String[] r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (r5.length <= 0) goto L15;
        int r02 = r5.length;
        int r1 = 0;
    L6:
        if (r1 >= r02) goto L16;
        String r2 = r5[r1];
        if (Utils.c(Constants.ALL_IDENTITY_KEYS, r2) == false) goto L10;
        this.f34575a.add(Utils.g(r2));
    L10:
        r1 = r1 + 1;
        goto L6
    L16:
        return;
    }

    public boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (getClass() == r3.getClass()) goto L10;
        return false;
    L10:
        return this.f34575a.equals(((e) r3).f34575a);
    }

    public boolean f() {
        return !this.f34575a.isEmpty();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        Iterator r1 = this.f34575a.iterator();
    L4:
        if (r1.hasNext() == false) goto L13;
        String r2 = (String) r1.next();
        if (Constants.ALL_IDENTITY_KEYS.contains(r2) == false) goto L4;
        r02.append(r2);
        if (r1.hasNext() == false) goto L10;
        String r22 = Constants.SEPARATOR_COMMA;
    L11:
        r02.append(r22);
        goto L4
    L10:
        r22 = "";
        goto L11
    L13:
        return r02.toString();
    }

    public e(HashSet r2) {
        HashSet r02 = new HashSet();
        this.f34575a = r02;
        r02.addAll(r2);
    }
}
