package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class Task<TResult> {
    public Task() {
    }

    public Task<TResult> addOnCanceledListener(Activity r1, OnCanceledListener r2) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> addOnCompleteListener(Activity r1, OnCompleteListener<TResult> r2) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Task<TResult> addOnFailureListener(Activity r1, OnFailureListener r2);

    public abstract Task<TResult> addOnFailureListener(OnFailureListener r1);

    public abstract Task<TResult> addOnFailureListener(Executor r1, OnFailureListener r2);

    public abstract Task<TResult> addOnSuccessListener(Activity r1, OnSuccessListener<? super TResult> r2);

    public abstract Task<TResult> addOnSuccessListener(OnSuccessListener<? super TResult> r1);

    public abstract Task<TResult> addOnSuccessListener(Executor r1, OnSuccessListener<? super TResult> r2);

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> r2) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> r2) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <X extends Throwable> TResult getResult(Class<X> r1) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> r2) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task<TResult> addOnCanceledListener(OnCanceledListener r2) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> r2) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor r1, Continuation<TResult, TContinuationResult> r2) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor r1, Continuation<TResult, Task<TContinuationResult>> r2) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor r1, SuccessContinuation<TResult, TContinuationResult> r2) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task<TResult> addOnCanceledListener(Executor r1, OnCanceledListener r2) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(Executor r1, OnCompleteListener<TResult> r2) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
