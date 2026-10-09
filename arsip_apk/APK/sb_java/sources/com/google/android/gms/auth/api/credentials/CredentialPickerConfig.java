package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "CredentialPickerConfigCreator")
@Deprecated
/* loaded from: classes5.dex */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = null;

    @SafeParcelable.Field(id = 1000)
    final int zba;

    @SafeParcelable.Field(getter = "shouldShowAddAccountButton", id = 1)
    private final boolean zbb;

    @SafeParcelable.Field(getter = "shouldShowCancelButton", id = 2)
    private final boolean zbc;

    @SafeParcelable.Field(getter = "getPromptInternalId", id = 4)
    private final int zbd;

    public static class Builder {
        private boolean zba;
        private boolean zbb;
        private int zbc;

        public Builder() {
            this.zba = false;
            this.zbb = true;
            this.zbc = 1;
        }

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(2, this.zba, this.zbb, false, this.zbc);
        }

        @Deprecated
        public Builder setForNewAccount(boolean r2) {
            int r02 = 1;
            if (true != r2) goto L6;
            r02 = 3;
        L6:
            this.zbc = r02;
            return this;
        }

        public Builder setPrompt(int r1) {
            this.zbc = r1;
            return this;
        }

        public Builder setShowAddAccountButton(boolean r1) {
            this.zba = r1;
            return this;
        }

        public Builder setShowCancelButton(boolean r1) {
            this.zbb = r1;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    static {
        CREATOR = new zbb();
    }

    @SafeParcelable.Constructor
    public CredentialPickerConfig(@SafeParcelable.Param(id = 1000) int r1, @SafeParcelable.Param(id = 1) boolean r2, @SafeParcelable.Param(id = 2) boolean r3, @SafeParcelable.Param(id = 3) boolean r4, @SafeParcelable.Param(id = 4) int r5) {
        this.zba = r1;
        this.zbb = r2;
        this.zbc = r3;
        if (r1 >= 2) goto L10;
        int r12 = 1;
        if (true != r4) goto L8;
        r12 = 3;
    L8:
        this.zbd = r12;
        return;
    L10:
        this.zbd = r5;
    }

    @Deprecated
    public boolean isForNewAccount() {
        if (this.zbd != 3) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean shouldShowAddAccountButton() {
        return this.zbb;
    }

    public boolean shouldShowCancelButton() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r3, int r4) {
        int r42 = SafeParcelWriter.beginObjectHeader(r3);
        SafeParcelWriter.writeBoolean(r3, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(r3, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(r3, 3, isForNewAccount());
        SafeParcelWriter.writeInt(r3, 4, this.zbd);
        SafeParcelWriter.writeInt(r3, 1000, this.zba);
        SafeParcelWriter.finishObjectHeader(r3, r42);
    }
}
