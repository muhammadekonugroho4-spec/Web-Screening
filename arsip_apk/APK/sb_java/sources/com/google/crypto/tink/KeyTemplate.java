package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: classes6.dex */
public final class KeyTemplate {
    private final com.google.crypto.tink.proto.KeyTemplate kt;

    /* renamed from: com.google.crypto.tink.KeyTemplate$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
            int[] r02 = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = r02;
            r02[OutputPrefixType.TINK.ordinal()] = 1;     // Catch: NoSuchFieldError -> L16
        L24:
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;     // Catch: NoSuchFieldError -> L17
        L30:
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;     // Catch: NoSuchFieldError -> L18
        L38:
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;     // Catch: NoSuchFieldError -> L19
        L10:
            int[] r4 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r4;
            r4[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;     // Catch: NoSuchFieldError -> L20
        L26:
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;     // Catch: NoSuchFieldError -> L21
        L28:
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;     // Catch: NoSuchFieldError -> L22
        L34:
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;     // Catch: NoSuchFieldError -> L23
            return;
        }
    }

    public enum OutputPrefixType extends Enum<OutputPrefixType> {
        private static final /* synthetic */ OutputPrefixType[] $VALUES = null;
        public static final OutputPrefixType CRUNCHY = null;
        public static final OutputPrefixType LEGACY = null;
        public static final OutputPrefixType RAW = null;
        public static final OutputPrefixType TINK = null;

        static {
            OutputPrefixType r02 = new OutputPrefixType("TINK", 0);
            TINK = r02;
            OutputPrefixType r1 = new OutputPrefixType("LEGACY", 1);
            LEGACY = r1;
            OutputPrefixType r2 = new OutputPrefixType("RAW", 2);
            RAW = r2;
            OutputPrefixType r3 = new OutputPrefixType("CRUNCHY", 3);
            CRUNCHY = r3;
            $VALUES = new OutputPrefixType[]{r02, r1, r2, r3};
        }

        OutputPrefixType(String r1, int r2) {
        }

        public static OutputPrefixType valueOf(String r1) {
            return (OutputPrefixType) Enum.valueOf(OutputPrefixType.class, r1);
        }

        public static OutputPrefixType[] values() {
            return (OutputPrefixType[]) $VALUES.clone();
        }
    }

    private KeyTemplate(com.google.crypto.tink.proto.KeyTemplate r1) {
        this.kt = r1;
    }

    public static KeyTemplate create(String r2, byte[] r3, OutputPrefixType r4) {
        return new KeyTemplate(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(r2).setValue(ByteString.copyFrom(r3)).setOutputPrefixType(toProto(r4)).build());
    }

    public static OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType r1) {
        int r12 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[r1.ordinal()];
        if (r12 == 1) goto L19;
        if (r12 == 2) goto L17;
        if (r12 == 3) goto L15;
        if (r12 != 4) goto L13;
        return OutputPrefixType.CRUNCHY;
    L13:
        throw new IllegalArgumentException("Unknown output prefix type");
    L15:
        return OutputPrefixType.RAW;
    L17:
        return OutputPrefixType.LEGACY;
    L19:
        return OutputPrefixType.TINK;
    }

    public static com.google.crypto.tink.proto.OutputPrefixType toProto(OutputPrefixType r1) {
        int r12 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[r1.ordinal()];
        if (r12 == 1) goto L19;
        if (r12 == 2) goto L17;
        if (r12 == 3) goto L15;
        if (r12 != 4) goto L13;
        return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
    L13:
        throw new IllegalArgumentException("Unknown output prefix type");
    L15:
        return com.google.crypto.tink.proto.OutputPrefixType.RAW;
    L17:
        return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
    L19:
        return com.google.crypto.tink.proto.OutputPrefixType.TINK;
    }

    public OutputPrefixType getOutputPrefixType() {
        return fromProto(this.kt.getOutputPrefixType());
    }

    public com.google.crypto.tink.proto.KeyTemplate getProto() {
        return this.kt;
    }

    public String getTypeUrl() {
        return this.kt.getTypeUrl();
    }

    public byte[] getValue() {
        return this.kt.getValue().toByteArray();
    }
}
