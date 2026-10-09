package com.airbnb.lottie.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f31357c = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f31358a;

    /* renamed from: b, reason: collision with root package name */
    public e f31359b;

    static {
        f31357c = new d(new String[]{"COMPOSITION"});
    }

    public d(String... r1) {
        this.f31358a = Arrays.asList(r1);
    }

    public d a(String r3) {
        d r02 = new d(this);
        r02.f31358a.add(r3);
        return r02;
    }

    public final boolean b() {
        return ((String) this.f31358a.get(r0.size() - 1)).equals("**");
    }

    public boolean c(String r6, int r7) {
        if (r7 < this.f31358a.size()) goto L6;
        return false;
    L6:
        if (r7 != (this.f31358a.size() - 1)) goto L8;
        boolean r02 = true;
    L9:
        String r3 = (String) this.f31358a.get(r7);
        if (r3.equals("**") == false) goto L12;
        if (r02 == false) goto L28;
    L38:
        if (r02 == false) goto L40;
        return true;
    L40:
        int r72 = r7 + 1;
        if (r72 >= (this.f31358a.size() - 1)) goto L44;
        return false;
    L44:
        return ((String) this.f31358a.get(r72)).equals(r6);
    L28:
        if (((String) this.f31358a.get(r7 + 1)).equals(r6) == false) goto L38;
        if (r7 != (this.f31358a.size() - 2)) goto L32;
    L37:
        return true;
    L32:
        if (r7 == (this.f31358a.size() - 3)) goto L34;
    L36:
        return false;
    L34:
        if (b() == false) goto L36;
    L12:
        if (r3.equals(r6) == false) goto L14;
    L17:
        boolean r62 = true;
    L18:
        if (r02 == false) goto L20;
    L23:
        if (r62 == false) goto L25;
        return true;
    L25:
        return false;
    L20:
        if (r7 != (this.f31358a.size() - 2)) goto L25;
        if (b() == false) goto L25;
    L14:
        if (r3.equals("*") == true) goto L17;
        r62 = false;
        goto L18
    L8:
        r02 = false;
        goto L9
    }

    public e d() {
        return this.f31359b;
    }

    public int e(String r4, int r5) {
        if (f(r4) == false) goto L6;
        return 0;
    L6:
        if (((String) this.f31358a.get(r5)).equals("**") == true) goto L9;
        return 1;
    L9:
        if (r5 != (this.f31358a.size() - 1)) goto L12;
        return 0;
    L12:
        if (((String) this.f31358a.get(r5 + 1)).equals(r4) == false) goto L15;
        return 2;
    L15:
        return 0;
    }

    public final boolean f(String r2) {
        return "__container".equals(r2);
    }

    public boolean g(String r4, int r5) {
        if (f(r4) == false) goto L6;
        return true;
    L6:
        if (r5 < this.f31358a.size()) goto L9;
        return false;
    L9:
        if (((String) this.f31358a.get(r5)).equals(r4) == false) goto L11;
    L16:
        return true;
    L11:
        if (((String) this.f31358a.get(r5)).equals("**") == true) goto L16;
        if (((String) this.f31358a.get(r5)).equals("*") == true) goto L16;
        return false;
    }

    public boolean h(String r2, int r3) {
        if ("__container".equals(r2) == false) goto L6;
        return true;
    L6:
        if (r3 >= (this.f31358a.size() - 1)) goto L8;
    L12:
        return true;
    L8:
        if (((String) this.f31358a.get(r3)).equals("**") == true) goto L12;
        return false;
    }

    public d i(e r2) {
        d r02 = new d(this);
        r02.f31359b = r2;
        return r02;
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder();
        r02.append("KeyPath{keys=");
        r02.append(this.f31358a);
        r02.append(",resolved=");
        if (this.f31359b == null) goto L5;
        boolean r1 = true;
    L6:
        r02.append(r1);
        r02.append('}');
        return r02.toString();
    L5:
        r1 = false;
        goto L6
    }

    public d(d r3) {
        this.f31358a = new ArrayList(r3.f31358a);
        this.f31359b = r3.f31359b;
    }
}
