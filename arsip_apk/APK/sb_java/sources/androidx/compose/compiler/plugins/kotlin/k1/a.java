package androidx.compose.compiler.plugins.kotlin.k1;

import org.jetbrains.kotlin.diagnostics.rendering.CommonRenderers;
import org.jetbrains.kotlin.diagnostics.rendering.DefaultErrorMessages;
import org.jetbrains.kotlin.diagnostics.rendering.DiagnosticFactoryToRendererMap;
import org.jetbrains.kotlin.diagnostics.rendering.Renderers;

/* loaded from: classes.dex */
public final class a implements DefaultErrorMessages.Extension {

    /* renamed from: a, reason: collision with root package name */
    public final DiagnosticFactoryToRendererMap f7011a;

    public a() {
        DiagnosticFactoryToRendererMap r02 = new DiagnosticFactoryToRendererMap("Compose");
        this.f7011a = r02;
        r02.put(b.f7013b, "@Composable invocations can only happen from the context of a @Composable function");
        r02.put(b.f7014c, "Functions which invoke @Composable functions must be marked with the @Composable annotation");
        r02.put(b.d, "Function References of @Composable functions are not currently supported");
        r02.put(b.f7020j, "Composable calls are not allowed inside the {0} parameter of {1}", Renderers.NAME, Renderers.COMPACT);
        r02.put(b.f7022l, "Parameter {0} cannot be inlined inside of lambda argument {1} of {2} without also being annotated with @DisallowComposableCalls", Renderers.NAME, Renderers.NAME, Renderers.NAME);
        r02.put(b.f7023m, "Composables marked with @ReadOnlyComposable can only call other @ReadOnlyComposable composables");
        r02.put(b.f7015e, "Composable properties are not able to have backing fields");
        r02.put(b.f7024n, "@Composable annotation mismatch with overridden function: {0}", CommonRenderers.commaSeparated(Renderers.FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS));
        r02.put(b.f7016f, "Composable properties are not able to have backing fields");
        r02.put(b.f7017g, "Composable function cannot be annotated as suspend");
        r02.put(b.f7018h, "Overridable Composable functions with default values are not currently supported");
        r02.put(b.f7019i, "Composable main functions are not currently supported");
        r02.put(b.f7025o, "Try catch is not supported around composable function invocations.");
        r02.put(b.f7026p, "Type inference failed. Expected type mismatch: inferred type is {1} but {0} was expected", Renderers.RENDER_TYPE_WITH_ANNOTATIONS, Renderers.RENDER_TYPE_WITH_ANNOTATIONS);
        r02.put(b.f7027q, "Calling a {0} composable function where a {1} composable was expected", Renderers.TO_STRING, Renderers.TO_STRING);
        r02.put(b.f7028r, "A {0} composable parameter was provided where a {1} composable was expected", Renderers.TO_STRING, Renderers.TO_STRING);
        r02.put(b.f7029s, "The composition target of an override must match the ancestor target");
        r02.put(b.f7030t, "Composable setValue operator is not currently supported.");
        r02.put(b.f7032v, "Mismatched @Composable annotation between expect and actual declaration");
        r02.put(b.f7033w, "Invalid `@Composable` annotation on inline lambda. This will become an error in Kotlin 2.0.");
        r02.put(b.f7031u, "Named arguments in composable function types are deprecated. This will become an error in Kotlin 2.0");
    }
}
