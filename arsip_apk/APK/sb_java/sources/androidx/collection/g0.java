package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.AbstractC11772p;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f6436a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f6437b;

    /* renamed from: c, reason: collision with root package name */
    public int f6438c;

    public g0() {
        int r2 = 0;
        this(r2, 1, null);
    }

    public final int a(Object r6) {
        int r02 = this.f6438c * 2;
        Object[] r1 = this.f6437b;
        if (r6 != null) goto L11;
        int r62 = 1;
    L5:
        if (r62 >= r02) goto L18;
        if (r1[r62] == null) goto L9;
        r62 = r62 + 2;
        goto L5
    L9:
        return r62 >> 1;
    L18:
        return -1;
    L11:
        int r3 = 1;
    L12:
        if (r3 >= r02) goto L24;
        if (kotlin.jvm.internal.p.g(r6, r1[r3]) == true) goto L16;
        r3 = r3 + 2;
        goto L12
    L16:
        return r3 >> 1;
    L24:
        return -1;
    }

    public void b(int r4) {
        int r02 = this.f6438c;
        int[] r1 = this.f6436a;
        if (r1.length >= r4) goto L6;
        int[] r12 = Arrays.copyOf(r1, r4);
        kotlin.jvm.internal.p.k(r12, "copyOf(...)");
        this.f6436a = r12;
        Object[] r42 = Arrays.copyOf(this.f6437b, r4 * 2);
        kotlin.jvm.internal.p.k(r42, "copyOf(...)");
        this.f6437b = r42;
    L6:
        if (this.f6438c != r02) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public void clear() {
        if (this.f6438c <= 0) goto L6;
        this.f6436a = androidx.collection.internal.a.f6448a;
        this.f6437b = androidx.collection.internal.a.f6450c;
        this.f6438c = 0;
    L6:
        if (this.f6438c > 0) goto L9;
        return;
    L9:
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object r1) {
        if (e(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean containsValue(Object r1) {
        if (a(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final int d(Object r6, int r7) {
        int r02 = this.f6438c;
        if (r02 != 0) goto L6;
        return -1;
    L6:
        int r1 = androidx.collection.internal.a.a(this.f6436a, r02, r7);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (kotlin.jvm.internal.p.g(r6, this.f6437b[r1 << 1]) == true) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r02) goto L20;
        if (this.f6436a[r2] != r7) goto L20;
        if (kotlin.jvm.internal.p.g(r6, this.f6437b[r2 << 1]) == true) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.f6436a[r12] != r7) goto L29;
        if (kotlin.jvm.internal.p.g(r6, this.f6437b[r12 << 1]) == true) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    public int e(Object r2) {
        if (r2 != null) goto L6;
        return f();
    L6:
        return d(r2, r2.hashCode());
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L44;
        return true;
    L44:
        if ((r8 instanceof g0) == false) goto L25;
        if (size() == ((g0) r8).size()) goto L11;
        return false;
    L11:
        g0 r82 = (g0) r8;     // Catch: Throwable -> L43
        int r2 = this.f6438c;     // Catch: Throwable -> L43
        int r3 = 0;
    L12:
        if (r3 >= r2) goto L23;
        Object r4 = g(r3);     // Catch: Throwable -> L43
        Object r5 = l(r3);     // Catch: Throwable -> L43
        Object r6 = r82.get(r4);     // Catch: Throwable -> L43
        if (r5 != null) goto L20;
        if (r6 != null) goto L18;
        if (r82.containsKey(r4) == false) goto L18;
    L22:
        r3 = r3 + 1;     // Catch: Throwable -> L43
    L18:
        return false;
    L20:
        if (kotlin.jvm.internal.p.g(r5, r6) == true) goto L22;
        return false;
    L23:
        return true;
    L25:
        if ((r8 instanceof Map) == false) goto L42;
        if (size() == ((Map) r8).size()) goto L29;
        return false;
    L29:
        int r22 = this.f6438c;     // Catch: Throwable -> L43
        int r32 = 0;
    L30:
        if (r32 >= r22) goto L41;
        Object r42 = g(r32);     // Catch: Throwable -> L43
        Object r52 = l(r32);     // Catch: Throwable -> L43
        Object r62 = ((Map) r8).get(r42);     // Catch: Throwable -> L43
        if (r52 != null) goto L38;
        if (r62 != null) goto L36;
        if (((Map) r8).containsKey(r42) == false) goto L36;
    L40:
        r32 = r32 + 1;
    L36:
        return false;
    L38:
        if (kotlin.jvm.internal.p.g(r52, r62) == true) goto L40;
        return false;
    L41:
        return true;
    L42:
        return false;
    }

    public final int f() {
        int r02 = this.f6438c;
        if (r02 != 0) goto L6;
        return -1;
    L6:
        int r1 = androidx.collection.internal.a.a(this.f6436a, r02, 0);
        if (r1 >= 0) goto L10;
    L11:
        return r1;
    L10:
        if (this.f6437b[r1 << 1] == null) goto L11;
        int r2 = r1 + 1;
    L13:
        if (r2 >= r02) goto L20;
        if (this.f6436a[r2] != 0) goto L20;
        if (this.f6437b[r2 << 1] == null) goto L18;
        r2 = r2 + 1;
        goto L13
    L18:
        return r2;
    L20:
        int r12 = r1 - 1;
    L21:
        if (r12 < 0) goto L29;
        if (this.f6436a[r12] != 0) goto L29;
        if (this.f6437b[r12 << 1] == null) goto L26;
        r12 = r12 - 1;
        goto L21
    L26:
        return r12;
    L29:
        return ~r2;
    }

    public Object g(int r4) {
        boolean r02 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r02 == true) goto L10;
        androidx.collection.internal.d.a("Expected index to be within 0..size()-1, but was " + r4);
    L10:
        return this.f6437b[r4 << 1];
    L5:
        if (r4 >= this.f6438c) goto L7;
        r02 = true;
        goto L7
    }

    public Object get(Object r2) {
        int r22 = e(r2);
        if (r22 >= 0) goto L5;
        return null;
    L5:
        return this.f6437b[(r22 << 1) + 1];
    }

    public Object getOrDefault(Object r1, Object r2) {
        int r12 = e(r1);
        if (r12 >= 0) goto L5;
        return r2;
    L5:
        return this.f6437b[(r12 << 1) + 1];
    }

    public void h(g0 r5) {
        kotlin.jvm.internal.p.l(r5, "map");
        int r02 = r5.f6438c;
        b(this.f6438c + r02);
        int r2 = 0;
        if (this.f6438c != 0) goto L7;
        if (r02 <= 0) goto L9;
        AbstractC11772p.m(r5.f6436a, this.f6436a, 0, 0, r02);
        AbstractC11772p.o(r5.f6437b, this.f6437b, 0, 0, r02 << 1);
        this.f6438c = r02;
        return;
    L9:
        return;
    L7:
        if (r2 >= r02) goto L11;
        put(r5.g(r2), r5.l(r2));
        r2 = r2 + 1;
        goto L7
    }

    public int hashCode() {
        int[] r02 = this.f6436a;
        Object[] r1 = this.f6437b;
        int r2 = this.f6438c;
        int r4 = 1;
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r5 >= r2) goto L9;
        Object r7 = r1[r4];
        int r8 = r02[r5];
        if (r7 == null) goto L7;
        int r72 = r7.hashCode();
    L8:
        r6 = r6 + (r72 ^ r8);
        r5 = r5 + 1;
        r4 = r4 + 2;
        goto L3
    L7:
        r72 = 0;
        goto L8
    L9:
        return r6;
    }

    public Object i(int r12) {
        if (r12 >= 0) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == true) goto L10;
        androidx.collection.internal.d.a("Expected index to be within 0..size()-1, but was " + r12);
    L10:
        Object[] r22 = this.f6437b;
        int r3 = r12 << 1;
        Object r4 = r22[r3 + 1];
        int r5 = this.f6438c;
        if (r5 > 1) goto L14;
        clear();
        return r4;
    L14:
        int r6 = r5 - 1;
        int[] r7 = this.f6436a;
        int r9 = 8;
        if (r7.length > 8) goto L17;
    L28:
        if (r12 >= r6) goto L30;
        int r02 = r12 + 1;
        AbstractC11772p.m(r7, r7, r12, r02, r5);
        Object[] r122 = this.f6437b;
        AbstractC11772p.o(r122, r122, r3, r02 << 1, r5 << 1);
    L30:
        Object[] r123 = this.f6437b;
        int r03 = r6 << 1;
        r123[r03] = null;
        r123[r03 + 1] = null;
    L32:
        if (r5 != this.f6438c) goto L36;
        this.f6438c = r6;
        return r4;
    L36:
        throw new ConcurrentModificationException();
    L17:
        if (r5 >= (r7.length / 3)) goto L28;
        if (r5 <= 8) goto L20;
        r9 = r5 + (r5 >> 1);
    L20:
        int[] r8 = Arrays.copyOf(r7, r9);
        kotlin.jvm.internal.p.k(r8, "copyOf(...)");
        this.f6436a = r8;
        Object[] r82 = Arrays.copyOf(this.f6437b, r9 << 1);
        kotlin.jvm.internal.p.k(r82, "copyOf(...)");
        this.f6437b = r82;
        if (r5 != this.f6438c) goto L27;
        if (r12 <= 0) goto L24;
        AbstractC11772p.m(r7, this.f6436a, 0, 0, r12);
        AbstractC11772p.o(r22, this.f6437b, 0, 0, r3);
    L24:
        if (r12 >= r6) goto L32;
        int r83 = r12 + 1;
        AbstractC11772p.m(r7, this.f6436a, r12, r83, r5);
        AbstractC11772p.o(r22, this.f6437b, r3, r83 << 1, r5 << 1);
        goto L32
    L27:
        throw new ConcurrentModificationException();
    L5:
        if (r12 >= this.f6438c) goto L7;
        r2 = true;
        goto L8
    }

    public boolean isEmpty() {
        if (this.f6438c > 0) goto L6;
        return true;
    L6:
        return false;
    }

    public Object j(int r4, Object r5) {
        boolean r02 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r02 == true) goto L9;
        androidx.collection.internal.d.a("Expected index to be within 0..size()-1, but was " + r4);
    L9:
        int r42 = (r4 << 1) + 1;
        Object[] r03 = this.f6437b;
        Object r1 = r03[r42];
        r03[r42] = r5;
        return r1;
    L5:
        if (r4 >= this.f6438c) goto L7;
        r02 = true;
        goto L7
    }

    public Object l(int r4) {
        boolean r02 = false;
        if (r4 >= 0) goto L5;
    L7:
        if (r02 == true) goto L10;
        androidx.collection.internal.d.a("Expected index to be within 0..size()-1, but was " + r4);
    L10:
        return this.f6437b[(r4 << 1) + 1];
    L5:
        if (r4 >= this.f6438c) goto L7;
        r02 = true;
        goto L7
    }

    public Object put(Object r8, Object r9) {
        int r02 = this.f6438c;
        if (r8 == null) goto L5;
        int r1 = r8.hashCode();
    L6:
        if (r8 == null) goto L8;
        int r2 = d(r8, r1);
    L9:
        if (r2 < 0) goto L12;
        int r82 = (r2 << 1) + 1;
        Object[] r03 = this.f6437b;
        Object r12 = r03[r82];
        r03[r82] = r9;
        return r12;
    L12:
        int r22 = ~r2;
        int[] r3 = this.f6436a;
        if (r02 < r3.length) goto L26;
        int r4 = 8;
        if (r02 < 8) goto L18;
        r4 = (r02 >> 1) + r02;
    L21:
        int[] r32 = Arrays.copyOf(r3, r4);
        kotlin.jvm.internal.p.k(r32, "copyOf(...)");
        this.f6436a = r32;
        Object[] r33 = Arrays.copyOf(this.f6437b, r4 << 1);
        kotlin.jvm.internal.p.k(r33, "copyOf(...)");
        this.f6437b = r33;
        if (r02 == this.f6438c) goto L26;
        throw new ConcurrentModificationException();
    L18:
        if (r02 >= 4) goto L21;
        r4 = 4;
    L26:
        if (r22 >= r02) goto L28;
        int[] r34 = this.f6436a;
        int r42 = r22 + 1;
        AbstractC11772p.m(r34, r34, r42, r22, r02);
        Object[] r35 = this.f6437b;
        AbstractC11772p.o(r35, r35, r42 << 1, r22 << 1, this.f6438c << 1);
    L28:
        int r36 = this.f6438c;
        if (r02 != r36) goto L35;
        int[] r04 = this.f6436a;
        if (r22 >= r04.length) goto L35;
        r04[r22] = r1;
        Object[] r05 = this.f6437b;
        int r13 = r22 << 1;
        r05[r13] = r8;
        r05[r13 + 1] = r9;
        this.f6438c = r36 + 1;
        return null;
    L35:
        throw new ConcurrentModificationException();
    L8:
        r2 = f();
        goto L9
    L5:
        r1 = 0;
        goto L6
    }

    public Object putIfAbsent(Object r2, Object r3) {
        Object r02 = get(r2);
        if (r02 == null) goto L5;
        return r02;
    L5:
        return put(r2, r3);
    }

    public Object remove(Object r1) {
        int r12 = e(r1);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return i(r12);
    }

    public Object replace(Object r1, Object r2) {
        int r12 = e(r1);
        if (r12 >= 0) goto L5;
        return null;
    L5:
        return j(r12, r2);
    }

    public int size() {
        return this.f6438c;
    }

    public String toString() {
        if (isEmpty() == false) goto L6;
        return "{}";
    L6:
        StringBuilder r1 = new StringBuilder(this.f6438c * 28);
        r1.append('{');
        int r02 = this.f6438c;
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L19;
        if (r2 <= 0) goto L10;
        r1.append(", ");
    L10:
        Object r3 = g(r2);
        if (r3 == r1) goto L13;
        r1.append(r3);
    L14:
        r1.append('=');
        Object r32 = l(r2);
        if (r32 == r1) goto L17;
        r1.append(r32);
    L18:
        r2 = r2 + 1;
        goto L7
    L17:
        r1.append("(this Map)");
        goto L18
    L13:
        r1.append("(this Map)");
        goto L14
    L19:
        r1.append('}');
        String r03 = r1.toString();
        kotlin.jvm.internal.p.k(r03, "toString(...)");
        return r03;
    }

    public g0(int r2) {
        if (r2 != 0) goto L5;
        int[] r02 = androidx.collection.internal.a.f6448a;
    L6:
        this.f6436a = r02;
        if (r2 != 0) goto L9;
        Object[] r22 = androidx.collection.internal.a.f6450c;
    L10:
        this.f6437b = r22;
        return;
    L9:
        r22 = new Object[r2 << 1];
        goto L10
    L5:
        r02 = new int[r2];
        goto L6
    }

    public boolean remove(Object r2, Object r3) {
        int r22 = e(r2);
        if (r22 >= 0) goto L5;
        return false;
    L5:
        if (kotlin.jvm.internal.p.g(r3, l(r22)) == false) goto L10;
        i(r22);
        return true;
    L10:
        return false;
    }

    public boolean replace(Object r2, Object r3, Object r4) {
        int r22 = e(r2);
        if (r22 >= 0) goto L5;
        return false;
    L5:
        if (kotlin.jvm.internal.p.g(r3, l(r22)) == false) goto L10;
        j(r22, r4);
        return true;
    L10:
        return false;
    }

    public /* synthetic */ g0(int r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = 0;
    L5:
        this(r1);
    }

    public g0(g0 r4) {
        int r2 = 0;
        this(r2, 1, null);
        if (r4 == null) goto L6;
        h(r4);
        return;
    }
}
