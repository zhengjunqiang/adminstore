package com.haoxuer.adminstore.rest.api;

import com.haoxuer.adminstore.rest.domain.request.MemberNameRequest;
import com.haoxuer.adminstore.rest.domain.page.MemberPage;
import com.haoxuer.adminstore.rest.domain.request.MemberUpdateRequest;
import com.haoxuer.discover.rest.base.RequestTokenPageObject;
import com.haoxuer.discover.rest.base.ResponseObject;
import com.quhaodian.jsonrpc.annotation.RestFul;

/**
 * 用户api
 */
@RestFul(value = "memberApi", api = MemberApi.class)
public interface MemberApi {
  
  /**
   * 获取系统的用户
   *
   * @param request
   * @return
   */
  MemberPage page(RequestTokenPageObject request);
  
  /**
   * 更新用户信息
   * @param request
   * @return
   */
  ResponseObject update(MemberUpdateRequest request);


  MemberPage name(MemberNameRequest request);


  ResponseObject demo();

}
