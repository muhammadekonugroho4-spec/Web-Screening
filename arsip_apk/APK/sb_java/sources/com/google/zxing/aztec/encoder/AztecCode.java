package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitMatrix;

/* loaded from: classes6.dex */
public final class AztecCode {
    private int codeWords;
    private boolean compact;
    private int layers;
    private BitMatrix matrix;
    private int size;

    public AztecCode() {
    }

    public int getCodeWords() {
        return this.codeWords;
    }

    public int getLayers() {
        return this.layers;
    }

    public BitMatrix getMatrix() {
        return this.matrix;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isCompact() {
        return this.compact;
    }

    public void setCodeWords(int r1) {
        this.codeWords = r1;
    }

    public void setCompact(boolean r1) {
        this.compact = r1;
    }

    public void setLayers(int r1) {
        this.layers = r1;
    }

    public void setMatrix(BitMatrix r1) {
        this.matrix = r1;
    }

    public void setSize(int r1) {
        this.size = r1;
    }
}
