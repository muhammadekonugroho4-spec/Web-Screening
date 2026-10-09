package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* loaded from: classes5.dex */
public interface StandardIntegrityManager {

    public static abstract class PrepareIntegrityTokenRequest {

        public static abstract class Builder {
            public Builder() {
            }

            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long r1);
        }

        public PrepareIntegrityTokenRequest() {
        }

        public static Builder builder() {
            c r02 = new c();
            r02.a(0);
            return r02;
        }

        public abstract int a();

        public abstract long b();
    }

    public static abstract class StandardIntegrityToken {
        public StandardIntegrityToken() {
        }

        public abstract Task<Integer> showDialog(Activity r1, int r2);

        public abstract String token();
    }

    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest r1);
    }

    public static abstract class StandardIntegrityTokenRequest {

        public static abstract class Builder {
            public Builder() {
            }

            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String r1);
        }

        public StandardIntegrityTokenRequest() {
        }

        public static Builder builder() {
            return new f();
        }

        public abstract String a();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest r1);
}
