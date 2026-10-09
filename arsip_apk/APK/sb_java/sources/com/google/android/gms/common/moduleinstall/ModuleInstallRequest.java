package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class ModuleInstallRequest {
    private final List zaa;
    private final InstallStatusListener zab;
    private final Executor zac;

    public static class Builder {
        private final List zaa;
        private InstallStatusListener zab;
        private Executor zac;

        public Builder() {
            this.zaa = new ArrayList();
        }

        @CanIgnoreReturnValue
        public Builder addApi(OptionalModuleApi r2) {
            this.zaa.add(r2);
            return this;
        }

        public ModuleInstallRequest build() {
            return new ModuleInstallRequest(this.zaa, this.zab, this.zac, true, null);
        }

        @CanIgnoreReturnValue
        public Builder setListener(InstallStatusListener r1, Executor r2) {
            this.zab = r1;
            this.zac = r2;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setListener(InstallStatusListener r2) {
            return setListener(r2, null);
        }
    }

    public /* synthetic */ ModuleInstallRequest(List r1, InstallStatusListener r2, Executor r3, boolean r4, zac r5) {
        Preconditions.checkNotNull(r1, "APIs must not be null.");
        Preconditions.checkArgument(!r1.isEmpty(), "APIs must not be empty.");
        if (r3 == null) goto L5;
        Preconditions.checkNotNull(r2, "Listener must not be null when listener executor is set.");
    L5:
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<OptionalModuleApi> getApis() {
        return this.zaa;
    }

    public InstallStatusListener getListener() {
        return this.zab;
    }

    public Executor getListenerExecutor() {
        return this.zac;
    }
}
