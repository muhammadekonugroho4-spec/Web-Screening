package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes6.dex */
final class BlockParsedResult {
    private final DecodedInformation decodedInformation;
    private final boolean finished;

    public BlockParsedResult(boolean r2) {
        this(null, r2);
    }

    public DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    public boolean isFinished() {
        return this.finished;
    }

    public BlockParsedResult(DecodedInformation r1, boolean r2) {
        this.finished = r2;
        this.decodedInformation = r1;
    }
}
