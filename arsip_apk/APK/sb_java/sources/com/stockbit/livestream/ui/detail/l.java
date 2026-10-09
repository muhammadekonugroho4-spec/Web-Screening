package com.stockbit.livestream.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;

/* loaded from: classes10.dex */
public final class l implements InterfaceC4094y {

    /* renamed from: c, reason: collision with root package name */
    public static final a f121784c = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f121785a;

    /* renamed from: b, reason: collision with root package name */
    public final String f121786b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final l a(Bundle r4) {
            kotlin.jvm.internal.p.l(r4, "bundle");
            r4.setClassLoader(l.class.getClassLoader());
            if (r4.containsKey("liveStreamId") == false) goto L19;
            String r02 = r4.getString("liveStreamId");
            if (r02 == null) goto L17;
            if (r4.containsKey("liveStreamSource") == false) goto L15;
            String r42 = r4.getString("liveStreamSource");
            if (r42 == null) goto L13;
            return new l(r02, r42);
        L13:
            throw new IllegalArgumentException("Argument \"liveStreamSource\" is marked as non-null but was passed a null value.");
        L15:
            throw new IllegalArgumentException("Required argument \"liveStreamSource\" is missing and does not have an android:defaultValue");
        L17:
            throw new IllegalArgumentException("Argument \"liveStreamId\" is marked as non-null but was passed a null value.");
        L19:
            throw new IllegalArgumentException("Required argument \"liveStreamId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f121784c = new a(null);
    }

    public l(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "liveStreamId");
        kotlin.jvm.internal.p.l(r3, "liveStreamSource");
        this.f121785a = r2;
        this.f121786b = r3;
    }

    public static final l fromBundle(Bundle r1) {
        return f121784c.a(r1);
    }

    public final String a() {
        return this.f121785a;
    }

    public final String b() {
        return this.f121786b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("liveStreamId", this.f121785a);
        r02.putString("liveStreamSource", this.f121786b);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f121785a, r52.f121785a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f121786b, r52.f121786b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f121785a.hashCode() * 31) + this.f121786b.hashCode();
    }

    public String toString() {
        return "LivestreamDetailFragmentArgs(liveStreamId=" + this.f121785a + ", liveStreamSource=" + this.f121786b + ')';
    }
}
