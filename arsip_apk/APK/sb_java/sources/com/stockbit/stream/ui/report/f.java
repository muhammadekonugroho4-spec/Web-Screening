package com.stockbit.stream.ui.report;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class f implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f144658b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f144659a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final f a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(f.class.getClassLoader());
            if (r3.containsKey("postId") == false) goto L5;
            String r32 = r3.getString("postId");
        L7:
            return new f(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f144658b = new a(null);
    }

    public f(String r1) {
        this.f144659a = r1;
    }

    public static final f fromBundle(Bundle r1) {
        return f144658b.a(r1);
    }

    public final String a() {
        return this.f144659a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        r02.putString("postId", this.f144659a);
        return r02;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f144659a, ((f) r4).f144659a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String r02 = this.f144659a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "StreamReportFragmentArgs(postId=" + this.f144659a + ')';
    }
}
