package com.stockbit.stream.ui.composenote;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import java.util.Arrays;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class g implements InterfaceC4094y {

    /* renamed from: h, reason: collision with root package name */
    public static final a f142188h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final int f142189i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f142190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f142191b;

    /* renamed from: c, reason: collision with root package name */
    public final String f142192c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f142193e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f142194f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f142195g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final g a(Bundle r11) {
            p.l(r11, "bundle");
            r11.setClassLoader(g.class.getClassLoader());
            if (r11.containsKey("companySymbol") == false) goto L43;
            String r3 = r11.getString("companySymbol");
            if (r3 == null) goto L41;
            if (r11.containsKey("companyName") == false) goto L39;
            String r4 = r11.getString("companyName");
            if (r4 == null) goto L37;
            if (r11.containsKey("companyIcon") == false) goto L35;
            String r5 = r11.getString("companyIcon");
            if (r5 == null) goto L33;
            if (r11.containsKey("noteId") == false) goto L18;
            int r02 = r11.getInt("noteId");
        L17:
            int r6 = r02;
            String[] r2 = null;
            if (r11.containsKey("noteContent") == false) goto L22;
            String r7 = r11.getString("noteContent");
        L24:
            if (r11.containsKey("noteImageUrls") == false) goto L26;
            String[] r8 = r11.getStringArray("noteImageUrls");
        L28:
            if (r11.containsKey("noteFileUrls") == false) goto L31;
            r2 = r11.getStringArray("noteFileUrls");
        L31:
            return new g(r3, r4, r5, r6, r7, r8, r2);
        L26:
            r8 = null;
            goto L28
        L22:
            r7 = null;
            goto L24
        L18:
            r02 = 0;
            goto L17
        L33:
            throw new IllegalArgumentException("Argument \"companyIcon\" is marked as non-null but was passed a null value.");
        L35:
            throw new IllegalArgumentException("Required argument \"companyIcon\" is missing and does not have an android:defaultValue");
        L37:
            throw new IllegalArgumentException("Argument \"companyName\" is marked as non-null but was passed a null value.");
        L39:
            throw new IllegalArgumentException("Required argument \"companyName\" is missing and does not have an android:defaultValue");
        L41:
            throw new IllegalArgumentException("Argument \"companySymbol\" is marked as non-null but was passed a null value.");
        L43:
            throw new IllegalArgumentException("Required argument \"companySymbol\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f142188h = new a(null);
        f142189i = 8;
    }

    public g(String r2, String r3, String r4, int r5, String r6, String[] r7, String[] r8) {
        p.l(r2, "companySymbol");
        p.l(r3, "companyName");
        p.l(r4, "companyIcon");
        this.f142190a = r2;
        this.f142191b = r3;
        this.f142192c = r4;
        this.d = r5;
        this.f142193e = r6;
        this.f142194f = r7;
        this.f142195g = r8;
    }

    public static final g fromBundle(Bundle r1) {
        return f142188h.a(r1);
    }

    public final String a() {
        return this.f142192c;
    }

    public final String b() {
        return this.f142191b;
    }

    public final String c() {
        return this.f142190a;
    }

    public final String d() {
        return this.f142193e;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f142190a, r52.f142190a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f142191b, r52.f142191b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f142192c, r52.f142192c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f142193e, r52.f142193e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f142194f, r52.f142194f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f142195g, r52.f142195g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final Bundle f() {
        Bundle r02 = new Bundle();
        r02.putString("companySymbol", this.f142190a);
        r02.putString("companyName", this.f142191b);
        r02.putString("companyIcon", this.f142192c);
        r02.putInt("noteId", this.d);
        r02.putString("noteContent", this.f142193e);
        r02.putStringArray("noteImageUrls", this.f142194f);
        r02.putStringArray("noteFileUrls", this.f142195g);
        return r02;
    }

    public int hashCode() {
        int r02 = ((((((this.f142190a.hashCode() * 31) + this.f142191b.hashCode()) * 31) + this.f142192c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31;
        String r1 = this.f142193e;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String[] r13 = this.f142194f;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String[] r15 = this.f142195g;
        if (r15 == null) goto L15;
        r2 = Arrays.hashCode(r15);
    L15:
        return r04 + r2;
    L9:
        r14 = Arrays.hashCode(r13);
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "StreamComposeNoteFragmentArgs(companySymbol=" + this.f142190a + ", companyName=" + this.f142191b + ", companyIcon=" + this.f142192c + ", noteId=" + this.d + ", noteContent=" + this.f142193e + ", noteImageUrls=" + Arrays.toString(this.f142194f) + ", noteFileUrls=" + Arrays.toString(this.f142195g) + ')';
    }
}
