package org.chromium.support_lib_boundary;

/* loaded from: classes3.dex */
public interface SpeculativeLoadingConfigBoundaryInterface {
    int getMaxPrefetches();

    default int getMaxPrerenders() {
        return 0;
    }

    int getPrefetchTTLSeconds();
}
