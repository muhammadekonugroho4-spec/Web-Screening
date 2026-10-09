package com.google.firebase.crashlytics.internal.stacktrace;

/* loaded from: classes6.dex */
public class MiddleOutStrategy implements StackTraceTrimmingStrategy {
    private final int trimmedSize;

    public MiddleOutStrategy(int r1) {
        this.trimmedSize = r1;
    }

    @Override // com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy
    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] r5) {
        int r02 = r5.length;
        int r1 = this.trimmedSize;
        if (r02 > r1) goto L5;
        return r5;
    L5:
        int r03 = r1 / 2;
        int r2 = r1 - r03;
        StackTraceElement[] r12 = new StackTraceElement[r1];
        System.arraycopy(r5, 0, r12, 0, r2);
        System.arraycopy(r5, r5.length - r03, r12, r2, r03);
        return r12;
    }
}
