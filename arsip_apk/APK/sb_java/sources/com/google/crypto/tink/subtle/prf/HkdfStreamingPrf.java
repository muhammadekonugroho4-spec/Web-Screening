package com.google.crypto.tink.subtle.prf;

import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

@Immutable
/* loaded from: classes6.dex */
public class HkdfStreamingPrf implements StreamingPrf {
    private final Enums.HashType hashType;
    private final byte[] ikm;
    private final byte[] salt;

    /* renamed from: com.google.crypto.tink.subtle.prf.HkdfStreamingPrf$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
            int[] r02 = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r02;
            r02[Enums.HashType.SHA1.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
        L12:
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA256.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
        L14:
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA384.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
        L18:
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 4;     // Catch: NoSuchFieldError -> L11
            return;
        }
    }

    public class HkdfInputStream extends InputStream {
        private ByteBuffer buffer;
        private int ctr;
        private final byte[] input;
        private Mac mac;
        private byte[] prk;
        final /* synthetic */ HkdfStreamingPrf this$0;

        public HkdfInputStream(HkdfStreamingPrf r1, byte[] r2) {
            this.this$0 = r1;
            this.ctr = -1;
            this.input = Arrays.copyOf(r2, r2.length);
        }

        private void initialize() throws GeneralSecurityException, IOException {
            this.mac = EngineFactory.MAC.getInstance(HkdfStreamingPrf.access$100(HkdfStreamingPrf.access$000(this.this$0)));     // Catch: GeneralSecurityException -> L12
            if (HkdfStreamingPrf.access$200(this.this$0) != null) goto L6;
        L9:
            this.mac.init(new SecretKeySpec(new byte[this.mac.getMacLength()], HkdfStreamingPrf.access$100(HkdfStreamingPrf.access$000(this.this$0))));
        L10:
            this.mac.update(HkdfStreamingPrf.access$300(this.this$0));
            this.prk = this.mac.doFinal();
            ByteBuffer r1 = ByteBuffer.allocateDirect(0);
            this.buffer = r1;
            r1.mark();
            this.ctr = 0;
            return;
        L6:
            if (HkdfStreamingPrf.access$200(this.this$0).length == 0) goto L9;
            this.mac.init(new SecretKeySpec(HkdfStreamingPrf.access$200(this.this$0), HkdfStreamingPrf.access$100(HkdfStreamingPrf.access$000(this.this$0))));
        L12:
            e = move-exception;
            throw new IOException("Creating HMac failed", e);
        }

        private void updateBuffer() throws GeneralSecurityException, IOException {
            this.mac.init(new SecretKeySpec(this.prk, HkdfStreamingPrf.access$100(HkdfStreamingPrf.access$000(this.this$0))));
            this.buffer.reset();
            this.mac.update(this.buffer);
            this.mac.update(this.input);
            int r02 = this.ctr + 1;
            this.ctr = r02;
            this.mac.update((byte) r02);
            ByteBuffer r03 = ByteBuffer.wrap(this.mac.doFinal());
            this.buffer = r03;
            r03.mark();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            byte[] r1 = new byte[1];
            int r3 = read(r1, 0, 1);
            if (r3 != 1) goto L7;
            return r1[0] & UnsignedBytes.MAX_VALUE;
        L7:
            if (r3 != (-1)) goto L10;
            return r3;
        L10:
            throw new IOException("Reading failed");
        }

        @Override // java.io.InputStream
        public int read(byte[] r3) throws IOException {
            return read(r3, 0, r3.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] r4, int r5, int r6) throws IOException {
        L5:
            e = move-exception;
            this.mac = null;
            throw new IOException("HkdfInputStream failed", e);
        L3:
            if (this.ctr != (-1)) goto L7;
            initialize();     // Catch: GeneralSecurityException -> L5
        L7:
            int r02 = 0;
        L8:
            if (r02 >= r6) goto L17;
            if (this.buffer.hasRemaining() == false) goto L12;
        L15:
            int r1 = Math.min(r6 - r02, this.buffer.remaining());     // Catch: GeneralSecurityException -> L5
            this.buffer.get(r4, r5, r1);     // Catch: GeneralSecurityException -> L5
            r5 = r5 + r1;
            r02 = r02 + r1;
            goto L8
        L12:
            if (this.ctr == 255) goto L17;
            updateBuffer();     // Catch: GeneralSecurityException -> L5
        L17:
            return r02;
        }
    }

    public HkdfStreamingPrf(Enums.HashType r1, byte[] r2, byte[] r3) {
        this.hashType = r1;
        this.ikm = Arrays.copyOf(r2, r2.length);
        this.salt = Arrays.copyOf(r3, r3.length);
    }

    public static /* synthetic */ Enums.HashType access$000(HkdfStreamingPrf r02) {
        return r02.hashType;
    }

    public static /* synthetic */ String access$100(Enums.HashType r02) throws GeneralSecurityException {
        return getJavaxHmacName(r02);
    }

    public static /* synthetic */ byte[] access$200(HkdfStreamingPrf r02) {
        return r02.salt;
    }

    public static /* synthetic */ byte[] access$300(HkdfStreamingPrf r02) {
        return r02.ikm;
    }

    private static String getJavaxHmacName(Enums.HashType r3) throws GeneralSecurityException {
        int r02 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[r3.ordinal()];
        if (r02 != 1) goto L5;
        return "HmacSha1";
    L5:
        if (r02 != 2) goto L7;
        return "HmacSha256";
    L7:
        if (r02 != 3) goto L9;
        return "HmacSha384";
    L9:
        if (r02 != 4) goto L13;
        return "HmacSha512";
    L13:
        throw new GeneralSecurityException("No getJavaxHmacName for given hash " + r3 + " known");
    }

    @Override // com.google.crypto.tink.subtle.prf.StreamingPrf
    public InputStream computePrf(byte[] r2) {
        return new HkdfInputStream(this, r2);
    }
}
