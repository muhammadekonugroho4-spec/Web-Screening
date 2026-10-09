package androidx.compose.ui.text.android;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class D implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f19702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19703b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19704c;
    public int d;

    static {
    }

    public D(CharSequence r1, int r2, int r3) {
        this.f19702a = r1;
        this.f19703b = r2;
        this.f19704c = r3;
        this.d = r2;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        return super.clone();
    L5:
        throw new InternalError();
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int r02 = this.d;
        if (r02 != this.f19704c) goto L7;
        return 65535;
    L7:
        return this.f19702a.charAt(r02);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.d = this.f19703b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f19703b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f19704c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int r02 = this.f19703b;
        int r1 = this.f19704c;
        if (r02 != r1) goto L6;
        this.d = r1;
        return 65535;
    L6:
        int r12 = r1 - 1;
        this.d = r12;
        return this.f19702a.charAt(r12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int r02 = this.d + 1;
        this.d = r02;
        int r1 = this.f19704c;
        if (r02 < r1) goto L7;
        this.d = r1;
        return 65535;
    L7:
        return this.f19702a.charAt(r02);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int r02 = this.d;
        if (r02 > this.f19703b) goto L6;
        return 65535;
    L6:
        int r03 = r02 - 1;
        this.d = r03;
        return this.f19702a.charAt(r03);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int r3) {
        int r02 = this.f19703b;
        if (r3 > this.f19704c) goto L8;
        if (r02 > r3) goto L8;
        this.d = r3;
        return current();
    L8:
        throw new IllegalArgumentException("invalid position");
    }
}
