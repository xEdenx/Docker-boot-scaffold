package com.tneciv.dockerboot.controller;

import com.tneciv.dockerboot.entity.TokenEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Tneciv on 2017/1/8.
 */
@RestController
public class OAuthController {
    @RequestMapping("/oauth/tokenTest")
    public TokenEntity getToken() {
        return new TokenEntity().setAccessToken("qwertyuiop_ASDF")
                .setExpiresIn(2000)
                .setScope("read")
                .setTokenType("bearer");
    }
}
