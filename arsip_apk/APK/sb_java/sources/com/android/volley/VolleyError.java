package com.android.volley;

/* loaded from: classes4.dex */
public class VolleyError extends Exception {
    public final h networkResponse;
    private long networkTimeMs;

    public VolleyError() {
        this.networkResponse = null;
    }

    public void a(long r1) {
        this.networkTimeMs = r1;
    }

    public VolleyError(h r1) {
        this.networkResponse = r1;
    }

    public VolleyError(Throwable r1) {
        super(r1);
        this.networkResponse = null;
    }
}
