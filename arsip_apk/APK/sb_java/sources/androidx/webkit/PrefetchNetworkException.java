package androidx.webkit;

/* loaded from: classes4.dex */
public class PrefetchNetworkException extends PrefetchException {
    public final int httpResponseStatusCode;

    public PrefetchNetworkException(int r1) {
        this.httpResponseStatusCode = r1;
    }

    public PrefetchNetworkException() {
        this(0);
    }
}
