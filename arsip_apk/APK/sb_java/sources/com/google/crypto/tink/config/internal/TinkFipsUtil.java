package com.google.crypto.tink.config.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class TinkFipsUtil {
    private static final AtomicBoolean isRestrictedToFips = null;
    private static final Logger logger = null;

    /* renamed from: com.google.crypto.tink.config.internal.TinkFipsUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum AlgorithmFipsCompatibility extends Enum<AlgorithmFipsCompatibility> {
        private static final /* synthetic */ AlgorithmFipsCompatibility[] $VALUES = null;
        public static final AlgorithmFipsCompatibility ALGORITHM_NOT_FIPS = null;
        public static final AlgorithmFipsCompatibility ALGORITHM_REQUIRES_BORINGCRYPTO = null;

        static {
            final String r1 = "ALGORITHM_NOT_FIPS";
            final int r2 = 0;
            AlgorithmFipsCompatibility r02 = new AnonymousClass1(r1, r2);
            ALGORITHM_NOT_FIPS = r02;
            final String r3 = "ALGORITHM_REQUIRES_BORINGCRYPTO";
            final int r4 = 1;
            AlgorithmFipsCompatibility r12 = new AnonymousClass2(r3, r4);
            ALGORITHM_REQUIRES_BORINGCRYPTO = r12;
            $VALUES = new AlgorithmFipsCompatibility[]{r02, r12};
        }

        AlgorithmFipsCompatibility(String r1, int r2) {
        }

        public static AlgorithmFipsCompatibility valueOf(String r1) {
            return (AlgorithmFipsCompatibility) Enum.valueOf(AlgorithmFipsCompatibility.class, r1);
        }

        public static AlgorithmFipsCompatibility[] values() {
            return (AlgorithmFipsCompatibility[]) $VALUES.clone();
        }

        public abstract boolean isCompatible();

        /* synthetic */ AlgorithmFipsCompatibility(String r1, int r2, AnonymousClass1 r3) {
            this(r1, r2);
        }
    }

    static {
        logger = Logger.getLogger(TinkFipsUtil.class.getName());
        isRestrictedToFips = new AtomicBoolean(false);
    }

    private TinkFipsUtil() {
    }

    public static Boolean checkConscryptIsAvailableAndUsesFipsBoringSsl() {
        return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
    L4:
        logger.info("Conscrypt is not available or does not support checking for FIPS build.");
        return Boolean.FALSE;
    }

    public static boolean fipsModuleAvailable() {
        return checkConscryptIsAvailableAndUsesFipsBoringSsl().booleanValue();
    }

    public static void setFipsRestricted() {
        isRestrictedToFips.set(true);
    }

    public static void unsetFipsRestricted() {
        isRestrictedToFips.set(false);
    }

    public static boolean useOnlyFips() {
        if (TinkFipsStatus.useOnlyFips() == false) goto L5;
        return true;
    L5:
        if (isRestrictedToFips.get() == true) goto L11;
        return false;
    L11:
        return true;
    }
}
