package com.tongna.adminstore.controller.rest;


import com.quhaodian.discover.rest.base.RequestTokenPageObject;
import com.tongna.adminstore.rest.api.MemberApi;
import com.tongna.adminstore.rest.domain.page.MemberPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class MemberRestController {

    @RequestMapping("/member/page")
    public MemberPage page(RequestTokenPageObject request) {
        return api.page(request);
    }

    @Autowired
    private MemberApi api;


}
