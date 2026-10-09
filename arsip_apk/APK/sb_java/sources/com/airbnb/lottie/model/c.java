package com.airbnb.lottie.model;

import java.util.List;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f31264a;

    /* renamed from: b, reason: collision with root package name */
    public final char f31265b;

    /* renamed from: c, reason: collision with root package name */
    public final double f31266c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31267e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31268f;

    public c(List r1, char r2, double r3, double r5, String r7, String r8) {
        this.f31264a = r1;
        this.f31265b = r2;
        this.f31266c = r3;
        this.d = r5;
        this.f31267e = r7;
        this.f31268f = r8;
    }

    public static int c(char r02, String r1, String r2) {
        return (((r02 * 31) + r1.hashCode()) * 31) + r2.hashCode();
    }

    public List a() {
        return this.f31264a;
    }

    public double b() {
        return this.d;
    }

    public int hashCode() {
        return c(this.f31265b, this.f31268f, this.f31267e);
    }
}
