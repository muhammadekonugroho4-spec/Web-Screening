package com.google.android.datatransport;

/* loaded from: classes4.dex */
public final class Encoding {
    private final String name;

    private Encoding(String r2) {
        if (r2 == null) goto L7;
        this.name = r2;
        return;
    L7:
        throw new NullPointerException("name is null");
    }

    public static Encoding of(String r1) {
        return new Encoding(r1);
    }

    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof Encoding) == true) goto L10;
        return false;
    L10:
        return this.name.equals(((Encoding) r2).name);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.name + "\"}";
    }
}
