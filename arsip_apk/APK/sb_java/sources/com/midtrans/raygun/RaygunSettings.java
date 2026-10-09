package com.midtrans.raygun;

import java.util.HashSet;

/* loaded from: classes6.dex */
public abstract class RaygunSettings {

    /* renamed from: a, reason: collision with root package name */
    public static IgnoredURLs f42092a;

    /* renamed from: b, reason: collision with root package name */
    public static HashSet f42093b;

    public static class IgnoredURLs extends HashSet<String> {
        public IgnoredURLs(String... r4) {
            int r02 = r4.length;
            int r1 = 0;
        L3:
            if (r1 >= r02) goto L5;
            add(r4[r1]);
            r1 = r1 + 1;
            goto L3
        }
    }

    static {
        f42092a = new IgnoredURLs(new String[]{"api.raygun.io"});
        f42093b = new HashSet();
    }

    public static String a() {
        return "https://api.raygun.io/entries";
    }

    public static String b() {
        return "https://api.raygun.io/events";
    }
}
