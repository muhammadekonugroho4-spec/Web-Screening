package a.a.a.a.a;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.midtrans.sdk.corekit.core.Constants;
import com.midtrans.sdk.corekit.models.CardRegistrationResponse;
import com.midtrans.sdk.corekit.models.TokenDetailsResponse;
import retrofit2.http.k;
import retrofit2.http.t;

/* loaded from: classes.dex */
public interface d {
    @retrofit2.http.f(Constants.QUERY_STRING)
    retrofit2.d<TokenDetailsResponse> a(@t("card_number") String r1, @t("card_cvv") String r2, @t("card_exp_month") String r3, @t("card_exp_year") String r4, @t("client_key") String r5, @t("bank") String r6, @t("two_click") Boolean r7, @t("gross_amount") Double r8, @t("channel") String r9, @t("type") String r10, @t(FirebaseAnalytics.Param.CURRENCY) String r11, @t("point") Boolean r12);

    @retrofit2.http.f(Constants.QUERY_STRING)
    retrofit2.d<TokenDetailsResponse> b(@t("card_number") String r1, @t("card_cvv") String r2, @t("card_exp_month") String r3, @t("card_exp_year") String r4, @t("client_key") String r5, @t("bank") String r6, @t("two_click") Boolean r7, @t("gross_amount") Double r8, @t("installment") Boolean r9, @t("channel") String r10, @t("installment_term") String r11, @t("type") String r12, @t(FirebaseAnalytics.Param.CURRENCY) String r13, @t("point") Boolean r14);

    @retrofit2.http.f(Constants.QUERY_STRING)
    retrofit2.d<TokenDetailsResponse> c(@t("card_cvv") String r1, @t("token_id") String r2, @t("two_click") Boolean r3, @t("gross_amount") Double r4, @t("bank") String r5, @t("client_key") String r6, @t("channel") String r7, @t("type") String r8, @t(FirebaseAnalytics.Param.CURRENCY) String r9, @t("point") Boolean r10);

    @k({"Content-Type: application/json", "x-auth: da53847171259b511488cf366e701050"})
    @retrofit2.http.f("card/register")
    retrofit2.d<CardRegistrationResponse> d(@t("card_number") String r1, @t("card_cvv") String r2, @t("card_exp_month") String r3, @t("card_exp_year") String r4, @t("client_key") String r5);

    @retrofit2.http.f(Constants.QUERY_STRING)
    retrofit2.d<TokenDetailsResponse> e(@t("card_number") String r1, @t("card_cvv") String r2, @t("card_exp_month") String r3, @t("card_exp_year") String r4, @t("client_key") String r5, @t("gross_amount") Double r6, @t("channel") String r7, @t("type") String r8, @t(FirebaseAnalytics.Param.CURRENCY) String r9, @t("point") Boolean r10);

    @retrofit2.http.f(Constants.QUERY_STRING)
    retrofit2.d<TokenDetailsResponse> f(@t("card_cvv") String r1, @t("token_id") String r2, @t("two_click") Boolean r3, @t("gross_amount") Double r4, @t("bank") String r5, @t("client_key") String r6, @t("installment") Boolean r7, @t("installment_term") String r8, @t("channel") String r9, @t("type") String r10, @t(FirebaseAnalytics.Param.CURRENCY) String r11, @t("point") Boolean r12);
}
