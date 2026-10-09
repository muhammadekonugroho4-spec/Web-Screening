package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
final class ExpandedRow {
    private final List<ExpandedPair> pairs;
    private final int rowNumber;
    private final boolean wasReversed;

    public ExpandedRow(List<ExpandedPair> r2, int r3, boolean r4) {
        this.pairs = new ArrayList(r2);
        this.rowNumber = r3;
        this.wasReversed = r4;
    }

    public boolean equals(Object r4) {
        if ((r4 instanceof ExpandedRow) == true) goto L5;
        return false;
    L5:
        ExpandedRow r42 = (ExpandedRow) r4;
        if (this.pairs.equals(r42.getPairs()) == true) goto L8;
    L11:
        return false;
    L8:
        if (this.wasReversed != r42.wasReversed) goto L11;
        return true;
    }

    public List<ExpandedPair> getPairs() {
        return this.pairs;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public int hashCode() {
        return this.pairs.hashCode() ^ Boolean.valueOf(this.wasReversed).hashCode();
    }

    public boolean isEquivalent(List<ExpandedPair> r2) {
        return this.pairs.equals(r2);
    }

    public boolean isReversed() {
        return this.wasReversed;
    }

    public String toString() {
        return "{ " + this.pairs + " }";
    }
}
