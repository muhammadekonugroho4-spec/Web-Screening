package com.google.android.gms.tasks;

/* loaded from: classes5.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(Task<TResult> r1) throws Exception;
}
