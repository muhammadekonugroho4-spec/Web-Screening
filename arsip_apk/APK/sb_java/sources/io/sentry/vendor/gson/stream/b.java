package io.sentry.vendor.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class b implements Closeable, Flushable, AutoCloseable {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f176932j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f176933k = null;

    /* renamed from: a, reason: collision with root package name */
    public final Writer f176934a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f176935b;

    /* renamed from: c, reason: collision with root package name */
    public int f176936c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f176937e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f176938f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f176939g;

    /* renamed from: h, reason: collision with root package name */
    public String f176940h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f176941i;

    static {
        f176932j = new String[128];
        int r02 = 0;
    L4:
        if (r02 > 31) goto L6;
        f176932j[r02] = String.format("\\u%04x", new Object[]{Integer.valueOf(r02)});
        r02 = r02 + 1;
        goto L4
    L6:
        String[] r03 = f176932j;
        r03[34] = "\\\"";
        r03[92] = "\\\\";
        r03[9] = "\\t";
        r03[8] = "\\b";
        r03[10] = "\\n";
        r03[13] = "\\r";
        r03[12] = "\\f";
        String[] r04 = (String[]) r03.clone();
        f176933k = r04;
        r04[60] = "\\u003c";
        r04[62] = "\\u003e";
        r04[38] = "\\u0026";
        r04[61] = "\\u003d";
        r04[39] = "\\u0027";
    }

    public b(Writer r2) {
        this.f176935b = new int[32];
        this.f176936c = 0;
        Z(6);
        this.f176937e = ":";
        this.f176941i = true;
        if (r2 == null) goto L7;
        this.f176934a = r2;
        return;
    L7:
        throw new NullPointerException("out == null");
    }

    public final void A0() {
        if (this.f176940h == null) goto L6;
        c();
        f0(this.f176940h);
        this.f176940h = null;
        return;
    }

    public b B(String r2) {
        if (r2 == null) goto L14;
        if (this.f176940h != null) goto L12;
        if (this.f176936c == 0) goto L10;
        this.f176940h = r2;
        return this;
    L10:
        throw new IllegalStateException("JsonWriter is closed.");
    L12:
        throw new IllegalStateException();
    L14:
        throw new NullPointerException("name == null");
    }

    public final void E() {
        if (this.d == null) goto L8;
        this.f176934a.write(10);
        int r02 = this.f176936c;
        int r1 = 1;
    L6:
        if (r1 >= r02) goto L10;
        this.f176934a.write(this.d);
        r1 = r1 + 1;
        goto L6
    L10:
        return;
    }

    public b M() {
        if (this.f176940h != null) goto L5;
    L9:
        f();
        this.f176934a.write("null");
        return this;
    L5:
        if (this.f176941i == false) goto L7;
        A0();
        goto L9
    L7:
        this.f176940h = null;
        return this;
    }

    public final b O(int r1, char r2) {
        f();
        Z(r1);
        this.f176934a.write(r2);
        return this;
    }

    public final int W() {
        int r02 = this.f176936c;
        if (r02 == 0) goto L7;
        return this.f176935b[r02 - 1];
    L7:
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void Z(int r4) {
        int r02 = this.f176936c;
        int[] r1 = this.f176935b;
        if (r02 != r1.length) goto L5;
        this.f176935b = Arrays.copyOf(r1, r02 * 2);
    L5:
        int[] r03 = this.f176935b;
        int r12 = this.f176936c;
        this.f176936c = r12 + 1;
        r03[r12] = r4;
    }

    public final void c() {
        int r02 = W();
        if (r02 != 5) goto L6;
        this.f176934a.write(44);
    L7:
        E();
        c0(4);
        return;
    L6:
        if (r02 == 3) goto L7;
        throw new IllegalStateException("Nesting problem.");
    }

    public final void c0(int r3) {
        this.f176935b[this.f176936c - 1] = r3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f176934a.close();
        int r02 = this.f176936c;
        if (r02 > 1) goto L10;
        if (r02 == 1) goto L6;
    L7:
        this.f176936c = 0;
        return;
    L6:
        if (this.f176935b[r02 - 1] == 7) goto L7;
    L10:
        throw new IOException("Incomplete document");
    }

    public final void d0(String r2) {
        if (r2 != null) goto L4;
    L8:
        this.d = null;
        this.f176937e = ":";
        return;
    L4:
        if (r2.length() == 0) goto L8;
        this.d = r2;
        this.f176937e = ": ";
    }

    public final void f() {
        int r02 = W();
        if (r02 == 1) goto L23;
        if (r02 != 2) goto L6;
        this.f176934a.append(',');
        E();
        return;
    L6:
        if (r02 != 4) goto L8;
        this.f176934a.append(this.f176937e);
        c0(5);
        return;
    L8:
        if (r02 == 6) goto L17;
        if (r02 != 7) goto L16;
        if (this.f176938f == true) goto L17;
        throw new IllegalStateException("JSON must have only one top-level value.");
    L16:
        throw new IllegalStateException("Nesting problem.");
    L17:
        c0(7);
        return;
    L23:
        c0(2);
        E();
    }

    public final void f0(String r9) {
        if (this.f176939g == false) goto L5;
        String[] r02 = f176933k;
    L6:
        this.f176934a.write(34);
        int r1 = r9.length();
        int r3 = 0;
        int r4 = 0;
    L7:
        if (r3 >= r1) goto L23;
        char r5 = r9.charAt(r3);
        if (r5 >= 128) goto L14;
        String r52 = r02[r5];
        if (r52 == null) goto L22;
    L19:
        if (r4 >= r3) goto L21;
        this.f176934a.write(r9, r4, r3 - r4);
    L21:
        this.f176934a.write(r52);
        r4 = r3 + 1;
    L22:
        r3 = r3 + 1;
        goto L7
    L14:
        if (r5 != 8232) goto L17;
        r52 = "\\u2028";
        goto L19
    L17:
        if (r5 != 8233) goto L22;
        r52 = "\\u2029";
        goto L19
    L23:
        if (r4 >= r1) goto L25;
        this.f176934a.write(r9, r4, r1 - r4);
    L25:
        this.f176934a.write(34);
        return;
    L5:
        r02 = f176932j;
        goto L6
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f176936c == 0) goto L7;
        this.f176934a.flush();
        return;
    L7:
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public b g0(double r4) {
        A0();
        if (this.f176938f == false) goto L5;
    L11:
        f();
        this.f176934a.append(Double.toString(r4));
        return this;
    L5:
        if (Double.isNaN(r4) == true) goto L10;
        if (Double.isInfinite(r4) == false) goto L11;
    L10:
        throw new IllegalArgumentException("Numeric values must be finite, but was " + r4);
    }

    public b i() {
        A0();
        return O(1, '[');
    }

    public b k() {
        A0();
        return O(3, '{');
    }

    public final b l(int r2, int r3, char r4) {
        int r02 = W();
        if (r02 == r3) goto L9;
        if (r02 == r2) goto L9;
        throw new IllegalStateException("Nesting problem.");
    L9:
        if (this.f176940h != null) goto L16;
        this.f176936c--;
        if (r02 != r3) goto L13;
        E();
    L13:
        this.f176934a.write(r4);
        return this;
    L16:
        throw new IllegalStateException("Dangling name: " + this.f176940h);
    }

    public b n() {
        return l(1, 2, ']');
    }

    public b o0(long r2) {
        A0();
        f();
        this.f176934a.write(Long.toString(r2));
        return this;
    }

    public b p0(Boolean r2) {
        if (r2 == null) goto L4;
        A0();
        f();
        Writer r02 = this.f176934a;
        if (r2.booleanValue() == false) goto L8;
        String r22 = "true";
    L9:
        r02.write(r22);
        return this;
    L8:
        r22 = "false";
        goto L9
    L4:
        return M();
    }

    public final void setLenient(boolean r1) {
        this.f176938f = r1;
    }

    public b t() {
        return l(3, 5, '}');
    }

    public String u() {
        return this.d;
    }

    public b v0(Number r4) {
        if (r4 == null) goto L4;
        A0();
        String r02 = r4.toString();
        if (this.f176938f == false) goto L8;
    L16:
        f();
        this.f176934a.append(r02);
        return this;
    L8:
        if (r02.equals("-Infinity") == true) goto L15;
        if (r02.equals("Infinity") == true) goto L15;
        if (r02.equals("NaN") == false) goto L16;
    L15:
        throw new IllegalArgumentException("Numeric values must be finite, but was " + r4);
    L4:
        return M();
    }

    public b x(String r2) {
        if (r2 == null) goto L4;
        A0();
        f();
        this.f176934a.append(r2);
        return this;
    L4:
        return M();
    }

    public b y0(String r1) {
        if (r1 == null) goto L4;
        A0();
        f();
        f0(r1);
        return this;
    L4:
        return M();
    }

    public b z0(boolean r2) {
        A0();
        f();
        Writer r02 = this.f176934a;
        if (r2 == false) goto L5;
        String r22 = "true";
    L6:
        r02.write(r22);
        return this;
    L5:
        r22 = "false";
        goto L6
    }
}
