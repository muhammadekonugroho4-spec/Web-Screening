package com.koushikdutta.async.http;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Multimap extends LinkedHashMap<String, List<String>> implements Iterable<t> {

    /* renamed from: a, reason: collision with root package name */
    public static final c f41327a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final c f41328b = null;

    public static class a implements c {
        public a() {
        }
    }

    public static class b implements c {
        public b() {
        }
    }

    public interface c {
    }

    static {
        f41327a = new a();
        f41328b = new b();
    }

    public Multimap() {
    }

    public void a(String r1, String r2) {
        b(r1).add(r2);
    }

    public List b(String r2) {
        List<String> r02 = get(r2);
        if (r02 != null) goto L6;
        List r03 = g();
        put(r2, r03);
        return r03;
    L6:
        return r02;
    }

    public String e(String r2) {
        List<String> r22 = get(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        if (r22.size() != 0) goto L8;
        return null;
    L8:
        return r22.get(0);
    }

    public abstract List g();

    public void h(String r2, String r3) {
        List r02 = g();
        r02.add(r3);
        put(r2, r02);
    }

    @Override // java.lang.Iterable
    public Iterator<t> iterator() {
        ArrayList r02 = new ArrayList();
        Iterator r1 = keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        String r2 = (String) r1.next();
        Iterator r3 = ((List) get(r2)).iterator();
    L7:
        if (r3.hasNext() == false) goto L4;
        r02.add(new p(r2, (String) r3.next()));
        goto L7
    L10:
        return r02.iterator();
    }
}
