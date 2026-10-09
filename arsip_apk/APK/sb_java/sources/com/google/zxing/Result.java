package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Result {
    private final BarcodeFormat format;
    private final int numBits;
    private final byte[] rawBytes;
    private Map<ResultMetadataType, Object> resultMetadata;
    private ResultPoint[] resultPoints;
    private final String text;
    private final long timestamp;

    public Result(String r8, byte[] r9, ResultPoint[] r10, BarcodeFormat r11) {
        this(r8, r9, r10, r11, System.currentTimeMillis());
    }

    public void addResultPoints(ResultPoint[] r5) {
        ResultPoint[] r02 = this.resultPoints;
        if (r02 != null) goto L6;
        this.resultPoints = r5;
        return;
    L6:
        if (r5 != null) goto L8;
        return;
    L8:
        if (r5.length <= 0) goto L12;
        ResultPoint[] r1 = new ResultPoint[r02.length + r5.length];
        System.arraycopy(r02, 0, r1, 0, r02.length);
        System.arraycopy(r5, 0, r1, r02.length, r5.length);
        this.resultPoints = r1;
        return;
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.format;
    }

    public int getNumBits() {
        return this.numBits;
    }

    public byte[] getRawBytes() {
        return this.rawBytes;
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
        return this.resultMetadata;
    }

    public ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public String getText() {
        return this.text;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void putAllMetadata(Map<ResultMetadataType, Object> r2) {
        if (r2 == null) goto L9;
        Map<ResultMetadataType, Object> r02 = this.resultMetadata;
        if (r02 != null) goto L7;
        this.resultMetadata = r2;
        return;
    L7:
        r02.putAll(r2);
        return;
    }

    public void putMetadata(ResultMetadataType r3, Object r4) {
        if (this.resultMetadata != null) goto L5;
        this.resultMetadata = new EnumMap(ResultMetadataType.class);
    L5:
        this.resultMetadata.put(r3, r4);
    }

    public String toString() {
        return this.text;
    }

    public Result(String r10, byte[] r11, ResultPoint[] r12, BarcodeFormat r13, long r14) {
        if (r11 != null) goto L5;
        int r02 = 0;
    L6:
        this(r10, r11, r02, r12, r13, r14);
        return;
    L5:
        r02 = r11.length * 8;
        goto L6
    }

    public Result(String r1, byte[] r2, int r3, ResultPoint[] r4, BarcodeFormat r5, long r6) {
        this.text = r1;
        this.rawBytes = r2;
        this.numBits = r3;
        this.resultPoints = r4;
        this.format = r5;
        this.resultMetadata = null;
        this.timestamp = r6;
    }
}
