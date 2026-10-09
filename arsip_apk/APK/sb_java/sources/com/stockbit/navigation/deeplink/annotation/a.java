package com.stockbit.navigation.deeplink.annotation;

import com.stockbit.navigation.deeplink.DeeplinkAuthType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface a {
    DeeplinkAuthType authType() default DeeplinkAuthType.TYPE_AUTH_ONLY;

    String[] hosts();

    String pathPatterns();

    String[] schemes() default {"http", "https"};
}
