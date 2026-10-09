package com.google.crypto.tink.subtle;

/* loaded from: classes6.dex */
public final class Enums {

    public enum HashType extends Enum<HashType> {
        private static final /* synthetic */ HashType[] $VALUES = null;
        public static final HashType SHA1 = null;
        public static final HashType SHA224 = null;
        public static final HashType SHA256 = null;
        public static final HashType SHA384 = null;
        public static final HashType SHA512 = null;

        static {
            HashType r02 = new HashType("SHA1", 0);
            SHA1 = r02;
            HashType r1 = new HashType("SHA224", 1);
            SHA224 = r1;
            HashType r2 = new HashType("SHA256", 2);
            SHA256 = r2;
            HashType r3 = new HashType("SHA384", 3);
            SHA384 = r3;
            HashType r4 = new HashType("SHA512", 4);
            SHA512 = r4;
            $VALUES = new HashType[]{r02, r1, r2, r3, r4};
        }

        HashType(String r1, int r2) {
        }

        public static HashType valueOf(String r1) {
            return (HashType) Enum.valueOf(HashType.class, r1);
        }

        public static HashType[] values() {
            return (HashType[]) $VALUES.clone();
        }
    }

    private Enums() {
    }
}
