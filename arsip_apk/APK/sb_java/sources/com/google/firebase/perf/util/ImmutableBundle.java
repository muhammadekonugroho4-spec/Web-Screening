package com.google.firebase.perf.util;

import android.os.Bundle;
import com.google.firebase.perf.logging.AndroidLogger;

/* loaded from: classes6.dex */
public final class ImmutableBundle {
    private static final AndroidLogger logger = null;
    private final Bundle bundle;

    static {
        logger = AndroidLogger.getInstance();
    }

    public ImmutableBundle() {
        this(new Bundle());
    }

    private Optional<Integer> getInt(String r3) {
        if (containsKey(r3) == false) goto L5;
        return Optional.fromNullable((Integer) this.bundle.get(r3));
    L8:
        e = move-exception;
        logger.debug("Metadata key %s contains type other than int: %s", new Object[]{r3, e.getMessage()});
        return Optional.absent();
    L5:
        return Optional.absent();
    }

    public boolean containsKey(String r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if (this.bundle.containsKey(r2) == false) goto L9;
        return true;
    L9:
        return false;
    }

    public Optional<Boolean> getBoolean(String r3) {
        if (containsKey(r3) == false) goto L5;
        return Optional.fromNullable((Boolean) this.bundle.get(r3));
    L8:
        e = move-exception;
        logger.debug("Metadata key %s contains type other than boolean: %s", new Object[]{r3, e.getMessage()});
        return Optional.absent();
    L5:
        return Optional.absent();
    }

    public Optional<Double> getDouble(String r3) {
        if (containsKey(r3) == false) goto L5;
        Object r02 = this.bundle.get(r3);
        if (r02 != null) goto L11;
        return Optional.absent();
    L11:
        if ((r02 instanceof Float) == false) goto L15;
        return Optional.of(Double.valueOf(((Float) r02).doubleValue()));
    L15:
        if ((r02 instanceof Double) == true) goto L17;
        logger.debug("Metadata key %s contains type other than double: %s", new Object[]{r3});
        return Optional.absent();
    L17:
        return Optional.of((Double) r02);
    L5:
        return Optional.absent();
    }

    public Optional<Long> getLong(String r3) {
        if (getInt(r3).isAvailable() == false) goto L7;
        return Optional.of(Long.valueOf(r3.get().intValue()));
    L7:
        return Optional.absent();
    }

    public ImmutableBundle(Bundle r1) {
        this.bundle = (Bundle) r1.clone();
    }
}
