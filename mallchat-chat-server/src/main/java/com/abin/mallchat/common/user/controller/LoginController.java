package com.abin.mallchat.common.user.controller;


import com.abin.mallchat.common.common.domain.vo.response.ApiResult;
import com.abin.mallchat.common.common.utils.AssertUtil;
import com.abin.mallchat.common.common.utils.RequestHolder;
import com.abin.mallchat.common.user.domain.dto.ItemInfoDTO;
import com.abin.mallchat.common.user.domain.dto.SummeryInfoDTO;
import com.abin.mallchat.common.user.domain.enums.RoleEnum;
import com.abin.mallchat.common.user.domain.vo.request.user.*;
import com.abin.mallchat.common.user.domain.vo.response.user.BadgeResp;
import com.abin.mallchat.common.user.domain.vo.response.user.UserInfoResp;
import com.abin.mallchat.common.user.service.IRoleService;
import com.abin.mallchat.common.user.service.UserService;
import com.abin.mallchat.common.user.service.WebSocketService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 用户登录控制器
 * </p>
 *
 * @author <a href="https://github.com/zongzibinbin">abin</a>
 * @since 2023-03-19
 */
@Slf4j
@RestController
@RequestMapping("/capi/login/public")
@Api(tags = "用户登录相关接口")
public class LoginController {//贾叔 我公司最近搬迁了 离这里有点远 我也打算搬到公司附近  租房合同也快到期了  我不准备续了

    @Autowired
    @Lazy
    private WebSocketService webSocketService;

    @GetMapping("/qrcode")
    @ApiOperation("qrcode扫码登录")
    public Boolean qrcodeLogin(Integer loginCode, Long uid) {
        log.info("---------------------开始测试 qrcode扫码登录: {}, uid: {}", loginCode, uid);
        return webSocketService.scanLoginSuccess(loginCode, uid);
    }

    @GetMapping("/api")
    @ApiOperation("api登录")
    public Boolean haha(Integer loginCode, Long uid) {
        log.info("---------------------开始测试 api登录: {}, uid: {}", loginCode, uid);
        return webSocketService.scanLoginSuccess(loginCode, uid);
    }
}

