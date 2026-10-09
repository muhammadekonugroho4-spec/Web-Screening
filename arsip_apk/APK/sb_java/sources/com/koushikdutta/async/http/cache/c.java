package com.koushikdutta.async.http.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final Comparator f41372f = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f41373a;

    /* renamed from: b, reason: collision with root package name */
    public String f41374b;

    /* renamed from: c, reason: collision with root package name */
    public int f41375c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f41376e;

    public static class a implements Comparator {
        public a() {
        }

        public int a(String r2, String r3) {
            if (r2 != r3) goto L5;
            return 0;
        L5:
            if (r2 != null) goto L8;
            return -1;
        L8:
            if (r3 != null) goto L12;
            return 1;
        L12:
            return String.CASE_INSENSITIVE_ORDER.compare(r2, r3);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object r1, Object r2) {
            return a((String) r1, (String) r2);
        }
    }

    static {
        f41372f = new a();
    }

    public c() {
        this.f41373a = new ArrayList(20);
        this.f41375c = 1;
        this.d = -1;
    }

    public static c d(Map r3) {
        c r02 = new c();
        Iterator r32 = r3.entrySet().iterator();
    L4:
        if (r32.hasNext() == false) goto L11;
        Map.Entry r1 = (Map.Entry) r32.next();
        String r2 = (String) r1.getKey();
        List r12 = (List) r1.getValue();
        if (r2 != null) goto L7;
        if (r12.isEmpty() == true) goto L4;
        r02.o((String) r12.get(r12.size() - 1));
        goto L4
    L7:
        r02.b(r2, r12);
        goto L4
    L11:
        return r02;
    }

    public void a(String r3, String r4) {
        if (r3 == null) goto L9;
        if (r4 != null) goto L6;
        System.err.println("Ignoring HTTP header field '" + r3 + "' because its value is null");
        return;
    L6:
        this.f41373a.add(r3);
        this.f41373a.add(r4.trim());
        return;
    L9:
        throw new IllegalArgumentException("fieldName == null");
    }

    public void b(String r2, List r3) {
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        a(r2, (String) r32.next());
        goto L4
    }

    public void c(String r3) {
        int r02 = r3.indexOf(":");
        if (r02 != (-1)) goto L6;
        a("", r3);
        return;
    L6:
        a(r3.substring(0, r02), r3.substring(r02 + 1));
    }

    public String e(String r3) {
        int r02 = this.f41373a.size() - 2;
    L3:
        if (r02 < 0) goto L9;
        if (r3.equalsIgnoreCase((String) this.f41373a.get(r02)) == true) goto L7;
        r02 = r02 - 2;
        goto L3
    L7:
        return (String) this.f41373a.get(r02 + 1);
    L9:
        return null;
    }

    public c f(Set r6) {
        c r02 = new c();
        int r1 = 0;
    L4:
        if (r1 >= this.f41373a.size()) goto L9;
        String r2 = (String) this.f41373a.get(r1);
        if (r6.contains(r2) == false) goto L8;
        r02.a(r2, (String) this.f41373a.get(r1 + 1));
    L8:
        r1 = r1 + 2;
        goto L4
    L9:
        return r02;
    }

    public String g(int r2) {
        int r22 = r2 * 2;
        if (r22 >= 0) goto L5;
        return null;
    L5:
        if (r22 < this.f41373a.size()) goto L8;
        return null;
    L8:
        return (String) this.f41373a.get(r22);
    }

    public int h() {
        return this.d;
    }

    public String i() {
        return this.f41376e;
    }

    public String j() {
        return this.f41374b;
    }

    public String k(int r2) {
        int r22 = (r2 * 2) + 1;
        if (r22 >= 0) goto L5;
        return null;
    L5:
        if (r22 < this.f41373a.size()) goto L8;
        return null;
    L8:
        return (String) this.f41373a.get(r22);
    }

    public int l() {
        return this.f41373a.size() / 2;
    }

    public void m(String r3) {
        int r02 = 0;
    L4:
        if (r02 >= this.f41373a.size()) goto L9;
        if (r3.equalsIgnoreCase((String) this.f41373a.get(r02)) == false) goto L8;
        this.f41373a.remove(r02);
        this.f41373a.remove(r02);
    L8:
        r02 = r02 + 2;
        goto L4
    }

    public void n(String r1, String r2) {
        m(r1);
        a(r1, r2);
    }

    public void o(String r5) {
        String r52 = r5.trim();
        this.f41374b = r52;
        if (r52 != null) goto L5;
        return;
    L5:
        if (r52.startsWith("HTTP/") == false) goto L22;
        String r53 = r52.trim();
        int r02 = r53.indexOf(" ");
        int r1 = r02 + 1;
        if (r1 != 0) goto L11;
        return;
    L11:
        if (r53.charAt(r02 - 1) == '1') goto L13;
        this.f41375c = 0;
    L13:
        int r03 = r02 + 4;
        if (r03 <= r53.length()) goto L16;
        r03 = r53.length();
    L16:
        this.d = Integer.parseInt(r53.substring(r1, r03));
        int r04 = r03 + 1;
        if (r04 > r53.length()) goto L21;
        this.f41376e = r53.substring(r04);
        return;
    L21:
        return;
    }

    public String p() {
        StringBuilder r02 = new StringBuilder(256);
        r02.append(this.f41374b);
        r02.append("\r\n");
        int r2 = 0;
    L4:
        if (r2 >= this.f41373a.size()) goto L6;
        r02.append((String) this.f41373a.get(r2));
        r02.append(": ");
        r02.append((String) this.f41373a.get(r2 + 1));
        r02.append("\r\n");
        r2 = r2 + 2;
        goto L4
    L6:
        r02.append("\r\n");
        return r02.toString();
    }

    public Map q() {
        TreeMap r02 = new TreeMap(f41372f);
        int r1 = 0;
    L4:
        if (r1 >= this.f41373a.size()) goto L9;
        String r2 = (String) this.f41373a.get(r1);
        String r3 = (String) this.f41373a.get(r1 + 1);
        ArrayList r4 = new ArrayList();
        List r5 = (List) r02.get(r2);
        if (r5 == null) goto L8;
        r4.addAll(r5);
    L8:
        r4.add(r3);
        r02.put(r2, Collections.unmodifiableList(r4));
        r1 = r1 + 2;
        goto L4
    L9:
        String r12 = this.f41374b;
        if (r12 == null) goto L13;
        r02.put(null, Collections.unmodifiableList(Collections.singletonList(r12)));
    L13:
        return Collections.unmodifiableMap(r02);
    }
}
