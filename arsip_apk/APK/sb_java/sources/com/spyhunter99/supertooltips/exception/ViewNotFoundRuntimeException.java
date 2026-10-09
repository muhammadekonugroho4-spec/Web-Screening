package com.spyhunter99.supertooltips.exception;

/* loaded from: classes6.dex */
public class ViewNotFoundRuntimeException extends RuntimeException {
    public ViewNotFoundRuntimeException() {
        super("View not found for this resource id. Are you sure it exists?");
    }
}
