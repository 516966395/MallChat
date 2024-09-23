package com.abin.mallchat.common.task;

import com.abin.mallchat.common.chat.dao.MessageDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class MessageDeleteTask {

    @Autowired
    private MessageDao messageDao;

    @Scheduled(cron = "0 30 18 * * ?")
    public void test() {
        messageDao.clearByRoomId(1L);
        log.info("清空主房间聊天记录完成 time:" + LocalDateTime.now());
    }
}
