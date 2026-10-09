package androidx.compose.compiler.plugins.kotlin;

import java.util.List;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.i;
import org.jetbrains.kotlin.compiler.plugin.CliOption;
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor;

/* loaded from: classes.dex */
public final class a implements CommandLineProcessor {

    /* renamed from: c, reason: collision with root package name */
    public static final C0062a f6993c = null;
    public static final String d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final CliOption f6994e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final CliOption f6995f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final CliOption f6996g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final CliOption f6997h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final CliOption f6998i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final CliOption f6999j = null;

    /* renamed from: k, reason: collision with root package name */
    public static final CliOption f7000k = null;

    /* renamed from: l, reason: collision with root package name */
    public static final CliOption f7001l = null;

    /* renamed from: m, reason: collision with root package name */
    public static final CliOption f7002m = null;

    /* renamed from: n, reason: collision with root package name */
    public static final CliOption f7003n = null;

    /* renamed from: o, reason: collision with root package name */
    public static final CliOption f7004o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final CliOption f7005p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final CliOption f7006q = null;

    /* renamed from: r, reason: collision with root package name */
    public static final CliOption f7007r = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f7008a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7009b;

    /* renamed from: androidx.compose.compiler.plugins.kotlin.a$a, reason: collision with other inner class name */
    public static final class C0062a {
        public /* synthetic */ C0062a(i r1) {
            this();
        }

        public C0062a() {
        }
    }

    static {
        f6993c = new C0062a(null);
        d = "androidx.compose.compiler.plugins.kotlin";
        f6994e = new CliOption("liveLiterals", "<true|false>", "Enable Live Literals code generation", false, false);
        f6995f = new CliOption("liveLiteralsEnabled", "<true|false>", "Enable Live Literals code generation (with per-file enabled flags)", false, false);
        f6996g = new CliOption("generateFunctionKeyMetaClasses", "<true|false>", "Generate function key meta classes with annotations indicating the functions and their group keys. Generally used for tooling.", false, false);
        f6997h = new CliOption("sourceInformation", "<true|false>", "Include source information in generated code", false, false);
        f6998i = new CliOption("metricsDestination", "<path>", "Save compose build metrics to this folder", false, false);
        f6999j = new CliOption("reportsDestination", "<path>", "Save compose build reports to this folder", false, false);
        f7000k = new CliOption("intrinsicRemember", "<true|false>", "Include source information in generated code", false, false);
        f7001l = new CliOption("nonSkippingGroupOptimization", "<true|false>", "Remove groups around non-skipping composable functions", false, false);
        f7002m = new CliOption("suppressKotlinVersionCompatibilityCheck", "<kotlin_version>", "Suppress Kotlin version compatibility check", false, false);
        f7003n = new CliOption("generateDecoys", "<true|false>", "Generate decoy methods in IR transform", false, false);
        f7004o = new CliOption("strongSkipping", "<true|false>", "Enable strong skipping mode", false, false);
        f7005p = new CliOption("experimentalStrongSkipping", "<true|false>", "Deprecated - Use strongSkipping instead", false, false);
        f7006q = new CliOption("stabilityConfigurationPath", "<path>", "Path to stability configuration file", false, true);
        f7007r = new CliOption("traceMarkersEnabled", "<true|false>", "Include composition trace markers in generate code", false, false);
    }

    public a() {
        this.f7008a = d;
        this.f7009b = AbstractC11777v.r(new CliOption[]{f6994e, f6995f, f6996g, f6997h, f6998i, f6999j, f7000k, f7001l, f7002m, f7003n, f7005p, f7004o, f7006q, f7007r});
    }
}
