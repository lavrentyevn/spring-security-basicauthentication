package com.nikolay.basicauth.appuser;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/register")
@AllArgsConstructor
public class AppUserController {
    private final AppUserService appUserService;

    @PostMapping
    public void register(@RequestBody AppUser appUser) {
        appUserService.registerUser(appUser);
    }
}
