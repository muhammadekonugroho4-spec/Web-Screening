package androidx.webkit.internal;

import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes4.dex */
public class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f28859a;

    public m(WebViewProviderFactoryBoundaryInterface r1) {
        this.f28859a = r1;
    }

    @Override // androidx.webkit.internal.l
    public String[] a() {
        return this.f28859a.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.l
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(DropDataContentProviderBoundaryInterface.class, this.f28859a.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.l
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(StaticsBoundaryInterface.class, this.f28859a.getStatics());
    }

    @Override // androidx.webkit.internal.l
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) org.chromium.support_lib_boundary.util.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f28859a.getWebkitToCompatConverter());
    }
}
