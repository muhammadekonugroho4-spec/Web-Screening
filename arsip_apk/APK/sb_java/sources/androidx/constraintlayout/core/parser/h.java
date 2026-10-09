package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class h extends c {
    public h(char[] r1) {
        super(r1);
    }

    public static h o(String r3) {
        h r02 = new h(r3.toCharArray());
        r02.n(0);
        r02.m(r3.length() - 1);
        return r02;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof h) == false) goto L11;
        if (b().equals(((h) r4).b()) == false) goto L11;
        return true;
    L11:
        return super.equals(r4);
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int hashCode() {
        return super.hashCode();
    }
}
