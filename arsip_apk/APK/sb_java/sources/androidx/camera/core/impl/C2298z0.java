package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2298z0 implements Config {

    /* renamed from: P, reason: collision with root package name */
    public static final Comparator f5635P = null;

    /* renamed from: Q, reason: collision with root package name */
    public static final C2298z0 f5636Q = null;

    /* renamed from: O, reason: collision with root package name */
    public final TreeMap f5637O;

    static {
        Comparator r02 = new C2296y0();
        f5635P = r02;
        f5636Q = new C2298z0(new TreeMap(r02));
    }

    public C2298z0(TreeMap r1) {
        this.f5637O = r1;
    }

    public static /* synthetic */ int e0(Config.a r02, Config.a r1) {
        return r02.c().compareTo(r1.c());
    }

    public static C2298z0 f0() {
        return f5636Q;
    }

    public static C2298z0 g0(Config r7) {
        if (C2298z0.class.equals(r7.getClass()) == true) goto L5;
        TreeMap r02 = new TreeMap(f5635P);
        Iterator r1 = r7.h().iterator();
    L8:
        if (r1.hasNext() == false) goto L15;
        Config.a r2 = (Config.a) r1.next();
        Set r3 = r7.c(r2);
        ArrayMap r4 = new ArrayMap();
        Iterator r32 = r3.iterator();
    L11:
        if (r32.hasNext() == false) goto L13;
        Config.OptionPriority r5 = (Config.OptionPriority) r32.next();
        r4.put(r5, r7.g(r2, r5));
        goto L11
    L13:
        r02.put(r2, r4);
        goto L8
    L15:
        return new C2298z0(r02);
    L5:
        return (C2298z0) r7;
    }

    @Override // androidx.camera.core.impl.Config
    public Object a(Config.a r4) {
        Map r02 = (Map) this.f5637O.get(r4);
        if (r02 == null) goto L7;
        return r02.get((Config.OptionPriority) Collections.min(r02.keySet()));
    L7:
        throw new IllegalArgumentException("Option does not exist: " + r4);
    }

    @Override // androidx.camera.core.impl.Config
    public void b(String r4, Config.b r5) {
        Config.a r02 = Config.a.a(r4, Void.class);
        Iterator r03 = this.f5637O.tailMap(r02).entrySet().iterator();
    L4:
        if (r03.hasNext() == false) goto L10;
        Map.Entry r1 = (Map.Entry) r03.next();
        if (((Config.a) r1.getKey()).c().startsWith(r4) == false) goto L15;
        if (r5.a((Config.a) r1.getKey()) == true) goto L4;
        return;
    L15:
        return;
    }

    @Override // androidx.camera.core.impl.Config
    public Set c(Config.a r2) {
        Map r22 = (Map) this.f5637O.get(r2);
        if (r22 != null) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return Collections.unmodifiableSet(r22.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public Object d(Config.a r1, Object r2) {
        return a(r1);
    L4:
        return r2;
    }

    @Override // androidx.camera.core.impl.Config
    public boolean f(Config.a r2) {
        return this.f5637O.containsKey(r2);
    }

    @Override // androidx.camera.core.impl.Config
    public Object g(Config.a r4, Config.OptionPriority r5) {
        Map r02 = (Map) this.f5637O.get(r4);
        if (r02 == null) goto L11;
        if (r02.containsKey(r5) == false) goto L9;
        return r02.get(r5);
    L9:
        throw new IllegalArgumentException("Option does not exist: " + r4 + " with priority=" + r5);
    L11:
        throw new IllegalArgumentException("Option does not exist: " + r4);
    }

    @Override // androidx.camera.core.impl.Config
    public Set h() {
        return Collections.unmodifiableSet(this.f5637O.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public Config.OptionPriority i(Config.a r4) {
        Map r02 = (Map) this.f5637O.get(r4);
        if (r02 == null) goto L7;
        return (Config.OptionPriority) Collections.min(r02.keySet());
    L7:
        throw new IllegalArgumentException("Option does not exist: " + r4);
    }
}
