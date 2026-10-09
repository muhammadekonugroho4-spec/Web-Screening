package com.google.firebase.appcheck.internal.util;

/* loaded from: classes6.dex */
public interface Clock {

    public static class DefaultClock implements Clock {
        public DefaultClock() {
        }

        @Override // com.google.firebase.appcheck.internal.util.Clock
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    }

    long currentTimeMillis();
}
