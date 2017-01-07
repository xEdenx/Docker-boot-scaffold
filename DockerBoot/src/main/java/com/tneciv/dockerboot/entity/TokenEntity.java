package com.tneciv.dockerboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Tneciv on 2017/1/8.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenEntity {

    /**
     * access_token : adba1423-205b-4cbc-adf1-6c3e591ab667
     * token_type : bearer
     * expires_in : 43197
     * scope : read
     */

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private int expiresIn;
    @JsonProperty("scope")
    private String scope;

    public String getAccessToken() {
        return accessToken;
    }

    public TokenEntity setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getTokenType() {
        return tokenType;
    }

    public TokenEntity setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public TokenEntity setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    public String getScope() {
        return scope;
    }

    public TokenEntity setScope(String scope) {
        this.scope = scope;
        return this;
    }
}
