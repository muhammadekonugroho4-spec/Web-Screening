package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b extends c {

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f21191f;

    public b(char[] r1) {
        super(r1);
        this.f21191f = new ArrayList();
    }

    public f A(String r2) {
        c r22 = D(r2);
        if ((r22 instanceof f) == true) goto L5;
        return null;
    L5:
        return (f) r22;
    }

    public c C(int r2) {
        if (r2 >= 0) goto L4;
        return null;
    L4:
        if (r2 < this.f21191f.size()) goto L6;
        return null;
    L6:
        return (c) this.f21191f.get(r2);
    }

    public c D(String r4) {
        Iterator r02 = this.f21191f.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        d r1 = (d) ((c) r02.next());
        if (r1.b().equals(r4) == false) goto L4;
        return r1.R();
    L9:
        return null;
    }

    public String F(int r4) {
        c r02 = q(r4);
        if ((r02 instanceof h) == false) goto L7;
        return r02.b();
    L7:
        throw new CLParsingException("no string at index " + r4, this);
    }

    public String G(String r6) {
        c r02 = r(r6);
        if ((r02 instanceof h) == true) goto L5;
        if (r02 == null) goto L8;
        String r1 = r02.j();
    L10:
        throw new CLParsingException("no string found for key <" + r6 + ">, found [" + r1 + "] : " + r02, this);
    L8:
        r1 = null;
        goto L10
    L5:
        return r02.b();
    }

    public String H(int r2) {
        c r22 = C(r2);
        if ((r22 instanceof h) == true) goto L5;
        return null;
    L5:
        return r22.b();
    }

    public String I(String r2) {
        c r22 = D(r2);
        if ((r22 instanceof h) == true) goto L5;
        return null;
    L5:
        return r22.b();
    }

    public boolean J(String r4) {
        Iterator r02 = this.f21191f.iterator();
    L4:
        if (r02.hasNext() == false) goto L11;
        c r1 = (c) r02.next();
        if ((r1 instanceof d) == false) goto L4;
        if (((d) r1).b().equals(r4) == false) goto L4;
        return true;
    L11:
        return false;
    }

    public ArrayList K() {
        ArrayList r02 = new ArrayList();
        Iterator r1 = this.f21191f.iterator();
    L4:
        if (r1.hasNext() == false) goto L8;
        c r2 = (c) r1.next();
        if ((r2 instanceof d) == false) goto L4;
        r02.add(((d) r2).b());
        goto L4
    L8:
        return r02;
    }

    public void L(String r4, c r5) {
        Iterator r02 = this.f21191f.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        d r1 = (d) ((c) r02.next());
        if (r1.b().equals(r4) == false) goto L4;
        r1.S(r5);
        return;
    L9:
        d r42 = (d) d.P(r4, r5);
        this.f21191f.add(r42);
    }

    public void N(String r2, float r3) {
        L(r2, new e(r3));
    }

    public void O(String r4, String r5) {
        h r02 = new h(r5.toCharArray());
        r02.n(0);
        r02.m(r5.length() - 1);
        L(r4, r02);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public /* bridge */ /* synthetic */ c a() {
        return p();
    }

    public void clear() {
        this.f21191f.clear();
    }

    @Override // androidx.constraintlayout.core.parser.c
    public /* bridge */ /* synthetic */ Object clone() {
        return p();
    }

    @Override // androidx.constraintlayout.core.parser.c
    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof b) == true) goto L10;
        return false;
    L10:
        return this.f21191f.equals(((b) r2).f21191f);
    }

    public float getFloat(int r4) {
        c r02 = q(r4);
        if (r02 == null) goto L7;
        return r02.e();
    L7:
        throw new CLParsingException("no float at index " + r4, this);
    }

    public int getInt(int r4) {
        c r02 = q(r4);
        if (r02 == null) goto L7;
        return r02.g();
    L7:
        throw new CLParsingException("no int at index " + r4, this);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int hashCode() {
        return Objects.hash(new Object[]{this.f21191f, Integer.valueOf(super.hashCode())});
    }

    public void o(c r4) {
        this.f21191f.add(r4);
        if (g.f21200a == false) goto L6;
        System.out.println("added element " + r4 + " to " + this);
        return;
    }

    public b p() {
        b r02 = (b) super.a();
        ArrayList r1 = new ArrayList(this.f21191f.size());
        Iterator r2 = this.f21191f.iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        c r3 = ((c) r2.next()).a();
        r3.l(r02);
        r1.add(r3);
        goto L4
    L6:
        r02.f21191f = r1;
        return r02;
    }

    public c q(int r4) {
        if (r4 < 0) goto L8;
        if (r4 >= this.f21191f.size()) goto L8;
        return (c) this.f21191f.get(r4);
    L8:
        throw new CLParsingException("no element at index " + r4, this);
    }

    public c r(String r4) {
        Iterator r02 = this.f21191f.iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        d r1 = (d) ((c) r02.next());
        if (r1.b().equals(r4) == false) goto L4;
        return r1.R();
    L10:
        throw new CLParsingException("no element for key <" + r4 + ">", this);
    }

    public a s(String r5) {
        c r02 = r(r5);
        if ((r02 instanceof a) == false) goto L7;
        return (a) r02;
    L7:
        throw new CLParsingException("no array found for key <" + r5 + ">, found [" + r02.j() + "] : " + r02, this);
    }

    public int size() {
        return this.f21191f.size();
    }

    @Override // androidx.constraintlayout.core.parser.c
    public String toString() {
        StringBuilder r02 = new StringBuilder();
        Iterator r1 = this.f21191f.iterator();
    L4:
        if (r1.hasNext() == false) goto L10;
        c r2 = (c) r1.next();
        if (r02.length() <= 0) goto L8;
        r02.append("; ");
    L8:
        r02.append(r2);
        goto L4
    L10:
        return super.toString() + " = <" + r02 + " >";
    }

    public a u(String r2) {
        c r22 = D(r2);
        if ((r22 instanceof a) == true) goto L5;
        return null;
    L5:
        return (a) r22;
    }

    public float v(String r5) {
        c r02 = r(r5);
        if (r02 == null) goto L7;
        return r02.e();
    L7:
        throw new CLParsingException("no float found for key <" + r5 + ">, found [" + r02.j() + "] : " + r02, this);
    }

    public float w(String r2) {
        c r22 = D(r2);
        if ((r22 instanceof e) == true) goto L5;
        return Float.NaN;
    L5:
        return r22.e();
    }

    public int y(String r5) {
        c r02 = r(r5);
        if (r02 == null) goto L7;
        return r02.g();
    L7:
        throw new CLParsingException("no int found for key <" + r5 + ">, found [" + r02.j() + "] : " + r02, this);
    }

    public f z(String r5) {
        c r02 = r(r5);
        if ((r02 instanceof f) == false) goto L7;
        return (f) r02;
    L7:
        throw new CLParsingException("no object found for key <" + r5 + ">, found [" + r02.j() + "] : " + r02, this);
    }
}
