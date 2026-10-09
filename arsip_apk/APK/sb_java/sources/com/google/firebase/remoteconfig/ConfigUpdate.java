package com.google.firebase.remoteconfig;

import com.google.auto.value.AutoValue;
import java.util.Set;

@AutoValue
/* loaded from: classes6.dex */
public abstract class ConfigUpdate {
    public ConfigUpdate() {
    }

    public static ConfigUpdate create(Set<String> r1) {
        return new AutoValue_ConfigUpdate(r1);
    }

    public abstract Set<String> getUpdatedKeys();
}
