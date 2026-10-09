package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
final class Count implements Serializable {
    private int value;

    public Count(int r1) {
        this.value = r1;
    }

    public void add(int r2) {
        this.value += r2;
    }

    public int addAndGet(int r2) {
        int r02 = this.value + r2;
        this.value = r02;
        return r02;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof Count) == true) goto L5;
        return false;
    L5:
        if (((Count) r2).value != this.value) goto L10;
        return true;
    L10:
        return false;
    }

    public int get() {
        return this.value;
    }

    public int getAndSet(int r2) {
        int r02 = this.value;
        this.value = r2;
        return r02;
    }

    public int hashCode() {
        return this.value;
    }

    public void set(int r1) {
        this.value = r1;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
