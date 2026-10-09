package com.koushikdutta.async.http;

import com.koushikdutta.async.util.TaggedList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class Headers {

    /* renamed from: a, reason: collision with root package name */
    public final Multimap f41326a;

    public Headers() {
        this.f41326a = new AnonymousClass1(this);
    }

    public Headers a(String r3, String r4) {
        String r02 = r3.toLowerCase(Locale.US);
        this.f41326a.a(r02, r4);
        ((TaggedList) this.f41326a.get(r02)).e(r3);
        return this;
    }

    public Headers b(String r2, List r3) {
        Iterator r32 = r3.iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        a(r2, (String) r32.next());
        goto L4
    L6:
        return this;
    }

    public Headers c(String r4) {
        if (r4 == null) goto L8;
        String[] r42 = r4.trim().split(":", 2);
        if (r42.length != 2) goto L7;
        a(r42[0].trim(), r42[1].trim());
        return this;
    L7:
        a(r42[0].trim(), "");
    L8:
        return this;
    }

    public String d(String r3) {
        return this.f41326a.e(r3.toLowerCase(Locale.US));
    }

    public Multimap e() {
        return this.f41326a;
    }

    public List f(String r3) {
        return this.f41326a.remove(r3.toLowerCase(Locale.US));
    }

    public Headers g(String r3, String r4) {
        if (r4 != null) goto L4;
    L10:
        String r02 = r3.toLowerCase(Locale.US);
        this.f41326a.h(r02, r4);
        ((TaggedList) this.f41326a.get(r02)).e(r3);
        return this;
    L4:
        if (r4.contains("\n") == true) goto L9;
        if (r4.contains("\r") == false) goto L10;
    L9:
        throw new IllegalArgumentException("value must not contain a new line or line feed");
    }

    public String h(String r3) {
        return i().insert(0, r3 + "\r\n").toString();
    }

    public StringBuilder i() {
        StringBuilder r02 = new StringBuilder(256);
        Iterator<String> r1 = this.f41326a.keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        String r2 = r1.next();
        TaggedList r22 = (TaggedList) this.f41326a.get(r2);
        Iterator<T> r4 = r22.iterator();
    L7:
        if (r4.hasNext() == false) goto L4;
        String r5 = (String) r4.next();
        r02.append((String) r22.a());
        r02.append(": ");
        r02.append(r5);
        r02.append("\r\n");
        goto L7
    L9:
        r02.append("\r\n");
        return r02;
    }

    public String toString() {
        return i().toString();
    }

    public Headers(Map r4) {
        this.f41326a = new AnonymousClass1(this);
        Iterator r02 = r4.keySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        String r1 = (String) r02.next();
        b(r1, (List) r4.get(r1));
        goto L4
    }
}
