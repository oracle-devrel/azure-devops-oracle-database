package oracleai.services;

import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AuthProvider {

//    public static AuthenticationDetailsProvider getAuthenticationDetailsProvider() throws IOException {
    public static AuthenticationDetailsProvider getAuthenticationDetailsProvider() throws IOException {
        return new ConfigFileAuthenticationDetailsProvider(
                    System.getenv("OCICONFIG_FILE"), System.getenv("OCICONFIG_PROFILE"));
    //    InstancePrincipalsAuthenticationDetailsProvider.builder().build();
    }



    public  static AuthenticationDetailsProvider getAuthenticationDetailsProvider1() {
        return new AuthenticationDetailsProvider() {
            @Override
            public String getKeyId() {
                return getTenantId() + "/" + getUserId() + "/" + getFingerprint();
//                return "ocid1.tenancy.oc1..aaaaaaaab6vzaylctdrkxvr2pa6h6nkn3b5y32wg4e572lubuy33na6d3jja/ocid1.user.oc1..aaaaaaaari35rhm4hjmdtcu2ixur2646aqoe57pzy75k6muddyitztjwffaa/7f:65:2e:54:c1:ee:9d:78:ae:65:9f:8f:e3:6b:22:3f";
            }

            @Override
            public InputStream getPrivateKey() {
                String privateKey = "-----BEGIN PRIVATE KEY-----\n" +
                        "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDGcWlNH082wT8u\n" +
                        "C5uT4VWcVa5w27bT1FgORUeuzqXHH682tM1QDBipbxvb0nThAZY9kkwaPNIfCng3\n" +
                        "qOGHuViIbecy8CTy309t+yLvHZlCmO/ZmLmTAFoHSIbbx1MpQKrraGUQzIYwof6B\n" +
                        "+x1wnifqcn6c7x9tIGk343SEefEC7Fw/rHzEDmCyN93NuMvJCbYDtx3qkvP1a30p\n" +
                        "7YcxVQsZDQhjdtPOyhGgZxyaofPf12A/Pt61sf/cHnBUhuVLbPS6EdnCVY0Cy1pL\n" +
                        "3LpCwysv6f+s6u+C1lbGR80FDUyZp3fao1Y0A4SePZvFFIisXu4ZLznJsZncPQuD\n" +
                        "ZkG317+DAgMBAAECggEAXygO+H5k+7qa0zeZuMW6yaaEaXXSK62NM/qgrwBEmkFl\n" +
                        "QXRdZ18FjGnNEBHRHfwm0QuQFpzHnT7l+rquuuhzvagFz3U8IoJWkkR0sfidf0Pa\n" +
                        "75q+kfD/OrLaiBUCmat6yjtbCz0ns7ZaVnXV3iTYuyF/+Tzo8ukxyyz0uHnIyj82\n" +
                        "93TdajVBTUILcVex4V93p55+7s2uQksEX5zcW7KKWKpOzrL0mKADYa2NF4w3HeDZ\n" +
                        "Eq010YJXtlEj9UPZ6OTnAuO+K6YtCPIodwOkrJOTFKMMffGYD0emkNgkEsv8GNEF\n" +
                        "gFqGKafME7Z9uymZ02ArIiy09R/5exoOR3IvEYBdQQKBgQD/iA5o5iNugRDMfvao\n" +
                        "BZqnqFP/Q0h5DXF2UFEOcx6hlqaq2d6tOC8c5JucAMv5gJGmF0erQPFKjGEP70Bk\n" +
                        "YNzyW3zb1OVDYAtzbR8NgrkWNnANDLZR55issoo/SXcwnLF7srMYOqZ2pmxNEk3S\n" +
                        "r0UVchn78YLjkg1+zABFNh2i0QKBgQDGzo7vXQ6UyM5d71/ShYdSugcQZ0o+TJp7\n" +
                        "zpJBtAnzREnbtnLlaA2ra8awmu7d/YTqwn7H8A0XthSm3177MyNKuZnBw+P9VHz+\n" +
                        "kNSd5/g6ej/KovVN0PFFc8LbgRjEDWgsunAl9TWUpMmnk0nrqeWC77cQLb3iI8W8\n" +
                        "kh4y0+CKEwKBgG/PFJ8JtA8yIiuYkkzKxvT9TmOvCRMOssrWMeFktc52oM65LhoV\n" +
                        "L2gxD3WfU6EEhLZsEUv5ypqX+hCC22YQjBzvsx5tdTOZ3ujOonvC60Gw6C6NlWkZ\n" +
                        "MVC/foZamvCGX5KEiqDbaOMZxuGiVLMPRecwWfZHosH4sjb9BFFEcItBAoGAacdB\n" +
                        "ug4zUeq+ErDotSSi6dtdItcyY49yqukwXJEksjDlc2fSHkmM7GZ94z2sVqUrcZVm\n" +
                        "y47oCHOy7U7wRIvi/UFfk/9ccU/g6bm5xwLDyql9A55NEshXd3KufQhlWvsfMJ1K\n" +
                        "Sof7qEk9mlH+BMvy+AX/yzXrUEVkUn8UXkrpr80CgYBLuhqeRY3dleYppw7KXooq\n" +
                        "7q4vhigBKv/iupmgxdhDtoXVuEeQKJvjzPVt0XL6zAInlQvVUX4RleY4oc9yvj8k\n" +
                        "DHsyRP9g1U1qB+MxtuQNqYO6negdlcQR1+toQzkCBcsaJZgr90TEBXNH3whqQAvC\n" +
                        "bfB5/TTQuA8r0V6+Igsxtg==\n" +
                        "-----END PRIVATE KEY-----\n";
                return new ByteArrayInputStream(privateKey.getBytes());
                //todo close inputstream

            }

            @Override
            public String getPassPhrase() {
                return null;
            }

            @Override
            public char[] getPassphraseCharacters() {
                return new char[0];
            }

            @Override
            public String getFingerprint() {
                return "7f:65:2e:54:c1:ee:9d:78:ae:65:9f:8f:e3:6b:22:3f";
            }

            @Override
            public String getTenantId() {
                return "ocid1.tenancy.oc1..aaaaaaaaj4ccqe763dizkrcdbs5x7ufvmmojd24mb6utvkymyo4xwxyv3gfa";
            }

            @Override
            public String getUserId() {
                return "ocid1.user.oc1..aaaaaaaasd37w2te2a2c4ijpaf4axsxmky6hinmygkqm2csijpvvbspzfssq";
            }
        };
    }
}
