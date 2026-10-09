package com.android.volley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f32001a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f32002b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f32003c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32004e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32005f;

    public h(int r9, byte[] r10, Map r11, boolean r12, long r13) {
        this(r9, r10, r11, a(r11), r12, r13);
    }

    public static List a(Map r4) {
        if (r4 != null) goto L6;
        return null;
    L6:
        if (r4.isEmpty() == true) goto L8;
        ArrayList r02 = new ArrayList(r4.size());
        Iterator r42 = r4.entrySet().iterator();
    L11:
        if (r42.hasNext() == false) goto L13;
        Map.Entry r1 = (Map.Entry) r42.next();
        r02.add(new e((String) r1.getKey(), (String) r1.getValue()));
        goto L11
    L13:
        return r02;
    L8:
        return Collections.EMPTY_LIST;
    }

    public static Map b(List r3) {
        if (r3 != null) goto L6;
        return null;
    L6:
        if (r3.isEmpty() == true) goto L8;
        TreeMap r02 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator r32 = r3.iterator();
    L11:
        if (r32.hasNext() == false) goto L13;
        e r1 = (e) r32.next();
        r02.put(r1.a(), r1.b());
        goto L11
    L13:
        return r02;
    L8:
        return Collections.EMPTY_MAP;
    }

    public h(int r9, byte[] r10, boolean r11, long r12, List r14) {
        this(r9, r10, b(r14), r14, r11, r12);
    }

    public h(byte[] r8, Map r9) {
        this(200, r8, r9, false, 0);
    }

    public h(int r1, byte[] r2, Map r3, List r4, boolean r5, long r6) {
        this.f32001a = r1;
        this.f32002b = r2;
        this.f32003c = r3;
        if (r4 != null) goto L5;
        this.d = null;
    L6:
        this.f32004e = r5;
        this.f32005f = r6;
        return;
    L5:
        this.d = Collections.unmodifiableList(r4);
        goto L6
    }
}
