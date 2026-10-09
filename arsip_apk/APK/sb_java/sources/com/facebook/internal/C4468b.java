package com.facebook.internal;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4468b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4468b f36448a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f36449b = null;

    /* renamed from: com.facebook.internal.b$a */
    public static final class a implements h {
        public a() {
        }

        @Override // com.facebook.internal.C4468b.h
        public void a(Bundle r2, String r3, Object r4) {
            kotlin.jvm.internal.p.l(r2, "bundle");
            kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r4, "value");
            r2.putBoolean(r3, ((Boolean) r4).booleanValue());
        }
    }

    /* renamed from: com.facebook.internal.b$b, reason: collision with other inner class name */
    public static final class C0380b implements h {
        public C0380b() {
        }

        @Override // com.facebook.internal.C4468b.h
        public void a(Bundle r2, String r3, Object r4) {
            kotlin.jvm.internal.p.l(r2, "bundle");
            kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r4, "value");
            r2.putInt(r3, ((Integer) r4).intValue());
        }
    }

    /* renamed from: com.facebook.internal.b$c */
    public static final class c implements h {
        public c() {
        }

        @Override // com.facebook.internal.C4468b.h
        public void a(Bundle r3, String r4, Object r5) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            kotlin.jvm.internal.p.l(r4, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r5, "value");
            r3.putLong(r4, ((Long) r5).longValue());
        }
    }

    /* renamed from: com.facebook.internal.b$d */
    public static final class d implements h {
        public d() {
        }

        @Override // com.facebook.internal.C4468b.h
        public void a(Bundle r3, String r4, Object r5) {
            kotlin.jvm.internal.p.l(r3, "bundle");
            kotlin.jvm.internal.p.l(r4, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r5, "value");
            r3.putDouble(r4, ((Double) r5).doubleValue());
        }
    }

    /* renamed from: com.facebook.internal.b$e */
    public static final class e implements h {
        public e() {
        }

        @Override // com.facebook.internal.C4468b.h
        public void a(Bundle r2, String r3, Object r4) {
            kotlin.jvm.internal.p.l(r2, "bundle");
            kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r4, "value");
            r2.putString(r3, (String) r4);
        }
    }

    /* renamed from: com.facebook.internal.b$f */
    public static final class f implements h {
        public f() {
        }

        @Override // com.facebook.internal.C4468b.h
        public void a(Bundle r2, String r3, Object r4) {
            kotlin.jvm.internal.p.l(r2, "bundle");
            kotlin.jvm.internal.p.l(r3, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r4, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: com.facebook.internal.b$g */
    public static final class g implements h {
        public g() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.C4468b.h
        public void a(Bundle r6, String r7, Object r8) {
            kotlin.jvm.internal.p.l(r6, "bundle");
            kotlin.jvm.internal.p.l(r7, Constants.KEY_KEY);
            kotlin.jvm.internal.p.l(r8, "value");
            JSONArray r82 = (JSONArray) r8;
            ArrayList r02 = new ArrayList();
            if (r82.length() != 0) goto L6;
            r6.putStringArrayList(r7, r02);
            return;
        L6:
            int r1 = r82.length();
            int r2 = 0;
        L7:
            if (r2 >= r1) goto L13;
            Object r3 = r82.get(r2);
            if ((r3 instanceof String) == false) goto L12;
            r02.add(r3);
            r2 = r2 + 1;
            goto L7
        L12:
            throw new IllegalArgumentException("Unexpected type in an array: " + r3.getClass());
        L13:
            r6.putStringArrayList(r7, r02);
        }
    }

    /* renamed from: com.facebook.internal.b$h */
    public interface h {
        void a(Bundle r1, String r2, Object r3);
    }

    static {
        f36448a = new C4468b();
        HashMap r02 = new HashMap();
        f36449b = r02;
        r02.put(Boolean.class, new a());
        r02.put(Integer.class, new C0380b());
        r02.put(Long.class, new c());
        r02.put(Double.class, new d());
        r02.put(String.class, new e());
        r02.put(String[].class, new f());
        r02.put(JSONArray.class, new g());
    }

    public C4468b() {
    }

    public static final Bundle a(JSONObject r6) {
        kotlin.jvm.internal.p.l(r6, "jsonObject");
        Bundle r02 = new Bundle();
        Iterator<String> r1 = r6.keys();
    L4:
        if (r1.hasNext() == false) goto L16;
        String r2 = r1.next();
        Object r3 = r6.get(r2);
        if (r3 == JSONObject.NULL) goto L4;
        if ((r3 instanceof JSONObject) == true) goto L10;
        h r4 = (h) f36449b.get(r3.getClass());
        if (r4 == null) goto L15;
        kotlin.jvm.internal.p.k(r2, Constants.KEY_KEY);
        kotlin.jvm.internal.p.k(r3, "value");
        r4.a(r02, r2, r3);
        goto L4
    L15:
        throw new IllegalArgumentException("Unsupported type: " + r3.getClass());
    L10:
        r02.putBundle(r2, a((JSONObject) r3));
        goto L4
    L16:
        return r02;
    }
}
