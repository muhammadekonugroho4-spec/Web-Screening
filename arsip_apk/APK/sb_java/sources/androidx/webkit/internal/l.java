package androidx.webkit.internal;

import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes4.dex */
public interface l {
    String[] a();

    DropDataContentProviderBoundaryInterface getDropDataProvider();

    StaticsBoundaryInterface getStatics();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
