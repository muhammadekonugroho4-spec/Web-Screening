package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
abstract class DecodedObject {
    private final int newPosition;

    public DecodedObject(int r1) {
        this.newPosition = r1;
    }

    public final int getNewPosition() {
        return this.newPosition;
    }
}
