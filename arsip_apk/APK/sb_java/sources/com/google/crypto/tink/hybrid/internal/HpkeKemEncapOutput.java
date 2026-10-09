package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes6.dex */
final class HpkeKemEncapOutput {
    private final byte[] encapsulatedKey;
    private final byte[] sharedSecret;

    public HpkeKemEncapOutput(byte[] r1, byte[] r2) {
        this.sharedSecret = r1;
        this.encapsulatedKey = r2;
    }

    public byte[] getEncapsulatedKey() {
        return this.encapsulatedKey;
    }

    public byte[] getSharedSecret() {
        return this.sharedSecret;
    }
}
