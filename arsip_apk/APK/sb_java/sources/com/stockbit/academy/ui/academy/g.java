package com.stockbit.academy.ui.academy;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public final class g implements InterfaceC4094y {
    public static final a d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f44400a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44401b;

    /* renamed from: c, reason: collision with root package name */
    public final String f44402c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r6) {
            p.l(r6, "bundle");
            r6.setClassLoader(g.class.getClassLoader());
            if (r6.containsKey("EXTRA_CURRENT_TAB_ID") == false) goto L9;
            String r02 = r6.getString("EXTRA_CURRENT_TAB_ID");
            if (r02 == null) goto L8;
        L10:
            String r3 = "";
            if (r6.containsKey("EXTRA_STOCKBIT_ACADEMY_URL") == false) goto L17;
            String r1 = r6.getString("EXTRA_STOCKBIT_ACADEMY_URL");
            if (r1 != null) goto L19;
            throw new IllegalArgumentException("Argument \"EXTRA_STOCKBIT_ACADEMY_URL\" is marked as non-null but was passed a null value.");
        L19:
            if (r6.containsKey("academyEntrySource") == false) goto L26;
            r3 = r6.getString("academyEntrySource");
            if (r3 != null) goto L26;
            throw new IllegalArgumentException("Argument \"academyEntrySource\" is marked as non-null but was passed a null value.");
        L26:
            return new g(r02, r1, r3);
        L17:
            r1 = "";
            goto L19
        L8:
            throw new IllegalArgumentException("Argument \"EXTRA_CURRENT_TAB_ID\" is marked as non-null but was passed a null value.");
        L9:
            r02 = "0";
            goto L10
        }

        public a() {
        }
    }

    static {
        d = new a(null);
    }

    public g(String r2, String r3, String r4) {
        p.l(r2, "EXTRACURRENTTABID");
        p.l(r3, "EXTRASTOCKBITACADEMYURL");
        p.l(r4, "academyEntrySource");
        this.f44400a = r2;
        this.f44401b = r3;
        this.f44402c = r4;
    }

    public static final g fromBundle(Bundle r1) {
        return d.a(r1);
    }

    public final String a() {
        return this.f44402c;
    }

    public final String b() {
        return this.f44401b;
    }

    public final Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("EXTRA_CURRENT_TAB_ID", this.f44400a);
        r02.putString("EXTRA_STOCKBIT_ACADEMY_URL", this.f44401b);
        r02.putString("academyEntrySource", this.f44402c);
        return r02;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f44400a, r52.f44400a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f44401b, r52.f44401b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f44402c, r52.f44402c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f44400a.hashCode() * 31) + this.f44401b.hashCode()) * 31) + this.f44402c.hashCode();
    }

    public String toString() {
        return "AcademyFragmentArgs(EXTRACURRENTTABID=" + this.f44400a + ", EXTRASTOCKBITACADEMYURL=" + this.f44401b + ", academyEntrySource=" + this.f44402c + ')';
    }
}
