package com.alibou.book_network.email;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EmailTemplateName {
    ACTIVATE_ACCOUNT("activate_account");

    private final String name;

}
