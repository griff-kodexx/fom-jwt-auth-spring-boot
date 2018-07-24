package fom.authapi.security;
/*
 *  Created by griff on 7/24/18 .
 */

public class SecurityConstants {
    public static final String SECRET = "someSecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; //10 days
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "users/signUp";

}
