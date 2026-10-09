package com.stockbit.chat.ui.groupshare;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class i implements InterfaceC4094y {

    /* renamed from: g, reason: collision with root package name */
    public static final a f56398g = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f56399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56400b;

    /* renamed from: c, reason: collision with root package name */
    public final String f56401c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f56402e;

    /* renamed from: f, reason: collision with root package name */
    public final String f56403f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final i a(Bundle r10) {
            p.l(r10, "bundle");
            r10.setClassLoader(i.class.getClassLoader());
            if (r10.containsKey("groupId") == false) goto L42;
            int r3 = r10.getInt("groupId");
            if (r10.containsKey("roomId") == false) goto L40;
            int r4 = r10.getInt("roomId");
            String r2 = "";
            if (r10.containsKey("groupName") == false) goto L13;
            String r02 = r10.getString("groupName");
            if (r02 == null) goto L12;
            String r5 = r02;
        L15:
            if (r10.containsKey("invitationLink") == false) goto L21;
            String r03 = r10.getString("invitationLink");
            if (r03 == null) goto L20;
            String r6 = r03;
        L23:
            if (r10.containsKey("avatar") == false) goto L29;
            String r04 = r10.getString("avatar");
            if (r04 == null) goto L28;
            String r7 = r04;
        L31:
            if (r10.containsKey("shortName") == false) goto L38;
            r2 = r10.getString("shortName");
            if (r2 != null) goto L38;
            throw new IllegalArgumentException("Argument \"shortName\" is marked as non-null but was passed a null value.");
        L38:
            return new i(r3, r4, r5, r6, r7, r2);
        L28:
            throw new IllegalArgumentException("Argument \"avatar\" is marked as non-null but was passed a null value.");
        L29:
            r7 = "";
            goto L31
        L20:
            throw new IllegalArgumentException("Argument \"invitationLink\" is marked as non-null but was passed a null value.");
        L21:
            r6 = "";
            goto L23
        L12:
            throw new IllegalArgumentException("Argument \"groupName\" is marked as non-null but was passed a null value.");
        L13:
            r5 = "";
            goto L15
        L40:
            throw new IllegalArgumentException("Required argument \"roomId\" is missing and does not have an android:defaultValue");
        L42:
            throw new IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f56398g = new a(null);
    }

    public i(int r2, int r3, String r4, String r5, String r6, String r7) {
        p.l(r4, "groupName");
        p.l(r5, "invitationLink");
        p.l(r6, "avatar");
        p.l(r7, "shortName");
        this.f56399a = r2;
        this.f56400b = r3;
        this.f56401c = r4;
        this.d = r5;
        this.f56402e = r6;
        this.f56403f = r7;
    }

    public static final i fromBundle(Bundle r1) {
        return f56398g.a(r1);
    }

    public final String a() {
        return this.f56402e;
    }

    public final int b() {
        return this.f56399a;
    }

    public final String c() {
        return this.f56401c;
    }

    public final String d() {
        return this.d;
    }

    public final int e() {
        return this.f56400b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f56399a == r52.f56399a) goto L12;
        return false;
    L12:
        if (this.f56400b == r52.f56400b) goto L15;
        return false;
    L15:
        if (p.g(this.f56401c, r52.f56401c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f56402e, r52.f56402e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f56403f, r52.f56403f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f56403f;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f56399a) * 31) + Integer.hashCode(this.f56400b)) * 31) + this.f56401c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f56402e.hashCode()) * 31) + this.f56403f.hashCode();
    }

    public String toString() {
        return "ShareGroupFragmentArgs(groupId=" + this.f56399a + ", roomId=" + this.f56400b + ", groupName=" + this.f56401c + ", invitationLink=" + this.d + ", avatar=" + this.f56402e + ", shortName=" + this.f56403f + ')';
    }
}
